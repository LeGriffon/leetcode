package app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Solution obj = new Solution();
        String[][] equationsArr = { {"a", "b"}, {"b", "c"} };
        String[][] queries = { {"a", "c"}, {"b", "a"}, {"a", "e"}, {"a", "a"}, {"x", "x"} };
        double[] values = {2.0, 3.0};

        List<List<String>> equationsList = new ArrayList<>(), queriesList = new ArrayList<>();
        for(String[] array : equationsArr) {
            equationsList.add(Arrays.asList(array));
        }
        for(String[] array : queries) {
            queriesList.add(Arrays.asList(array));
        }

        double[] result = obj.calcEquation(equationsList, values, queriesList);
        for(double n : result) {
            System.out.println(n);
        }
    }
}