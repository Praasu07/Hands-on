package Inheritance;
 class Tester {
	  public void display() {
	       System.out.println(" display");
	    }
	 }
	 class Rectangle extends Tester {
	    public void area() {
	       System.out.println("area");
	    }
	 }
	 class Cube extends Rectangle {
	    public void volume() {
	       System.out.println("volume");
	    }
	 
	    public static void main(String[] arguments) {
	       Cube cube = new Cube();
	       cube.display();
	       cube.area();
	       cube.volume();
	    }
	 }

