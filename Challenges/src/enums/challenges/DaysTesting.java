package enums.challenges;

public class DaysTesting {
    public static void main(String[] args) {
        System.out.println("Printing all the days of the week");
       /* System.out.println(Days.MONDAY);
        System.out.println(Days.THURSDAY);
        System.out.println(Days.TUESDAY);
        System.out.println(Days.WEDNESDAY);
        System.out.println(Days.FRIDAY);
        System.out.println(Days.SATURDAY);
        System.out.println(Days.SUNDAY);*/


      /*  for(Days day : Days.values()){
            System.out.println(day);
        }*/


        for(Days day : Days.values()){
            System.out.printf("%s : %s\n", day, day.getType());
        }



    }
}
