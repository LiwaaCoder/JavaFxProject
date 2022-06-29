package Model;

public class Truck {
	
	Container container;
	int loadx = 450 ;
	int loady = 640 ;
	public Truck() {
	}
	
	public void loadContainer(Container container) {
		this.container = container;
		container.setX(loadx);
		container.setY(loady);
	}
	
	public void removeContainer() {
		this.container = null;
	}
	
	public Container getContainer() {
		return container;
	}
}
