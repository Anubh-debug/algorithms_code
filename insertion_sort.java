/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Anubh_sinha
 */
class sort{ //this class will sort the array according to insertion sort algorithm
    public void method_sort(int[] a)
    {
        for(int i=1;i<a.length;i++)
        {
            int key = a[i]; 
            int j = i-1;
            while(j>=0 && a[j]>key)
            {
                a[j+1] = a[j]; //just shift the digit to right to find right place for key in the array.
                j=j-1;
            }
            a[j+1] = key;
        }
    }
}
public class insertion_sort {
    public static void main(String args[])
    {
        int[] array = {23,45,1,0,65,4,64,1,2,3,4,5,6,7,8,9,11,12,13,45,65,67}; //declaring array to be sorted
        sort s = new sort(); //making object
        s.method_sort(array); //calling sort method
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }
}
