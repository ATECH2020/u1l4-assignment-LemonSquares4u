import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanboi = new Scanner(System.in);

        //Reads ints from user
        int hourHandDegree = scanboi.nextInt();

        /*
         *  your code goes here
         */

         int partialHour, remaindingDegree, remainder, minutes, minHandDegree = 0;

          partialHour = hourHandDegree % 30;
          remaindingDegree = partialHour /6;
          remainder = partialHour % 6;
          minutes = (remaindingDegree * 12) + (remainder * 2);
          minHandDegree = minutes * 6;

          System.out.print(minHandDegree);


        // closing the scanner object
        scanner.close();
    }
}