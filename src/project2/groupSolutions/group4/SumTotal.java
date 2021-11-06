package project2.groupSolutions.group4;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;

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
        String[][] money = {{"$12", "$22", "5"}, {"€9", "€10", "€40", "$1" , "$2"}, {"€12", "6", "$4", "1"}};

        //System.out.println(Arrays.deepToString(money));

        double sum = 0;
        double number;

        for (String[] values : money) {
            for (String value : values) {
                if (value.charAt(0) == '$'){
                    number = Double.parseDouble(value.substring(1)) * 3.2;
                }else if(value.charAt(0) == '€'){
                    number = Double.parseDouble(value.substring(1)) * 4.2;
                }else{
                    number = Double.parseDouble(value);
                }
                sum+=number;
            }
        }

       // System.out.println("Sum is: " + sum);

        //Additional:
        DecimalFormat df = new DecimalFormat("#.#");

        // System.out.print("Sum with one decimal place is: ");
        System.out.print(df.format(sum));
    }
}



