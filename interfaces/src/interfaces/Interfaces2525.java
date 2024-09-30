package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import java.awt.Font;

public class Interfaces2525 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			//sadasd
			public void run() {
				try {
					Interfaces2525 frame = new Interfaces2525();
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
	public Interfaces2525() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(30, 42, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextArea txtrAlumno = new JTextArea();
		txtrAlumno.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtrAlumno.setBackground(UIManager.getColor("Button.background"));
		txtrAlumno.setText("Alumno");
		txtrAlumno.setBounds(30, 10, 96, 22);
		contentPane.add(txtrAlumno);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(30, 103, 96, 19);
		contentPane.add(passwordField);
		
		JTextPane txtpnContrasea = new JTextPane();
		txtpnContrasea.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtpnContrasea.setBackground(UIManager.getColor("Button.background"));
		txtpnContrasea.setText("Contraseña");
		txtpnContrasea.setBounds(30, 71, 108, 31);
		contentPane.add(txtpnContrasea);
	}
}
