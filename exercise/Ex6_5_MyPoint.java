package exercise;

public class Ex6_5_MyPoint {
	private double x;
	private double y;
	
	public Ex6_5_MyPoint(){
		this.x = this.y = 0;
	}
	public Ex6_5_MyPoint(double x, double y){
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}

	public double distance(Ex6_5_MyPoint secondPoint) {
		
		double temp = (this.x - secondPoint.x) * (this.x - secondPoint.x) 
				+ (this.y - secondPoint.y) * (this.x - secondPoint.y);
		return Math.sqrt(temp);
	}
	public double distance(Ex6_5_MyPoint p1,Ex6_5_MyPoint p2) {
		
		double temp = (p1.x - p2.x) * (p1.x - p2.x)
				+  (p1.y - p2.y) * (p1.y - p2.y);
		return Math.sqrt(temp);
	}
	
	
}
