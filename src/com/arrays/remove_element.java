/*nums = [3,2,2,3], val = 3
        Output: 2, nums = [2,2,_,_]
        Explanation: Your function should return k = 2, with the first two elements of nums being 2.
        It does not matter what you leave beyond the returned k (hence they are underscores)*/
package com.arrays;

import java.util.Arrays;

import static com.arrays.insertion_sort.swap;
public class remove_element {
    public static void main(String[] args) {
        int[] arr1={2,2,3,3};
        int i=0;
        int n=arr1.length-1;
        int value=2;
        int[] arr2=new int[n];
        while(i<=n){
            if(arr1[i]==value){
                swap(arr1,i,n);
                n--;
            }
            else i++;
        }
        for(int j=arr1.length-1;j>=0;j--){
            if(arr1[j]==value){
                arr2[j]=arr1[j];
            }
            else{
                break;
            }
        }
        System.out.println(Arrays.toString(arr1));







//        for(int i=0;i<n;i++) {
//            if (arr1[i] != value) {
//                arr2[i] = arr1[i];
//            }
//        }
//        int c=0;
//        for(int i=0;i<n;i++){
//            if(arr1[i]!=value){
//                c++;
//            }
//        }
//        System.out.println(c);
    }
}
