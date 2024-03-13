class Solution {
    public int pivotInteger(int n) {
        if(n==1) return 1;
        int left=1,right=n,sum=n*(n+1)/2;
        while(left<=right){
            int mid=(left+right)/2;
            int midsum=mid*(mid+1)/2;
            int remainingsum=sum-midsum+mid;
            if(midsum==remainingsum) return mid;
            else if(midsum<remainingsum) left=mid+1;
            else right =mid-1;
        }
        return -1;
    }
}
