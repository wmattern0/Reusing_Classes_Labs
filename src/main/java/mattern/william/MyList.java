package mattern.william;

import java.util.ArrayList;

/**
 * Created by williammattern on 1/18/17.
 * Created in collaboration with Gerrod Mozeik.  There is a method that rotates the array by one.  This
 * method is called k times.
 * To rotate a 6 element array by 2 times, there are 12 swaps that need to be done.
 */

public class MyList extends ArrayList {
    ArrayList<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) {
        MyList myList = new MyList();
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        myList.fillList(arr1);
        myList.printList();
        myList.rotateLeft(arr1, 2, arr1.length);
        myList.fillList(arr1);
        myList.printList();
    }

    public void fillList(int[] array) {
        list.clear();
        for (Integer num : array) {
            list.add(num);
        }
    }

    public void printList(){
        for (Integer num: list){
            System.out.print(num + " ");
        }
        System.out.println("");

    }

    public void rotateLeft(int[] arr1, int rotateBy, int arrayLength) {
        for (int i = 0; i < rotateBy; i++) {
            rotateLeftByOne(arr1, arrayLength);
        }
    }

    public void rotateLeftByOne(int[] arr1, int arrayLength) {
        int j, swap;
        swap = arr1[0];
        for (j = 0; j < arrayLength - 1; j++) {
            arr1[j] = arr1[j + 1];
        }
        arr1[j] = swap;
    }
}
