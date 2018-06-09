package travelMS;

import java.util.Scanner;

public class TravelMS 
{
      public static void main(String[] args)
      {
         int i,count;
         double GST_cal = 0;
         double total_package=0,rate=0,GST=0;  
        BookPackage[] B= new BookPackage[10];
        for(i=0; i<B.length; i++)
        {
             B[i]=new BookPackage();
        }

         Billing[] bill=new Billing[10];
         for(i=0; i<bill.length; i++)
        {
             bill[i]=new Billing();
        }
        Scanner inp=new Scanner(System.in);
        PackageDetails P = new PackageDetails();
        CancelPackage C=new CancelPackage();
        int choice;
     
        exit:
      while(true)
      {
          System.out.println("Enter 1.View tour package details. 2.Book a package. 3.Exit");
          choice=inp.nextInt();
          switch(choice)
          {
              case 1: {
                        P.details();
                        P.travelMode();
                        break;
                       }
               case 2:{
                        System.out.println("Enter the number of packages you want to book(only one at a time)");
                        count=inp.nextInt();
                        for(i=0;i<count;i++)
                        {
                            total_package=B[i].customerDetails(total_package);
                            GST_cal = bill[i].GST_calculate(total_package,rate,GST);
                            System.out.println("The GST amount = "+GST_cal);
                        };
                        break;
                        
                     }
               case 3: break exit;
               
              default:System.out.println("Invalid choice entered!!!!");
              
          }
      }
    }
}   