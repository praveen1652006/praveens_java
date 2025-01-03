package com.oops.generics;
import java.util.*;
public class CustomArrayList <T extends Number>{
    private Object[] arr;
    private static int default_size = 10;
    private int size = 0;

    public CustomArrayList() {
        this.arr = new Object[default_size];
    }

    public void add(T num) {
        if (this.isFull()) {
            this.resize();
        }
        arr[size] = num;
        size++;
    }

    private void resize() {
        Object[] temp = new Object[size * 2];
        for (Object i : arr) {
            temp[(int) i] = arr[(int) i];
        }
        arr = temp;
    }

    private boolean isFull() {
        return size == arr.length;
    }

    public T remove() {
        T removed = (T) arr[size--];
        return removed;
    }

    public T get(int index) {
        return (T)arr[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        arr[index] = value;
    }

    public void addFirst(T value) {
        arr[0] = value;
    }

    public void addLast(T value) {
        arr[arr.length-1] = value;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        st.add(0);
//        list.add(19);
//        list.add(6);
        CustomArrayList<Integer> list1=new CustomArrayList<>();
//        list1.add(2);
//        list1.add(2);
//        list1.add(2);
//        list1.add(2);
//        list1.add(2);
//        list1.addFirst(3);
//        list1.addLast(1);
//        for(int i=list1.size();i<14;i++){
//            list1.add(2*i);
//        }
//        System.out.println(list1);
    }
}
