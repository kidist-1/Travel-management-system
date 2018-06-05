/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelMS;

/**
 *
 * @author shahy
 */
public class Billing extends BookPackage
{
    public double GST_calculate(double total_package,double rate,double GST)
    {
        System.out.println("The total_amt::"+total_package);
        rate=(total_package*12)/112;
        System.out.println("The Rate::"+rate);
        GST=total_package-rate;
        return GST;
    }
}
