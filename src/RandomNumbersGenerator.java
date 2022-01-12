import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RandomNumbersGenerator {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("inputRandowNumbers.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        Random random = new Random();
        for (int i = 0; i < a; i++) {
            writer.write(String.valueOf(random.nextInt()) + "\n");
        }
        writer.flush();
        writer.close();
    }
}
