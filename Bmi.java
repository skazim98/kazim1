/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;
//THIS IS BMI
/**
 *
 * 
 */
import java.util.*;
public class Bmi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     System.out.println("Input your weight:");
     double weight=input.nextDouble();
     double pound=weight*0.45359237;
     System.out.println(weight+"kg weight is"+pound+"ponds");
     
     System.out.println("Input your height:");
     double inch=input.nextDouble();
     double feet=inch*0.0254;
     System.out.println(inch+"inches is"+ feet +"feets");
     
     double BMI = pound/(feet * feet);
     System.out.println(BMI + "is bmi");
        // TODO code application logic here
    }
    
}

