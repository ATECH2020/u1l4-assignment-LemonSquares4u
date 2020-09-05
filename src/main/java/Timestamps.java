import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();


       /*
       *  your code goes here
       */
       int deltaH = 0;
       int deltaM = 0;
       int deltaS = 0;
 
       int conH = 0;
       int conM = 0;
       int totalS = 0;

       deltaH = hours2 - hours1;
       deltaM = minutes2 - minutes1;
       deltaS = seconds2 - seconds1;
 
        conH = deltaH * 3600;
        conM = deltaM * 60;
 
        totalS = conH + conM + deltaS;
        System.out.print(/*"Difference in terms of Seconds: " + */totalS);



        // closing the scanner object
        scanner.close();
    }
}