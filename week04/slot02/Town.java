package week04.slot02;

public class Town {

	private Player player;
	private NonPlayableCharacter[][] npcs;
	
	public Town(int width, int heigth) {
		npcs = new NonPlayableCharacter[width][heigth];
	}
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	private boolean checkCoordinate(int x, int y) {
		if(x >= 0 && x < npcs.length && y >= 0 && y < npcs[0].length) {
			return true;
		} else {
			return false;
		}
	}
	
	public void addNPC(NonPlayableCharacter npc, int x, int y) {
		if(checkCoordinate(x, y)) {
			npcs[x][y] = npc;
		}
	}
	
	public String interactWithNPC(int x, int y) {
//		String msg = "";
		if(checkCoordinate(x, y)) {
			if(npcs[x][y] != null) {
//				msg = player.interact(npcs[x][y]);
				return player.interact(npcs[x][y]);
			} else {
//				msg = "Siuk sendiri kau disana!";
				return "Siuk sendiri kau disana!";
			}
		} else {
//			msg = "Kampung mana kan kau aga atu?";
			return "Kampung mana kan kau aga atu?";
		}
//		return msg;
	}
	
}










