/*
 * selection sort time complexity is O(n^2). space complexity is O(1). there are no worst or best time complexity in selection sort.
 * selection sort is useful where swapping cost is much high because in selection sort maximum n swaps can be done for n elements.
 * It is an not an online algorithm but stable in nature.
 */

/**
 *
 * @author Anubh_sinha
 */
public class selection_sort {
    public static void main(String args[])
    {
        int[] array = {23,12,56,1,6,3,9,45,65,90,4,10}; //declaring array to be sorted
        for(int i=0;i<array.length-1;i++)
        {
            int min = array[i]; // selecting on element as minimum
            for(int j=i+1;j<array.length;j++)
            {
                if(min>array[j]) // swap the value if any element is smaller than min
                {
                    int temp = array[j];
                    array[j] = min;
                    min = temp;
                    array[i] = min;
                }
            }
        }
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }
}
