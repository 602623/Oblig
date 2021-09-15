package no.hvl.dat100;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

	public class Fakultet {

		public static void main(String[] args) {
			String heltall = showInputDialog("Heltall");
			int tall = parseInt(heltall);
			
			if (tall < 0) {
				System.out.println("feilmelding");
			}
			
			int fakultet = 1;
			
			for(int i = 1; i <= tall; i++) {
				
				fakultet = fakultet * i; 		
			}
			
			System.out.println("Fakultetet av tallet er: " + fakultet);
	}

}
