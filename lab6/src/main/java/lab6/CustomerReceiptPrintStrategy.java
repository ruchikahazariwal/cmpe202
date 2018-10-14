package lab6;

import java.text.DecimalFormat;

public class CustomerReceiptPrintStrategy implements IPrintStrategy {
	
	private IComponent order;
	private String description;
	private double total;
	
	public CustomerReceiptPrintStrategy(String desc,IComponent order) {
		this.order = order;
		description = desc;
	}

	/**
     * Print Description of all the components 
     */
	public void printDescription() {
	   System.out.println( "===========" + description + "===========" );
	   for(IComponent obj:((Composite)order).getComponents()) {
		   obj.printPriceDescription();
		   total += obj.getPrice();
		}
	   DecimalFormat fmt = new DecimalFormat("0.00");
	   StringBuffer str = new StringBuffer();
       str.append(" Sub. Total:");
       int descLen = str.length() ;
       if (descLen < 30 ) {
           int pad = (30 - descLen) / 2 ;
           str.append(PadSpaces.padSpaces( pad ));
       }
       str.append("$"+fmt.format(total));
       System.out.println(str);
	   System.out.println( "============================================" );
	}

}
