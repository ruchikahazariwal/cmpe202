public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
    public void insertCoin(int n) {
        System.out.println("Please wait, we're already giving you a gumball");
    }
 
    public void ejectCoin() {
        System.out.println("Sorry, we have already given your money back");
    }
 
    public void turnCrank() {
        System.out.println("Please wait, we're already giving you a gumball");
    }
 
    public void dispense() 
    {
        gumballMachine.releaseBall();
            
        if(gumballMachine.getCoinTotalAmount()>0) {
            System.out.println("Your "+ gumballMachine.getCoinTotalAmount()+ " cents returned.");
                gumballMachine.setCoinTotalAmount(0);    
        }
           
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoCoinsState());
        } else {
            System.out.println("out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
        
        
    }
 
    public String toString() {
        return "dispensing a gumball";
    }
}

