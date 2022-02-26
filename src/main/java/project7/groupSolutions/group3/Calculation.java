package project7.groupSolutions.group3;

import java.util.ArrayList;

public class Calculation {

    public int getRam(ArrayList<String> list){
        int price = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("32 gb"))
                price = 300;
            else if(list.get(i).equals("16 gb"))
                price = 200;
            else if(list.get(i).equals("8 gb"))
                price = 100;
            else if (list.get(i).equals("4 gb"))
                price = 50;
        }
        return price;

    }


    public int getCPU(ArrayList<String> list){
        int price = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("i3"))
                price = 200;
            else if(list.get(i).equals("i5"))
                price = 300;
            else if(list.get(i).equals("i7"))
                price = 500;
        }
        return price;

    }


    public int getColor(ArrayList<String> list){
        int price = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("Red"))
                price = 400;
            else if(list.get(i).equals("Orange"))
                price = 300;
            else if(list.get(i).equals("Silver"))
                price = 200;
            else if (list.get(i).equals("Black"))
                price = 150;
        }
        return price;

    }


    public int getSize(ArrayList<String> list){
        int price = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("Mini"))
                price = 100;
            else if(list.get(i).contains("Middle"))
                price = 200;
            else if(list.get(i).contains("Max"))
                price = 300;
        }
        return price;

    }

}
