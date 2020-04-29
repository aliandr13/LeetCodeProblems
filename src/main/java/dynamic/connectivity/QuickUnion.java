package dynamic.connectivity;

public class QuickUnion implements UnionFind {

    int[] id;

    public QuickUnion(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        int i = getRoot(p);
        int j = getRoot(q);
        id[i] = j;
    }

    @Override
    public boolean connected(int p, int q) {
        return getRoot(p) == getRoot(q);
    }

    public int getRoot(int i) {
        while (i != id[i]) i = id[i];
        return i;
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
