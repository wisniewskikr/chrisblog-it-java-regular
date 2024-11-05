To rotate an array to the right by 
𝑘
k steps, each element in the array is shifted to the right 
𝑘
k times. When elements are shifted beyond the last position, they reappear at the beginning of the array.

Here's a few examples:

Example 1
Input: array = [1, 2, 3, 4, 5, 6, 7], k = 3
Output: [5, 6, 7, 1, 2, 3, 4]
Example 2
Input: array = [1, 2, 3, 4, 5], k = 2
Output: [4, 5, 1, 2, 3]
Example 3
Input: array = [10, 20, 30, 40, 50], k = 1
Output: [50, 10, 20, 30, 40]
Example 4
Input: array = [7, 8, 9], k = 4
Output: [9, 7, 8]
Example 5
Input: array = [3, 8, 9, 7, 6], k = 3
Output: [9, 7, 6, 3, 8]