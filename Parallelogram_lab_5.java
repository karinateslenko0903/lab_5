public class Parallelogram_lab_5 {
    private double base;
    private double side;
    private double height;


    public Parallelogram_lab_5(double base, double side, double height) {
        this.base = base;
        this.side = side;
        this.height = height;
    }


    public double getArea() {
        return base * height;
    }


    public double getPerimeter() {
        return 2 * (base + side);
    }


    public int compareTo(Parallelogram_lab_5 other) {
        double thisArea = this.getArea();
        double otherArea = other.getArea();
        return Double.compare(thisArea, otherArea);
    }

    @Override
    public String toString() {
        return "Паралелограм: Основа = " + base + ", Бічна сторона = " + side + ", Висота = " + height +
                ", Площа = " + getArea() + ", Периметр = " + getPerimeter();
    }

    public static void main(String[] args) {
        Parallelogram_lab_5 p1 = new Parallelogram_lab_5(10, 6, 5);
        Parallelogram_lab_5 p2 = new Parallelogram_lab_5(8, 5, 4);

        System.out.println(p1);
        System.out.println(p2);

        int comparison = p1.compareTo(p2);
        if (comparison > 0) {
            System.out.println("Паралелограм 1 має більшу площу.");
        } else if (comparison < 0) {
            System.out.println("Паралелограм 2 має більшу площу.");
        } else {
            System.out.println("Обидва паралелограми мають однакову площу.");
        }
    }
}
