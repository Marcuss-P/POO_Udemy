import java.util.Scanner;

public class fun_Mat {

	public static void main(String[] args) {
		
	double delta;
	int x, a, c;
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	x = sc.nextInt();
	a = sc.nextInt();
	c = sc.nextInt();
	
	delta = Math.pow(x, 2) - (4*a)*c;
	
	System.out.println("Valor de delta: " + delta);
		
	}
	
}
