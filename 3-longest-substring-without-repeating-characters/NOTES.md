​Approach 1 : Brute Force
=======

Check all substrings one by one to see if it has no duplicate characters.

Time Complexity: O(n<sup>3</sup>), as for going through all substrings time taken is O(n<sup>2</sup>) and to check if the string has repeating characters, it takes O(n) time. So total Time Complexity = O(n<sup>3</sup>).

Space Complexity: O(1), constant space used by the HashTable as we have limited number of characters in English Alphabet.


Approach 2: Sliding Window with Hash Table
=====

We can add characters of the string to a HashMap. We map the character to its index + 1(explained below). If a certain character is already present in the Map, we know that there is a repeating character in the current substring. Now we want to start the count of the substring again, and that too after that repeating character. This is why we map index + 1 to the character.

At each step we store the maximum length substring we have found.
