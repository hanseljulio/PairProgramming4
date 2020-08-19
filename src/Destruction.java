public class Destruction {
    public static void main(String[] args) {
        Material material = new Material("glass");
        Furniture chair = new Furniture("chair", material);
        chair.printStatus();

        Furniture table1 = new Table(new Glass());
        table1.printStatus();
        table1.getMaterial().hit();
        table1.printStatus();

        Furniture chair1 = new Chair(new Plywood());
        chair1.printStatus();
        chair1.getMaterial().setFire();
        chair1.getMaterial().hit();
        chair1.printStatus();

        System.out.println("Thwacking the chair...");
        chair.getMaterial().hit();
        chair.printStatus();

        System.out.println("Setting fire to the chair...");
        chair.getMaterial().setFire();
        chair.printStatus();

        System.out.println();

        Furniture table = new Furniture("table", material);
        table.printStatus();

        System.out.println("Thwacking the table...");
        table.getMaterial().hit();
        table.printStatus();

        System.out.println("Setting fire to the table...");
        table.getMaterial().setFire();
        table.printStatus();
    }
}