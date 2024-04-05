package stepic.triangleArea;

import java.util.Scanner;
import java.lang.*;

// Программа принимает на вход координаты 3-х точек и вычисляет площадь треугольника, построенного по этим трём точкам
public class TriangleArea {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты точки А: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Введите координаты точки B: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.println("Введите координаты точки C: ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        // создаю 3 новых объекта-точки
        TrianglePoint a = new TrianglePoint (x1, y1);
        TrianglePoint b = new TrianglePoint (x2, y2);
        TrianglePoint c = new TrianglePoint (x3, y3);

        // создаю новый объект-треугольник по трем точкам
        Triangle triangle = new Triangle(a, b, c);

        System.out.println();
        System.out.println(triangle.area());
    }
}

