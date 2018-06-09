/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelMS;
import java.text.DecimalFormat;
/**
 *
 * @author shahy
 */
public class Billing extends BookPackage
{
    private static DecimalFormat df2 = new DecimalFormat(".##");
    
    public double GST_calculate(double total_package,double rate,double GST)
    {
        System.out.println("The total_amt:: " +df2.format(total_package));
        
        GST=(total_package*12)/112;
        rate=total_package-GST;
        System.out.println("The Rate::" +df2.format(rate));
        
        return GST;
    }
}
