public class OverwatchHero{
	
	int health;
	String ability1;
	String name;
	String ability2;
	String ultimate;
	
	public OverwatchHero(String name, int health, String ability1, String ability2, String ultimate) {
		this.name = name;
		this.health = health;
		this.ability1 = ability1;
		this.ability2 = ability2;
		this.ultimate = ultimate;
	}
	void display() {
		System.out.println("Name: " + this.name + "\nHealth: " + this.health + "\nAbility 1: " + this.ability1 + "\nAbility 2: " + this.ability2 + "\nUltimate: " + this.ultimate);
		
	}
}
