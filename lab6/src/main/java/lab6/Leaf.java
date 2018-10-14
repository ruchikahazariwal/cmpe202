package lab6;

import java.text.DecimalFormat;

public class Leaf implements IComponent {

   private String description ;
   protected double price ;

   public Leaf ( String d, double p )
   {
       description = d ;
       price = p ;
   }
   
   public Leaf ( String d )
   {
       description = d ;
   }
   
   public double getPrice() {
	   return price;
   }

   @Override
   public void printDescription() {
       System.out.println( " " + description + " " ) ;
   }
   
   @Override
	public void printPriceDescription() {
	   DecimalFormat fmt = new DecimalFormat("0.00");
	   StringBuffer str = new StringBuffer();
       str.append(" " + description);
       int descLen = str.length() ;
       if (descLen < 35 ) {
           int pad = (35 - descLen) / 2 ;
           str.append(PadSpaces.padSpaces( pad ));
       }
       str.append(fmt.format(getPrice()));
       System.out.println(str);
	}
	 

   public void addChild(IComponent c) {
	    // no implementation
	}

	public void removeChild(IComponent c) {
       // no implementation
	}

	public IComponent getChild(int i) {
       // no implementation
       return null ;
	}

	
}

