/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Javalab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
        System.out.println("Input a string");
        String str = sc.nextLine();
        
        for(int i=0; i<str.length();i++)
        {
          if(str.charAt(i)>='0'&&str.charAt(i)<='9')
            {
                   System.out.print("Token: ");
             while(Character.isDigit(str.charAt(i)))
                 {
                    
                    System.out.print(str.charAt(i));
                      if(i==str.length()-1||!Character.isDigit(str.charAt(i+1)))
                        break;
                    if(Character.isDigit(str.charAt(i+1)))
                        i++;
                }
                 System.out.println("");
                System.out.println("Type: Number");
            }
            else if(Character.isLetter(str.charAt(i)))
            {
                 System.out.print("Token: ");
                
                
                    
                while(Character.isLetter(str.charAt(i))||Character.isDigit(str.charAt(i)))//(str.charAt(i)>='0' && str.charAt(i)<='9')&&i<str.length())
                {
                    
                    System.out.print(str.charAt(i));
                          if(i==str.length()-1||(!Character.isDigit(str.charAt(i+1))&&!Character.isLetter(str.charAt(i+1))))
                        break;
                    if(Character.isDigit(str.charAt(i+1))||Character.isLetter(str.charAt(i+1)))
                        i++;
                }
                   
                System.out.println("");
                System.out.println("Type: Identifier");
            }
         else if(str.charAt(i)=='*')
            {
            System.out.println("Token: *");
            System.out.println("Type: Times");
            }
            else if(str.charAt(i)=='+')
            {
            System.out.println("Token: +");
            System.out.println("Type: Plus");
            }
            else if(str.charAt(i)=='-')
            {
            System.out.println("Token: -");
            System.out.println("Type: Minus");
            }      
            else if(str.charAt(i)=='=')
            {
            System.out.println("Token: =");
            System.out.println("Type: Assign");
            }
            else if(str.charAt(i)=='(')
            {
            System.out.println("Token: (");
            System.out.println("Type: Left Parenthesis");
            }   
            else if(str.charAt(i)==')')
            {
            System.out.println("Token: )");
            System.out.println("Type: Right Parenthesis");
            }   
            else if(str.charAt(i)=='/')
            {
            System.out.println("Token: /");
            System.out.println("Type: Divide");
            }   
            else if(str.charAt(i)==';')
            {
            System.out.println("Token: ;");
            System.out.println("Type: Semi");
            }   
             
        }
    }
}
    

