package com.hanisha.primenumbers;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicateelements {
	public  int[] removeElements(int arr[], int n){  
        if  (n==1){  
            return arr; 
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
         
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return temp;  
    }  
       
    public static void main (String[] args) {  
    	
        int arr[] = {10,20,20,30,30,40,50,50,10};  
        Arrays.sort(arr);
        int length = arr.length; 
        Duplicateelements de= new Duplicateelements();
        
      
        int finalarray[] =de.removeElements(arr, length); 
        int finalArrayLength = finalarray.length;
        for(int i=0;i<finalarray.length;i++) {
        	System.out.println("without duplicate values : "+finalarray[i]);
        }
        
   }
}
