package com.hashing;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class majorityelement {
    public static void main(String[] args){
        HashMap<Integer,Integer> map=new HashMap<>();
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])) map.put(arr[i],map.get(arr[i])+1);
            else map.put(arr[i],1);
        }
        for(int i:map.keySet()){
            if(map.get(i)>arr.length/3) System.out.println(i);
        }

    }
}
