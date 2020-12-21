package tp_note_poo.tp5.controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FormulaireAddress extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel container = new JPanel();
	private JFormattedTextField jtf = new JFormattedTextField(NumberFormat.getIntegerInstance());
	private JLabel label = new JLabel("Please input your address :");
	private JButton b = new JButton ("Get the weather at the given adress!");

	public FormulaireAddress(){
		this.setTitle("Formulaire");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
		JPanel top = new JPanel();        
		Font police = new Font("Arial", Font.BOLD, 14);
		jtf.setFont(police);
		jtf.setPreferredSize(new Dimension(150, 30));
		jtf.setForeground(Color.BLUE);
		b.addActionListener(new BoutonListener());
		top.add(label);
		top.add(jtf);
		top.add(b);
		this.setContentPane(top);
		this.setVisible(true);            
	}       

	class BoutonListener implements ActionListener{
	   public void actionPerformed(ActionEvent e) {
       System.out.println("TEXT : jtf " + jtf.getText());
	   }
    }
}