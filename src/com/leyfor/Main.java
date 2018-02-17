package com.leyfor;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();

        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        int index = -1;
        for (int i = 0; i < intArray.length; i = i + 1) {
            if (intArray[i] == 7) {
                index = i;
                break;
            }

        }
        System.out.println("index = " + index);

      int tester =  Main.searchT(7, intArray);

        System.out.println("The index number is: " + tester);
        System.out.println(intArray[3]);

        int tester2 = Main.deleteT(7, intArray);

        System.out.println("Deleting the element at index: " + tester2);
        System.out.println(intArray[3]);

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i = i + 1) {
                if (intArray[i] > intArray[ i + 1]) {
                    bubbleSort.swap(intArray, i, i + 1);
                }

            }
        }

        for (int i = 0; i < intArray.length; i = i + 1) {
            System.out.println(intArray[i]);

        }
    }

    static int searchT(int num, int[] array) {

        array = new int[7];

        int index = -1;
        for (int i = 0; i < array.length; i = i + 1) {
            if (array[i] == num) {
                index = i;
                System.out.println("Check " + index);
                break;
            }

        }
        return index;
    }

     static int deleteT(int num, int[] array) {

        int index = -1;
        for (int i = 0; i < array.length; i = i + 1) {
            if (array[i] == num) {
                index = i;
                break;
            }
        }

    // set the index to -1
        return array[index] = -1;
    }
}
