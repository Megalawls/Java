
public class Board {
	int x = 8;
	int y = 8;
	String defaultState = ("RNBQKBNRPPPPPPPP                                pppppppprnbqkbnr");
	char[] boardState;

	public Board() {
		super();
		boardState = defaultState.toCharArray();
	}

	public void printState() {
		String stateBoard = "";
		for (int i = 0; i <= 63; i++) {
			stateBoard += boardState[i];
			stateBoard += " ¦ ";
		}
		System.out.println("---------------------------------");
		for (int i = 0; i <= 255; i += 32) {
			System.out.println("¦ " + stateBoard.substring(i, i + 32));
			System.out.println("---------------------------------");
		}
	}

	void move(int x, int y) {

	}

	void arrayMove(int i, int y) {
		char temp = boardState[i]; // stores king as temp
		boardState[i] = boardState[y]; // changes the position king was at to
										// the value of the position at one less
										// in the string
		boardState[y] = temp; // sets king to queens old position

	}
}
