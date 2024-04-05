package stepic.triangleArea;

// класс Треугольник
class Triangle {
    TrianglePoint a, b, c;

    public Triangle(TrianglePoint a, TrianglePoint b, TrianglePoint c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // метод получения площади треугольника
    public double area() {
        // вычисляю длину каждой стороны
        double A = Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
        double B = Math.sqrt(Math.pow((b.getX() - c.getX()), 2) + Math.pow((b.getY() - c.getY()), 2));
        double C = Math.sqrt(Math.pow((a.getX() - c.getX()), 2) + Math.pow((a.getY() - c.getY()), 2));
        double P = (A + B + C) / 2; // полу-периметр треугольника
        double S = Math.sqrt(P * (P - A) * (P - B) * (P - C)); // площадь треугольника

        if ((((A + B) < C) || ((A + C) < B) || ((B + C) < A)) || S == 0) {
            System.out.println("Треугольник не существует");
            System.exit(0);
        }
        System.out.print("Площадь треугольника = ");
        return S;
    }

}
