package collections;

import java.util.Objects;

public class Coordinates {
    private float x;
    private long y; //Значение поля должно быть больше -828

    public Coordinates(float x, long y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    @Override
    public String toString() {
        return "X:" + x + "Y:" + y;
    }

    //hashcode

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj instanceof Coordinates) {
//            Coordinates coordinatesObj = (Coordinates) obj;
//            return (x == coordinatesObj.getX()) && y.equals(coordinatesObj.getY());
//        }
//        return false;
//    }

}

