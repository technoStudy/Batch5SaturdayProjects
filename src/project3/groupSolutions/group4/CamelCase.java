package project3.groupSolutions.group4;

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

import java.util.Locale;

public class CamelCase {

    public String camelCase(String str) {
        String[] strArray = str.split(" ");
        String titleCaseSentence = "";

        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = strArray[i].substring(0, 1).toUpperCase() + strArray[i].substring(1);

            titleCaseSentence += strArray[i];

            if (i == strArray.length - 1) break; //to avoid adding space after the last word
            titleCaseSentence += " ";
        }

        return titleCaseSentence;
    }
}



