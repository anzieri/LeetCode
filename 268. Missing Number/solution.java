//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
import java.util.*;

public class Main {
  public static void main(String[] args) {
    int[] numbers = {9,6,4,2,3,5,7,0,1};  // Experiment with other values as well

    Leetcode.missingNumber(numbers); //function call
  }

  public static Leetcode{
    public static int missingNumber(int[] nums) {
      Arrays.sort(nums);
//            int lowest = nums[0];
//            int highest  = nums[nums.length-1];
      if(nums[nums.length-1]==nums.length && nums[0]==0){
        for(int i=1; i<=nums.length; i++){
          if(nums[i]==(nums[i-1]+1)){
            System.out.println("False");
          }else{
            System.out.println("True:" + (nums[i-1]+1));
            return nums[i-1]+1;
          }
        }
      }else if(nums[nums.length-1]<nums.length){
        System.out.println("True: "+ nums.length);
        return nums.length;
      }else{
        System.out.println("0");
        return 0;
      }
      System.out.println("Done");
      return 0;
    }
  }
}