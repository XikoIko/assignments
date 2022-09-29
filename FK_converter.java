import java.util.*;
public class FK_converter {

	public static void main(String[] args) {
	
	
	Scanner in = new Scanner(System.in);
	System.out.println("Please enter the tempure in fahrenheit");
	double F = in.nextDouble();
	
	double K = (F+459.67)*5/9;
	String str = String.format("%.2f", K);
	double K_2 = Double.parseDouble(str);
	System.out.println("The tempure in kelvin is "+K_2+"K");
	
	}
}
