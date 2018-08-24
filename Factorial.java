import java.io.*;
import java.util.*;
  public class Factorial{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
      System.out.println("Enter some integer:");
      int value=sc.nextInt();
      int fact=1;
      for(int i=1;i<=value;i++)
      {
        fact=fact*i;
        }
        System.out.println("The Factorial of "+value+" is "+fact);
    }
 }   
      
      
      
      
      
