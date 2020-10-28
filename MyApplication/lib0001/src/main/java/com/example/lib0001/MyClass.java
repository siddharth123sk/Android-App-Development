package com.example.lib0001;


import java.sql.SQLOutput;

public class MyClass {

    public static void main (String [] args){

        Circle c = new Circle();

        Circle c1 = new Circle(20);


        System.out.println(c.getArea());
        System.out.println(c1.getArea());

        printMsg("success");
        int returnvalue = printNewMsg(6);
        System.out.println(returnvalue);

        //System.out.println("Hello guys!");
        int a = 1;
        int b = 3;

        //System.out.println(a+b);

//        int [] c;
//        c = new int[3]; // allocate the memory
//        c[0] = 1;
//        c[1] = 2;
//        c[2] = 3;

        //System.out.println(c[2] + c[0]);

        String word = "Hello SUTD!";
        //System.out.println(word);

        int len = word.length();
        //System.out.println(len);

        char character = 'x';

        char[] characters = {'x', 'y', 'z'};

        String f = new String(characters);

        //System.out.println(f);

        int mark = 65;

        if(mark < 60){
            System.out.println("Mark is less than 60 lol");
        }
        else{
            //System.out.println("Mark is more than 60 duh");
        }

        for(int i = 10; i<20; i++){

            //System.out.println(i);

        }
    }

    public static void printMsg(String s) {

        System.out.println("Message! "  + s);
    }

    public static int printNewMsg(int t){
        System.out.println("Returning something");
        return 6*t;
    }

}