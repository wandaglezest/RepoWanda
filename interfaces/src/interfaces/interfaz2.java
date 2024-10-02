package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;

public class interfaz2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz2 frame = new interfaz2();
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
	public interfaz2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_2 = new JPanel();
		contentPane_2.setBounds(10, 0, 458, 365);
		contentPane_2.setBackground(SystemColor.window);
		contentPane_2.setLayout(null);
		contentPane_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(contentPane_2);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(null);
		passwordField.setSelectionColor(SystemColor.textHighlightText);
		passwordField.setDisabledTextColor(SystemColor.textHighlightText);
		passwordField.setCaretColor(SystemColor.textHighlightText);
		passwordField.setToolTipText("");
		passwordField.setForeground(SystemColor.activeCaptionBorder);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 10));
		passwordField.setBounds(32, 241, 153, 19);
		contentPane_2.add(passwordField);
		
		
		JTextPane txtpnIngreseSuUsuario = new JTextPane();
		txtpnIngreseSuUsuario.setText("Ingrese su usuario.");
		txtpnIngreseSuUsuario.setForeground(SystemColor.activeCaptionBorder);
		txtpnIngreseSuUsuario.setFont(new Font("Helvetica", Font.PLAIN, 10));
		txtpnIngreseSuUsuario.setBounds(32, 188, 153, 19);
		contentPane_2.add(txtpnIngreseSuUsuario);
		
		JTextArea txtrUsuario = new JTextArea();
		txtrUsuario.setBackground(new Color(255, 255, 255));
		txtrUsuario.setFont(new Font("Helvetica", Font.PLAIN, 11));
		txtrUsuario.setText("USUARIO");
		txtrUsuario.setBounds(32, 176, 74, 13);
		contentPane_2.add(txtrUsuario);
		
		JTextArea txtrContrasea = new JTextArea();
		txtrContrasea.setText("CONTRASEÑA");
		txtrContrasea.setFont(new Font("Helvetica", Font.PLAIN, 11));
		txtrContrasea.setBackground(Color.WHITE);
		txtrContrasea.setBounds(32, 226, 99, 19);
		contentPane_2.add(txtrContrasea);
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(interfaz2.class.getResource("/imagenes/Recurso 8.png")));
		lblNewLabel_1.setBounds(32, 24, 85, 88);
		contentPane_2.add(lblNewLabel_1);
		
		JTextArea txtrIniciarSesin = new JTextArea();
		txtrIniciarSesin.setText("INICIAR SESIÓN");
		txtrIniciarSesin.setFont(new Font("Helvetica", Font.BOLD, 17));
		txtrIniciarSesin.setBackground(Color.WHITE);
		txtrIniciarSesin.setBounds(32, 119, 144, 19);
		contentPane_2.add(txtrIniciarSesin);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(SystemColor.activeCaptionBorder);
		separator.setForeground(SystemColor.activeCaptionBorder);
		separator.setBounds(32, 207, 235, 9);
		contentPane_2.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(SystemColor.activeCaptionBorder);
		separator_1.setBackground(SystemColor.activeCaptionBorder);
		separator_1.setBounds(32, 261, 235, 9);
		contentPane_2.add(separator_1);
		
		JButton btnNewButton = new JButton("ENTRAR");
		btnNewButton.setForeground(SystemColor.textHighlightText);
		btnNewButton.setBounds(32, 271, 96, 21);
		contentPane_2.add(btnNewButton);
		btnNewButton.setFont(new Font("Helvetica", Font.PLAIN, 10));
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setOpaque(true);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(467, 0, 252, 365);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setIcon(new ImageIcon(interfaz2.class.getResource("/imagenes/Recurso 6.png")));
		lblNewLabel_2.setBounds(0, 248, 242, 91);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 10, 252, 380);
		lblNewLabel.setIcon(new ImageIcon(interfaz2.class.getResource("/imagenes/Recurso 7.png")));
		panel.add(lblNewLabel);
	}
}
