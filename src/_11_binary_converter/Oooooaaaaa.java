package _11_binary_converter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Oooooaaaaa {

	public static void main(String[] args) {
		JFrame wow = new JFrame();
		JPanel oooo = new JPanel();
		JTextField answer = new JTextField(10);
		JButton aa = new JButton("convert");
		wow.setVisible(true);
		wow.setTitle("Binary converter");
		wow.add(oooo);
		oooo.add(answer);
		oooo.add(aa);
		wow.pack();
		aa.addActionListener((m) -> {
			convert(answer.getText());
		});
		
	}
	static String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}

}
