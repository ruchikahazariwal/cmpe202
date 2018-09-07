import java.util.Random;

public class HasCoinsState implements State {
    GumballMachine gumballMachine;
 
    public HasCoinsState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
    
    public void insertCoin(int n) {
        //System.out.println("You inserted a quarter");
        //gumballMachine.setState(gumballMachine.getHasCoinsState());
        if(n==5)
        {
            System.out.println("You have inserted a Nickel");
        }else if(n==10)
        {
            System.out.println("You have inserted a Dime");        
        }else if(n==25)
        {
            System.out.println("You have inserted a Quarter");
        }
        else{
            System.out.println("Only Nickel,Dime and Quarter is allowed");       
            return;
        }
        
        gumballMachine.setCoinTotalAmount(gumballMachine.getCoinTotalAmount() + n);        
    }
 
    public void ejectCoin() {
        System.out.println("Your"+ gumballMachine.getCoinTotalAmount()+ " cents returned.");
        gumballMachine.setCoinTotalAmount(0);
        gumballMachine.setState(gumballMachine.getNoCoinsState());
    }
 
    public void turnCrank() {
        System.out.println("You have turned the crank ");
        if(gumballMachine.getCoinTotalAmount() < 25){
            int remainingAmount = 25 - gumballMachine.getCoinTotalAmount();
            System.out.println("You need "+ remainingAmount +" more cents to get a gumball ");    
        }
		else if(gumballMachine.getCoinTotalAmount() > 25 && gumballMachine.getCoinTotalAmount() < 50){
            int remainingAmount = 50 - gumballMachine.getCoinTotalAmount();
            System.out.println("You need "+ remainingAmount +" more cents to get a gumball");    
        }
        else{
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    public void dispense() {
		
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "waiting for turn of crank";
    }
}