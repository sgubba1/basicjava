
public class Student {
	String name;

	Student(String name) {
		this.name = name;
	}

	int Play(int game) {

		if (game == 1) {
			System.out.println(name + " is playing B-ball.");
		} else if (game == 1) {
			System.out.println(name + " is playing Soccer.");
		} else {
			System.out.println(name + " is laying unknown game.");
		}

		return 10;
	}

	// switch
	int play2(int gameType) {
		switch (gameType) {
		case 1:
			System.out.println("Playing B-ball.");
			break;

		case 2:
			System.out.println("Playing Soccer.");
			break;

		default:
			System.out.println("Playing the unknown.");

		}

		return 10;
	}

	// enum
	int play(Game gametype) {
		if (gametype == Game.basketball) {
			System.out.println("Playing basketball.");
		} else if (gametype == Game.football) {
			System.out.println("Playing football.");
		}
		return 10;
	}
}