/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign2;

/**
 *
 * @author BHARATH sharan
 */
import java.util.ArrayList;
import java.util.Scanner;
public class tofindrepeatedele {
    void intersect(ArrayList<Integer> L1,ArrayList<Integer> L2)
    
    {
        L1.retainAll(L2);
       
    }

    public static void main(String[] arg) {
  
        int a, a1,a2,i=0;        
        System.out.println("Enter the size of LIST 1  --> ");
        ArrayList<Integer> L1=new ArrayList();
        Scanner z=new Scanner(System.in);
        a1 =z.nextInt();
        
        
        for(i=1;i<=a1;i++)
        {
            System.out.println("Enter the ELEMENT LIST 1 --> "+i);
            a=z.nextInt();
            L1.add(a);
            
        }
         
        System.out.println("Enter the size of LIST 2  -->:");
        ArrayList<Integer> L2=new ArrayList();
        a2=z.nextInt();
        
        
        
         for(i=1;i<=a2;i++)
        {
            System.out.println("Enter the ELEMENT LIST 2 -->:"+i);
            a=z.nextInt();
            L2.add(a);
            
        }
          System.out.println("Element of LIST 1 :"+L1);
         System.out.println("Element of LIST 2 :"+L2);
         
         System.out.println("      THE Repeated elements --> "+L1);
        tofindrepeatedele z1=new tofindrepeatedele();
        z1.intersect(L1,L2);
    
         
}
}

    
