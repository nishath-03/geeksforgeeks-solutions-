class Solution {
    int missingNum(int arr[]) {
        // code here
        long len = arr.length+1;
        long total  = len*(len+1)/2;
        len--;
        long sum=0;
        for(int i=0;i<len;i++){
            sum+=arr[i];
        }
        return (int)(total - sum);
          
        
    }
}