class Solution {
    public int jump(int[] nums) {
        int jumps = 0, a=0, b = 0;
        for(int i = 0; i < nums.length -1; i++){
            a= Math.max(a, i +nums[i]);
            if(i == b){
                jumps++;
                b= a;
            }
        }
        return jumps;

    }
}