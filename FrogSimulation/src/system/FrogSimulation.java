package system;
//class used to simulate a frog during a race.
public class FrogSimulation {
	private int goalDistance;
	private int maxHops;
	private int score;
	private int numRounds;
	private int wins;
	
	public int getGoalDistance() {return this.goalDistance;}
	public void setGoalDistance(int goalDistance) {this.goalDistance = goalDistance;}
	public int getMaxHops() {return this.maxHops;}
	public void setMaxHops(int maxHops) {this.maxHops = maxHops;}
	public int getScore() {return this.score;}
	public void setScore(int score) {this.score = score;}
	public int getNumRounds() {return this.numRounds;}
	public int getWins() {return this.wins;}
//constructor used to set the goal distance the frog must reach in the max amount of hops.
	public FrogSimulation(int goalDistance, int maxHops) {
		this.goalDistance = goalDistance;
		this.maxHops = maxHops;
		this.score = 0;
		this.numRounds = 0;
		this.wins = 0;
	}
//determines the distance the frog can jump during the simulation is based on randomness.
	private int hopDistance() {
		double random = Math.random();
		int hops;
		if(random >= 0.5) {
			int num = (int)(((double)this.goalDistance / this.maxHops) * 1);
			hops = (int)(Math.random() * (num + 1));
			hops *= -1;
		}
		else {
			int num = (int)(((double)this.goalDistance / this.maxHops) * 5);
			hops = (int)(Math.random() * (num + 1));
		}
		return hops;
	}
//simulates 1 frog's race using the information of how many hops it can make and goal distance.
	public boolean simulate() {
		int distance = 0;
		this.numRounds++;
		for(int i = 0; i < this.maxHops; i++) {
			distance += this.hopDistance();
			if(distance < 0) {
				return false;
			}
			else if(distance >= this.goalDistance) {
				this.wins++;
				this.score += this.maxHops + 10 - 2 * i;
				return true;
			}
		}
		return false;
	}
//converts instance variable information to a String.
	public String toString() {
		return "Score: " + this.score + " Goal Distance: " + this.goalDistance + " Max Hops: " + this.maxHops + " Number Of Wins: " + this.wins + " Number of Losses: " + (this.numRounds - this.wins);
	}
}
