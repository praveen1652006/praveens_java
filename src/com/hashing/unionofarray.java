package com.hashing;
import java.util.HashSet;
public class unionofarray{
    public static void main(String[] args) {
       int[] arr1={2,3,4};
       int[] arr2={1,4,5,2};
//        HashSet<Integer> hash=new HashSet<>();
//        for(int i:arr1){
//            hash.add(i);
//        }
//        for(int i:arr2){
//            hash.add(i);
//        }
//        System.out.println(hash);
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]) {
                System.out.println(arr1[i]);
                i++;
            }
            else if(arr1[i]>arr2[j]) {
                System.out.println(arr2[j]);
                j++;
            }

            else {
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }
//        System.out.println(i+""+j);


        // if there is remaining elements in the array
        while(i<arr1.length){
            System.out.print(arr1[i]);
            i++;
        }
        while(j<arr2.length){
            System.out.println(arr2[j]);
            j++;
        }
    }
}