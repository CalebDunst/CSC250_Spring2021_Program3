
public class Driver {
	
	public static void main(String[] args) {
		OverwatchHero c1 = new OverwatchHero("Reinhardt", 550, "Firestrike", "Charge", "Earthshatter");
		OverwatchHero c2 = new OverwatchHero("McCree", 225, "Combat Roll", "Flashbang", "Deadeye");
		OverwatchHero c3 = new OverwatchHero("Baptiste", 200, "Regen Burst", "Immortality Field", "Amplification Matrix");
		OverwatchHero c4 = new OverwatchHero("Roadhog", 600, "Breather", "Chain Hook", "Whole Hog");
		OverwatchHero c5 = new OverwatchHero("Junkrat", 200, "Concussion Mine", "Steel Trap", "Riptire");
		
		c1.display();
		c2.display();
		c3.display();
		c4.display();
		c5.display();
		
		c1.name="Wilhelm";
		c1.display();
	}

}
