package com.xh.myapplication;

/**
 * Created by Administrator on 2017/3/3.
 */
public class A {
    public void m() {
        System.out.print("1");
    }
    public static int m2(){
        System.out.print("2");
        return 2;

    }
    public  int m3(){
        System.out.print("3");
        return 3;
    }
}

 class B extends A{
    public void m4() {
        System.out.print("4");
    }
    public static int m2(){
        System.out.print("5");
        return 5;
    }
    public  int m3(){
        System.out.print("6");
        return 6;
    }
     public static void main(String[] args){
         System.out.print("7");
        // A a=new B();
     }
}



