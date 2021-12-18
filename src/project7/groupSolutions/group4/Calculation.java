package project7.groupSolutions.group4;

import java.util.ArrayList;

public class Calculation {

     /*
        Create method whose name is getRam

        Parameter is ArrayList<String>
        return type is int

        if ram is 32 gb add 300 to price
        if ram is 16 gb add 200 to price
        if ram is 8 gb add 100 to price
        if ram is 4 gb add 50 to price

        return the price.
     */

     int getRam(ArrayList<String> list){
         int ramBonus;

         if(list.get(2).equals("32 gb"))
             ramBonus = 300;
         else if(list.get(2).equals("16 gb"))
             ramBonus = 200;
         else if(list.get(2).equals("8 gb"))
             ramBonus = 100;
         else if(list.get(2).equals("4 gb"))
             ramBonus = 50;
         else
             ramBonus = 0;

         return ramBonus;
     }


    /*
       Create method name is getCPU

        return type is int
        Parameter is ArrayList<String>

        if CPU is i3 add 200 to price
        if CPU is i5 add 300 to price
        if CPU is i7 add 500 to price

        return the price.
     */
    int getCPU(ArrayList<String> list){
        int cpuBonus;

        if(list.get(3).equals("i3"))
            cpuBonus = 200;
        else if(list.get(3).equals("i5"))
            cpuBonus = 300;
        else if(list.get(3).equals("i7"))
            cpuBonus = 500;
        else
            cpuBonus = 0;

        return cpuBonus;
    }



    /*
      Create method name is getColor

      Parameter is ArrayList<String>

      return type is int

      if Color is Red add 400 to price
      if Color is Orange add 300 to price
      if Color is Silver add 200 to price
      if Color is Black add 150 to price

      return the price.
   */

    int getColor(ArrayList<String> list){
        int colorBonus;

        if(list.get(4).equals("Red"))
            colorBonus = 400;
        else if(list.get(4).equals("Orange"))
            colorBonus = 300;
        else if(list.get(4).equals("Silver"))
            colorBonus = 200;
        else if(list.get(4).equals("Black"))
            colorBonus = 150;
        else
            colorBonus = 0;

        return colorBonus;
    }

    /*
      Create method name is getSize

      return type is int

      Parameter is ArrayList<String>

      if Size contains "Mini" add 100 to price
      if Size contains "Middle" add 200 to price
      if Size contains "Max" add 300 to price

      return the price.
   */
    int getSize(ArrayList<String> list){
        int sizeBonus;

        if(list.get(1).contains("Mini"))
            sizeBonus = 100;
        else if(list.get(1).contains("Middle"))
            sizeBonus = 200;
        else if(list.get(1).contains("Max"))
            sizeBonus = 300;
        else
            sizeBonus = 0;

        return sizeBonus;
    }


}
