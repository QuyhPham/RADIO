package Client;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;


public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField textField_5;
	private Color panel;
	private JPasswordField checkNewPass;
	public JButton btnNewButton_1_1 = new JButton("BACK");
	public JButton btnSignUp = new JButton("SIGN UP");
	//private ConnectDatabase conDB = new ConnectDatabase();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SignUp frame = new SignUp();
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
public SignUp() {
		
		setForeground(new Color(128, 0, 0));
		this.setTitle("SIGN UP");
		URL MainIcon = SignUp.class.getResource("/Image/top_signup.png");
		Image img = Toolkit.getDefaultToolkit().createImage(MainIcon);
		this.setIconImage(img);
		
		setFont(new Font("Tahoma", Font.BOLD, 25));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 400);
		setSize(850,400);
		setResizable(false);
		getContentPane().setLayout(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(244, 250, 255));
		contentPane.setForeground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon( new ImageIcon(
				Toolkit.getDefaultToolkit().getImage(
						SignUp.class.getResource("/Image/icon_human.jpg")
						)
				).getImage().getScaledInstance(253, 253, Image.SCALE_DEFAULT)));
		lblNewLabel_1.setBounds(10, 96, 253, 209);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_7 = new JLabel("* START CREATING AN ACCOUNT");
		lblNewLabel_7.setForeground(new Color(118, 54, 224));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_7.setBounds(349, 50, 532, 47);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Enter user name:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(273, 140, 181, 47);
		contentPane.add(lblNewLabel_8);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(443, 144, 383, 40);
		contentPane.add(textField_5);
		
		JButton btnClean = new JButton("CLEAN");
		btnClean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_5.setText("");
//				passwordField.setText("");
//				passwordField_1.setText("");
				
				
				
				
			}
		});
		btnClean.setForeground(new Color(128, 0, 0));
		btnClean.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClean.setBackground(new Color(255, 227, 227));
		btnClean.setBounds(463, 238, 168, 47);
		contentPane.add(btnClean);
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		btnSignUp.setForeground(new Color(0, 0, 96));
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSignUp.setBackground(new Color(140, 198, 255));
		btnSignUp.setBounds(641, 238, 168, 47);
		contentPane.add(btnSignUp);
		
		MaskFormatter mf;
		try {
			mf = new MaskFormatter("############");
			mf.setPlaceholderCharacter('#');
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		btnNewButton_1_1.setForeground(new Color(128, 0, 0));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
       
		
		
		
		
		
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1.setBackground(new Color(255, 255, 221));
		btnNewButton_1_1.setBounds(296, 238, 157, 47);
		contentPane.add(btnNewButton_1_1);
		
//		JCheckBox chckbxNewCheckBox = new JCheckBox("Show password");
//		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
//		chckbxNewCheckBox.setBounds(293, 568, 148, 30);
//		chckbxNewCheckBox.addMouseListener(new MouseAdapter() {
//			public void mouseClicked(MouseEvent e) {
//				if(chckbxNewCheckBox.isSelected()) {
//					passwordField.setEchoChar((char)0);
//					passwordField_1.setEchoChar((char)0);
//					checkNewPass.setEchoChar((char)0);
//				} else {
//					passwordField.setEchoChar('*');
//					passwordField_1.setEchoChar('*');
//					checkNewPass.setEchoChar('*');
//				}
//			}
//		});
		
//		checkNewPass = new JPasswordField();
//		checkNewPass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		

	
		
		
	}
	
	
	
	
	public void Clean() {
		textField_5.setText("");
//		passwordField.setText("");
//		passwordField_1.setText("");
	}
}