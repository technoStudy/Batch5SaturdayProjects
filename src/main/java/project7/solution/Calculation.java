package project7.solution;

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
    int price;
    public int getRam(ArrayList<String> list){
        switch (list.get(2)) {
            case "32 gb":
               return price += 300;
            case "16 gb":
               return price += 200;
            case "8 gb":
                return price += 100;
            case "4 gb":
                return price += 50;
            default:
               return price = 0;
        }
    }

    public int getCPU(ArrayList<String> list){
        switch (list.get(3)) {
            case "i3":
               return price += 200;
            case "i5":
               return price += 300;
            case "i7":
               return price += 500;
            default:
               return price = 0;
        }
    }

    public int getColor(ArrayList<String> list){
        switch (list.get(4)) {
            case "Red":
                return price += 400;
            case "Orange":
               return price += 300;
            case "Silver":
                return price += 200;
            case "Black":
               return price += 150;
            default:
                return price = 0;
        }
    }

    public int getSize(ArrayList<String> list){
            if(list.get(1).contains("Mini")){
                price += 100;
            }else if(list.get(1).contains("Middle")){
                price += 200;
            }else if(list.get(1).contains("Max")){
                price += 300;
            }
        return price;
    }
}
