package warFiles;

public class Card {

	private int value;
	private String name;
	
	
	// Instantiate new card
	public Card(int value, String name) {
		this.setValue(value);
		this.setName(name);
	}
	
	// Print the value and name of a card
	public void describe() {
		if (value < 11) {
			System.out.println(value + " of " + name);
		} else if (value == 11) {
			System.out.println("Jack of " + name);
		} else if (value == 12) {
			System.out.println("Queen of " + name);
		} else if (value == 13) {
			System.out.println("King of " + name);
		} else if (value == 14) {
			System.out.println("Ace of " + name);
		}
	}
	
	public String returnDescription() {
		
		String description = "";
		
		if (value < 11) {
			description = value + " of " + name;
		} else if (value == 11) {
			description = "Jack of " + name;
		} else if (value == 12) {
			description = "Queen of " + name;
		} else if (value == 13) {
			description = "King of " + name;
		} else {
			description = "Ace of " + name;
		}
		
		return description;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}
	
}
