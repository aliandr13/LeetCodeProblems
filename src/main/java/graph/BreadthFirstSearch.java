package graph;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch<T> {

    public void travers(Vertex<T> start) {
        Queue<Vertex<T>> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()) {
            Vertex<T> current = q.poll();
            if (!current.isVisited()) {
                current.setVisited(true);
                System.out.println(current);
                q.addAll(current.getNeighbors());
            }
        }
    }

}
