import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


class sorted
{
    public static void sort012(int a[], int n)
    {
        // code here

        int low =0, mid=0, high=n-1;
        while(mid<= high) {
            if (a[mid] == 0) {
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            } else if (a[mid] == 1)
                mid++;
            else {
                int temp = a[high];
                a[high] = a[mid];
                a[mid] = temp;
                high--;
            }
        }


    }


    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the elements (0, 1, or 2):");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        sort012(a, n);

        System.out.println("Sorted array:");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}