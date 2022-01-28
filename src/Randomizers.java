import java.util.Random;

public class Randomizers {
    public static void main(String[] args) {
//        System.out.println("Random number: " + nextRandom1(6));
//        System.out.println("Random number: " + nextRandom2(6));
        nextRandom3();
    }
    static int nextRandom1(int bound) {
        Random rnd = new Random();
        return  rnd.nextInt(bound) + 1;
    }
    static int nextRandom2(int bound) {
        Random rnd = new Random();
        return  1 + (int) (Math.random() * bound);
    }
    //Этот метод принимает три параметра. Количество генерируемых чисел и от(включая)...до(не включая)...
    static void nextRandom3(){
        new Random().ints(15, 1, 7).forEach(n -> System.out.println(n));
    }

}
