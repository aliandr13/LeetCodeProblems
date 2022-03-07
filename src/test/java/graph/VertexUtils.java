package graph;

import java.util.List;

public class VertexUtils {
    public static Vertex<Integer> getVertex() {
        Vertex<Integer> v0 = Vertex.of(0);
        Vertex<Integer> v1 = Vertex.of(1);
        Vertex<Integer> v2 = Vertex.of(2);
        Vertex<Integer> v3 = Vertex.of(3);
        Vertex<Integer> v4 = Vertex.of(4);
        Vertex<Integer> v5 = Vertex.of(5);
        Vertex<Integer> v6 = Vertex.of(6);


        v0.setNeighbors(List.of(v1, v5, v6));
        v1.setNeighbors(List.of(v3, v4, v5));
        v4.setNeighbors(List.of(v2, v6));
        v6.setNeighbors(List.of(v0));

        return v0;
    }
}
