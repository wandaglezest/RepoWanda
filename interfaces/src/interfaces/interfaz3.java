package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class interfaz3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz3 frame = new interfaz3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public interfaz3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(34, 57, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(34, 133, 96, 19);
		contentPane.add(passwordField);
		
		JTextArea txtrDni = new JTextArea();
		txtrDni.setBackground(SystemColor.menu);
		txtrDni.setText("DNI");
		txtrDni.setBounds(34, 25, 96, 22);
		contentPane.add(txtrDni);
		
		JTextArea txtrPassword = new JTextArea();
		txtrPassword.setBackground(SystemColor.menu);
		txtrPassword.setText("CONTRASEÑA");
		txtrPassword.setBounds(34, 101, 96, 22);
		contentPane.add(txtrPassword);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(34, 167, 85, 21);
		contentPane.add(btnNewButton);
		
	}
}
