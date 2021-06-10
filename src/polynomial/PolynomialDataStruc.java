package polynomial;

	public class PolynomialDataStruc implements PolynomialADT{
		private PolyNode first;
		private PolyNode last;
		
		//default
		public PolynomialDataStruc() {
			this.last = null;
			this.first = null;
		}
		//overloaded const
		public PolynomialDataStruc(PolyNode first, PolyNode last) {
			this.last = last;
			this.first = first;
			
		}
		//copy const
		public PolynomialDataStruc(PolynomialDataStruc c) {
			this.last = c.last;
			this.first = c.first;
		}
		
		public boolean isEmpty() {
			return first == null;	
		}
		
		public void setFirstNode(PolyNode first) {
			this.first = first;
		}
		
		public PolyNode getFirstNode(PolyNode first) {
			return first;
		}
		//add exp and coe
		public void addPolyNodeFirst(int coe, int exp) {
			PolyNode node = new PolyNode(coe,exp);
			if(last == null) {
				last = node; 
				first = node;
			}
			
		}
		//add end 
		public void addPolyNodeLast(int coe, int exp) {
			PolyNode node = new PolyNode(coe,exp);
			if(last == null) {
				last = node;
				first = node;
			}
			else 
			{
			last.setNext(node);
			last = node;
			}
		}
		
		public void addPolyNode(int coe, int exp) {
			PolyNode node = new PolyNode(coe,exp);
			if(last == null)
			{
				last = node;
				first = node;
			}
			else
			{
				last.setNext(node);
				last = node;
			}
		}
		//add coe and exp with addpolynode method
		public void addPolynomials(int coe, int exp) {
		addPolyNode(coe,exp);
			
		}
		// 4x^3 + 3x^2 – 5 
		public String toString() {
			String str = "";
			PolyNode val = first;
			while(val != null) {
				if(val.getCoefficient()!=0) {
					str += String.format(" + ", val.getCoefficient(), val.getExponent());
					if(val.getCoefficient() < 0)
						str += String.format(" - ",
								-val.getCoefficient(), val.getExponent());
						if(val.getCoefficient() != 0 && val.getExponent() != 0)
						str += String.format("x^ ", val.getExponent());
						val = val.getNext();
				}
			}
			return str;
		}
		@Override
		public PolyNode getFirstNode() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public void addPolyNode(PolyNode next) {
			// TODO Auto-generated method stub
			
		}
	}


