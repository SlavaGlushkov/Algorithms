package Algorithms;

import java.io.*;

public class KnapsackUnlimited {
    static StreamTokenizer streamTokenizer;
    public static void main(String[] args) throws IOException {
        /*
        3
        2 5 4
        10 15 6
        9
        */
        streamTokenizer = new StreamTokenizer(new FileReader("input.txt"));
        int [] weights = new int[nextInt()];
        for (int i = 0; i < weights.length; i++) {
            weights[i] = nextInt();
        }
        int [] values = new int[weights.length];
        for (int i = 0; i < weights.length; i++) {
            values[i] = nextInt();
        }
        int W = nextInt();
        System.out.println("Unlimited number of items " + knapsack1(weights, values, W));
        System.out.println("Each item unigue " + knapsack(weights, values, W));
    }
    //wts - массив весов, cost - массив стоимостей предметов, W - вместимость рюкзака
//функция возвращает максимальную стоимость, которую можно набрать(решение задачи о рюкзаке
//с повторениями)
//массив dp собственно реализует метод динамического программирования
    //knapsack1 количество предметов в магазине неограниченно
    static int knapsack1(int[] wts, int[] cost, int W)
    {
        int n = wts.length;
        int[] dp = new int[W + 1];
        dp[0] = 0;
        for (int w = 1; w <= W; w++)
        {
            dp[w] = dp[w-1];
            for (int i = 0; i < wts.length; i++)
            {
                if (wts[i] <= w)
                {
                    dp[w] = Math.max(dp[w], dp[w - wts[i]] + cost[i]);
                }
            }
        }
        return dp[W];
    }
    //knapsack1 количество предметов в магазине по одному
    static int knapsack(int weights[], int costs[], int W) {
        int n = weights.length;
        int dp[][] = new int[W + 1][n + 1];
        for (int j = 1; j <= n; j++) {
            for (int w = 1; w <= W; w++) {
                if (weights[j-1] <= w) {
                    dp[w][j] = Math.max(dp[w][j - 1], dp[w - weights[j-1]][j - 1] + costs[j-1]);
                } else {
                    dp[w][j] = dp[w][j - 1];
                }
            }
        }
        return dp[W][n];
    }
    static int nextInt() throws IOException {
        streamTokenizer.nextToken();
        return (int) streamTokenizer.nval;
    }
}
