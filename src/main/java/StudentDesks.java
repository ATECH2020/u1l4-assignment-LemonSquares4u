import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanboi = new Scanner(System.in);

        //Reads ints from user
         int classOneKids = scanboi.nextInt();
         int classTwoKids = scanboi.nextInt();
         int classThreeKids = scanboi.nextInt();

         //a desk holds two kids 
        /*
         *  your code goes here
         */
         int classOneDesksNeed,classTwoDesksNeed, classThreeDesksNeed, desksNeeded = 0;

         classOneDesksNeed = classOneKids / 2.0;
         classTwoDesksNeed = classTwoKids / 2.0;  
         classThreeDesksNeed = classThreeKids / 2.0;  

         desksNeeded = classOneDesksNeed + classTwoDesksNeed + classThreeDesksNeed;

          System.out.print(desksNeeded);

        // closing the scanner object
        scanboi.close();
    }
}