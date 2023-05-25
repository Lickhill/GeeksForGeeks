import java.util.*;

class day1 {
    public static int getMaximum(int N, int[] arr) {
        int i;
        long sum = 0;
        for (i = 0; i < N; i++) {
            sum += arr[i];
        }
        for (i = N; i > 0; i--) {
            if (sum % N == 0) {
                return N;
            } else {
                N--;
            }
        }

        return 1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of bowls");
        int N = sc.nextInt();
        System.out.println("Enter the array elements");
        int i;
        int arr[] = new int[N];
        for (i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Res:" + getMaximum(N, arr));
    }
}
