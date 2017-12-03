

public class BiasedCoin {
	
	private final int HEADS = 0;
	private final int TAILS = 1;
	private double bias;
	
	private int face;
	
	public BiasedCoin() {
		bias = 0.5;
		flip();
	}
	
	public BiasedCoin(double inputBias) {
		if(inputBias>=0 && inputBias<=1)
			bias = inputBias;
		else
			bias = 0.5;
		flip();
	}
	
	public void flip() {
		if(Math.random()<bias)
			face = 0;
		else
			face = 1;
	}
	
	public boolean isHeads() {
		return (face == HEADS);
	}
	
	public String toString() {
		
		String faceName;
		if(face == HEADS) {
			faceName  = "Heads";
		} else {
			faceName = "Tails";
		}
		
		return faceName;
	}

}
