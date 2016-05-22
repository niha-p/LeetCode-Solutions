/*
https://leetcode.com/problems/search-insert-position/
*/
public class SearchOrInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if(nums ==null)
            return 0;
        int start=-1;
        int end=nums.length;
        int i=0;
        while(end-start>1)
        {
            int mid=start+(end-start)/2;
            if(target<=nums[mid])
                end=mid;
            else
                start=mid;
        }
        return end;
    }
}