package behavioral.strategy;

public class Compression {

    private final CompressionStrategy compressionStrategy;

    public Compression(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void compress(Object obj) {
        this.compressionStrategy.compress(obj);
    }
}
