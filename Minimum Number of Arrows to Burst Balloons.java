class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)-> Integer.compare(a[1],b[1]));
        int arrow=1;
        int previous=points[0][1];
        for(int i=0;i<points.length;++i){
            if(points[i][0]>previous){
                arrow++;
                previous=points[i][1];
            }
        }
        return arrow;   
    }
}
