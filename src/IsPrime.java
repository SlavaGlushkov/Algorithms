

        import java.util.Scanner;

        public class IsPrime {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                long checkPrime = scanner.nextLong();
                long time = System.currentTimeMillis();
                System.out.println(isPrime(checkPrime) ? "Yes" : "No");
                System.out.println((System.currentTimeMillis() - time)/1000.0);
                time = System.currentTimeMillis();
                System.out.println(isPrime(checkPrime, Math.sqrt(checkPrime + 1)) ? "Yes" : "No");
                System.out.println((System.currentTimeMillis() - time)/1000.0);
            }
            static boolean isPrime(long x) {
                for (int i = 2; i <= Math.sqrt(x); i++) {
                    if (x % i == 0) {
                        return false;
                    }
                }
                return true;
            }
            static boolean isPrime(long x, double param) {
                for (int i = 2; i <= param; i++) {
                    if (x % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        }
