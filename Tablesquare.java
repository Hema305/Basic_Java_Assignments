/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.practice;

/**
 *
 * @author HEMA
 */
import java.lang.Math;
public class Tablesquare {
    public static void main(String args[]){
  int number=5,multiplicationResult,square;
  
            for(int i=1;i<=10;i++)
            {
             multiplicationResult=number*i;
             square=(int) Math.pow(multiplicationResult,2);
             System.out.println(number+"*"+i+"="+multiplicationResult+"---------"+square);
            }
    
         }
 
    }
