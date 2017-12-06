/**
 * Given a string, find the length of the longest substring without repeating characters.

 Examples:

 Given "abcabcbb", the answer is "abc", which the length is 3.

 Given "bbbbb", the answer is "b", with the length of 1.

 Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */


package com.test.java;

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        return 0;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        String[] sArr = s.split("");
        int bestCounter = 0;
        int currentCounter = 1;
        System.out.println(sArr[0]);

        int i=0, j=1;
        while(i<j && j<sArr.length) {
            System.out.println("Outer comparison " + sArr[i] + " and " + sArr[j]);
            if(sArr[i].equals(sArr[j])) {
                i++;
                currentCounter--;
            } else {
                for(int x=i; x<j; x++) {
                    System.out.println("Inner comparison " + sArr[x] + " and " + sArr[j]);
                    if(sArr[x].equals(sArr[j])) {
                        i=x+1;
                        break;
                    } else {
                        x++;
                    }
                }
                j++;
                currentCounter++;
            }
        }

        System.out.println("Best counter " + currentCounter);
    }
}
