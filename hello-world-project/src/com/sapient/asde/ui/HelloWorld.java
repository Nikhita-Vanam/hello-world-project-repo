package com.sapient.asde.ui;
/**
*@author saivanam1
 * @version 1.0
 *
 * java.lang need not be explicitly imported
 * System,Object,math,Class,String,StringBuffer etc are a part of this
 *
 * Working on command line arguments
*/
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("I am "+args[0]);
        System.out.println("I am ok now");
    }
}
