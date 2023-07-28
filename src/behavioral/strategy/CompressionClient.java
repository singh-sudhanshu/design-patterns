package behavioral.strategy;

public class CompressionClient {

    public static void main(String[] args) {
        var context = new Compression(new MainframeCompressor());
        context.compress("test");
        var anotherContext = new Compression(new DistributedCompressor());
        anotherContext.compress("new string");
    }
}
