package project7.groupSolutions.group1;

import java.util.ArrayList;
import java.util.TreeMap;

public class Data {

    /*
        YOU HAVE NOTHING TO DO IN THIS FILE.
        THIS FILE IS FOR YOUR PERUSAL.
        DO NOT CHANGE ANY LINE OF THIS FILE

        In this method you have all the data about the laptops.

        Parameter is int

        Return type is ArrayList<String>

        What you have in the ArrayList in order:
         Brand
         Model
         Ram
         CPU
         Color

         This order is always same it will not change.
     */

    public ArrayList<String> AllData(int laptopID){

        TreeMap<Integer , ArrayList<String>> allData  = new TreeMap<>();

        ArrayList<String> s1 = new ArrayList<>();
        s1.add("Apple");
        s1.add("Mac Mini");
        s1.add("4 gb");
        s1.add("i5");
        s1.add("Red");

        allData.put(1100000 , s1);

        ArrayList<String> s2 = new ArrayList<>();
        s2.add("Apple");
        s2.add("Mac Middle");
        s2.add("8 gb");
        s2.add("i5");
        s2.add("Black");

        allData.put(1100001 , s2);

        ArrayList<String> s3 = new ArrayList<>();
        s3.add("Apple");
        s3.add("Mac Max");
        s3.add("8 gb");
        s3.add("i7");
        s3.add("Silver");

        allData.put(1100002 , s3);


        ArrayList<String> s4 = new ArrayList<>();
        s4.add("Apple");
        s4.add("Mac Max");
        s4.add("16 gb");
        s4.add("i7");
        s4.add("Red");

        allData.put(1100003 , s4);

        ArrayList<String> s5 = new ArrayList<>();
        s5.add("Apple");
        s5.add("Mac Max");
        s5.add("32 gb");
        s5.add("i7");
        s5.add("Black");

        allData.put(1100004 , s5);

        ArrayList<String> s6 = new ArrayList<>();
        s6.add("Samsung ");
        s6.add("Creator Mini");
        s6.add("4 gb");
        s6.add("i3");
        s6.add("Red");

        allData.put(1100005 , s6);

        ArrayList<String> s7 = new ArrayList<>();
        s7.add("Samsung");
        s7.add("Creator Middle");
        s7.add("8 gb");
        s7.add("i5");
        s7.add("Black");

        allData.put(1100006 , s7);

        ArrayList<String> s8 = new ArrayList<>();
        s8.add("Samsung");
        s8.add("Creator Max");
        s8.add("16 gb");
        s8.add("i7");
        s8.add("Orange");

        allData.put(1100007 , s8);

        ArrayList<String> s9 = new ArrayList<>();
        s9.add("Samsung");
        s9.add("Creator Max");
        s9.add("32 gb");
        s9.add("i7");
        s9.add("Red");

        allData.put(1100008 , s9);

        return allData.get(laptopID);
    }

}
