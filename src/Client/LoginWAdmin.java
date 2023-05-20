package Client;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginWAdmin extends JFrame {

	private JPanel contentPane;
	public JTextField textField_1;
	public JButton btnNewButton_1_1 = new JButton("Back");
	//ConnectDatabase conDB = new ConnectDatabase();
	public JButton btnNewButton_1 = new JButton("Login");

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					LoginWAdmin frame = new LoginWAdmin();
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
	public LoginWAdmin() {
		setForeground(new Color(128, 0, 0));
		this.setTitle("Login with admin!");
		this.setIconImage((Toolkit.getDefaultToolkit().createImage(LoginWAdmin.class.getResource("/Image/top_icon_loginA.jpg"))));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(244, 255, 244));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon( new ImageIcon(
				Toolkit.getDefaultToolkit().getImage(
						LoginWAdmin.class.getResource("/Image/vithello.gif")
						)
				).getImage().getScaledInstance(149, 106, Image.SCALE_DEFAULT)));
		lblNewLabel.setBounds(159, 11, 149, 106);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login as administrator!");
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		lblNewLabel_1.setBounds(128, 114, 243, 34);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("User Name:");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(47, 187, 119, 34);
		contentPane.add(lblNewLabel_3_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(184, 188, 243, 41);
		contentPane.add(textField_1);
		
		
		
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(157, 157, 255));
		btnNewButton_1.setBounds(245, 279, 107, 41);
		contentPane.add(btnNewButton_1);
		
		
		
		btnNewButton_1_1.setForeground(new Color(128, 0, 0));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1.setBackground(new Color(255, 255, 210));
		btnNewButton_1_1.setBounds(126, 279, 107, 41);
		contentPane.add(btnNewButton_1_1);
	}

}
