package ClientController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Client.Approve;
import Client.BlogAdmin;
import Client.BlogUser;
import Client.ChatAdmin;
import Client.ChatUser;
import Client.HomeAdmin;
import Client.HomeUser;
import Client.IconBlog;
import Client.LoginWAdmin;
import Client.LoginWUser;
import Client.Login_Signup;
import Client.SignUp;

public class Main {
	static Login_Signup ls = new Login_Signup();
    static SignUp si = new SignUp();
    static LoginWAdmin lowa = new LoginWAdmin();
	static LoginWUser lowu = new LoginWUser();
	
	static HomeAdmin ha = new HomeAdmin();
	static Approve apr = new Approve();
	static BlogAdmin boa = new BlogAdmin();
	static ChatAdmin cha = new ChatAdmin();
	
	static HomeUser hu = new HomeUser();
	static BlogUser bou = new BlogUser();
	static ChatUser chu = new ChatUser();
	
	static IconBlog ib = new IconBlog();
	

	public static void main(String[] args) {
		
//		controllerHome();
//		controllerLogin();
//		controllerSignup();
		controllerAdmin();
//		controllerUser();
		
//		ls.setVisible(true);
		ha.setVisible(true);
//		hu.setVisible(true);
		
	}
	
	
	public static void controllerHome() {
		//nhấn vào nút Login with Admin ở trang Login_Signup thì chuyển qua trang Login with admin!
		ls.btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ls.setVisible(false);
				lowa.setVisible(true);
			}
		});
		
		//nhấn vào nút Login with User ở trang Login_Signup thì chuyển qua trang Login with user!
		ls.btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ls.setVisible(false);
				lowu.setVisible(true);
			}
				
		});
		
		//nhấn vào nút signup ở trang Login_Signup thì chuyển qua trang SignUp
		ls.btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ls.setVisible(false);
				si.setVisible(true);
			}
				
		});
		
	}
	
	
	public static void controllerLogin() {
		
		//------------  1. Đầu tiên là Admin: ------------------------------
		
				//nhấn vào nút Back ở trang Login with admin! thì trở về trang Login_Signup
				lowa.btnNewButton_1_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						lowa.setVisible(false);
						ls.setVisible(true);
					}
				});
		
				
		//------------  2. Cuối cùng là User: ------------------------------
				
				//nhấn vào nút Back ở trang Login with user! thì trở về trang Login_Signup
				lowu.btnNewButton_1_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						lowu.setVisible(false);
						ls.setVisible(true);
					}
				});
		
	}
	
	
	public static void controllerSignup() {
		
		//nhấn vào nút Back ở trang SignUp thì trở về trang Login_Signup
		si.btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				si.setVisible(false);
				ls.setVisible(true);
			}
		});
		
	}
	
	public static void controllerAdmin() {
		
		// ------------------- 1. Home Admin ------------------
			
		//nhấn vào Log out ở thanh menu thì quay về trang Login_Signup	
		ha.Logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ha.setVisible(false);
				ls.setVisible(true);
			}
		});
		
		// nhấn vào Approve ở thanh menu thì đến trang Approve
		ha.Approve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ha.setVisible(false);
				apr.setVisible(true);
			}
		});
		
		// nhấn vào Blog ở thanh menu thì đến trang BlogAdmin
		ha.Blog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ha.setVisible(false);
				boa.setVisible(true);
			}
		});
		
		// nhấn vào Chatbox ở thanh menu thì đến trang ChatAdmin
		ha.Chatbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ha.setVisible(false);
				cha.setVisible(true);
			}
		});
		
		// -------------------- 2. Approve -------------------------
		
		// nhấn vào Back ở trang Approve thì đến trang HomeAdmin
		apr.btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				apr.setVisible(false);
				ha.setVisible(true);
			}
		});
		
		// nhấn vào Blog ở trang Approve thì đến trang Blog
		apr.btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				apr.setVisible(false);
				boa.setVisible(true);
			}
		});
		
		// nhấn vào Chat ở trang Approve thì đến trang ChatAdmin
		apr.btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				apr.setVisible(false);
				cha.setVisible(true);
			}
		});
		
		// -------------------- 3. BlogAdmin -----------------------------
		
		// nhấn vào nút Back ở trang BlogAdmin thì đến trang HomeAdmin
		boa.btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boa.setVisible(false);
				ha.setVisible(true);
			}
		});
		
		// nhấn vào button có icon mặt cười ở trang BlogAdmin thì mở ra trang IconBlog
		boa.btnNewButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boa.setVisible(true);
				ib.setVisible(true);
			}
		});
		
		
		
		// -------------------- 4. ChatAdmin -----------------------------
		
		// nhấn vào nút Back ở trang ChatAdmin thì quay về trang HomeAdmin
		cha.btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cha.setVisible(false);
				ha.setVisible(true);
			}
		});
		
		
		
		}
	
	
	public static void controllerUser() {

		// ------------------- 1. HomeUser ------------------
			
		//nhấn vào Log out ở thanh menu thì quay về trang Login_Signup	
		hu.Logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hu.setVisible(false);
				ls.setVisible(true);
			}
		});
		
		// nhấn vào Blog ở thanh menu thì đến trang Blog
		hu.Blog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hu.setVisible(false);
				bou.setVisible(true);
			}
		});
		
		// nhấn vào Chatbox ở thanh menu thì đến trang ChatUser
		hu.Chatbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hu.setVisible(false);
				chu.setVisible(true);
			}
		});
		
		// -------------------- 2. BlogUser -----------------------------
		
		// nhấn vào nút Back ở trang BlogUser thì đến trang HomeUser
		bou.btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bou.setVisible(false);
				hu.setVisible(true);
			}
		});
		
		// nhấn vào button có icon mặt cười ở trang BlogUser thì mở ra trang IconBlog
		bou.btnNewButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bou.setVisible(true);
				ib.setVisible(true);
			}
		});
		
		
		
		// -------------------- 3. ChatUser -----------------------------
		
		// nhấn vào nút Back ở trang ChatUser thì quay về trang HomeUser
		chu.btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chu.setVisible(false);
				hu.setVisible(true);
			}
		});
		
		
		
		
	}

}
