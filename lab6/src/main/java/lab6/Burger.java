package lab6;

import java.text.DecimalFormat;

/**
 * 
 * @author ruchikahazariwal
 * @version 1.0
 * Prints the Burger with Price and description
 *
 */
public class Burger extends Composite
{
    public Burger ( String description, double price)
    {
        super(description,price) ;
    }
    
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
        for (IComponent obj  : components)
        {
            obj.printDescription();
        }
    }
    
    public void printDescription() {
        System.out.println( " " + description + " " );
        for (IComponent obj  : components)
        {
            obj.printDescription();
        }
    }
}