package day49.Autonomous;

/*
Task :
	Create an Interface called Autonomous
		it has a single abstract method
			selfDrive()
	Create an abstract class called Vehicle
		it has 1 fields
			year
		add a constructor to set the field
		abstract method start() ;
		non-abstract instance method
			goForward
	Create a concrete class called Tesla
		 add instance field horsePower as int
	Tesla extends Vehicle and implements Autonomous
		add constructor to set all fields
		implement all abstract methods
		add toString methods
	create main method to test your code


Task 2
		Create an Interface called Drawable
				it has draw method
		Create an abstract class called Shape
		it implements Drawable interface
		it has 2 fields :  String name , double area
		abstract method calculateArea();
		Create 2 concrete Shape classes called
				Square
					field : length
					instance methods : (implement all abstract methods)
					toString method
				Circle
					field : radius
					instance methods : (implement all abstract methods)
					toString method
 */
public interface Autonomous {

    public abstract void selDrive();





}
