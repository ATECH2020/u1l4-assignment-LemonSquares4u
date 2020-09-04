import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int seconds = scanner.nextInt();

        //Your code goes here
        int hours = 0;
       int minutes = 0;
 
       /*System.out.print("Amount of seconds user entered: " + seconds);*/

       hours = seconds / 3600;
       minutes = seconds / 60;
       System.out.print("Hours and minutes: " + hours + " " + minutes);

        // closing the scanner object
        scanner.close();
    }
}