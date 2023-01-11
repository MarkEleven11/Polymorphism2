package Enumerations;

public enum Capacity {
    XS(0, 10),
    S(10,25),
    M(40,50 ),
    L(60,80),
    XL(100,120);

    public int getSeatsNumberMin() {
        return seatsNumberMin;
    }

    public int getGetSeatsNumberMax() {
        return getSeatsNumberMax;
    }

    private int seatsNumberMin;
    private int getSeatsNumberMax;

    Capacity(int seatsNumberMin, int getSeatsNumberMax) {
        this.seatsNumberMin = seatsNumberMin;
        this.getSeatsNumberMax = getSeatsNumberMax;
    }
}
