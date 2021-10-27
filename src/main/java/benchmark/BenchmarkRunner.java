package benchmark;

import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;

@Fork(value = 1, warmups = 2)
@BenchmarkMode(Mode.AverageTime)
public class BenchmarkRunner {

    public static void main(String[] args) throws Exception {
        Main.main(args);
    }

    @Benchmark
    public void init() {
        // Do nothing
    }

}
