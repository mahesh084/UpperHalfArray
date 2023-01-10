package ArrayAssignment;

import java.util.*;

public class UpperHalfArray   
{    
    public static void main(String[] args) {    
        int rows=0, cols = 0;    
            
        System.out.println("Enter the values in Rows: ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
       
        int a[][] = new int[number][number];   
              
          //Calculates number of rows and columns present in given matrix    
          
        System.out.println("Enter the values in array: ");
        for(int i=0;i<a.length;i++) {
        	for(int j=0;j<a[i].length;j++) {
        		a[i][j]=sc.nextInt();
        	}
        }
            
            
            
            //Performs required operation to convert given matrix into upper triangular matrix    
            System.out.println("Upper triangular matrix: ");    
            for(int i = 0; i < a.length; i++){    
                for(int j = 0; j <a[i].length; j++){    
                  if(i > j)    
                    System.out.print("  ");    
                  else    
                    System.out.print(a[i][j] + " ");    
                }    
                System.out.println();    
            }       
    }    
} 
