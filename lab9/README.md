## Decorator Pattern using Lambda

In the normal java code to apply decorator pattern we need to have a class which need to be decorated and then we decorated that class using the its parent class as base class. So in my code we had to add RedShapeDecorator.java a separate class which decorated the shape passed to it.
But using lambda function we need not to have an additional class for it, We can decorate the class just by calling a lambda decorator to whichever shape we need to decorate in draw of that shape. Hence this reduces the memory of creating another class and also efforts. If we need to decorate more we can just call another lamba function rather than creating other class.

```java
Shape circle = new Circle();
Shape redCircle = new RedShapeDecorator(new Circle());
Shape redRectangle = new RedShapeDecorator(new Rectangle());
```
In normal code we had to create object of specific decorator class
But, in Lamba we can create object of generic decorator class:

```java
Shape circle = new Circle();
Shape redCircle = new ShapeDecorator(new Circle());
Shape redRectangle = new ShapeDecorator(new Rectangle());
```

The decorator method definition also changes:
#### In case of Lambda:
```java
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
```

#### In case of Normal:
```java
public class RedShapeDecorator extends ShapeDecorator {

   public RedShapeDecorator(Shape decoratedShape) {
      super(decoratedShape);		
   }

   @Override
   public void draw() {
      decoratedShape.draw();	       
      setRedBorder(decoratedShape);
   }

   private void setRedBorder(Shape decoratedShape){
      System.out.println("Border Color: Red");
   }
}
```
