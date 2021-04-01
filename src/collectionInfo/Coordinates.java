package collectionInfo;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (o instanceof Coordinates) {
            Coordinates that = (Coordinates) o;
            return Float.compare(that.x, x) == 0 &&
                    y == that.y;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

