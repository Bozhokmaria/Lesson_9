import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int [] array = createArray(scanner);

            fillArray(array);
            printArray(array);
          int [] reverse =  myReverse(array);
            printArray(reverse);
           int [] arr = subArray(array, 3, 10);
            printArray(arr);
        }


        public static int[] createArray(Scanner scanner) {
            System.out.println(" Enter your array size: ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            return array;
        }

    public static int[] fillArray(int [] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter your numbers for new array ");
            array[i] = scanner.nextInt();
        }
        return array;
    }


    public static void printArray (int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] myReverse(int[] array) {
        int[] tempArray = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            tempArray[j] = array[i];
        }
        System.out.println("Reversed array");
        return tempArray;
    }

    public static int[] subArray(int[] array, int index, int count) {
        int[] tempArray = new int[count];
         int num = array.length-1;
                for (int i = index, j = 0; i < count+ index; i++, j++) {
                    if (i>num) {
                        tempArray[j] = 1;
                    }   else tempArray[j] = array[i];
            }
        System.out.println("Sub array");
        return tempArray;
    }
}


// output:
// Enter your array size:
//4
//Enter your numbers for new array
//11
//Enter your numbers for new array
//44
//Enter your numbers for new array
//55
//Enter your numbers for new array
//77
//11 44 55 77
//Reversed array
//77 55 44 11
//Sub array
//77 1 1 1 1 1 1 1 1 1