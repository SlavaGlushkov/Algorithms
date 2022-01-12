import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryMathOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        System.out.println(String.format("%032d", Integer.parseInt(Integer.toBinaryString(a))));
        System.out.println(Integer.toBinaryString(-a-1));
        String s = Integer.toBinaryString(-a-1);
        //String s3 = Integer.toBinaryString(-a-1, 3);
        int b = Integer.parseInt(Integer.toBinaryString(a), 3);
        System.out.println(b);
        System.out.println();
        System.out.println(Integer.toBinaryString(2));
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(0));
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.toBinaryString(-2));
    }
    public class ObjectForQuickBinaryOperations {
        int number;
        double aDouble;
        int [][] matrix;
        long [][] matrixLong;

        public ObjectForQuickBinaryOperations(int number) {
            this.number = number;
        }

        public ObjectForQuickBinaryOperations(double aDouble) {
            this.aDouble = aDouble;
        }

        public ObjectForQuickBinaryOperations(int[][] matrix) {
            this.matrix = matrix;
        }

        public ObjectForQuickBinaryOperations(long[][] matrixLong) {
            this.matrixLong = matrixLong;
        }
    }
    int binaryAdd (int a) {
        System.out.println();
        return a;
    }
}
