RPN will perform the same mathematical calculations as the Traditional way.
Below you can find an example of how it looks in the Traditional way vs RPN.
Your application will receive a valid operation always.
 
Create a function that will receive the Input as an argument and print the result to the screen.
You may use tests if you think it is applicable.
 
Example with numbers:
Traditional 2 + 4
Polish 2 4 +
Result 6
Input => {"2", "4", "+"}
 
Traditional 2 ∗ 4 + 8
Polish 2 4 * 8 +
Result 16
Java Input => {"2", "4", "*", "8", "+"}
 
Traditional 2 * (4 + 8)
Polish 2 4 8 + *
Result 24
Java Input => {"2", "4", "8", "+", "*"}
 
Traditional 2 *(4 + 8) / 2
Polish 2 4 8 + * 2 /
Result 12
Java Input => {"2", "4", "8", "+", "*", "2", "/"}
 
Traditional 2 * (4 - 8)
Polish 2 4 8 - *
Result -8
Java Input => {"2", "4", "8", "-", "*"}