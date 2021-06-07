package system;
//class used to simulate a competition between 10 frogs in a race.
public class FrogRace {
	private FrogSimulation frog1;
	private FrogSimulation frog2;
	private FrogSimulation frog3;
	private FrogSimulation frog4;
	private FrogSimulation frog5;
	private FrogSimulation frog6;
	private FrogSimulation frog7;
	private FrogSimulation frog8;
	private FrogSimulation frog9;
	private FrogSimulation frog0;
//constructor used to set up frogs for race.
	public FrogRace() {
		this.frog0 = new FrogSimulation(0, 0);
		this.frog1 = new FrogSimulation(0, 0);
		this.frog2 = new FrogSimulation(0, 0);
		this.frog3 = new FrogSimulation(0, 0);
		this.frog4 = new FrogSimulation(0, 0);
		this.frog5 = new FrogSimulation(0, 0);
		this.frog6 = new FrogSimulation(0, 0);
		this.frog7 = new FrogSimulation(0, 0);
		this.frog8 = new FrogSimulation(0, 0);
		this.frog9 = new FrogSimulation(0, 0);
		this.startRace();
	}
//method used to ask user input for maxHops and goalDistance for each frog.
	public void startRace() {
		while(true) {
			String input = JOP.in("What goal distance do you want (easy: 0 - 10; medium 10 - 100; hard > 100): (press cancel at any time to exit)");
			while(!JOP.isInt(input)) {input = JOP.in("What goal distance do you want (easy: 0 - 10; medium 10 - 100; hard > 100): (press cancel at any time to exit)");}
			
			String input2 = JOP.in("What is the number of hops that you want(easy > 100; medium > 20; hard > 0): ");
			while(!JOP.isInt(input2)) {input2 = JOP.in("What is the number of hops that you want(easy > 100; medium > 20; hard > 0): ");}
			
			this.frog0.setGoalDistance(Integer.valueOf(input));
			this.frog0.setMaxHops(Integer.valueOf(input2));
			this.frog1.setGoalDistance(Integer.valueOf(input));
			this.frog1.setMaxHops(Integer.valueOf(input2));
			this.frog2.setGoalDistance(Integer.valueOf(input));
			this.frog2.setMaxHops(Integer.valueOf(input2));
			this.frog3.setGoalDistance(Integer.valueOf(input));
			this.frog3.setMaxHops(Integer.valueOf(input2));
			this.frog4.setGoalDistance(Integer.valueOf(input));
			this.frog4.setMaxHops(Integer.valueOf(input2));
			this.frog5.setGoalDistance(Integer.valueOf(input));
			this.frog5.setMaxHops(Integer.valueOf(input2));
			this.frog6.setGoalDistance(Integer.valueOf(input));
			this.frog6.setMaxHops(Integer.valueOf(input2));
			this.frog7.setGoalDistance(Integer.valueOf(input));
			this.frog7.setMaxHops(Integer.valueOf(input2));
			this.frog8.setGoalDistance(Integer.valueOf(input));
			this.frog8.setMaxHops(Integer.valueOf(input2));
			this.frog9.setGoalDistance(Integer.valueOf(input));
			this.frog9.setMaxHops(Integer.valueOf(input2));
			
			this.race();
		}
	}
//method used to simulate the results of the race for each of the 10 frogs 5 times and display the results.
	public void race() {
		for(int i = 0; i < 5; i++) {
			this.frog0.simulate();
			this.frog1.simulate();
			this.frog2.simulate();
			this.frog3.simulate();
			this.frog4.simulate();
			this.frog5.simulate();
			this.frog6.simulate();
			this.frog7.simulate();
			this.frog8.simulate();
			this.frog9.simulate();
			this.displayResults();
		}
	}
//displays the results of the race after a round is finished for each frog.
	public void displayResults() {
		String s = "";
		s += "Your Frog " + this.frog0.toString() + "\n";
		s += "Frog1 " + this.frog1.toString() + "\n";
		s += "Frog2 " + this.frog2.toString() + "\n";
		s += "Frog3 " + this.frog3.toString() + "\n";
		s += "Frog4 " + this.frog4.toString() + "\n";
		s += "Frog5 " + this.frog5.toString() + "\n";
		s += "Frog6 " + this.frog6.toString() + "\n";
		s += "Frog7 " + this.frog7.toString() + "\n";
		s += "Frog8 " + this.frog8.toString() + "\n";
		s += "Frog9 " + this.frog9.toString() + "\n";
		JOP.msg(s);
	}
}
