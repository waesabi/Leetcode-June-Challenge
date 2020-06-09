package com.company;

import java.util.Arrays;

public class TwoCityScheduling {

    public static void main(String[] args) {
        String a = "sanket";
        String b = "sanket";
        System.out.println(a.equals(b));
    }

    public int twoCitySchedCost(int[][] costs) {
        int len = costs.length / 2;
        int[] refund = new int[costs.length];
        int minCostToSendToA = 0, index = 0;
        for (int[] cost: costs) {
            refund[index++] = cost[1] - cost[0];
            minCostToSendToA += cost[0];
        }
        Arrays.sort(refund);
        for (int i = 0; i < len; i++) {
            minCostToSendToA += refund[i];
        }
        return minCostToSendToA;
    }

}
