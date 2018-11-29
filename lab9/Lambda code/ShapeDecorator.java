import java.util.function.*;

public class ShapeDecorator implements Shape {
   protected Shape decoratedShape;
   protected Function <String, Void> border= (String input) -> {
	   System.out.println("Border Color:" + input);
	   return null;
	} ;

   public ShapeDecorator(Shape decoratedShape){
      this.decoratedShape = decoratedShape;
   }

   public void draw(){
      decoratedShape.draw();
      border.apply("Red");
   }	
}
