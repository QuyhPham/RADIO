package Client;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;

public class Login_Signup extends JFrame {

	private JPanel contentPane;
	public JButton btnAdmin = new JButton("Login with Admin");
    public JButton btnUser = new JButton("Login with User");
    public JButton btnSignup = new JButton("SignUp");

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Login_Signup frame = new Login_Signup();
//					frame.setVisible(true);
//					frame.setResizable(false);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Login_Signup() {
		setForeground(new Color(128, 0, 0));
		this.setTitle("HOME");
		this.setIconImage((Toolkit.getDefaultToolkit().createImage(Login_Signup.class.getResource("/Image/TopHome.png"))));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(20, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 213));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 187, 187), null, new Color(255, 187, 187), new Color(255, 187, 187)));
		panel.setBounds(506, 0, 480, 563);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("- Acount Login -");
		lblNewLabel.setBounds(128, 65, 284, 55);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		
		btnAdmin.setBounds(40, 129, 398, 63);
		btnAdmin.setForeground(new Color(0, 111, 55));
		btnAdmin.setBackground(new Color(247, 255, 247));
		btnAdmin.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(btnAdmin);
		
		JLabel lblOr = new JLabel("or");
		lblOr.setBounds(225, 201, 27, 32);
		panel.add(lblOr);
		lblOr.setFont(new Font("Tahoma", Font.BOLD, 26));
		
		btnUser.setBounds(40, 244, 398, 63);
		panel.add(btnUser);	
		btnUser.setForeground(new Color(128, 0, 0));
		btnUser.setBackground(new Color(254, 253, 250));
		btnUser.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel lblAcountSignup = new JLabel("- Acount Signup -");
		lblAcountSignup.setBounds(125, 357, 295, 72);
		panel.add(lblAcountSignup);
		lblAcountSignup.setFont(new Font("Tahoma", Font.BOLD, 26));
		
		btnSignup.setBounds(40, 429, 398, 63);
		panel.add(btnSignup);
		btnSignup.setForeground(new Color(255, 255, 225));
		btnSignup.setFont(new Font("Tahoma", Font.BOLD, 32));
		btnSignup.setBackground(new Color(66, 160, 255));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(242, 242, 0)));
		panel_1.setBounds(0, 0, 507, 563);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbImage = new JLabel(new ImageIcon( new ImageIcon(
				Toolkit.getDefaultToolkit().getImage(
						Login_Signup.class.getResource("/Image/Logo_Home.png")
						)
				).getImage().getScaledInstance(507, 563, Image.SCALE_DEFAULT)));
		lbImage.setBounds(2, 2, 505, 560);
		panel_1.add(lbImage);
		
		
		
		
		
	}
}
