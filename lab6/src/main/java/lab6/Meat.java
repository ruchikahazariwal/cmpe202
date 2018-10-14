package lab6;

public class Meat extends LeafDecorator
{
	private String[] options ;
	private final static String SYMBOL = "->|";
    
    
    public Meat( String desc )
    {
        super(desc) ;
    }
    
    
    public void setOptions( String[] options )
    {
        this.options = options ;
    }
    
    public String getDescription() 
    {
    	StringBuilder desc = new StringBuilder();
        for ( int i = 0; i<options.length; i++ )
        {	
        	desc.append("  ");
        	desc.append(SYMBOL);
            desc.append(options[i]);
            if(i!=options.length-1)
            	desc.append("\n");
        }        
        return desc.toString() ;
    }
    
}