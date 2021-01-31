package com.interviewPrep.epi.Chap5Arrays;

public class FIve6BuySellStockOnce {
    public static void main(String[] args) {
        double[] stonks = {5.00, 4.12, 2.5, 2.2, 4.5, 13.5, 15.0, 19.0, 2.0};
        System.out.println(maxProfitBuySellOnce(stonks));
    }

    private static double maxProfitBuySellOnce(double[] stonks) {
        double maxProfit = Double.MIN_VALUE;
        double currLeast = stonks[0];
        for (int i = 0; i < stonks.length; i++) {
            currLeast = Math.min(currLeast, stonks[i]);
            maxProfit = Math.max(maxProfit, stonks[i] - currLeast);
        }
        return maxProfit;
    }
}
