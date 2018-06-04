
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
        return tamt;
    }
    
    public void bookTravelMode(double bamt, double tramt, double famt)
    {
        System.out.println("Enter the travel mode: 1.Bus 2.Train 3.Flight");
        Scanner inp=new Scanner(System.in);
        int mode = inp.nextInt();
        switch(mode)
        {
            case 1: {
                          System.out.println("Travel expenses: "+bookBus(bamt));
                         break;
                    }
            
           case 2: {
                          System.out.println("Travel expenses: "+bookTrain(tramt));
                         break;
                    }
            
           case 3: {
                          System.out.println("Travel expenses: "+bookFlight(famt));
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
                                + "Package expenses:" +bookManali(5500));
                        bookTravelMode(3500,1800,10000);
                        
                        break;
                    }
           
            case 2: {
                       
                        System.out.println("Successfully Booked the package for Andaman! "
                                + "Package expenses:" +bookAndaman(20500));
                        bookTravelMode(5500,3800,12000);
                        break;
                    }
            case 3: {
                       
                        System.out.println("Successfully Booked the package for Goa! "
                                + "Package expenses:" +bookGoa(5999));
                        bookTravelMode(3000,2000,5000);
                        break;
                    }
            case 4: {
                        
                        System.out.println("Successfully Booked the package for Ooty! "
                                + "Package expenses:" +bookOoty(8499));
                        bookTravelMode(4500,2800,8499);
                        break;
                    }
            
            case 5: {
                        
                        System.out.println("Successfully Booked the package for Ladakh! "
                                + "Package expenses:" +bookLadakh(15500));
                        bookTravelMode(8000,4500,12000);
                        break;
                    }
            
            
            }
         }
        
        
        
        
        
    }

