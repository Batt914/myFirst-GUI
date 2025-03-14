package uiFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class my_firstFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textName;
	private JTextField textAge;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					my_firstFrame frame = new my_firstFrame();
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
	public my_firstFrame() {
		setForeground(new Color(0, 0, 0));
		setType(Type.POPUP);
		setFont(new Font("Times New Roman", Font.BOLD, 40));
		setTitle("Get your's");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 548);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Name        ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(112, 126, 182, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Code                  ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(112, 195, 182, 45);
		contentPane.add(lblNewLabel_1);
		
		textName = new JTextField();
		textName.setBounds(373, 126, 213, 45);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textAge = new JTextField();
		textAge.setBounds(373, 202, 213, 45);
		contentPane.add(textAge);
		textAge.setColumns(10);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setFont(new Font("STZhongsong", Font.BOLD, 25));
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int age=Integer.parseInt(textAge.getText());
					if(age <= 5) {
					String myurl = "https://www.youtube.com/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
					 
					} else if(age >= 6  && age <= 10) {
						String myurl = "https://www.instagram.com/reel/DA2QNDYodhH/?igsh=MWt2cDByejZpcW95Zg%3D%3D";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
						
					} else if(age >= 11  && age <= 15) {
						String myurl = "https://www.whatsapp.com/";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
					}  else if(age >= 16  && age <= 20) {
						String myurl = "https://x.com/?lang=en";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
						
					} else if(age >= 21  && age <= 25) {
						String myurl = "https://www.snapchat.com/";
						java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
					}
				}catch(NumberFormatException nfe) {
					System.out.println("enter valid number for age. ");
				} 
				catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		});
		btnEnter.setBounds(185, 297, 109, 40);
		contentPane.add(btnEnter);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textName.setText("");
				textAge.setText("");
				
			}
		});
		btnReset.setFont(new Font("STZhongsong", Font.BOLD, 24));
		btnReset.setBounds(477, 292, 109, 45);
		contentPane.add(btnReset);
	}
}
