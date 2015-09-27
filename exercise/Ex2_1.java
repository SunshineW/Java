package exercise;

import java.util.Scanner;

/*import javax.swing.JOptionPane;

public class Ex1 {
	
	public static void main(String[] args){
	String str1 = JOptionPane.showInputDialog("input r:");
	double r = Double.parseDouble(str1);
	String str2 = JOptionPane.showInputDialog("input h:");
	double h = Double.parseDouble(str2);
	
	double v = Math.PI * r * r * h;
	
	JOptionPane.showMessageDialog(null, "v = " + Math.round(v*100/100.0
	));
	}

}*/
public class Ex2_1{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the radius: ");
		Double r = sc.nextDouble();
		System.out.println("Please input the high: ");
		Double h = sc.nextDouble();
		Double v = Math.PI * r * r * h;
		System.out.println("The volume is " + Math.round(v*100)/100.0);
		sc.close();
	}
}

