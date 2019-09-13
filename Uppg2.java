/*
Detta är en av koderna från boken
Skapad 2019-09-13
Programerare Johan Jokijärvi
*/

import javax.swing.*;
import java.util.Scanner;

public class Uppg2 {
	public static void main (String[] args) {
		String s1;
		s1 = "valkommen";
		
		String s2;
		s2 = s1;
		s2 = s2 + " hit";
		s2 = s2 + " " + System.getProperty("user.name");
		JOptionPane.showMessageDialog(null, s2);
	}
}