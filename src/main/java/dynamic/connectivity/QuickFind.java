package dynamic.connectivity;

public class QuickFind implements UnionFind {

    int[] id;

    public QuickFind(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }


    @Override
    public void union(int p, int q) {
        int v = id[p];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == v) {
                id[i] = id[q];
            }
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    @Override
    public int find(int p) {
        return 0;
    }

    @Override
    public int count() {
        return 0;
    }
}
