package com.example;

import java.util.Stack;

public class App 
{
    public static void main( String[] args ) {
        
        // String[] input = {"2", "4", "+"};                        // Input
        // String[] input = {"2", "4", "*", "8", "+"};
        // String[] input = {"2", "4", "8", "+", "*"};
        // String[] input = {"2", "4", "8", "+", "*", "2", "/"};
        String[] input = {"2", "4", "8", "-", "*"};

        int result = calculateRPN(input);                           // Calculation

        System.out.println("Calculated result is: " + result);      // Output

    }

    public static int calculateRPN(String[] input) {

        if (input == null || input.length == 0) {
            throw new IllegalArgumentException("Input can not be null.");
        }

        Stack<String> stack = new Stack<>();
        int first = 0;
        int second = 0;
        int result = 0;

        for (String sign : input) {
            
            switch (sign) {
                case "+":
                    second = Integer.parseInt(stack.pop());
                    first = Integer.parseInt(stack.pop());
                    result = first + second;
                    stack.push(String.valueOf(result));
                    break;

                case "-":
                    second = Integer.parseInt(stack.pop());
                    first = Integer.parseInt(stack.pop());
                    result = first - second;
                    stack.push(String.valueOf(result));
                    break;

                case "*":
                    second = Integer.parseInt(stack.pop());
                    first = Integer.parseInt(stack.pop());
                    result = first * second;
                    stack.push(String.valueOf(result));
                    break;

                case "/":
                    second = Integer.parseInt(stack.pop());
                    first = Integer.parseInt(stack.pop());
                    result = first / second;
                    stack.push(String.valueOf(result));
                    break;
            
                default:
                    stack.push(sign);
                    break;
            }

        }

        return Integer.parseInt(stack.pop());

    }

}
