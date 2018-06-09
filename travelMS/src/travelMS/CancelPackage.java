
package travelMS;
import java.util.Scanner;


public class CancelPackage 
{
    BookPackage b= new BookPackage();
    
   public double cancelManali(double amt)
    {
        b.pamt=b.pamt-amt;
        return b.pamt;
    }
    
    public double cancelAndaman(double amt)
    {
        b.pamt=b.pamt-amt;
        return b.pamt;
    }
    
    public double cancelGoa(double amt)
    {
        b.pamt=b.pamt-amt;
        return b.pamt;
    }
    
    public double cancelOoty(double amt)
    {
        b.pamt=b.pamt-amt;
        return b.pamt;
    }
    
    public double cancelLadakh(double amt)
    {
        b.pamt=b.pamt-amt;
        return b.pamt;
    }
 
    public double cancelBus(double bamt)
    {
        b.tamt=b.tamt-bamt;
        return b.tamt;
    }
     public double cancelTrain(double tramt)
    {
        b.tamt=b.tamt-tramt;
        return b.tamt;
    }
      public double cancelFlight(double famt)
    {
        b.tamt=b.tamt-famt;
        return b.tamt;
    }
      
     public double cancelTravel(double bamt,double tramt,double famt)
    {
          System.out.println("Ënter the travel mode you have selected : 1.Bus\t 2.Train\t 3.Flight");
          Scanner inp=new Scanner(System.in);
          int mode=inp.nextInt();
        switch (mode) 
        {
            case 1:
                return cancelBus(bamt);
            case 2:
                return cancelTrain(tramt);
            case 3:
                return cancelFlight(famt);
            default:
                return 0;
        }
    }
    public double cancelDetails(double total_package)
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the package you want to cancel: 1.Manali 2.Andaman 3.Goa 4.Ooty 5.Ladakh");
        int ch= inp.nextInt();
        if(total_package==0)
        {    
            System.out.println("No packages booked yet!!");
            return 0;

        }
        else if(ch==1)          
        {
            total_package=total_package-(cancelTravel(3500,1800,10000)+cancelManali(5500));
             return total_package;
         }
           
        else if(ch==2)
        {
            total_package=total_package-(cancelTravel(5500,3800,12000)+cancelAndaman(20500));
            return total_package;
        }
          
        else if(ch==3)
        {
            total_package=total_package-(cancelTravel(3000,2000,5000)+cancelGoa(5999));
            return total_package;
        }
           
        else if(ch==4)
        {
            total_package=total_package-(cancelTravel(4500,2800,8499)+cancelOoty(8499));
            return total_package;
        }
        else if(ch==5) 
        {
            total_package= total_package-(cancelTravel(8000,4500,12000)+cancelLadakh(15500));
            return total_package;
        }
            
        else
          return 0;
        
    }
}

        