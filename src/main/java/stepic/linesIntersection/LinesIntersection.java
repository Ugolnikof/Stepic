package stepic.linesIntersection;

import java.util.Scanner;

// Программа принимает на вход координаты 2х точек и вычисляет координаты пересечения прямых, построенных по этим двум точкам
public class LinesIntersection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты точки А: ");
        int k1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        System.out.println("Введите координаты точки B: ");
        int k2 = scanner.nextInt();
        int b2 = scanner.nextInt();

        Line line1 = new Line(k1,b1);
        Line line2 = new Line(k2,b2);

        System.out.println();
        System.out.println(line1.intersection(line2));
    }
}

