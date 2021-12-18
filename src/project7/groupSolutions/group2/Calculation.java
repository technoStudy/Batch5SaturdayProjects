package project7.groupSolutions.group2;

import java.util.ArrayList;
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

  /*
       Create method name is getCPU

        return type is int
        Parameter is ArrayList<String>

        if CPU is i3 add 200 to price
        if CPU is i5 add 300 to price
        if CPU is i7 add 500 to price

        return the price.
     */
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
      /*
      Create method name is getSize

      return type is int

      Parameter is ArrayList<String>

      if Size contains "Mini" add 100 to price
      if Size contains "Middle" add 200 to price
      if Size contains "Max" add 300 to price

      return the price.
   */

public class Calculation {

    int totalPrice=0;


    public int getRam(ArrayList<String> laptop){
        if(laptop.get(2).equals("32 gb"))
            totalPrice +=300;
        if(laptop.get(2).equals("16 gb"))
            totalPrice +=200;
        if(laptop.get(2).equals("8 gb"))
            totalPrice +=100;
        if(laptop.get(2).equals("4 gb"))
            totalPrice +=50;

        return totalPrice;
    }



    public int getCPU(ArrayList<String> araba) {
        if(araba.get(3).equals("i3"))
            totalPrice +=200;
        if(araba.get(3).equals("i5"))
            totalPrice +=300;
        if(araba.get(3).equals("i7"))
            totalPrice +=500;
        return totalPrice;
    }

    public int getColor(ArrayList<String> laptop){
        if(laptop.get(4).equals("Red"))
            totalPrice +=400;
        if(laptop.get(4).equals("Orange"))
            totalPrice +=300;
        if(laptop.get(4).equals("Silver"))
            totalPrice +=200;
        if(laptop.get(4).equals("Black"))
            totalPrice +=150;
        return totalPrice;
    }



    public int getSize(ArrayList<String> laptop){

        if(laptop.get(1).contains("Mini"))
            totalPrice +=100;
        if (laptop.get(1).contains("Middle"))
            totalPrice +=200;
        if (laptop.get(1).contains("Max"))
            totalPrice +=300;
        return totalPrice;

    }



}
