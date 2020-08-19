public class Material {
    private String material;
    protected boolean isBroken;
    protected boolean isBurnt;

    public Material() {
        this.material = "";
    }

    public Material(String material) {
        this.material = material;
    }

    public String getMaterialType() { return this.material; }
    public boolean getIsBroken() { return this.isBroken; }
    public boolean getIsBurnt() { return this.isBurnt; }
    public void setMaterial(String material) { this.material = material; }

    public void hit() {
        isBroken = true;
    }

    public void setFire() {
        isBurnt = true;
    }


    public String toString() {
        return this.material;
    }
}