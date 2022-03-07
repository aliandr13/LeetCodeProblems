package graph;

import org.junit.jupiter.api.Test;

class BreadthFirstSearchTest {

    @Test
    void traverseTests() {
        Vertex<Integer> start = VertexUtils.getVertex();
        BreadthFirstSearch<Integer> dfs = new BreadthFirstSearch<>();
        dfs.travers(start);
    }

}