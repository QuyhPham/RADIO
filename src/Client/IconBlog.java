package Client;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class IconBlog extends JFrame {

	private JPanel contentPane;
	public JMenu iCon;
	public JMenuItem smile, cry, angry, heart;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IconBlog frame = new IconBlog();
					frame.setResizable(false);
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
	public IconBlog() {
		setForeground(new Color(128, 0, 0));
		this.setTitle("Emotion");
		this.setIconImage((Toolkit.getDefaultToolkit().createImage(IconBlog.class.getResource("/Image/iconBlog.png"))));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 352, 120);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(7, 7, 7, 7));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("D:\\JAVA_1\\RADIO\\src\\Image\\laugh.png"));
		btnNewButton.setBounds(10, 11, 72, 65);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("D:\\JAVA_1\\RADIO\\src\\Image\\cry.png"));
		btnNewButton_1.setBounds(92, 11, 72, 65);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon("D:\\JAVA_1\\RADIO\\src\\Image\\angry.png"));
		btnNewButton_1_1.setBounds(174, 11, 72, 65);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.setIcon(new ImageIcon("D:\\JAVA_1\\RADIO\\src\\Image\\heart.png"));
		btnNewButton_1_1_1.setBounds(256, 11, 72, 64);
		contentPane.add(btnNewButton_1_1_1);
		
		
		
		
//		iCon = new JMenu();
//		iCon.setIcon(new ImageIcon("D:\\JAVA_1\\RADIO\\src\\Image\\iconBlog.png"));
//		iCon.setBounds(50, 39, 78, 64);
//		contentPane.add(iCon);
//		
//		smile = new JMenuItem();
//		smile.setIcon(new ImageIcon("D:\\JAVA_1\\RADIO\\src\\Image\\laugh.png"));
//		iCon.add(smile);
//		
//		cry = new JMenuItem();
//		cry.setIcon(new ImageIcon("D:\\JAVA_1\\RADIO\\src\\Image\\cry.png"));
//		iCon.add(cry);
//		
//		angry = new JMenuItem();
//		angry.setIcon(new ImageIcon("D:\\JAVA_1\\RADIO\\src\\Image\\angry.png"));
//		iCon.add(angry);
//		
//		heart = new JMenuItem();
//		heart.setIcon(new ImageIcon("D:\\JAVA_1\\RADIO\\src\\Image\\heart.png"));
//		iCon.add(heart);
		
		
	}

}
