package week04.slot02;

public class TestGame {

	public static void main(String[] args) {
		System.out.println(Player.getNumberOfPlayer());
		System.out.println(Integer.parseInt("123"));
		System.out.println(NonPlayableCharacter.getNumberOfNPC());
		
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
		
		Player player2 = new Player("DEF");
		System.out.println(player1.attack(npc2));
		System.out.println(player1.attack(player2));
		
		Town town1 = new Town(3,4);
		town1.setPlayer(player1);
		town1.addNPC(npc1, 0, 1);
		town1.addNPC(npc2, 2, 1);
		
		System.out.println(town1.interactWithNPC(0, 1));
		System.out.println(town1.interactWithNPC(2, 1));
		System.out.println(town1.interactWithNPC(-1, 2));
		System.out.println(town1.interactWithNPC(2, 3));
	}
	
}







