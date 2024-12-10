package com.basic_programs;
public class count_first_occurence {
    public static void main(String[] args) {
        String haystack="leetcode";
        String needle="leeto";
        int n=haystack.length()-1;
        int c=0;
        int i=0;
        while(i<needle.length()){
            if(needle.charAt(i)==haystack.charAt(i)){
                c++;
            }
            i++;
        }
        if(c==needle.length()) {
            System.out.println(0);
        }
        else System.out.println(-1);
    }
}
