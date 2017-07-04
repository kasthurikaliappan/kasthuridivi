package kas;
import java.util.*;
public class Hcf {
	public static void main(String args[])
    {
	int a, b, x, y, t, hcf;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Two Number : ");
    a = s.nextInt();
    b = s.nextInt();
    x = a;
    y = b;
	
    while(y != 0)
    {
        t = y;
        y = x%y;
        x = t;
    }
    hcf = x;
    System.out.print("HCF = " +hcf);
}
}
