package week04.slot01;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class NonPlayableCharacter {

	private int id;
	public String name;
	private int health = 100;
	private String[] dialogs;
	boolean hostile = false;
	private static int numberOfNPC = 0;
	
	public NonPlayableCharacter(String name, int maxNoDialogs) {
		numberOfNPC++;
		this.id = numberOfNPC;
		this.name = name;
		dialogs = new String[maxNoDialogs];
	}
	
	public int getId() {
		return id;
	}
	
	public String talk(Player player) {
		if(hostile) {
			attack(player);
			return "Antah kau!";
		} else {
			int index = (int) (Math.random() * dialogs.length - 1);
			return dialogs[index];
		}
	}
	
	public void addDialog(String dialog) {
		for(int i = 0; i < dialogs.length; i++) {
			if(dialogs[i] == null) {
				dialogs[i] = dialog;
				break;
			} else {
				if(dialogs[i].equals("")) {
					dialogs[i] = dialog;
					break;
				}
			}
		}
	}
	
	public int attack(Player player) {
		player.reduceHealth(10);
		return player.getHealth();
	}
	
	public int getHealth() {
		return health;
	}
	
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
