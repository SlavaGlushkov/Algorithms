import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//алгоритм Евклида работает за O(log(min(a,b))).
public class EvklidGreatestCommonDividor {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(bufferedReader.readLine());
        long b = Long.parseLong(bufferedReader.readLine());
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));

    }
    //Наибольший общий делитель
    static long gcd (long a, long b) {
        if (b == 0)
            return Math.abs(a);
        else
            return gcd(b,a%b);
    }
    //Наименьшее общее кратное
    static long  lcm (long a, long b) {
        return a / gcd(a, b) * b;   //используя форму a * b / gcd(a, b),
        //можно получить переполнение на этапе a * b,
        //поэтому следует выполнять деление до умножения
    }
}
