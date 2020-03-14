package app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Solution obj = new Solution();
        String[][] airportsArr = {
            {"JFK","SFO"},
            {"JFK","ATL"},
            {"SFO","ATL"},
            {"ATL","JFK"},
            {"ATL","SFO"}
        };
        List<List<String>> airportList = new ArrayList<>();
        
        for (String[] array : airportsArr) {
            airportList.add(Arrays.asList(array));
        }

        obj.findItinerary(airportList);
        obj.printRoute();
    }
}