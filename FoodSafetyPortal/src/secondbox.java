import java.awt.BorderLayout;
import java.sql.Connection;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class secondbox extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					secondbox frame = new secondbox();
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
	public secondbox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToFood = new JLabel("Welcome to food safety portal");
		lblWelcomeToFood.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblWelcomeToFood.setBounds(22, 13, 383, 37);
		contentPane.add(lblWelcomeToFood);
		
		JButton btnUser = new JButton("User");
		btnUser.setIcon(null);
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				user user=new  user();
				user.setVisible(true);	
			}
		});
		btnUser.setBounds(166, 80, 97, 25);
		contentPane.add(btnUser);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin ad=new  admin();
				ad.setVisible(true);
			}
		});
		btnAdmin.setBounds(275, 80, 114, 25);
		contentPane.add(btnAdmin);
		
		JButton btnRestaurant = new JButton("Restaurant");
		btnRestaurant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				restaurant res=new  restaurant();
				res.setVisible(true);
			}
		});
		btnRestaurant.setBounds(166, 134, 97, 25);
		contentPane.add(btnRestaurant);
		
		JButton btnRestaurantguide = new JButton("Restaurantguide");
		btnRestaurantguide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				restaurantguid resg=new restaurantguid();
				resg.setVisible(true);
			}
		});
		btnRestaurantguide.setBounds(275, 134, 130, 25);
		contentPane.add(btnRestaurantguide);
		
		JButton btnTemplate = new JButton("Template");
		btnTemplate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				template tem=new  template();
				tem.setVisible(true);
			}
		});
		btnTemplate.setBounds(166, 183, 97, 25);
		contentPane.add(btnTemplate);
		
		JButton btnBoking = new JButton("Booking");
		btnBoking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				booking boo=new  booking();
				boo.setVisible(true);
			}
		});
		btnBoking.setBounds(275, 183, 114, 25);
		contentPane.add(btnBoking);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 255, 51));
		Image img7=new ImageIcon(this.getClass().getResource("/food.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img7));
		
		lblNewLabel.setBounds(12, 80, 142, 160);
		contentPane.add(lblNewLabel);
	}
}
