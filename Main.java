import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
/*
* 1.Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2 Test Data:
array = 50, -20, 0, 30, 40, 60, 10*/
    /*    int[] numbers = {50, -20, 0, 30, 40, 60, 10};

        if (numbers[0] == numbers[numbers.length - 1] ){
                System.out.println("true");
        }else {
            System.out.println("false");
        }*/


        /*2.Write a Java program to find the numbers greater than the average of the numbers of a given array.
Original Array:
[1, 4, 17, 7, 25, 3, 100]
Expected Output:
The average of the said array is: 22.0 The numbers in the said array that are greater than the average are: 25 100


        int[] list_numbers = {1, 4, 17, 7, 25, 3, 100};
        int sum = 0 ;
        int averag = 0;

        for (int i = 0; i < list_numbers.length; i++) {
            sum += list_numbers[i];

        }

        averag = sum / list_numbers.length;

        System.out.printf("he average of the said array is: %d", averag );
        for (int i = 0; i < list_numbers.length; i++) {
            if (list_numbers[i] > averag){

                System.out.printf(" The numbers in the said array that are greater than the average are:  ", list_numbers[i]);
            }
        }

        3.Write a Java program to get the larger value between first and last element of an array of integers.
Original Array:
[20, 30, 40]
Sample Output:
Larger value between first and last element: 40
*/
      /*
      int[] numbers = {20, 30, 40};
        int max = numbers[0];

      for (int i = 0; i < numbers.length; i++) {
          if (numbers[i] > max && numbers[0] < max && numbers.length - < max) {
              max = numbers[i];
          }
      }
      System.out.println("Larger value between first and last element: "+ max);*/

/*
* 4.Write a Java program to swap the first and last elements of an array and create a new array.
Original Array:
[20, 30, 40]
Sample Output:
New array after swapping the first and last elements: [40, 30, 20]*/

        int[] numbers = {20, 30, 40};
        int[] numbers2 = new int[numbers.length];


        for (int i = 0; i < numbers.length; i++) {
            numbers2[i] = numbers[i];
        }

        int temp = numbers2[0];
        numbers2[0] = numbers2[numbers2.length - 1];
        numbers2[numbers2.length - 1] = temp;


        System.out.println("Original Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }


        for (int num : numbers2) {
            System.out.print(num + " ");
        }



       /* 5. Write a program that places the odd elements of an array before the even elements.
                Original Array:
[2,3,40,1,5,9,4,10,7]
        Sample Output:
[3,1,5,9,7,2,40,4,10]*/

    /*    ArrayList<Integer> list = new ArrayList<>();

        // Add elements to the list
        list.add(2);
        list.add(3);
        list.add(40);
        list.add(1);
        list.add(5);
        list.add(9);
        list.add(4);
        list.add(10);
        list.add(7);


        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        for (int num : list) {
            if (num % 2 != 0) {
                oddList.add(num);
            } else {
                evenList.add(num);
            }
        }


        oddList.addAll(evenList);
        list = oddList;

        System.out.println("Sample Output: " + list);*/


/*6. Write a program that test the equality of two arrays.
[2,3,6,6,4] [2,3,6,6,4]
Sample Output: true*/

      /*  int[] array1 = {2, 3, 6, 6, 4};
        int[] array2 = {2, 3, 6, 6, 4};

        boolean areEqual = true;


        if (array1.length != array2.length) {
            areEqual = false;
        } else {

            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    areEqual = false;
                    break;
                }
            }
        }*/




    }
}