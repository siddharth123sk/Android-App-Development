package com.example.lib0001;

public class Circle {
    //attribute of data field
    double radius = 1.0;


    //constructor

    Circle(){

    }

    //overloading constructor
    Circle(double newRadius){
        radius = newRadius;
    }



    //method or behavior
    double getArea(){
        return radius*radius*Math.PI;
    }





}
