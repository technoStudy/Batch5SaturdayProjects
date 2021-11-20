package project3.groupSolutions.group3;

public class UpdateRange {


    public static int[] updateRange(int[] intArr, int lowerBound, int upperBound) {

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] > lowerBound && intArr[i] < upperBound)
                intArr[i] = -1;

        }
        return intArr;
    }
}





