package project2.groupSolutions.group2;

public class SumTotal {
    /*
        Create the following 2D String array (you may hard-code for creating it)
        {{"$12", "$22", "5"},{"€9", "€10", "€40", "$1" , "$2"}, {"€12", 6, $4, 1}}

        if the String has $ multiply the value by 3.2
        if the String has € multiply the value by 4.2
        if the element has no $ or € use its own number value
        Print the sum of all values  // (output is to be 441.4)
     */

    public static void main(String[] args) {
        float tempt =0;
String [][] arrray =   {{"$12", "$22", "5"},{"€9", "€10", "€40", "$1" , "$2"}, {"€12", "6", "$4", "1"}};
        for (int i = 0; i < arrray.length; i++) {
            for (int j = 0; j < arrray[i].length; j++) {
                if (arrray[i][j].contains("$")){

                    tempt = (float) (tempt+Integer.parseInt(arrray[i][j].replace("$",""))*3.2);
                }
               else if (arrray[i][j].contains("€")){

                    tempt = (float) (tempt+Integer.parseInt(arrray[i][j].replace("€",""))*4.2);
                }
               else{
                    tempt = tempt+Integer.parseInt(arrray[i][j]);
                }
            }
        }
        System.out.println(tempt);
    }
}



