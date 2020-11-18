import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер создаваемого массива: ");
        int arraySize = scanner.nextInt();
        int [] array = createArray(arraySize);
        randomFill(array);
        printArray(array);
        System.out.println("Сумма элементов массива: " + sumOfAllArrayElems(array));
        System.out.println("MAX : " + maxValue(array));
        System.out.println("MIN : " + minValue(array));
        System.out.println("Среднее арифметическое  :  " + average(array));
        printOddNums(array);
    }

    public static int [] createArray(int size) {
        int [] array = new int[size];
        return array;
          }


    public static int [] randomFill (int[]array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 100);
        }
        return array;
    }


    public static void printArray (int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int sumOfAllArrayElems (int [] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
        public static int maxValue (int [] array) {
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
             return max;
        }

    public static int minValue (int [] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

     public static double average (int [] array) {
         double sum = 0;
         for (int i = 0; i < array.length; i++) {
             sum += array[i];
         }
         double average = sum/ (double) array.length;
         return average;
     }


     public static void printOddNums (int[] array){
        System.out.print("Нечетные элементы : ");

        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) != 0)
                System.out.print(array[i] + " ");
        }
    }
    }

// Output:
// Введите размер создаваемого массива:
//7
//5 13 99 60 94 92 30
//Сумма элементов массива: 393
//MAX : 99
//MIN : 5
//Среднее арифметическое  :  56.142857142857146
//Нечетные элементы : 5 13 99
//Process finished with exit code 0