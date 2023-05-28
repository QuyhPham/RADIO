package Client;
			
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
			
	public class Approve extends JFrame {
			
		private JPanel contentPane;
		public JButton btnNewButton_1, btnNewButton_2, btnNewButton_2_1;
		public JButton btnNewButton;
		private JScrollPane scrollPane;
			
				/**
				 * Launch the application.
				 */
		public static void main(String[] args) {
				EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								Approve frame = new Approve();
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
		public Approve() {
				setForeground(new Color(128, 0, 0));
				this.setTitle("Approve");
				this.setIconImage((Toolkit.getDefaultToolkit().createImage(Approve.class.getResource("/Image/tichxanh.jpg"))));
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 1300, 689);
				contentPane = new JPanel();
				contentPane.setBackground(new Color(238, 247, 255));
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	
				setContentPane(contentPane);
				contentPane.setLayout(null);
				
	//			scrollPane = new JScrollPane();
	//			scrollPane.setBounds(0, 0, 1283, 652);
	//			contentPane.add(scrollPane);
				
			// Đoạn này phải có vòng lặp để thêm nhiều bài viết vào này
				scrollPane = new JScrollPane();
				scrollPane.setBounds(0, 83, 1283, 502);
				contentPane.add(scrollPane);
				
				JPanel panel = new JPanel();
				panel.setBorder(new LineBorder(new Color(238, 247, 255)));
				panel.setBackground(new Color(238, 247, 255));
				scrollPane.setViewportView(panel);
				panel.setLayout(null);
				
				btnNewButton = new JButton("Admit");
				btnNewButton.setBounds(1074, 452, 182, 44);
				btnNewButton.setBackground(new Color(255, 232, 232));
				btnNewButton.setForeground(new Color(128, 0, 0));
				btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
				panel.add(btnNewButton);
				
				JLabel lblNewLabel = new JLabel("BÀI VIẾT");
				lblNewLabel.setBounds(21, 11, 1228, 430);
				panel.add(lblNewLabel);
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 99));
				lblNewLabel.setBackground(new Color(255, 255, 213));
				
				
				
			// Cái đoạn này mặc định là vậy, không liên quan vòng lặp chi hết	
				JLabel lblNewLabel_1 = new JLabel("* The file sent has not been approved:");
				lblNewLabel_1.setForeground(new Color(128, 0, 64));
				lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
				lblNewLabel_1.setBounds(10, 11, 673, 57);
				getContentPane().add(lblNewLabel_1);
				
				btnNewButton_1 = new JButton("Back");
				btnNewButton_1.setBackground(new Color(240, 240, 240));
				btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
				btnNewButton_1.setBounds(1177, 608, 97, 33);
				contentPane.add(btnNewButton_1);
				
				btnNewButton_2 = new JButton("Blog");
				btnNewButton_2.setBackground(new Color(228, 228, 228));
				btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
				btnNewButton_2.setBounds(1070, 608, 97, 33);
				contentPane.add(btnNewButton_2);
				
				btnNewButton_2_1 = new JButton("Chat");
				btnNewButton_2_1.setBackground(new Color(228, 228, 228));
				btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
				btnNewButton_2_1.setBounds(963, 608, 97, 33);
				contentPane.add(btnNewButton_2_1);
					
		}
}
