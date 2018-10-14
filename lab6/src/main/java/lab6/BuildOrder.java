package lab6;

public class BuildOrder {

  public static IComponent getOrder()
  {
      Composite order = new Composite( "Order" ) ;

      Burger burger = new Burger( "LBB",5.59) ;
      
      TopBun topBun = new TopBun( "Top Options" ) ;
      String[] topBunOptions = { "LETTUCE","TOMATO" } ;
      topBun.setOptions( topBunOptions ) ;
      
      Meat meat = new Meat( "Meat Topping Options" ) ;
      String[] meatOptions = { "G ONION","JALA Grilled" } ;
      meat.setOptions( meatOptions ) ;
      
      Patty patty = new Patty( "Patty Options" ) ;
      String[] pattyOptions = { "BACON" } ;
      patty.setOptions( pattyOptions ) ;
      
      // Setup Burger Ingredients
      burger.addChild( topBun ) ;
      burger.addChild( meat ) ;
      burger.addChild( patty ) ;
            
      // Add Burger to the Order
      order.addChild( burger );
      order.addChild(new Leaf("LTL CAJ",2.79));
      return order ;
  }

}
