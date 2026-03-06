import java.util.ArrayList;

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> ls = new ArrayList<>();
        int curr = 0;
        int start = 0;

        for (int i = 0; i < arr.length; i++) {
            curr += arr[i];

            while (curr > target && start < i) {
                curr -= arr[start];
                start++;
            }

            if (curr == target) {
                ls.add(start + 1);
                ls.add(i + 1);
                return ls;
            }
        }

        ls.add(-1);
        return ls;
    }
}