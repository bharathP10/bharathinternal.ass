/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author BHARATH sharan
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;
import java.lang.*;
public class empclass {
     public static void main(String[] arg) {
       
        ArrayList <emp> z=new ArrayList <emp>();
        int i,j;
        String a;
        int a1;
        Scanner x=new Scanner(System.in);
        System.out.println("Enter  the number of Employee to implelement in list  ");
         i=x.nextInt();
        for(j=1;j<=i;j++)
        {
            System.out.println("EMPLOYEE  "+j+"  NAME-->");
            a=x.next();
            System.out.println("ENTER EMPLOYEE  " +a+"  SALARY-->");
            a1=x.nextInt();
            
            z.add(new emp(a,a1));
        }
         
        System.out.println(z);
        Collections.sort(z, new Sortlist());
        System.out.println("EMPLOYEE LIST in sorted order");
        System.out.println(z);
    

}
}


     class emp
             
{
    
    String name;
    int salary;
    public emp(String name,int salary)
            {
                this.name=name;
                this.salary=salary;
             }
   
    public String toString()
    {
        return name+"->"+salary+"";
    }
 
}
class Sortlist implements  Comparator<emp>
{
    public int compare(emp a,emp b)
    {
        return a.name.compareTo(b.name);
    }
}