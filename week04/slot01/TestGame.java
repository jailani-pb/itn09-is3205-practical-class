package week04.slot01;

public class TestGame {

	public static void main(String[] args) {
		Player player1 = new Player("ABC");
		NonPlayableCharacter npc1 = new NonPlayableCharacter("A", 3);
		NonPlayableCharacter npc2 = new NonPlayableCharacter("B", 3);
		
		System.out.println("player1 details");
		System.out.println(player1.getId() + " " + player1.name);
		
		// Add dialogs for both npcs
		npc1.addDialog("A");
		npc1.addDialog("AA");
		npc1.addDialog("AAA");
		npc2.addDialog("B");
		npc2.addDialog("BB");
		npc2.addDialog("BBB");
		
		System.out.println("player1 interact with npc1");
		System.out.println(player1.interact(npc1));
		
		System.out.println("player1 attack npc2");
		System.out.println("Current npc2 health: " + player1.attack(npc2));
		System.out.println("player1 interact with npc2");
		System.out.println(player1.interact(npc2));
		System.out.println("Current player health: " + player1.getHealth());
	}
	
}
