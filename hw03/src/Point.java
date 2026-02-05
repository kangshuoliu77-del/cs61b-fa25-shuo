public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    public double distanceTo(Point other) {
        return Math.sqrt(
                Math.pow(this.x - other.x, 2) +
                Math.pow(this.y - other.y, 2)
        );
    }

    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}
