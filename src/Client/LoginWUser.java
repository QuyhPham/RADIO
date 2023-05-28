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
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class LoginWUser extends JFrame {

	private JPanel contentPane;
	public JTextField textField_1;
	public JButton btnNewButton_1_1 = new JButton("Back");
	//ConnectDatabase conDB = new ConnectDatabase();
	public JButton btnNewButton_1 = new JButton("Login");
	public JPasswordField jpassWord;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					LoginWUser frame = new LoginWUser();
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
	public LoginWUser() {
		setForeground(new Color(128, 0, 0));
		this.setTitle("Login with user!");
		this.setIconImage((Toolkit.getDefaultToolkit().createImage(LoginWUser.class.getResource("/Image/top_icon_loginU.jpg"))));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 450);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 251));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon( new ImageIcon(
				Toolkit.getDefaultToolkit().getImage(
						LoginWUser.class.getResource("/Image/smile.gif")
						)
				).getImage().getScaledInstance(149, 106, Image.SCALE_DEFAULT)));
		lblNewLabel.setBounds(169, 11, 149, 106);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login with your account!");
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		lblNewLabel_1.setBounds(128, 114, 243, 34);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("User Name:");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(47, 174, 119, 34);
		contentPane.add(lblNewLabel_3_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(184, 175, 243, 41);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Password:");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_2.setBounds(47, 241, 119, 34);
		contentPane.add(lblNewLabel_3_2);
		
		jpassWord = new JPasswordField();
		jpassWord.setColumns(10);
		jpassWord.setBounds(184, 242, 243, 41);
		contentPane.add(jpassWord);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Pass");
		chckbxNewCheckBox.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					jpassWord.setEchoChar((char)0);
				} else {
					jpassWord.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxNewCheckBox.setBackground(new Color(255, 255, 251));
		chckbxNewCheckBox.setBounds(184, 290, 99, 23);
		contentPane.add(chckbxNewCheckBox);
		
		
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(87, 171, 255));
		btnNewButton_1.setBounds(245, 337, 107, 41);
		contentPane.add(btnNewButton_1);
		
		
		
		btnNewButton_1_1.setForeground(new Color(128, 0, 0));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1.setBackground(new Color(255, 240, 240));
		btnNewButton_1_1.setBounds(125, 337, 107, 41);
		contentPane.add(btnNewButton_1_1);
	}
	
	
	public String getPass(char[] pass) {
		String p = "";
		for (char x:pass) {
			p+= x;
		}
		return p;
	}

}
