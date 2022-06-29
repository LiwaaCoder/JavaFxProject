package Model;

import java.util.Random;

public class Container 
{
	private int x,y,r,g,b,width=110,height=40;
	private boolean IsActive;

	public Container(int x , int y)
	{
		setX(x);
		setY(y);
		Random rnd = new Random();
		r = rnd.nextInt(255);
		g = rnd.nextInt(255);
		b = rnd.nextInt(255);
		IsActive = false;
	}
	
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

	public boolean SetActive(int x2, int y2)
	{
		
		if(x<x2 && x+width>x2 && y<y2 && y+height>y2)
		{
			IsActive=true;
			return true;
		}
		return false;	
	}
	
	public boolean getIsActive()
	{
		return this.IsActive;
	}
	
	public void setInactive(){
		this.IsActive = false;
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
