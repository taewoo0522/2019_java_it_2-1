package chap04_ex03;

public class Circle {
	int radius;
	String name;

	public Circle() {
		radius = 1;
		name = "";

	}

	public Circle(int r, String n) {
		radius = r;
		name = n;

	}

	public double getArea() {
		return 3.14 * radius * radius;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza = new Circle(10, "Ã¥À»ÇÇÀÚ");
		double area = pizza.getArea();
		System.out.println(pizza.name + area);

		Circle donut = new Circle();
		donut.name = "Èñ¼ºµµ³Ó";
		area = donut.getArea();
		System.out.println(donut.name + area);

	}

}
