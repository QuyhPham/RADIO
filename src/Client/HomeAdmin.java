package Client;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Insets;

public class HomeAdmin extends JFrame {

	private JPanel contentPane;
	public JMenu Home, Admin, Chat;
	public  JMenuItem Logout, Blog, Approve, Chatbox;
	private JLabel lblBackGround;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	//public JMenuItem MainHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeAdmin frame = new HomeAdmin();
					frame.setVisible(true);
					//frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomeAdmin() {
			
			setForeground(new Color(128, 0, 0));
			this.setTitle("Administrator");
			this.setIconImage((Toolkit.getDefaultToolkit().createImage(HomeAdmin.class.getResource("/Image/HomeAd.png"))));
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 1400, 675);
			setSize(1400, 675);
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
//				Logout.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent e) {
//						setVisible(false);
//						Home ho = new Home();
//						ho.setVisible(true);
//					}});
				Logout.setBackground(new Color(236, 217, 217));
				Logout.setFont(new Font("Segoe UI", Font.PLAIN, 18));
				Logout.setForeground(new Color(128, 0, 0));
				
				Home.add(Logout);
				menuBar.add(Home);
				
				Admin = new JMenu("Admin");
				Admin.setBackground(new Color(173, 92, 92));
				Admin.setFont(new Font("Segoe UI", Font.BOLD, 18));
				Admin.setForeground(new Color(0, 0, 0));
				
				Approve = new JMenuItem("Approve");
				Approve.setBackground(new Color(236, 217, 217));
				Approve.setFont(new Font("Segoe UI", Font.PLAIN, 18));
				Approve.setForeground(new Color(128, 0, 0));
				Admin.add(Approve);
				menuBar.add(Admin);
				
				Blog = new JMenuItem("Blog");
				Blog.setBackground(new Color(236, 217, 217));
				Blog.setFont(new Font("Segoe UI", Font.PLAIN, 18));
				Blog.setForeground(new Color(128, 0, 0));
				Admin.add(Blog);
				menuBar.add(Admin);
				
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
				lblNewLabel.setBounds(564, 148, 612, 217);
				contentPane.add(lblNewLabel);
				lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 90));
				
				lblNewLabel_1 = new JLabel("Have a good day admin!");
				lblNewLabel_1.setBounds(838, 330, 382, 46);
				contentPane.add(lblNewLabel_1);
				lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 35));
				
				lblBackGround = new JLabel(new ImageIcon( new ImageIcon(
						Toolkit.getDefaultToolkit().getImage(
								HomeAdmin.class.getResource("/Image/Background_HomeAd.png")
								)
						).getImage().getScaledInstance(1283, 611, Image.SCALE_DEFAULT)));
				lblBackGround.setBounds(0, 0, 1283, 611);
				contentPane.add(lblBackGround);
				

			
	}
	

}
