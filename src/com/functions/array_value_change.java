package com.functions;
import java.util.Arrays;
public class array_value_change {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int [] arr){
        arr[0]=45;// in this it changes the 0th index of the array in the static function for we have seen in the string
        // it does not changes bcoz strings r immutable so...
    }

}

