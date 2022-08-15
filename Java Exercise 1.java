//Write a Java Program to Accept the Marks of a Student and 
//find Total Marks and Percentage-
//Make use of an Array-Make use of a loop

import java.util.*;   
public class Main 
{ 
    
    private static void main(String args[]) 
    {   
        // Taking input from user 
        Scanner sc = new Scanner(System.in); 
        int n;     
        
        //User Array input
        System.out.println("Enter the total subjects ");
        n=sc.nextInt();
        
        //Declare the array
        int arr[] = new int[n]; 
        System.out.println("Enter the marks secured in each subject ");
        for(int i=0;i<n;i++)   //Initialize the array
        {
            arr[i]=sc.nextInt();
        }
        
        int total=0;
        //Calculate the total marks
        for(int i=0;i<n;i++)
        {
            total=total+arr[i];
        }
        //Display the total marks
        System.out.println("The total marks obtained is "+total);
        
        //ercentage
        float percentage; 
        percentage = (total / (float)n); 
        
        //Display the total percentage
        System.out.println( "Total Percentage : " + percentage + "%");                         
    }   
}