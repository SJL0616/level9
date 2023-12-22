package game_Sangjun;

public enum Weapon {

	SWORD("검"),
	SPEAR("창"),
	STAFF("스태프");
	
	Weapon(String string) {
		this.name = string;
	}

	String name;

	public String getName() {
		return name;
	}
	
}
