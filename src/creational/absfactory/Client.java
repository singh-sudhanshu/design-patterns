package creational.absfactory;

public class Client {

    public static void main(String[] args) {

        FurnitureFactory victorianFurnitureFactory = new VictorianFactory();
        Chair chair = victorianFurnitureFactory.getChair();
        Couch couch = victorianFurnitureFactory.getCouch();
        System.out.println(chair);
        System.out.println(couch);

        FurnitureFactory modernFurnitureFactory = new ModernFactory();
        Chair modernChair = modernFurnitureFactory.getChair();
        Couch modernCouch = modernFurnitureFactory.getCouch();
        System.out.println(modernChair.toString());
        System.out.println(modernCouch);
    }
}
