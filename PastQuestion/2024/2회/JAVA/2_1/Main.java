
public class Main {
    public static void check(int[] x, int[] y) {
        if(x==y) System.out.print("O");
        else System.out.print("N");
    }
    public static void main(String[] args) {
        int a[] = new int[] {1,2,3,4};
        int b[] = new int[] {1,2,3,4};
        int c[] = new int[] {1,2,3};
        check(a,b);
        check(b,c);
        check(a,c);
    }
}
// import java.util.Arrays;

// public class Main {
//     public static void check(int[] x, int[] y) {
//         if (Arrays.equals(x, y)) System.out.print("O");
//         else System.out.print("N");
//     }

//     public static void main(String[] args) {
//         int a[] = {1, 2, 3, 4};
//         int b[] = {1, 2, 3, 4};
//         int c[] = {1, 2, 3};
//         check(a, b);  // O
//         check(b, c);  // N
//         check(a, c);  // N
//     }
// }