package project3.groupSolutions.group2;

/*
   Create a method whose name is threeEvenOrOdd
   It takes an int array as parameter
   It returns a boolean

   It returns true if the argument array contains EITHER three even OR three odd values.
   It returns false otherwise.

   Sample:
   [2, 3, 10, 8] -> true
   [5, 11, 27] -> true
   [1, 2, 3, 4] -> false
   [5, 10] -> false
   [2, 4, 6, 8] -> false
   [1, 2, 3, 4, 5, 6] -> true
   [1, 2, 3, 4, 5, 6, 7] -> true
   [1, 2, 3, 4, 5, 6, 7, 8] -> false
 */

public class ThreeEvenOdd {

//    public static void main(String[] args) {
//
//        System.out.println(threeEvenOrOdd(1, 2, 3, 4, 5, 6));
//    }

    public static boolean threeEvenOrOdd(int... arr){
        int even=0, odd=0;

    for(int i=0; i<arr.length;i++){

    if(arr[i]%2==0)
        even++;
    else
        odd++;
    }
        if(even==3 || odd==3)
            return true;
        else
            return false;
    }


}
