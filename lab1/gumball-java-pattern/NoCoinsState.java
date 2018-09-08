public class NoCoinsState implements State {
    GumballMachine gumballMachine;
 
    public NoCoinsState(GumballMachine gumballMachine) {
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
        else
        {
            System.out.println("Only Nickel,Dime and Quarter are allowed");       
            return;
        }
        
        gumballMachine.setCoinTotalAmount(gumballMachine.getCoinTotalAmount() + n);
        gumballMachine.setState(gumballMachine.getHasCoinsState());
        
    }
 
    public void ejectCoin() {
        System.out.println("Your"+ gumballMachine.getCoinTotalAmount()+ " cents returned. ");
        gumballMachine.setCoinTotalAmount(0);
    }
 
    public void turnCrank() {
        System.out.println("First insert coin");
     }
 
    public void dispense() {
        System.out.println("Pay first");
    } 
 
    public String toString() {
        return "waiting for coins";
    }
}