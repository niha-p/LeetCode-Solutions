/*
https://leetcode.com/problems/two-sum/
*/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> m=new HashMap<>();
       
        int[] ans=new int[2];
        for(int i=0;i<nums.length; i++)
           {
               if(m.containsKey(nums[i]))
               {
                   ans[0]=m.get(nums[i]);
                   ans[1]=i;
               }
               else
               {
                   m.put(target-nums[i],i);
               }
           }
        return ans;
    }
}