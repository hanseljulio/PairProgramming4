public class Furniture {
    protected Material material;
    protected String furnitureType;

    public Furniture(String furnitureType, Material materialType) {
        this.furnitureType = furnitureType;
        this.material = materialType;
    }

    public Material getMaterial() { return this.material; }
    public String getFurnitureType() { return this.furnitureType; }

    public void printStatus() {
        System.out.println(
                String.format(
                        "The %s %s is %sbroken, and it is %sburnt.",
                        this.material,
                        this.furnitureType,
                        this.material.getIsBroken() ? "" : "not ",
                        this.material.getIsBurnt() ? "" : "not "
                )
        );
    }
}