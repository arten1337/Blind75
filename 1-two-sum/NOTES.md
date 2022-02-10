​Approach 1: Brute Force
=============
The brute force approach is simple. Loop through each element x and find if there is another value that equals to target - x.

### Time Complexity - O(n<sup>2</sup>)
### Space Complexity - O(1)

Approach 2: Sort and Two Pointer
=============
Sort the array in non decreasing order. Pointer low = first index of array, high = last index of array. Take sum of values on low and high. 
If sum is less than target, increment low, if sum is more than target, decrement high.

### Time Complexity - O(nlogn)
### Space Complexity - O(1)

Approach 3: Hash Table
=============

Create a Hash Table. Store array element and its index in the hashtable. Also check if target - array element is present in the hashtable. If yes, the return the index of both the elements.

