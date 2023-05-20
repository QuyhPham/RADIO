package Client;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class HomeUser extends JFrame {

	private JPanel contentPane;
	public JMenu Home, Community, Chat;
	public  JMenuItem Logout, Blog, Chatbox;
	private JLabel lblBackGround;
	private JLabel lblNewLabel, lblNewLabel_1, lblNewLabel_2, lblNewLabel_3, lblNewLabel_4, lblNewLabel_5;
	//public JMenuItem MainHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeUser frame = new HomeUser();
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
	public HomeUser() {
		setForeground(new Color(128, 0, 0));
		this.setTitle("User");
		this.setIconImage((Toolkit.getDefaultToolkit().createImage(HomeUser.class.getResource("/Image/HomeUs.png"))));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 675);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(4, 4, 4, 4));
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.setBackground(new Color(253, 231, 172));
		setJMenuBar(menuBar);
			
			Home = new JMenu("Home");
			Home.setBackground(new Color(173, 92, 92));
			Home.setFont(new Font("Segoe UI", Font.BOLD, 18));
			Home.setForeground(new Color(0, 0, 0));
			
			Logout = new JMenuItem("Log Out");
//			Logout.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent e) {
//					setVisible(false);
//					Home ho = new Home();
//					ho.setVisible(true);
//				}});
			Logout.setBackground(new Color(236, 217, 217));
			Logout.setFont(new Font("Segoe UI", Font.PLAIN, 18));
			Logout.setForeground(new Color(128, 0, 0));
			
			Home.add(Logout);
			menuBar.add(Home);
			
			Community = new JMenu("Community");
			Community.setBackground(new Color(173, 92, 92));
			Community.setFont(new Font("Segoe UI", Font.BOLD, 18));
			Community.setForeground(new Color(0, 0, 0));
			
			Blog = new JMenuItem("Blog");
			Blog.setBackground(new Color(236, 217, 217));
			Blog.setFont(new Font("Segoe UI", Font.PLAIN, 18));
			Blog.setForeground(new Color(128, 0, 0));
			Community.add(Blog);
			menuBar.add(Community);
			
			Chat = new JMenu("Chat");
			Chat.setBackground(new Color(173, 92, 92));
			Chat.setFont(new Font("Segoe UI", Font.BOLD, 18));
			Chat.setForeground(new Color(0, 0, 0));
			menuBar.add(Chat);
			
			Chatbox = new JMenuItem("ChatBox");
			Chatbox.setBackground(new Color(236, 217, 217));
			Chatbox.setFont(new Font("Segoe UI", Font.PLAIN, 18));
			Chatbox.setForeground(new Color(128, 0, 0));
			Chat.add(Chatbox);
			
			
			
			
			
			lblNewLabel = new JLabel("SILENT RADIO");
			lblNewLabel.setForeground(new Color(166, 0, 0));
			lblNewLabel.setBounds(155, 35, 852, 240);
			contentPane.add(lblNewLabel);
			lblNewLabel.setFont(new Font("Poor Richard", Font.BOLD, 99));
			
			lblNewLabel_1 = new JLabel("Tell small stories...");
			lblNewLabel_1.setBounds(846, 343, 369, 46);
			contentPane.add(lblNewLabel_1);
			lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
			
			lblNewLabel_2 = new JLabel(new ImageIcon( new ImageIcon(
					Toolkit.getDefaultToolkit().getImage(
							HomeUser.class.getResource("/Image/icon_lantron_user.gif")
							)
					).getImage().getScaledInstance(212, 120, Image.SCALE_DEFAULT)));
			lblNewLabel_2.setBounds(633, 476, 212, 120);
			contentPane.add(lblNewLabel_2);
			
			lblNewLabel_3 = new JLabel(new ImageIcon( new ImageIcon(
					Toolkit.getDefaultToolkit().getImage(
							HomeUser.class.getResource("/Image/icon_mic_user.png")
							)
					).getImage().getScaledInstance(167, 167, Image.SCALE_DEFAULT)));
			lblNewLabel_3.setBounds(52, 35, 195, 186);
			contentPane.add(lblNewLabel_3);
			
			lblNewLabel_4 = new JLabel("Connect stories with people");
			lblNewLabel_4.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
			lblNewLabel_4.setBounds(748, 231, 467, 46);
			contentPane.add(lblNewLabel_4);
			
			lblNewLabel_5 = new JLabel("Quiet, simple and meaningful!");
			lblNewLabel_5.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
			lblNewLabel_5.setBounds(809, 266, 440, 46);
			contentPane.add(lblNewLabel_5);
			
			lblBackGround = new JLabel(new ImageIcon( new ImageIcon(
					Toolkit.getDefaultToolkit().getImage(
							HomeUser.class.getResource("/Image/Background_HomeUs.png")
							)
					).getImage().getScaledInstance(1283, 611, Image.SCALE_DEFAULT)));
			lblBackGround.setBounds(0, 0, 1283, 611);
			contentPane.add(lblBackGround);
			
			
			
			
			
			
	}

}
