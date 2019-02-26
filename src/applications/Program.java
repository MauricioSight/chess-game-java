package applications;

import boardgame.Board;
import boardgame.Position;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Board bor = new Board(8, 8);
		int cord = 0;
		
		for (int i=0; i<bor.piece.length; i++) {
			for (int j=0; j<bor.piece[i].length; j++){
				System.out.print(cord+" ");
				cord++;
			}
		System.out.println();
		}
	}

}
