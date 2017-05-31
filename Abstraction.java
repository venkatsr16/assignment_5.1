import java.util.*;
abstract class Figure {
	double dim1;
	abstract void findArea();
	abstract void findPerimeter();
}
class Circle extends Figure {
	double dim1;
	public Circle(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		dim1 = s.nextDouble();
	}	
	void findArea(){
		double ac;
		ac=3.14*dim1*dim1;
		System.out.println("Area of circle: "+ac);
	}
	void findPerimeter(){
		double pc;
		pc=2*3.14*dim1;
		System.out.println("Perimeter of the circle: "+pc);
	}	
}
class Rectangle extends Figure {
	double dim2;
	public Rectangle(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		dim1 = s.nextDouble();
		System.out.println("Enter the breadth of rectangle");
		dim2 = s.nextDouble();
	}
	void findArea(){
		double ar;		
		ar = dim1*dim2;
		System.out.println("Area of rectanegle: "+ar);
	}
	void findPerimeter(){
		double pr;
		pr=2*(dim1+dim2);
		System.out.println("Perimeter of rectangle: "+pr);
	}
}
class Triangle extends Figure {
	double height;
	double thirdside;
	public Triangle(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the base");
		dim1 = s.nextDouble();
		System.out.println("Enter the height");
		height = s.nextDouble();
		System.out.println("Enter the third side");
		thirdside = s.nextDouble();
	}
	void findArea(){
		double at;
		at=(0.5*dim1*height);
		System.out.println("Area of triangle: "+at);
	}
	void findPerimeter(){
		double pt;
		pt=dim1+height+thirdside;
		System.out.println("Perimeter of triangle: "+pt);
	}	
}
class Abstraction {
	public static void main(String args[]){
		Figure f1 = new Circle();
		f1.findArea();
		f1.findPerimeter();
		
		Figure f2 = new Rectangle();
		f2.findArea();
		f2.findPerimeter();

		Figure f3 = new Triangle();
		f3.findArea();
		f3.findPerimeter();
	}
}