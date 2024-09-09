import java.util.Scanner;

public class ShiftingElements {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int n = myScan.nextInt();
        int[] arr1 = new int[n];

        System.out.println("enter the " + n + " numbers in array:");
        for (int i = 0; i <= n - 1; i++) {
            arr1[i] = myScan.nextInt();
        }
        System.out.println("The array: ");
        for (int e : arr1) {
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println("enter number of d to shift element: ");
        int d = myScan.nextInt();
        System.out.println("d is " + d);

        for (int i = 1; i <= d; i++) {
            int temp = arr1[0];
            for (int j = 1; j < arr1.length; j++) {
                arr1[j - 1] = arr1[j];
            }
            arr1[arr1.length - 1] = temp;
        }

        System.out.println("The array after shifting: ");
        for (int e : arr1) {
            System.out.print(e + " ");
        }

    }
}