/*
 * bubble sort has time complexity O(n^2) in worst case and O(n) in best case. Best case is when input are sorted.
 * bubble sort is an inplace, stable, and not an online algorithm.
 * bubble sort is a very slow way of sorting.
 */

/**
 *
 * @author Anubh_sinha
 */
public class bubble_sort {
    public static void main(String args[])
    {
        int[] array = {23,1,12,6,34,27,90,43,1,78}; //this is the array which has to be sorted
        int len = array.length;  //determining length of the array
        int swapped = 0;
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len-i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = 1;
                }
            }
            if(swapped == 0) //if no swapping operation happened then loop will break
            {
                break;
            }
        }
        for(int i=0;i<len;i++)
        {
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }
    
}
