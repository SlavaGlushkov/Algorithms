import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestForPrimeSoloveyStrassen {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(bufferedReader.readLine());
        int k = Integer.parseInt(bufferedReader.readLine());
        System.out.println(isPrime(n,k) ? n + " -  простое с вероятностью " + (1 - Math.pow(2, - k)) : n + "  -  составное");
    }
    static boolean isPrime (long n, int k){
        boolean isPrimeIndicator = false;
        for (int i = 0; i < k; i++) {
            //int a = (int) (Math.random() * (n - 1)) + 2;
            int a = 11;
            if (EvklidGreatestCommonDividor.gcd(a,n) > 1) {
                isPrimeIndicator = false;
                break;
            }
            else if(Math.pow(a,(n-1)/2)%n != (a/n)%n){
                isPrimeIndicator = false;
                break;
            }
            else
                isPrimeIndicator = true;
        }
        return isPrimeIndicator;
    }
}
