package lab6;

public abstract class LeafDecorator extends Leaf {

   public LeafDecorator( String desc ) {
       super( desc) ;
    }

    abstract public void setOptions( String[] options ) ; 
    abstract public String getDescription() ;
        
    @Override
    public void printDescription() {
        System.out.println(getDescription() ) ;
    }
    
    
}

