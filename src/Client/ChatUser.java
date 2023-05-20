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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

public class ChatUser extends JFrame {

	private JPanel contentPane;
	private JTextField textField, textField_1, textField_2;
	static JTextArea textArea;
	public JButton btnSend, btnBack;
	private JScrollPane scrollPane;
	public JPanel panelChat, panelForm;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ChatUser frame = new ChatUser();
//					//frame.setResizable(false);
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
	public ChatUser() {
		setForeground(new Color(128, 0, 0));
		this.setTitle("ChatBox");
		this.setIconImage((Toolkit.getDefaultToolkit().createImage(ChatUser.class.getResource("/Image/top_icon_chatuser.png"))));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 880);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 217, 198));
		contentPane.setBorder(new LineBorder(new Color(0, 128, 255)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// ----------------- Đây là Form gửi file ----------------
		
		panelForm = new JPanel();
		panelForm.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 208, 162), new Color(255, 208, 162), new Color(255, 208, 162), null));
		panelForm.setBackground(new Color(255, 236, 217));
		panelForm.setBounds(0, 0, 936, 268);
		contentPane.add(panelForm);
		panelForm.setLayout(null);
		
		JLabel lblNewLabel_title = new JLabel("* Submit your story in here:");
		lblNewLabel_title.setForeground(new Color(179, 89, 0));
		lblNewLabel_title.setFont(new Font("Times New Roman", Font.BOLD, 34));
		lblNewLabel_title.setBounds(10, 11, 558, 45);
		panelForm.add(lblNewLabel_title);
		
		JLabel lblNewLabel_name = new JLabel("Title:");
		lblNewLabel_name.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_name.setBounds(81, 91, 144, 45);
		panelForm.add(lblNewLabel_name);
		
		JLabel lblNewLabel_path = new JLabel("File Path:");
		lblNewLabel_path.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_path.setBounds(81, 159, 144, 45);
		panelForm.add(lblNewLabel_path);
		
		textField_1 = new JTextField();
		textField_1.setBounds(213, 89, 635, 47);
		panelForm.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(213, 163, 635, 47);
		panelForm.add(textField_2);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setForeground(new Color(168, 0, 0));
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSubmit.setBackground(new Color(232, 243, 255));
		btnSubmit.setBounds(776, 221, 119, 36);
		panelForm.add(btnSubmit);
		
		
		
		
		// ------------------------- Đây là Chatbox của user ---------------------------
		
		panelChat = new JPanel();
		panelChat.setBackground(new Color(255, 214, 172));
		panelChat.setBounds(0, 268, 936, 391);
		contentPane.add(panelChat);
		panelChat.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 5, 916, 326);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		scrollPane.setViewportView(textArea);
		panelChat.add(scrollPane);
		
		
		JLabel lblNewLabel = new JLabel(new ImageIcon( new ImageIcon(
				Toolkit.getDefaultToolkit().getImage(
						ChatUser.class.getResource("/Image/iconchatUser.png")
						)
				).getImage().getScaledInstance(55, 51, Image.SCALE_DEFAULT)));
		lblNewLabel.setBounds(10, 335, 59, 51);
		panelChat.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(72, 335, 766, 51);
		textField.setColumns(10);
		panelChat.add(textField);
		
		btnSend = new JButton("Send");
		btnSend.setBounds(841, 339, 85, 44);
		btnSend.setForeground(new Color(0, 0, 0));
		btnSend.setBackground(new Color(204, 230, 255));
		btnSend.setFont(new Font("Tahoma", Font.BOLD, 20));
		panelChat.add(btnSend);
		
		
		
		// -------- Back không nằm trong JPanel, nằm trong contentPane, mục đích chỉ để quay về trang HomeUser thôi --------------
		
		btnBack = new JButton("Back");
		btnBack.setBackground(new Color(192, 192, 192));
		btnBack.setForeground(new Color(128, 0, 0));
		btnBack.setFont(new Font("Tahoma", Font.ITALIC, 15));
		btnBack.setBounds(829, 666, 103, 30);
		contentPane.add(btnBack);
		
		
		
		
	}
}
