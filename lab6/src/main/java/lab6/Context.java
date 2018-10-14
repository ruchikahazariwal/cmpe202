package lab6;

public class Context {
	   private IPrintStrategy strategy;

	   public Context(IPrintStrategy strategy){
	      this.strategy = strategy;
	   }

	   public void printDescription(){
	      strategy.printDescription();
	   }
	}