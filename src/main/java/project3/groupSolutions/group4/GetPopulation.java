package project3.groupSolutions.group4;

/*
   Create a method whose name is populationOfCountry
   As parameters it takes a String array, an int array and a String (in order)
       First parameter (String array) is a non-empty array of 'country names'
       Second parameter (int array) is a non-empty array of 'country population' of the corresponding country
       (i.e. sharing the same index, so the length of the two parameter arrays are the same)
       Third parameter (String) is the name of a country
   The method returns an int

   If the name of the country is in the country names array then the method returns the population of that country.
   If not, the method return -1

   Sample - 1:
        countryNames = {"USA" ,"Mexico" ,"Canada"}
        countryPopulations = {100000 , 120000 , 130000}
        country = "Mexico"
        method returns 120000

   Sample - 2:
        countryNames = {"USA" ,"Mexico" ,"Canada"}
        countryPopulations = {100000 , 120000 , 130000}
        country = "Russia"
        method returns -1
 */


public class GetPopulation {

    public int populationOfCountry (String[] countries, int[] countriesPopulation, String targetCountry){

        for (int i = 0; i < countries.length; i++) {
            if(countries[i].equals(targetCountry))
                return countriesPopulation[i];
        }
        return -1;
    }

}


