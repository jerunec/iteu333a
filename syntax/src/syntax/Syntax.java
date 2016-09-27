/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rplaganas
 */
public class Syntax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String a ;    
        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        int pos,mul,div,add,sub;
        a=scan.nextLine();
        //*e=a+b-c*d/0
        
        if(a.contains("*")){
         pos= a.indexOf("*");
        System.out.println(a.substring(pos-1,pos)+"wow"+a.substring(pos+1,pos));
        list.add(a.substring(pos-1,pos));
        list.add(a.substring(pos+1,pos));
        }
         if(a.contains("/")){
         pos= a.indexOf("/");
        System.out.println(a.substring(pos-1,pos)+"wow"+a.substring(pos+1,pos));
        list.add(a.substring(pos-1,pos));
        list.add(a.substring(pos+1,pos));
        }
           if(a.contains("*")){
         pos= a.indexOf("*");
        System.out.println(a.substring(pos-1,pos)+"wow"+a.substring(pos+1,pos));
        list.add(a.substring(pos-1,pos));
        list.add(a.substring(pos+1,pos));
        }
              if(a.contains("-")){
         pos= a.indexOf("-");
        System.out.println(a.substring(pos-1,pos)+"wow"+a.substring(pos+1,pos));
        list.add(a.substring(pos-1,pos));
        list.add(a.substring(pos+1,pos));
        }
                 if(a.contains("=")){
         pos= a.indexOf("=");
        System.out.println(a.substring(pos-1,pos)+"wow"+a.substring(pos+1,pos));
        list.add(a.substring(pos-1,pos));
        list.add(a.substring(pos+1,pos));
        }
       
        
        
        for(int i=0; i< list.size();i++){
        System.out.println(list.get(i));
    }
    }
}
