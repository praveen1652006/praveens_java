package com.arrays;
import java.util.*;
public class removeduplicates {
    public static void main(String[] args) {
                int[] nums={1,1,2};
                HashMap<Integer,Integer> map=new HashMap<>();
                for(int i=0;i<nums.length;i++)
                {
                    if(!map.containsKey(nums[i])){
                        map.put(nums[i],1);
                    }
                    else
                    {
                        map.put(nums[i],map.get(nums[i])+1);
                    }
                }
                int[] arr=new int[map.size()];
                int i=0;
                for(int key:map.keySet()){
                    //if(map.get(key)>=1){
                        arr[i]=key;
                        i++;
                    //}
                }
                System.out.println(Arrays.toString(arr));
                System.out.println(arr.length);
    }
}

