package exercise;

public class Ex4_2 {
	
	public static double footToMeter(double foot){
		double meter = 0.305 * foot;
		return meter;
	}
	
	public static double meterToFoot(double meter){
		double foot = meter / 0.305;
		return foot;
	}
	
	public static void main(String[] args){
		System.out.printf("%-10s %-10s %-5s %-10s %-10s\n","Feet","Meters", "|", "Meters", "Feet");
		System.out.printf("----------------------------------------------------------\n");
		for(int i=1; i<=10; i++){
			double f1  = (double)i;
			double m1 = footToMeter((long)i);
			double m2 = (double)i * 5 + 15;
			double f2 = meterToFoot((long)m2);
			System.out.printf("%-10.1f %-10.3f %-5s %-10.1f %-10.12f\n",f1, m1, "|", m2, f2);	
		}
	}

}
