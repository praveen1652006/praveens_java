/*Example 1:
        Input: array[] = {10,5,10,15,10,5};
        Output: 10 15
        Explanation: The frequency of 10 is 3, i.e. the highest and the frequency of 15 is 1 i.e. the lowest.*/
package com.hashing;
import java.util.HashMap;
import java.util.Map;
public class highest_lowestfrequencyelement {
    public static void main(String[] args) {
        int[] arr1 = {10, 5, 10, 15, 10, 5};
        int n = arr1.length;
        hashit(arr1, n);
    }

    static void hashit(int arr1[], int n) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!hash.containsKey(arr1[i])) {
                hash.put(arr1[i], 1);
            } else {
                hash.put(arr1[i], hash.get(arr1[i]) + 1);
            }
        }
        System.out.println(hash);
        find_max(hash);
    }

    static void find_max(HashMap<Integer, Integer> hash) {
        int max=0;int st_value=0;
        int min=0;
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            int value=entry.getValue();
            int key=entry.getKey();
            if(value>st_value){
                max=key;
                st_value=value;
            }
            else if(value<st_value){
                min=key;
                st_value=value;
            }
        }
        System.out.println("Maximum value: "+max+"minimum value: "+min);
    }
}

