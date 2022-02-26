package  project3.solution;

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
    public String camelCase(String sentence) {
        String[] wordArray = sentence.split(" ");
        String result = "";
        for (String s : wordArray) {
            result += s.substring(0, 1).toUpperCase() + s.substring(1) + " ";
        }
        return result.trim();

////////  Alternatively, it is recommended to use StringBuilder instead of String  //////////////////////////
//        StringBuilder result = new StringBuilder();
//        for (String s : wordArray) {
//            result.append(s.substring(0, 1).toUpperCase()).append(s.substring(1)).append(" ");
//        }
//        return result.toString().trim();
    }
}
