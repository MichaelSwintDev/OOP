public class Jug {
    private final String liquidType;
    private int gallons;

    public Jug(String liquidType, int gallons) {
        this.liquidType = liquidType;
        this.gallons = gallons;
    }

    public Jug() {
        liquidType = "water";
        gallons = 0;
    }

    public int getGallons() {
        return gallons;
    }

    public void setGallons(int gallons) {
        this.gallons = gallons;
    }

    public String getLiquidType() {
        return liquidType;
    }

    public boolean isEmpty() {
        return gallons == 0;
    }
}
