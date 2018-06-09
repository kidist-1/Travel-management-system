package travelMS;
import java.util.Scanner;
public class BookPackage 
{
    double pamt;        //package amount
    double tamt;        // travel mode amount
    String name;
    int age;
    double total_package;
    
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
     public double bookTrain(double tramt)
    {
        tamt=tamt+tramt;
        return tamt;
    }
      public double bookFlight(double famt)
    {
        tamt=tamt+famt;
        return tamt;
    }
    public double bookTravelMode(double bamt,double tramt,double famt)
    {
          System.out.println("Ënter the travel mode : 1.Bus\t 2.Train\t 3.Flight");
          Scanner inp=new Scanner(System.in);
          int mode=inp.nextInt();
          if(mode==1)
              return bookBus(bamt);
          else if(mode==2)
                return bookTrain(tramt);
          else if(mode==3)
               return bookFlight(famt);
          else
              return 0;
    }
    
    public double customerDetails(double total_package)
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
                        total_package=bookTravelMode(3500,1800,10000)+bookManali(5500);
                        return total_package;
                    }
           
            case 2: {
                        total_package=bookTravelMode(5500,3800,12000)+bookAndaman(20500);
                        return total_package;
                        
                    }
            case 3: {
                        total_package=bookTravelMode(3000,2000,5000)+bookGoa(5999);
                        return total_package;
                    }
            case 4: {
                        total_package=bookTravelMode(4500,2800,8499)+bookOoty(8499);
                        return total_package;
                    }
            case 5: {
                        total_package= bookTravelMode(8000,4500,12000)+bookLadakh(15500);
                        return total_package;
                    }
            default:return 0;
           
        }
    }
    
}

