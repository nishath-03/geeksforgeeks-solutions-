class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        Boolean bool = false;
        int sec = Integer.MIN_VALUE;
        int first = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>first){
                sec=first;
                first = arr[i];
                bool = true;    
                }
            if(arr[i]<first && arr[i]>sec){
                sec = arr[i];
                bool=true;
            }
            }
        return bool?sec:-1;
    }
}