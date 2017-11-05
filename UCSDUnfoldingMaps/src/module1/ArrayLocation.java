package module1;

public class ArrayLocation {
    private double[] coords;

    public ArrayLocation(double[] coords) {
        this.coords = coords;
    }

    public static void main(String[] args) {
        double[] coords = {50.0, -17.5};
        ArrayLocation location = new ArrayLocation(coords);
        coords[0] = 33.5;
        coords[1] = 63.9;

        assert location.coords[0] == 33.5;
        assert location.coords[1] == 63.9;
    }
}
