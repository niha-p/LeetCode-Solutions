/*
https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
*/

public class MinRotatedSortedArray {
    public int findMin(int[] nums) {
        //SOLUTION 1
        /*
        if (nums.length==1)
            return nums[0];
        int min=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--)
        {
         if (nums[i]<min)   
            min=nums[i];
         //if (i-1>=0)    
         if ((i-1)>=0 && nums[i]<nums[i-1])
            break;
            
        }
        return min;
        */

        //Better, Cleaner Solution
        if (nums.length==1)
            return nums[0];
        int left=0,right=nums.length-1;
        while(left<right-1)
        {
        int mid=left+(right-left)/2;    
        if (nums[mid] > nums[right]) { left = mid; }
        else
            right=mid;
        }
        if(nums[left]<nums[right])
            return nums[left];
        return nums[right];    
    }
}