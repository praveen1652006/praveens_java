package com.hashing;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
// the above logic is used o determine the count of intersection b/w two arrays
public class intersection {
    public static void main(String[] args) {
        int[] arr1 = {8, 8, 9, 3, 4, 5, 9, 1};
        int[] arr2 = {8, 3, 1};
        int count = 0;
        HashSet<Integer> hash = new HashSet<>();
//        for(int i:arr1){
//            hash.add(i);
//        }
//        System.out.println(hash);
//        for(int i:arr2){
//            if(hash.contains(i)){
//                count++;
//                hash.remove(i);
//            }
//        }
//        System.out.println(count);
//
//    }
        HashSet<Integer> hash1=new HashSet<>();
        for(int i:arr1){
            hash.add(i);
        }
        //System.out.println(hash);
        for(int i:arr2){
            if(hash.contains(i)){
                count++;
                hash1.add(i);
            }
        }
        System.out.println(hash1);
    }
}
