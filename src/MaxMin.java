/*
 * Find_largest_element
Set largest_element to array(0)
DO index = 1 to number_of_elements

ENDDO
Print largest_element
END
 */


import java.util.Scanner;

public class MaxMin {
    public static void main (String[] args){
        int intArray[] = new int[10];
        int maxNo = 0, minNo = 0, tmp = 0;
        double sum = 0.0, avg = 0.0;


        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter an interger: ");
            intArray[i] = keyboard.nextInt();
        }

        // search for max and min as well as sum
        minNo = intArray[0];
        for (int i = 0; i < 10; i++){
            tmp = intArray[i];
            if (tmp < minNo)
                minNo = tmp;
            else if (tmp > maxNo)
                maxNo = tmp;

            sum += tmp;
        }

        System.out.println("\n\nThe largest number is " + maxNo);
        System.out.println("The smallest number is " + minNo);
        System.out.println("Sum is " + sum);
        avg = sum / 10;
        System.out.printf("Average is %.2f\n", avg);
    }
}
