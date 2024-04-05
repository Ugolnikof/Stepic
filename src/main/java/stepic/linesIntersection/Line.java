package stepic.linesIntersection;

class Line {
    int k, b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        // если прямые параллельны
        if (this.k == other.k) {
            return null;
        }

        // если прямые идентичны
        if (this.k == other.k && this.b == other.b) {
            return null;
        }

        // вычисление координат пересечения прямых
        int x = (other.b - this.b) / (this.k - other.k);    // точка Х пересечения двух прямых
        int y = k * x + b;    // // точка Y пересечения двух прямых

        System.out.println("Точка пересечения прямых: ");
        return new Point(x, y);
    }

}
