/*
https://leetcode.com/problems/missing-number/
*/

public class MissingNumber {
    public int missingNumber(int[] nums) {
        /* **********SOLUTION 1***********/
        int x=nums.length;
        int sum=(x*(x+1))/2;
        for (int i=0; i<nums.length; i++)
            sum=sum-nums[i];
            
        return sum;
        
        
        /* *******SOLUTION 2*******
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i] - i;
        return nums.length - sum;
        */
        
        /* *********BINARY SEARCH*********
        Arrays.sort(nums);
        
        if(nums[0]==1)
            return 0;
        if(nums[nums.length-1]==nums.length-1)
            return nums.length;
        int f=0;
        int l=nums.length-1;    
        while(f<=l)
        {
            int mid=f+(l-f)/2;
            if(mid!=0 && nums[mid-1]+1!=nums[mid])
                return nums[mid-1]+1;
            if(nums[mid]==mid)
                f=mid+1;
            else
                l=mid-1;
            
        }
        return 0;
        
        */
            
    }
}