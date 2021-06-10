package polynomial;

public class PolynomialDemo {
	public static void main(String[] args) {
		//p1
		PolynomialDataStruc p1 = new PolynomialDataStruc();
		
		PolynomialDataStruc p2 = new PolynomialDataStruc();

		PolynomialDataStruc p3 = new PolynomialDataStruc();
		
		PolynomialDataStruc p4 = new PolynomialDataStruc();
		
		// p1= 4x^3 + 3x^2 – 5  ; p2 = 3x^5 + 4x^4 + x^3 – 4x^2 + 4x^1 + 2
		p1.addPolyNodeLast(4, 0);
		p1.addPolyNodeLast(3, 2);
		p1.addPolyNodeLast(-5, 0);
		
		p2.addPolynomials(3, 5);
		p2.addPolynomials(4, 4);
		p2.addPolynomials(1, 3);
		p2.addPolynomials(-4, 2);
		p2.addPolynomials(4, 1);
		p2.addPolynomials(2, 0);
		System.out.println(p1);
		// p3= -5x^0 + 3x^2 + 4x^3  ; p4 = -4x^0 + 4x^3 + 5x^4
		p3.addPolyNodeLast(-5, 0);
		p3.addPolyNodeLast(3, 2);
		p3.addPolyNodeLast(4, 3);
		
		p4.addPolynomials(-4, 0);
		p4.addPolynomials(4, 3);
		p4.addPolynomials(5, 4);
		
		System.out.println(p3);
		
		System.out.println(p4);
	}
}
