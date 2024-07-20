import java.util.*;

class Solution {
    public int print2largest(List<Integer> arr) {
        Collections.sort(arr);
        int max = arr.get(arr.size() - 1);
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) != max) {
                return arr.get(i);
            }
        }
        return -1;
    }
}

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        int secondLargest = solution.print2largest(arr);
        if (secondLargest != -1) {
            System.out.println("The second largest element is: " + secondLargest);
        } else {
            System.out.println("There is no second largest element.");
        }

        scanner.close();
    }
}
