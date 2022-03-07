package graph;

import org.junit.jupiter.api.Test;

class DepthFirstSearchTest {

    @Test
    void traverseTests() {
        Vertex<Integer> start = VertexUtils.getVertex();
        DepthFirstSearch<Integer> dfs = new DepthFirstSearch<>();
        dfs.travers(start);
    }

    @Test
    void traversRecursivelyTests() {
        Vertex<Integer> start = VertexUtils.getVertex();
        DepthFirstSearch<Integer> dfs = new DepthFirstSearch<>();
        dfs.traversRecursively(start);
    }

}