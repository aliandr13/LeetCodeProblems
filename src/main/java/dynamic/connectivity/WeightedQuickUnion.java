package dynamic.connectivity;

public class WeightedQuickUnion implements UnionFind {

    int[] id;
    int[] sz;

    public WeightedQuickUnion(int N) {
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    @Override
    public void union(int p, int q) {
        int i = getRoot(p);
        int j = getRoot(q);
        if (i == j) return;
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return getRoot(p) == getRoot(q);
    }

    public int getRoot(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
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
