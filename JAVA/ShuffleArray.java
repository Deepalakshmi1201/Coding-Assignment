package JAVA;
import java.util.*;

public class ShuffleArray {
    //A. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Length of array: ");
        int Length = in.nextInt();

        System.out.println("Enter a array: ");
        int[] array = new int[Length];

        for(int i = 0 ; i < Length ; i++)
        {
            array[i] = in.nextInt();
        }

        System.out.println("Original Array :" + Arrays.toString(array));
        System.out.println("Shuffled Array :"+Arrays.toString(shuffleArray(array)));

        in.close();
    }

    static int[] shuffleArray(int[] array)
    {
        Random randValue = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            int index = randValue.nextInt(i + 1);

            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        return array;
    }
}
