package polynomial;

public interface PolynomialADT {
	public abstract boolean isEmpty();
	
		public abstract void setFirstNode(PolyNode first);
	
	
		public void addPolyNode(int coe, int exp);
		public void addPolynomials(int coe, int exp);
		public abstract PolyNode getFirstNode();
	
		public abstract void addPolyNodeLast(int coef, int exp);
	
		public abstract void addPolyNode(PolyNode next);
	
	
		public abstract String toString();
}
