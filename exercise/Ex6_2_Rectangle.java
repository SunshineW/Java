package exercise;

public class Ex6_2_Rectangle {

	private double width;
	private double height;
	private String color;
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public double fidArea(){
		return width * height;
	}
	
	public double findPerimeter() {
		return 2 * (width + height);
	}
	@Override
	public String toString() {
		return "Ex6_2_Rectangle [width=" + width + ", height=" + height
				+ ", color=" + color + ", Area= " + this.fidArea() 
				+ ", perimeter= "+ this.findPerimeter() +"]";
	}
	
	
}
