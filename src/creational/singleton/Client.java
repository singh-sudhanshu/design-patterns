package creational.singleton;

public class Client {
    public static void main(String[] args) {

        String builder = "If it prints same value, then singleton was reused" + "\n" +
                "If prints different values, then 2 singletons were created";
        System.out.println(builder);
        Thread foo = new Thread(new Foo());
        Thread bar = new Thread(new Bar());
        foo.start();
        bar.start();
    }

    private static class Foo implements Runnable {
        @Override
        public void run() {
            var singleton = Singleton.getInstance("foo");
            System.out.println(singleton.getValue());
        }
    }

    private static class Bar implements Runnable {
        @Override
        public void run() {
            var singleton = Singleton.getInstance("bar");
            System.out.println(singleton.getValue());
        }
    }
}
