//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

import java.util.*;

public class Main {
  public static void main(String[] args) {
    int[] numbers = {1,3,6,2,3,4};  // Experiment with other values as well

    Leetcode.containsDuplicate(numbers); //function call
  }

  public class Leetcode{
    public boolean containsDuplicate(int[] nums) {
      Arrays.sort(nums); //sort the array

      for (int i = 0; i < nums.length-1; i++) {   //iterate through each element

        if (nums[i] == nums[i + 1]) {             // compare num with next num using array index

          System.out.println("True");
          return true;
        }
      }
      System.out.println("False");
      return false;
    }
  }
}