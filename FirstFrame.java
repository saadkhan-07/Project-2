package project1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class FirstFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtLabel;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstFrame frame = new FirstFrame();
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
	public FirstFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel idLabel = new JLabel("ID: ");
		idLabel.setBounds(71, 60, 46, 14);
		contentPane.add(idLabel);
		
		JLabel emailLabel = new JLabel("Email: ");
		emailLabel.setBounds(71, 122, 31, 14);
		contentPane.add(emailLabel);
		
		textField = new JTextField();
		textField.setBounds(102, 57, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtLabel = new JTextField();
		txtLabel.setBounds(102, 119, 86, 20);
		contentPane.add(txtLabel);
		txtLabel.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ID=textField.getText();
				String Name=textField_1.getText();
				String Email=txtLabel.getText();
			
				ArrayList<String> arr=new ArrayList<String>();
				arr.add("ID: "+ID);
				arr.add("Name "+Name);
				arr.add("Email: "+Email);
				try {
				FileHandler filehandle=new FileHandler();
				filehandle.writeintoFile(arr);
				
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(99, 173, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel nameLabel = new JLabel("Name: ");
		nameLabel.setBounds(54, 85, 46, 14);
		contentPane.add(nameLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(102, 85, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
