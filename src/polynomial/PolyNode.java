package polynomial;

public class PolyNode {
	private int coefficent = 0;
	private int exponent = 0;
	private PolyNode next;
	
	public PolyNode() {
		this.coefficent = 0;
		this.exponent = 0;
		this.next = null;
	}
	
	public PolyNode(int coefficent, int exponent) {
		this.coefficent = coefficent;
		this.exponent = exponent;
		this.next = null;
	}
	
	public PolyNode(PolyNode c) {
		this.coefficent = c.coefficent;
		this.exponent = c.exponent;
		this.next = c.next;
	}
	
	public void setCoefficent(int coefficent) {
		this.coefficent = coefficent;
	}
	
	public void setExponent(int exponent) {
		this.exponent = exponent;
	}
	
	public void setNext(PolyNode next) {
		this.next = next;
	}
	
	public int getCoefficient() {
	
		return coefficent;
	}
	
	public int getExponent() {
		return exponent;
	}
	
	public PolyNode getNext() {
	
		return next;
	}
	
	
	
	
}

