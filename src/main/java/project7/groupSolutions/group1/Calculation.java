package project7.groupSolutions.group1;

import java.util.ArrayList;

public class Calculation {



    public  int getRam(ArrayList<String> laptopDetail){

        int priceRam=0;
        if (laptopDetail.get(2).equals("4 gb")){
            priceRam += 50;
        }else if (laptopDetail.get(2).equals("8 gb")){
            priceRam += 100;
        }else if (laptopDetail.get(2).equals("16 gb")){
            priceRam +=200;
        }else if(laptopDetail.get(2).equals("32 gb")){
            priceRam += 300;
        }return priceRam;

    }

    public  int getCPU(ArrayList<String> laptopDetail ) {
        int priceCPU = 0;
        if (laptopDetail.get(3).equals("i3")) {
            priceCPU += 200;
        } else if (laptopDetail.get(3).equals("i5")) {
            priceCPU += 300;
        } else if (laptopDetail.get(3).equals("i7")) {
            priceCPU += 500;
        }return priceCPU;
    }

    public  int getColor(ArrayList<String> laptopDetail) {
        int price = 0;
        if (laptopDetail.get(4).equals("Red")) {
            price += 400;
        } else if (laptopDetail.get(4).equals("Orange")) {
            price += 300;
        } else if (laptopDetail.get(4).equals("Silver")) {
            price += 200;
        } else if (laptopDetail.get(4).equals("Black")) {
            price += 150;
        }return price;
    }

    public  int getSize(ArrayList<String> laptopDetail){
        int price = 0;
        if (laptopDetail.get(1).contains("Mini")) {
            price +=100;
        }else if (laptopDetail.get(1).contains("Middle")){
            price +=200;
        }else if (laptopDetail.get(1).contains("Max")){
            price +=300;
        }return price;
    }

}

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

