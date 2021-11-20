package project3.groupSolutions.group3;

public class GetPopulation {

  public static void main(String[] args) {

//        String[] countries = {"USA" ,"Mexico" ,"Canada"};
//        int[] countriesPopulation = {100000 , 120000 , 130000};
//        String targetCountry = "USA";
//        System.out.println();


    }public static int populationOfCountry (String[] countries, int[] population, String checkCountry){

        for (int i = 0; i < countries.length; i++) {
            if(countries[i].equals(checkCountry))
                return population[i];
        }
        return -1;
    }
}
