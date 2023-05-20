package Client;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class ChatAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	static JTextArea textArea;
	public JButton btnNewButton, btnNewButton_1;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatAdmin frame = new ChatAdmin();
					//frame.setResizable(false);
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
	public ChatAdmin() {
		setForeground(new Color(128, 0, 0));
		this.setTitle("ChatBox");
		this.setIconImage((Toolkit.getDefaultToolkit().createImage(ChatAdmin.class.getResource("/Image/top_icon_chatadmin.png"))));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 700);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(181, 216, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 128, 255)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 916, 545);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		scrollPane.setViewportView(textArea);
		
		
		JLabel lblNewLabel = new JLabel(new ImageIcon( new ImageIcon(
				Toolkit.getDefaultToolkit().getImage(
						ChatAdmin.class.getResource("/Image/iconchatAdmin.png")
						)
				).getImage().getScaledInstance(55, 51, Image.SCALE_DEFAULT)));
		lblNewLabel.setBounds(10, 567, 59, 51);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(72, 567, 766, 51);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Send");
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setBackground(new Color(255, 197, 168));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(841, 571, 85, 44);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.setForeground(new Color(128, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		btnNewButton_1.setBounds(823, 629, 103, 30);
		contentPane.add(btnNewButton_1);
		
		
	}
}
