package Model;

import java.util.ArrayList;

public class Model 
{
	private ArrayList<StackofContainers> StackofContainers;
	private StackofContainers sideContainer;
	private Truck truck;
	public Model ()
	{
		StackofContainers = new ArrayList<StackofContainers>();
		truck = new Truck();
		for (int i = 600; i <= 930; i=i+110) {
			StackofContainers st = new StackofContainers(i, 460);
			StackofContainers.add(st);
			for(int j =0; j < 4 ; j++) {
				st.addToStack(new Container(0, 0));
			}
		}
		sideContainer = new StackofContainers(1000, 660);

	}
	
	public void addStackofContainers(StackofContainers stackofContainers)
	{
		StackofContainers.add(stackofContainers);
		
	}
	
	public ArrayList<StackofContainers>GetAllStackofContainers()
	{
		return StackofContainers;
	}
	
	public StackofContainers getSideContainer() {
		return sideContainer;
	}
	
	public Truck getTruck() {
		return truck;
	}

}
