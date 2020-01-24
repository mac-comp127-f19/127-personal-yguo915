package basicjava;

/**
 * Course : COMP 127 - S20
 * Author : Yijie Guo
 * File: BasicStuff.java
 * This program contains Class Activity 1.
 */

public class BasicStuff {

    public static void main (String[] args) {
        int age0, age1;
        age0 = 18;
        age1 = 19;
        System.out.println("We are " + age0 + " and " + age1 + " years old!");

        int sumOfAges = age0 + age1;
        System.out.println("The sum of our ages is "+ sumOfAges + ".");
        System.out.println("The sum of our ages is "+ Math.addExact(age0, age1) + ".");

        System.out.println(6/3);
        System.out.println(6/4);
        System.out.println(6.0/4);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE -1);

       /*  Computes the number of weeks, days, and hours in 1600 hours. */
        int numOfHours = 1600;
        int numOfDays = 1 + numOfHours / 24;
        int numOfWeeks = 1 + numOfDays / 7;
        System.out.println("There are "+ numOfWeeks + " weeks, " + numOfDays + " days, and "+ numOfHours+ " hours in 1600 hours.");

        /* Computes the surface area and volume of a solid cone given the radius of its base and height.*/
        double h, r, V, A;
        h = 5.0;
        r = 2.0;
        V = ( 1.0 / 3 ) * Math.PI * Math.pow(r, 2) * h;
        A = Math.PI * Math.pow(r, 2) + Math.PI * r * Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2));
        System.out.println("The surface area of the cone is " + A + ", the volume of the cone is " + V +".");

        }
}
