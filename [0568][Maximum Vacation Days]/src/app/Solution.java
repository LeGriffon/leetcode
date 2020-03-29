package app;

class Solution {
    public int maxVacationDays(int[][] flights, int[][] days) {
        if(flights.length == 0 || days.length == 0) return 0;
        int numOfCities = days.length;
        int numOfWeeks = days[0].length;
        int[] dp = new int[numOfCities];
        for(int week = numOfWeeks - 1; week >= 0; week--) {
            int[] tempDP = new int[numOfCities];
            for(int currCity = 0; currCity < numOfCities; currCity++) {
                tempDP[currCity] = dp[currCity] + days[currCity][week];
                for(int destCity = 0; destCity < numOfCities; destCity++) {
                    if(flights[currCity][destCity] == 1) {
                        tempDP[currCity] = Math.max(tempDP[currCity], dp[destCity] + days[destCity][week]);
                    }
                }
            }
            dp = tempDP;
        }
        return dp[0];
    }
}