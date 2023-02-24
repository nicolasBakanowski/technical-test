import java.util.Arrays;

public class NonZero {
    public static void main(String[] args) {
        int[] A = {1, 0, 2, 0, 0, 3, 4};
        int[] B = {-1, 0, 2, 0, -3, 4, 0};
        int[] C = {0, 0, 0, 0};
        int[] D = {1, 2, 3, 4};
        
        test(A);
        test(B);
        test(C);
        test(D);
    }
    
    public static void test(int[] A) {
        int n = moveNonzeroToLeft(A);
        System.out.println(Arrays.toString(A) + ", " + n);
    }
    

    public static int moveNonzeroToLeft(int[] A) {
        int i = 0;
        int j = A.length - 1;
        while (i < j) {
            if (A[i] != 0) {
                i++;
            } else if (A[j] == 0) {
                j--;
            } else {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }
}