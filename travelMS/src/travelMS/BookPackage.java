
package travelMS;
import java.util.Scanner;

public class BookPackage {
    
    double pamt;        //package amount
    double tamt;        // travel mode amount
    String name;
    int age;
    
    public double bookManali(double amt)
    {
        pamt=pamt+amt;
        return pamt;
    }
    
    public double bookAndaman(double amt)
    {
        pamt=pamt+amt;
        return pamt;
    }
    
    public double bookGoa(double amt)
    {
        pamt=pamt+amt;
        return pamt;
    }
    
    public double bookOoty(double amt)
    {
        pamt=pamt+amt;
        return pamt;
    }
    
    public double bookLadakh(double amt)
    {
        pamt=pamt+amt;
        return pamt;
    }
    public double bookBus(double bamt)
    {
        tamt=tamt+bamt;
        return bamt;
    }
     public double bookTrain(double tramt)
    {
        tamt=tamt+tramt;
        return tramt;
    }
      public double bookFlight(double famt)
    {
        tamt=tamt+famt;
        return famt;
    }
      public void bookTravelMode(double bamt,double tramt,double famt)
      {
          System.out.println("Ënter the travel mode : 1.Bus\t 2.Train\t 3.Flight");
          Scanner inp=new Scanner(System.in);
          int mode=inp.nextInt();
          switch(mode)
          {
              case 1:{
                        System.out.println("Travel Expenses :"+bookBus(bamt));
                        break;
                     }
              case 2:{
                        System.out.println("Travel Expenses :"+bookTrain(tramt));
                        break;
                     }
              case 3:{
                        System.out.println("Travel Expenses :"+bookFlight(famt));
                        break;
                     }
               
              }
                
          }
      
    public void customerDetails()
    {
       
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the package you want to book:");
        int ch= inp.nextInt();

        System.out.println("Enter the name:");
        name=inp.next();
        System.out.println("Enter the age:");
        age=inp.nextInt();
        
        switch(ch)
        {
            case 1: {
                        System.out.println("Successfully Booked the package for Manali! "
                                + "Transaction amount:" +bookManali(5500));
                        break;
                    }
           
            case 2: {
                       
                        System.out.println("Successfully Booked the package for Andaman! "
                                + "Transaction amount:" +bookAndaman(20500));
                        break;
                    }
            case 3: {
                       
                        System.out.println("Successfully Booked the package for Goa! "
                                + "Transaction amount:" +bookGoa(5999));
                        break;
                    }
            case 4: {
                        
                        System.out.println("Successfully Booked the package for Ooty! "
                                + "Transaction amount:" +bookOoty(8499));
                        break;
                    }
            
            case 5: {
                        
                        System.out.println("Successfully Booked the package for Ladakh! "
                                + "Transaction amount:" +bookLadakh(15500));
                        break;
                    }
            
            
            }
        }
        
        
        
        
        
    }

