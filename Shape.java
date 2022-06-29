package Model;

import java.util.Random;

public abstract class Shape 
{
	protected int x , y ;
	protected int r,g,b;
	
	public Shape(int x , int y )
	{
		this.x=x;
		this.y=y;
		Random rnd = new Random();
		r = rnd.nextInt(255);
		g=rnd.nextInt(255);
		b=rnd.nextInt(255);
	}
	public abstract String getkind();
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setR(int r) {
		this.r = r;
	}
	public void setG(int g) {
		this.g = g;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getR() {
		return r;
	}
	public int getG() {
		return g;
	}
	public int getB() {
		return b;
	}

}
