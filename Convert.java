//Name-Harpreet Kaur Student id: A00245132
//Name-Amritpal Singh Pawar Student id:A00241707
//This is a program of conversions between the different forms of measurement 
 //import Scanner class
import java.util.Scanner;
class Convert
{
   public static void main(String arg[])
  {  
      double variable;// to store variable to convert
      double conVariable; //to store converted variable
      String unit; //string to store the unit
      Scanner sc=new Scanner(System.in); 
      System.out.print("Enter a value to convert: ");
      variable=sc.nextDouble();
      System.out.println(); //to give a line space
      System.out.print("Enter the current unit of measure: ");
      unit=sc.next();
      // apply if and else if condition 
       if(unit.equals("km"))
       {
        conVariable=variable*(0.62);
         System.out.println(variable+" "+unit+" "+ "is equal to"+" "+conVariable+"mi");
        }
        else if(unit.equals("mi"))
         {
          conVariable=variable*(1.61);
         System.out.println(variable+" "+unit+" "+ "is equal to"+" "+conVariable+"km");
        }
        else if(unit.equals("cm"))
       {
         conVariable=variable*(0.39);
         System.out.println(variable+" "+unit+" "+ "is equal to"+" "+conVariable+"in");
        }
        else if(unit.equals("in"))
         {
          conVariable=variable*(2.54);
         System.out.println(variable+" "+unit+" "+ "is equal to"+" "+conVariable+"km");
        }
         else if(unit.equals("kg"))
       {
         conVariable=variable*(2.2);
         System.out.println(variable+" "+unit+" "+ "is equal to"+" "+conVariable+"lb");
        }
        else if(unit.equals("lb"))
         {
          conVariable=variable*(0.45);
         System.out.println(variable+" "+unit+" "+ "is equal to"+" "+conVariable+"km");
        }
         else if(unit.equals("g"))
       {
        conVariable=variable*(0.045);
         System.out.println(variable+" "+unit+" "+ "is equal to"+" "+conVariable+"oz");
        }
        else if(unit.equals("oz"))
         {
        conVariable=variable*(28.35);
         System.out.println(variable+" "+unit+" "+ "is equal to"+" "+conVariable+"g");
        }
          else if(unit.equals("l"))
       {
         conVariable=variable*(4.17);
         System.out.println(variable+" "+unit+" "+ "is equal to"+" "+conVariable+"cups");
        }
        else if(unit.equals("cup"))
         {
        conVariable=variable*(0.24);
         System.out.println(variable+" "+unit+" "+ "is equal to"+" "+conVariable+"l");
        }
          
   }
}