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
         double classOneDesksNeed,classTwoDesksNeed, classThreeDesksNeed, desksNeeded = 0;
         int roundedDesks = 0;

         /*int classOneExtras,classTwoExtras,classThreeExtras,extraTotal = 0;*/

         /*classOneDesksNeed = classOneKids / 2.0;
         classTwoDesksNeed = classTwoKids / 2.0;  
         classThreeDesksNeed = classThreeKids / 2.0;  

         desksNeeded = classOneDesksNeed + classTwoDesksNeed + classThreeDesksNeed;*/

        desksNeeded = (classOneKids/2.0) + (classTwoKids/2.0) + (classThreeKids/2.0); 

         /*classOneExtras = classOneKids % 2;
         classTwoExtras = classOneKids % 2;
         classThreeExtras = classOneKids % 2;

         extraTotal = classOneExtras + classTwoExtras + classThreeExtras;*/ 

         roundedDesks = (int) Math.round(desksNeeded); 
        if(roundedDesks < 3)
         {
           roundedDesks = 3; 
         }
          System.out.print(/*"desks needed " + */roundedDesks);

          /*System.out.print(" Odd classes spilover: " + extraTotal);*/

        // closing the scanner object
        scanboi.close();
    }
}