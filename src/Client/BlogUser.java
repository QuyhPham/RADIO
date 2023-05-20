package Client;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class BlogUser extends JFrame {

	private JPanel contentPane;
	public JTextField textField, textField_1;
	public JButton btnNewButton_0;
	public JList list;
	public JButton btnNewButton, btnNewButton_1;
	public JTextArea textArea;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					BlogUser frame = new BlogUser();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public BlogUser() {
		setForeground(new Color(128, 0, 0));
		this.setTitle("Blog");
		this.setIconImage((Toolkit.getDefaultToolkit().createImage(BlogUser.class.getResource("/Image/blog.png"))));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 689);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(247, 255, 247));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);	
		
	// Đoạn này phải có vòng lặp để thêm nhiều bài viết vào này
		JLabel lblNewLabel = new JLabel("BÀI VIẾT");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 99));
		lblNewLabel.setBackground(new Color(255, 255, 213));
		lblNewLabel.setBounds(33, 79, 770, 430);
		getContentPane().add(lblNewLabel);
		
		btnNewButton_0 = new JButton("");
		btnNewButton_0.setBackground(new Color(247, 255, 247));
		btnNewButton_0.setIcon(new ImageIcon("D:\\JAVA_1\\RADIO\\src\\Image\\iconBlog.png"));
		btnNewButton_0.setBounds(20, 520, 65, 57);
		contentPane.add(btnNewButton_0);
		
		textField = new JTextField();
		textField.setBounds(95, 520, 1074, 55);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon( new ImageIcon(
				Toolkit.getDefaultToolkit().getImage(
						BlogUser.class.getResource("/Image/so_luot_thich_blog.png")
						)
				).getImage().getScaledInstance(96, 54, Image.SCALE_DEFAULT)));
		lblNewLabel_2.setBounds(813, 79, 96, 54);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(913, 91, 361, 32);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		textArea.setBackground(new Color(230, 230, 230));
		textArea.setBounds(813, 134, 461, 375);
		contentPane.add(textArea);
		
		btnNewButton = new JButton("Send");
		btnNewButton.setBackground(new Color(255, 232, 232));
		btnNewButton.setForeground(new Color(128, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(1179, 528, 103, 44);
		getContentPane().add(btnNewButton);
		
		
		
		
		
	// Cái đoạn này mặc định là vậy, không liên quan vòng lặp chi hết	
		JLabel lblNewLabel_1 = new JLabel("- Radio Connects Hearts! -");
		lblNewLabel_1.setForeground(new Color(128, 0, 64));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel_1.setBounds(448, 11, 673, 57);
		getContentPane().add(lblNewLabel_1);
		
		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBackground(new Color(240, 240, 240));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(1177, 608, 97, 33);
		contentPane.add(btnNewButton_1);
	}

}
