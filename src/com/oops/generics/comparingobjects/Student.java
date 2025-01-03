package com.oops.generics.comparingobjects;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student>{
    int rno;
    float marks;
    Student(){
        this.rno=9;
        this.marks=100f;
    }
    Student(int rno,float marks){
        this.rno=rno;
        this.marks=marks;
    }

    public static void main(String[] args) {
        Student praveen=new Student(1,100f);
        Student nisha=new Student(2,99.9f);
        if(praveen.compareTo(nisha)>0){
            System.out.println("praveen's mark is greater than praveen");
        }
    }

    public int compareTo(Student T) {
        int diff=(int)(this.marks-T.marks);
        return diff;
    }
}
