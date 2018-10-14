package lab6;

/**
 * 
 * @author ruchikahazariwal
 * @version 1.0
 * Component Interface for the Composite pattern
 *
 */
public interface IComponent {
	void printDescription() ;
	double getPrice();
    void addChild(IComponent c);
    void removeChild(IComponent c);
    IComponent getChild(int i);
	void printPriceDescription();

}
