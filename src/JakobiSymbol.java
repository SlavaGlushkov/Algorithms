import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JakobiSymbol {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(bufferedReader.readLine());
        long b = Long.parseLong(bufferedReader.readLine());
        System.out.println(gcd(a,b));
    }
    static long gcd (long a, long b) {
        if (a == 1)
            return 1;
        else
            return gcd(b,a%b);
    }
}

