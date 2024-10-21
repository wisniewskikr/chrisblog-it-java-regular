## Goal

Goal of this project is to create application which will find index of the element in the array using **Binary Search**. Binary Search means that array has to be sorted and then we check in the middle. If value is lower then middle then we check in the middle of left side. If value is higher then the middle the we check in the middle of right side.

##### Hints
Hints:
* Array has to be sorted
* We need 3 variables: right, left, middle
* We have to use the loop "while"
* We have to narrow results until we find our target or return -1

##### Terminology
The name Binary Search comes from the way the algorithm repeatedly divides the search space into two parts (binary meaning "two"). Here's how it works:

Binary Division: The search starts by looking at the middle element of a sorted list or array.
Comparison: The middle element is compared to the target value:
1. If the middle element is equal to the target, the search is complete.
2. If the target is smaller than the middle element, the search continues in the left half of the list.
3. If the target is larger, the search continues in the right half.

Halving the Search Space: This process repeats, dividing the list into two parts each time, focusing only on the half that could contain the target. The search space shrinks exponentially (by half) with each step.
Since the search algorithm works by binary division—repeatedly cutting the problem in half—it is called Binary Search. This allows it to efficiently search in 
𝑂 (log 𝑛) time for large datasets.