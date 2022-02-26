package project2.solution;

public class SumTotal {
    /*
        Create the following 2D String array (you may hard-code for creating it)
        {{"$12", "$22", "5"},{"€9", "€10", "€40", "$1" , "$2"}, {"€12", 6, $4, 1}}

        if the String has $ multiply the value by 3.2
        if the String has € multiply the value by 4.2
        if the element has no $ or € use its own number value
        Print the sum of all values rounded to one decimal place // (output is to be 441.4)
     */

    public static void main(String[] args) {
        String[][] values = {{"$12", "$22", "5"}, {"€9", "€10", "€40", "$1", "$2"}, {"€12", "6", "$4", "1"}};
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (values[i][j].contains("$")) {
                    values[i][j] = values[i][j].replaceAll("[^\\d.]", "");
                    sum += Integer.parseInt(values[i][j]) * (3.2);
                } else if (values[i][j].startsWith("€")) {
                    values[i][j] = values[i][j].replaceAll("[^\\d.]", "");
                    sum += Integer.parseInt(values[i][j]) * (4.2);
                } else {
                    sum += Integer.parseInt(values[i][j]);
                }
            }
        }
        System.out.printf("%.1f", sum);
    }
}



