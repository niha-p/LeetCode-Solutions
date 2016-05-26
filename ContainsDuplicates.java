/*
https://leetcode.com/problems/contains-duplicate/
*/

public class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        if (nums==null)
            return false;
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length;i++)
        {
        if(m.containsKey(nums[i]))
            return true;
        else
            m.put(nums[i],1);
        }
        return false;    
    }
}