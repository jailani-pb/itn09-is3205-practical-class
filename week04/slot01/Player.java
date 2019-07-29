package week04.slot01;

public class Player {

	private int id;
	public final String name;
	private int health = 100;
	private static int numberOfPlayer = 0;
	
	public Player(String name) {
		numberOfPlayer++;
		this.id = numberOfPlayer;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String interact(NonPlayableCharacter npc) {
		return null;
	}
	
	public int attack(NonPlayableCharacter npc) {
		return 0;
	}
	
	public int getHealth() {
		return health;
	}
	
//	public void setHealth(int health) {
//		if(health <= this.health) {
//			this.health = health;
//		}
//	}
	
	public boolean reduceHealth(int damage) {
		if(damage > 0) {
			health = health - damage;
			if(health < 0) {
				health = 0;
			}
			return true;
		} else {
			return false;
		}
	}
	
	public boolean increaseHealth(int heal) {
		if(heal > 0) {
			health = health + heal;
			if(health > 100) {
				health = 100;
			}
			return true;
		} else {
			return false;
		}
	}
}


