class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int len =citations.length;
        int hIndex =0;
        for(int i=0; i < len; i++){
            int h = len - i;
            if(citations[i] >= h){
                return h;
            }
        }
        return 0;

        
    }
}