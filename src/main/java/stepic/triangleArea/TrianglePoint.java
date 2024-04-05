package stepic.triangleArea;

// класс Точка
class TrianglePoint {
    private double x;
    private double y;

    public TrianglePoint(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    // метод получения координаты Х
    public double getX() {
        return x;
    }

    // метод получения координаты Y
    public double getY() {
        return y;
    }
}
