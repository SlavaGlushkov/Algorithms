import java.io.*;

public class Intersection_of_line_segments {
    static StreamTokenizer in;
    static int[][] array;
    public static void main(String[] args) throws IOException {
        in = new StreamTokenizer(new FileReader("input.txt"));
        FileWriter out = new FileWriter("output.txt");
        out.write("ТО ЧТО МЫ ЗАПИСЫВАЕМ В ФАЙЛ");
        out.flush();
        out.close();
    }
    static int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }
}
