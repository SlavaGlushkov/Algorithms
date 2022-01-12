import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dynamic {
    private static Map <Integer, Integer> cache = new HashMap<Integer, Integer>();


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        cache.put(0,1);
        cache.put(1,1);
        long time = System.currentTimeMillis();
        System.out.println(recurse(a));
        System.out.println("Time " + (System.currentTimeMillis() - time));
        time = System.currentTimeMillis();
        System.out.println(fcashe(a));
        System.out.println("Time " + (System.currentTimeMillis() - time));
        time = System.currentTimeMillis();
        System.out.println(calc(a));
        System.out.println("Time " + (System.currentTimeMillis() - time));

    }
    static int recurse (int a) {
        if (a < 2)
            return cache.get(a);

        return a%2 == 0 ? recurse(a/2) + recurse(a/2 - 1) :  recurse((a - 1)/2) - recurse((a - 1)/2 - 1);
    }
    private static int fcashe(int n){
        if(!cache.containsKey(n)){//Проверяем, находили ли мы данное значение
            cache.put(n, recurse(n)); //Если нет, то находим и записываем в таблицу
        }
        return cache.get(n);
    }
    private static int calc (int n){
        if(n<2) return 1; //Может, нам и вычислять ничего не нужно?
        for(int i=2; i<=n; i++){
            if(i%2==0){ //Проверяем чётность
                cache.put(i,cache.get(i/2)+cache.get(i/2-1));
            }else{
                cache.put(i, cache.get((i-1)/2) - cache.get((i-1)/2-1));
            }
        }

        return cache.get(n);
    }
}
