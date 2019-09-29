import java.awt.EventQueue;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;

public class loginpage {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginpage window = new loginpage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public loginpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 230, 140));
		frame.getContentPane().setForeground(Color.CYAN);
		frame.setBounds(400, 400, 850, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLoginPage = new JLabel("Login System");
		lblLoginPage.setForeground(new Color(128, 0, 128));
		lblLoginPage.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblLoginPage.setBounds(289, 59, 211, 40);
		frame.getContentPane().add(lblLoginPage);
		
		JLabel lblUserName = new JLabel("Username");
		Image img=new ImageIcon(this.getClass().getResource("/log.png")).getImage();
		lblUserName.setIcon(new ImageIcon(img));
		lblUserName.setForeground(new Color(128, 0, 0));
		lblUserName.setBackground(SystemColor.activeCaption);
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblUserName.setBounds(201, 160, 200, 40);
		frame.getContentPane().add(lblUserName);
		
		txtUsername = new JTextField();
		txtUsername.setBackground(SystemColor.info);
		txtUsername.setBounds(488, 160, 200, 40);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		Image img1=new ImageIcon(this.getClass().getResource("/password.png")).getImage();
		lblPassword.setIcon(new ImageIcon(img1));
		lblPassword.setForeground(new Color(128, 0, 0));
		lblPassword.setBackground(SystemColor.activeCaption);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblPassword.setBounds(201, 241, 200, 40);
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(SystemColor.info);
		passwordField.setBounds(488, 241, 200, 40);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		Image img6=new ImageIcon(this.getClass().getResource("/ok.png")).getImage();
		btnLogin.setIcon(new ImageIcon(img6));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.setBounds(69, 410, 145, 50);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Connection conn=null;
				try {
					conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","admin");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    if(conn != null)
			    {
			    	System.out.println("Connected");
				//    JOptionPane.showMessageDialog(null,"vaild login details","login successfully",JOptionPane.PLAIN_MESSAGE);
				 //   secondbox second =new secondbox();
				//	second.setVisible(true);
			    }
			    else
			    	System.out.println("Not Connected");
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				String username=txtUsername.getText();
				String password=passwordField.getText();
				if(password.contains("admin")&& username.contentEquals("SYSTEM")) {
					txtUsername.setText(null);
					passwordField.setText(null);
					JOptionPane.showMessageDialog(null,"vaild login details","login successfully",JOptionPane.PLAIN_MESSAGE);
					
					secondbox second =new secondbox();
					second.setVisible(true);
					
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid login details","login error",JOptionPane.ERROR_MESSAGE);
					txtUsername.setText(null);
					passwordField.setText(null);
				}
		}
		});
		frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		Image img5=new ImageIcon(this.getClass().getResource("/Reset.png")).getImage();
		btnReset.setIcon(new ImageIcon(img5));
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnReset.setBounds(344, 410, 145, 50);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsername.setText(null);
				passwordField.setText(null);
				
			}
		});
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		Image img3=new ImageIcon(this.getClass().getResource("/exit.png")).getImage();
		btnExit.setIcon(new ImageIcon(img3));
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExit.setBounds(645, 410, 133, 50);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm if i am want to exit","login page",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		frame.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(29, 339, 1, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(29, 339, 775, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(29, 134, 775, 2);
		frame.getContentPane().add(separator_2);
		
		JLabel lblNewLabel = new JLabel(" ");
		Image img2=new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img2));
		lblNewLabel.setBounds(29, 134, 173, 198);
		frame.getContentPane().add(lblNewLabel);
	}
}
