import java.util.Arrays;

public class UserArray {
    public static void main(String[] args) {
int [] array = {1, 5,6,7,8};
int [] array2 = arrayInsert(array, 101);
        System.out.println(Arrays.toString(array2));
    }




    public static int [] arrayInsert (int [] arr, int value){
        int [] tempArray = new int[arr.length+1];
        for (int i = 0, j = -1; i < tempArray.length; i++, j++) {
            if (i == 0) {
                tempArray[i] = value;
            } else
            tempArray[i] = arr[j];
        }
       return tempArray;
    }
}
