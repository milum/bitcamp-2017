
public class MidiTable {
	
	public static int tableValue(String s) {
		int[][] table = new int[10][12];
		int count = 0;
		int col = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 12; j++) {
				table [i][j] = count;
				count++;
			}
		}
		if (s.substring(0, 1).equals("C")) {
			col = 0;
		}
		else if (s.substring(0, 2).equals("Db")) {
			col = 1;
		}
		else if (s.substring(0, 1).equals("D")) {
			col = 2;
		}
		else if (s.substring(0, 2).equals("Eb")) {
			col = 3;
		}
		else if (s.substring(0, 1).equals("E")) {
			col = 4;
		}
		else if (s.substring(0, 1).equals("F")) {
			col = 5;
		}
		else if (s.substring(0, 2).equals("Gb")) {
			col = 6;
		}
		else if (s.substring(0, 1).equals("G")) {
			col = 7;
		}
		else if (s.substring(0, 2).equals("Ab")) {
			col = 8;
		}
		else if (s.substring(0, 1).equals("A")) {
			col = 9;
		}
		else if (s.substring(0, 2).equals("Bb")) {
			col = 10;
		}
		else if (s.substring(0, 1).equals("B")) {
			col = 11;
		}
		return table[Integer.parseInt(s.substring(s.length()-1, s.length()))][col];
	}

}
