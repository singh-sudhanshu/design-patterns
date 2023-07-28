package behavioral.strategy;

/**
 * Java Program to implement Strategy design pattern in Java.
 * Strategy pattern allows you to supply different strategy without changing the Context class,
 * which uses that strategy. You can also introduce new sorting strategy any time.
 * Similar example is Collections.sort() method, which accept Comparator or Comparable
 * which is actually a Strategy to compare objects in Java.
 * We implemented this pattern to provide the ability to compress the payload for different client at runtime.
 */
public interface CompressionStrategy {

    void compress(Object obj);
}
