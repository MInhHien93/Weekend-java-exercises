import java.util.Scanner;

public class Array {
    public static Scanner sc = new Scanner(System.in);

    // Create arr
    public static int[] enterArrayElement(int[] arr, int length) {
        System.out.printf("Enter %d element of array %n", length);
        for (int i = 0; i < length; i++) {
            System.out.printf("Enter element %d %n", i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        return arr;
    }

    // Display Arr
    public static void showArrayElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Display prime of array
    public static void checkPrimeInArray(int[] arr) {
        System.out.println("list prime of array : ");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Menu.isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
                count++;
            }
        }
        System.out.println();
        if (count == 0) {
            System.out.println("No prime in the array");
        }
    }

    // Check index of array
    public static void checkNumberInArray(int[] arr, int number) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.printf("%d is in the position %d %n", number, i);
                count++;
            }
        }
        if (count == 0) {
            System.out.printf("%d is not in the array %n", number);
        }
    }

    // Delete element
    public static int[] deleteAnElementInArray(int[] arr, int number) {
        if (arr[arr.length - 1] == number) {
            arr[arr.length - 1] = 0;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == number) {
                for (int j = i + 1; j < arr.length; j++) {
                    arr[i] = arr[j];
                }
            }
        }
        return arr;
    }

    // Soft
    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    // Push
    public static int[] addElementtoArray(int[] arr, int number) {
        int[] newArr = new int[arr.length + 1];
        newArr[newArr.length - 1] = number;
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr = sortArray(newArr);
        return newArr;
    }

    public static void main(String[] args) {
        int num = Menu.enterNumber();
        int[] arr = new int[num];
        arr = enterArrayElement(arr, num);
        showArrayElements(arr);
////        checkPrimeInArray(arr);
////        checkNumberInArray(arr, num);
//        int[] deledArray = deleteAnElementInArray(arr,num);
//        System.out.printf("mang moi sau khi xoa  %d la : %n", num);
//        for(int i: deledArray){
//            System.out.print(i + " ");
//        }
//        int[] sortedArray = sortArray(arr);
//        System.out.printf("mang moi sau khi sap xep la : %n");
//        for (int i : sortedArray) {
//            System.out.print(i + " ");
//        }
        int x = Menu.enterNumber();
        int[] addedArray = addElementtoArray(arr, x);
        System.out.printf("New array %d and soft: %n", x);
        for (int i : addedArray) {
            System.out.print(i + " ");
        }


    }
}
