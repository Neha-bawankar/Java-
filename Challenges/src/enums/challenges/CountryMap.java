package enums.challenges;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("Bharat", " New Delhi");
        countryMap.put("China", " Beijing");
        countryMap.put("Pakistan", " Islamabad");
        countryMap.put("Bangladesh", " Dhaka");
        countryMap.put("USA", " W.C Washington");
        countryMap.put("Nepal", " Kathmandu");
        countryMap.put("Canada", " Ottawa");



        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the country names:");
        String country = input.next();


        if(countryMap.containsKey(country)){
            System.out.printf("Capital of %s is %s", country, countryMap.get(country));
        }else{
            System.out.println("Sorry we don't know the capital");
        }




    }
}
