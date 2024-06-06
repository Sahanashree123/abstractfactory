package abstractfactory;
public class Client {
    private Chair chair;
    private Table table;

    public Client(FurnitureFactory factory) {
        chair = factory.createChair();
        table = factory.createTable();
    }

    public void useFurniture() {
        chair.sitOn();
        table.placeItems();
    }

    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Client modernClient = new Client(modernFactory);
        modernClient.useFurniture();

        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Client victorianClient = new Client(victorianFactory);
        victorianClient.useFurniture();
    }
}