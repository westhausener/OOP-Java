import java.awt.Color;

public class Rechteck {
	
	private int l, b;
	private Color c;
	
	public Rechteck(int l, int b, Color c){
		
		this.l = l;
		this.b = b;
		this.c = c;
	}
	
	public Rechteck(int l, Color c){
		this(l, l, c);
	}

	public int getL() {
		return l;
	}

	public int getB() {
		return b;
	}

	public Color getC() {
		return c;
	}

}
