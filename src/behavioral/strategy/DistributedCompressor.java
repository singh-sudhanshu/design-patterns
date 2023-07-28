package behavioral.strategy;

public class DistributedCompressor implements CompressionStrategy {

    @Override
    public void compress(Object obj) {
        System.out.println("Compression used for distributed objects");
    }
}
