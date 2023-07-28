package behavioral.strategy;

public class MainframeCompressor implements CompressionStrategy {

    @Override
    public void compress(Object obj) {
        System.out.println("Compression used for mainframe object.");
    }
}
