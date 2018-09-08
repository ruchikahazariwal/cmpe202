public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);

		System.out.println(gumballMachine);

	
		System.out.println("1.------------------------");
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		gumballMachine.takeGumballFromSlot();
		
		System.out.println("2.------------------------");
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		gumballMachine.takeGumballFromSlot();
		
		System.out.println("3.------------------------");
		gumballMachine.insertDime();
		gumballMachine.insertQuarter();
		gumballMachine.insertDime();
		gumballMachine.insertDime();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		gumballMachine.takeGumballFromSlot();
		
		
		System.out.println("4.------------------------");
		gumballMachine.insertDime();
		gumballMachine.insertQuarter();
		gumballMachine.insertNickel();
		gumballMachine.insertDime();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		gumballMachine.takeGumballFromSlot();
		
		System.out.println("5.------------------------");
		gumballMachine.insertDime();
		gumballMachine.turnCrank();
		gumballMachine.getState();
		System.out.println(gumballMachine);
		gumballMachine.takeGumballFromSlot();
		
		
	}
}