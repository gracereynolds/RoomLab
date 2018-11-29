package People;

/**
 * Person represents the player as they move through the game.
 */
public class Person {
	String firstName;
	String familyName;
	public String House;
	int xLoc, yLoc;


	public int getxLoc() {
		return xLoc;
	}

	public void setxLoc(int xLoc) {
		this.xLoc = xLoc;
	}

	public int getyLoc() {
		return yLoc;
	}

	public void setyLoc(int yLoc) {
		this.yLoc = yLoc;
	}

	public Person (String firstName, String familyName, String House, int xLoc, int yLoc)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.House = House;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
	}


}
