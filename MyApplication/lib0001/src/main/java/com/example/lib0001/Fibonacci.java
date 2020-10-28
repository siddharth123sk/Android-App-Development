package com.example.lib0001;

public class Fibonacci<p> {
    int n =15;

    public static String fibonacci( int n ){
        //int n = 15;
        int n1 = 0, n2 = 1, n3;
        String string_n = "";
        if (n==1){
            string_n = "0";
            return string_n;
        }
        else if(n==2){
            string_n = "0,1";
        }

        else{

            string_n = "0,1";
            for (int i = 2;i < n; i++){
                n3 = n1 + n2;
                string_n = string_n + "," + n3;
                n1 = n2;
                n2 = n3;

            }
        }

        return string_n;




    }
}