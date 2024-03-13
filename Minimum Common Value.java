
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
    for(int num:nums1){
        if(usebinary(num,nums2)) return num;
    }
    return -1;
    }
    static boolean usebinary(int target,int nums[]){
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target<nums[mid]) right=mid-1;
            else if(target>nums[mid]) left=mid+1;
            else return true;
        }
        return false;
    }
}
