# SearchingJava
Different searching techniques and similar questions in java.
In Java, searching techniques typically refer to methods and algorithms used to find specific elements within data structures like arrays, lists, trees, graphs, etc. Here are some common searching techniques implemented in Java:
1. Linear Search:

    Description:Linear search, also known as sequential search, is a straightforward method for finding a target element within an array or list by checking each element one by one until a match is found or the entire collection is traversed.

Algorithm:

  1.Start at the beginning of the array.
  
  2.Compare each element with the target element until a match is found or the end of the array is reached. 
  
  3.Iterates through each element of a collection sequentially until the desired element is found.
  
    
       for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i; 
          }
       }
       return -1; 

Pros:

  Simple and easy to implement.
  
  Works on unsorted arrays.

Cons:

  Inefficiency on large datasets as it checks each element sequentially.
  
  Time complexity: O(n) - where 'n' is the number of elements in the array.

2. Binary Search:

    Description: Binary search is a highly efficient search algorithm used for finding a target element within a sorted array. It works by repeatedly dividing the search interval in half and eliminating the half in which the target cannot be until the element is found or the interval is empty.

 Algorithm:

  1.Compare the target element with the middle element of the array.

  2.If the target matches the middle element, return the index.

  3.If the target is smaller, continue searching in the left half.
    
  4.If the target is larger, continue searching in the right half.

  5.Repeat until the element is found or the search interval becomes empty.


       int left = 0;
       int right = arr.length - 1;
       while (left <= right) {
       int mid = left + (right - left) / 2;
       if (arr[mid] == target) {
            return mid; 
        } else if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
       }
       return -1; 



  Pros:

  Highly efficient for large datasets due to halving the search space.

  Time complexity: O(log n) - where 'n' is the number of elements in the array.

 Cons:

  Requires a sorted array.
    
  More complex to implement than linear search.     

