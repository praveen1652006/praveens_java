/*Input: n = 5, arr[] = [2, 3, 2, 3, 5], p = 5,Output: [0, 2, 2, 0, 1]
 Explanation:
 Counting frequencies of each array element We have: 1 occurring 0 times. 2 occurring 2 times. 3 occurring 2 times.
 4 occurring 0 times. 5 occurring 1 time, all the modifications done in the same given arr[].*/
package com.hashing;
import java.util.HashMap;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
public class hash {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("praveen", 2006);
        map.put("deva", 2006);
        map.put("bhavani", 1986);
        map.put("nisha", 2008);
        System.out.println(map);
//        if(map.containsKey("praveen")) System.out.println("it contains key");
//        else System.out.println("it does not contains key");
        System.out.println(map.get("deva"));
        System.out.println(map);
        for (String i : map.keySet()) {
            System.out.println(i + "->" + map.get(i));
        }// map entry set used map interface
        for (Map.Entry<String, Integer> pk : map.entrySet()) {
            System.out.println("key:" + pk.getKey() + "->" + "Value:" + pk.getValue());
        }
        for (String m : map.keySet()) {
            System.out.println(m);
        }
    }
}

