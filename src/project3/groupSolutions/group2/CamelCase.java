package project3.groupSolutions.group2;

    /*
   Create a method whose name is camelCase
   It takes a String parameter
   It returns a String

   The String argument is a sentence with some words delimited by a space. The argument might be a single word too.
   The method capitalizes all the first letters of the word(s) in the argument

   Sample-1:
   my family lives in the united states. -> My Family Lives In The United States.

   Sample-2:
   sleeplessness -> Sleeplessness
     */

public class CamelCase {

//    public static void main(String[] args) {
//
//        System.out.println(camelCase("my family lives in the united states"));
//    }


    public static String camelCase(String str){
        String[] arr = str.split(" ");
        String withUpperCase="";

        for(int i=0; i<arr.length;i++){
        withUpperCase+= (arr[i].substring(0,1).toUpperCase().concat(arr[i].substring(1)))+ " ";
        }

        return withUpperCase.trim();
    }


}
