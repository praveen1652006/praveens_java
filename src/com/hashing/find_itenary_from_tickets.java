package com.hashing;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
public class find_itenary_from_tickets {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("chennai", "bengaluru");
        map.put("mumbai", "delhi");
        map.put("goa", "chennai");
        map.put("delhi", "goa");
        String start = find_itenary(map);
        System.out.println(start);
        while(map.containsKey(start)){
            System.out.print(start+"->");
            start=map.get(start);
        }
        System.out.print(start);
    }

    static String find_itenary(HashMap<String, String> map) {
        HashMap<String, String> revmap = new HashMap<>();
        for (String key : map.keySet()) {
            revmap.put(map.get(key), key);
        }
        for (String start : map.keySet()) {
            if (!revmap.containsKey(start)) {
                return start;
            }
        }
        return null;
    }
}


