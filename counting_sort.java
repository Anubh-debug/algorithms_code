/*
 * time complexity of counting sort is O(n+k) where n is size of array to be sorted and k is the range of bucket.
 *space complexity is O(k).
 * counting sort is useful where range is known because it can sort them in linear time. it is stable and out of place algorithm.
 */

/**
 *
 * @author Anubh_sinha
 */

class sorting_algo{ //this algorithm will sort any given array in linear time
    public void sorty(int[] ar)
    {
        //here range should be known and we are taking it from 0 to 50;
        int array[] = new int[50]; //this array will map all the values in their index;
        for(int i=0;i<ar.length;i++)
        {
            array[ar[i]] = array[ar[i]] + 1;
        }
        for(int j=0;j<array.length;j++)
        {
            while(array[j] !=0)
            {
                System.out.print(j);
                System.out.print(" ");
                array[j] = array[j] - 1;
            }
    }
}}
public class counting_sort {
    public static void main(String args[])
    {
        int[] input_array = {45,12,32,12,22,1,20,12,34,11,11,34,10,19,18};
        sorting_algo alg_sort = new sorting_algo();
        alg_sort.sorty(input_array);
    }
}
