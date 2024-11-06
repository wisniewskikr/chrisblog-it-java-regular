package com.example;

public class ProductArray {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        
        // Step 1: Calculate the left product array
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            output[i] = leftProduct;
            leftProduct *= nums[i];
        }
        
        // Step 2: Calculate the right product array and update the output
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        
        return output;
    }
    
    public static void main(String[] args) {
        ProductArray productArray = new ProductArray();
        int[] nums = {1, 2, 3, 4};
        int[] result = productArray.productExceptSelf(nums);
        
        // Print the result
        System.out.println("Result:");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}