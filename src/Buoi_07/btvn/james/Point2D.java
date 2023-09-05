package Buoi_07.btvn.james;

public class Point2D {
    float X, Y;
    float[] point = new float[2];

    public Point2D(float x, float y) {
        X = x;
        Y = y;
        setXY(x, y);
    }

    public float getX() {
        return X;
    }

    public void setX(float x) {
        X = x;
    }

    public float getY() {
        return Y;
    }

    public void setY(float y) {
        Y = y;
    }

    public float[] getXY() {
        return point;
    }

    public void setXY(float X, float Y) {
        point[0] = X;
        point[1] = Y;
    }

    @Override
    public String toString() {
        return "Point (" + X + "," + Y + ")";
    }
}
