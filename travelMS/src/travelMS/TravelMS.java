package travelMS;

import java.util.Scanner;

public class TravelMS 
{
      public static void main(String[] args) {
       
      Scanner inp=new Scanner(System.in);
      PackageDetails P = new PackageDetails();
      
      exit:
      while(true)
      {
          System.out.println("Enter 1.View tour package details. 2.Book a package. 3.Cancel a package. "
                  + "4.View transaction details. 5.Exit");
          int ch=inp.nextInt();
          
          switch(ch)
          {
              case 1: {
                        P.details();
                        P.travelMode();
                        break;
                       }
              
              case 5: break exit;
          }
      }
    }

}   