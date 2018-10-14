package lab6;

import java.util.ArrayList;

/**
 * 
 * @author ruchikahazariwal
 * @version 1.0
 * Implementation for the Component Interface
 * Add/Remove/Iterate component objects
 *
 */
public class Composite implements IComponent{
	
	protected ArrayList<IComponent> components = new ArrayList<IComponent>()  ;
    protected String description ;
    protected double price;
    
    public Composite(String description) {
    	this.description = description;
	}
    
    public Composite(String description, double price) {
    	this.description = description;
    	this.price = price;
	}
    
    
    
    public ArrayList<IComponent> getComponents() {
		return components;
	}

	public void setComponents(ArrayList<IComponent> components) {
		this.components = components;
	}

	/**
     * Print Description of all the leaf components along with itself
     */
	@Override
	public void printDescription() {
		for(IComponent obj:components) {
			obj.printDescription();
		}
		
	}
	
	/**
     * Print Description of all the leaf components along with itself
     */
	@Override
	public void printPriceDescription() {
		for(IComponent obj:components) {
			obj.printPriceDescription();
		}
		
	}
	
	/**
	 * Add component to the list
	 * @param c Component object
	 */
	@Override
	public void addChild(IComponent c) {
		components.add(c);
	}
	
	/**
	 * Remove component from the list
	 * @param c Component object
	 */
	@Override
	public void removeChild(IComponent c) {
		components.remove(c);
		
	}
	
	/**
	 * Get Component at a particular index in the list
	 * @return Component
	 */
	@Override
	public IComponent getChild(int i) {
		return components.get(i);
	}

	@Override
	public double getPrice() {
		return price;
	}
    
    
    
    
}
