//import java.awt.BorderLayout;
import java.awt.EventQueue;
//import java.sql.Connection;
//import java.sql.ResultSet;

import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;

//import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

@SuppressWarnings("serial")
public class user extends JFrame {
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JTextField textField_3;
	private JTextField textField_4;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin frame = new admin();
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
	public user() {
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(323, 79, 561, 327);
		getContentPane().add(table);
		
		JLabel lblNewLabel = new JLabel("userid");
		lblNewLabel.setBounds(29, 78, 56, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("username");
		lblNewLabel_1.setBounds(29, 124, 56, 16);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("emailid");
		lblNewLabel_2.setBounds(29, 180, 56, 16);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("password");
		lblNewLabel_3.setBounds(29, 226, 56, 16);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("contactno");
		lblNewLabel_4.setBounds(29, 285, 56, 16);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("city");
		lblNewLabel_5.setBounds(29, 345, 56, 16);
		getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("insert");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnNewButton.setBounds(22, 433, 97, 25);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("update");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(194, 433, 97, 25);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("delete");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(379, 433, 97, 25);
		getContentPane().add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(113, 75, 116, 22);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(113, 121, 116, 22);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(113, 177, 116, 22);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(113, 223, 116, 22);
		getContentPane().add(passwordField);
		
		textField_3 = new JTextField();
		textField_3.setBounds(113, 282, 116, 22);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(113, 342, 116, 22);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblDisplayUserTable = new JLabel("display user table data");
		lblDisplayUserTable.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblDisplayUserTable.setBounds(457, 32, 292, 34);
		getContentPane().add(lblDisplayUserTable);
		
		JButton btnNewButton_3 = new JButton("save");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(521, 433, 97, 25);
		getContentPane().add(btnNewButton_3);
		
		

}
}