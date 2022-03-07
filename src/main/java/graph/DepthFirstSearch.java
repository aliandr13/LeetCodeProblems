package graph;

import graph.Vertex;

import java.util.Deque;
import java.util.LinkedList;

public class DepthFirstSearch<T> {

    public void travers(Vertex<T> start) {
        Deque<Vertex<T>> stack = new LinkedList<>();
        stack.push(start);
        while (!stack.isEmpty()) {
            Vertex<T> current = stack.pop();
            if (!current.isVisited()) {
                current.setVisited(true);
                System.out.println(current);
                current.getNeighbors().forEach(stack::push);
            }
        }
    }

    public void traversRecursively(Vertex<T> vertex) {
        vertex.setVisited(true);
        System.out.println(vertex);
        vertex.getNeighbors().forEach(neighbour -> {
            if (!neighbour.isVisited()) {
                traversRecursively(neighbour);
            }
        });
    }

}
