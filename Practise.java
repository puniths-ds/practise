public abstract class Shape{ //abstract class
	private String color; //encapsulation 
	
	public Shape(String color) { //constructor to initialize
		this.color=color;
	}
	
	public String getcolor() { //method to access color
		return color;
	}
	
	public abstract double calculateArea();//abstract method 
}

public class Circle extends Shape{
	private double radius;
	
	public Circle(String color, double radius) {
		super(color); //call parent to set color
		this.radius=radius;
	}
	
	
	public double calculateArea() { //overring the calculate area method
		return Math.PI*radius*radius;
	}
}

public class Rectangle extends Shape{ //class rectangle inheriting from class shape
	private double width; //encapsulating width
	private double height; //encapsulating height
	
	public Rectangle(String color,double width, double height) {
		super(color); //call parent constructor
		this.width=width; //assigning constructor parameter to instance 
		this.height=height;
		
	}
	
	public double calculateArea() {
		return width*height;
	}
}
public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
