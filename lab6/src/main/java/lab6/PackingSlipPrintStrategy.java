package lab6;

public class PackingSlipPrintStrategy implements IPrintStrategy {
	
	private IComponent order;
	private String description;
	
	public PackingSlipPrintStrategy(String desc, IComponent order) {
		this.order = order;
		description = desc;
	}

	/**
     * Print Description of all the components 
     */
	@Override
	public void printDescription() {
		System.out.println( "===========" + description + "=====================" );
		for(IComponent obj:((Composite)order).getComponents()) {
			obj.printDescription();
		}
		System.out.println( "============================================" );
	}

}
