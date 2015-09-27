package exercise;

public class Ex6_1_Fan {

	private int speed;
	private boolean on;
	private double radius;
	private String color;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Ex6_1_Fan [speed=" + speed + ", on=" + on + ", radius="
				+ radius + ", color=" + color + "]";
	}
	
}
