package Model;

import java.util.Stack;

public class StackofContainers
{
	private Stack<Container>sc;
	int x;
	int y;
	int width = 110;
	int height = 40;
	boolean isActive;
	
	public StackofContainers(int x, int y)
	{
		sc = new Stack<Container>();
		this.x = x;
		this.y = y;
		isActive = false;
	}

	public void addToStack(Container cs) 
	{
		cs.setX(x);
		cs.setY(y - sc.size()*40);
		sc.push(cs);
	}
	
	public Container getTopcontainer()
	{
		return sc.peek();
		
	}
	
	public boolean isEmpty() {
		return sc.isEmpty();
	}
	
	public Container removeTopcontainer()
	{
		return sc.pop();
		
	}
	
	public Stack<Container> getContainers() {
		return sc;
	}
	
	public boolean SetActive(int x2, int y2)
	{
		boolean result = false;
		if(x<x2 && x+width>x2 && y-(height*(sc.size()-1))<y2 && y+height>y2)
		{
			isActive=true;
			for(int i=0;i<sc.size();i++) {
				result = sc.get(i).SetActive(x2, y2);
				if(result) {
					for(int j=0;j<sc.size();j++) {
						if(j != i) {
							sc.get(j).setInactive();
						}
					}
					break;
				}
			}
		}
		return result;
			
	}
	
	public boolean getIsActive()
	{
		return this.isActive;
	}
	
	public void setActiveFalse(){
		this.isActive = false;
		for(int j=0;j<sc.size();j++) {
			sc.get(j).setInactive();
		}
	}
	
		
}
