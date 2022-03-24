package easy;

import java.util.LinkedList;

public class L1971 {

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        LinkedList<Integer>[] adjacencyList = new LinkedList[n];

        for (int[] edge : edges) {
            int first = edge[0];
            int second = edge[1];
            LinkedList<Integer> firstList = adjacencyList[first];
            if (firstList == null) {
                firstList = new LinkedList<>();
                adjacencyList[first] = firstList;
            }
            firstList.add(second);
            LinkedList<Integer> secondList = adjacencyList[second];
            if (secondList == null) {
                secondList = new LinkedList<>();
                adjacencyList[second] = secondList;
            }
            secondList.add(first);
        }

        return dfs(adjacencyList, source, destination, new boolean[n]);
    }

    private boolean dfs(LinkedList<Integer>[] adjacencyList, int source, int destination, boolean[] visited) {
        if (source == destination) return true;
        visited[source] = true;
        for (Integer neighbour : adjacencyList[source]) {
            if (!visited[neighbour]) {
                if (dfs(adjacencyList, neighbour, destination, visited)) return true;
            }
        }
        return false;
    }

}
