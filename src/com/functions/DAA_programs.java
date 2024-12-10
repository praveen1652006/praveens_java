package com.functions;
import java.util.Scanner;
public class DAA_programs {
        public static void main(String[] args) {
            Scanner obj=new Scanner (System.in);
            int n=obj.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=obj.nextInt();
            }
            int zerocount=countzeros(arr,n);
            System.out.println(zerocount);
        }
        static int firstindex(int arr[],int n){
            int low=0;
            int high=n-1;
            int first_index=-1;
            int mid=0;
            while(low<=high){
                mid=(low+high)/2;
                if(arr[mid]==0){
                    first_index=mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            return first_index;
        }
        static int countzeros(int arr[],int n){
            int firstzero=firstindex(arr,n);
            if(firstzero==-1){
                return 0;
            }
            return n-firstzero;
        }
    }
