import java.awt.BorderLayout;
import java.sql.Connection;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JPasswordField;

public class Registerpage extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_4;
	private JLabel lblEmailid;
	private JLabel lblPassword;
	private JLabel lblConfirmPassword;
	private JLabel lblRegisteration;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registerpage frame = new Registerpage();
					frame.setUndecorated(true);
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
	public Registerpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 537);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setForeground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		Button button = new Button("Signup");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
			}	
			
		});
		button.setForeground(new Color(0, 0, 0));
		button.setBackground(new Color(255, 127, 80));
		button.setBounds(422, 402, 288, 36);
		contentPane.add(button);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(711, 309, -292, 2);
		contentPane.add(separator);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(422, 97, 288, 36);
		contentPane.add(textField_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(422, 175, 288, 36);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(422, 62, 97, 22);
		contentPane.add(lblNewLabel);
		
		lblEmailid = new JLabel("Email Id");
		lblEmailid.setBounds(422, 146, 56, 16);
		contentPane.add(lblEmailid);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(422, 217, 78, 16);
		contentPane.add(lblPassword);
		
		lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setBounds(422, 295, 119, 16);
		contentPane.add(lblConfirmPassword);
		
		lblRegisteration = new JLabel("Register page");
		lblRegisteration.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRegisteration.setBackground(SystemColor.textHighlight);
		lblRegisteration.setForeground(new Color(139, 0, 0));
		lblRegisteration.setBounds(508, 13, 150, 25);
		contentPane.add(lblRegisteration);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(422, 246, 285, 36);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(422, 324, 288, 38);
		contentPane.add(passwordField_1);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBackground(Color.ORANGE);
		Image img8=new ImageIcon(this.getClass().getResource("/PC.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img8));
		lblNewLabel_1.setBounds(23, 62, 257, 376);
		contentPane.add(lblNewLabel_1);
	}
}
