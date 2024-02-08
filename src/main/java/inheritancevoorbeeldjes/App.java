package inheritancevoorbeeldjes;

public class App {
    public static void main(String[] args) {
        Table t = new Table();
        t.setColor("Blue");
        Measurement m = new Measurement();
        m.setHeight(100);
        m.setLength(200);
        m.setWidth(80);
        t.setMeasurement(m);

        System.out.println(t.isStandingDesk() + t.getColor() + " " + t.getMeasurement().getHeight());

        Chair c = new Chair();
        c.setColor("Purple");
        Measurement m2 = new Measurement();
        m2.setHeight(100);
        m2.setLength(60);
        m2.setWidth(60);
        c.setMeasurement(m2);

        System.out.println(c.getColor() + " " + c.getMeasurement().getHeight());

        printFurniture(t);
        printFurniture(c);

        Furniture f = new Table();
    }

    public static void printFurniture(Furniture f) {
        System.out.println(f.getColor() + " " + f.getMeasurement().getHeight());
    }
}
