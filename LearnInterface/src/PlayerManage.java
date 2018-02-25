
public class PlayerManage {
	
	static Playables getPlayer(int option) {
		Playables player;

		if (option == 1) {
			player = new Person();
		} else {
			player = new Dog();
		}
		return player;
	}
}
