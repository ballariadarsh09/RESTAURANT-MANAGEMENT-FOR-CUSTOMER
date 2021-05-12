package Restaurant_S;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import java.awt.Checkbox;
import javax.swing.JCheckBoxMenuItem;

public class Restaurants {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurants window = new Restaurants();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Restaurants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.setBounds(0, 0, 1368, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(10, 77, 530, 286);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("CHICKEN BURGER");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(27, 29, 120, 25);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CHICKEN MEAL");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(27, 65, 120, 25);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("CHICKEN CHEESE");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(27, 101, 120, 25);
		panel.add(lblNewLabel_1_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField.setBounds(229, 29, 219, 25);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_1.setColumns(10);
		textField_1.setBounds(229, 65, 219, 25);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_2.setColumns(10);
		textField_2.setBounds(229, 104, 219, 25);
		panel.add(textField_2);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("DRINK");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_2.setBounds(27, 137, 49, 25);
		panel.add(lblNewLabel_1_1_1_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("select");
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select a drink", "aa", "bb", "cc", "dd", "ee"}));
		comboBox.setBounds(27, 163, 120, 31);
		panel.add(comboBox);
		
		Checkbox checkbox = new Checkbox("Tax");
		checkbox.setBounds(285, 221, 95, 22);
		panel.add(checkbox);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(27, 221, 97, 23);
		panel.add(chckbxNewCheckBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(550, 77, 326, 286);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1_1.setBounds(550, 374, 326, 173);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Tax");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1_2_1.setBounds(23, 21, 52, 25);
		panel_1_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Sub Total");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1_2_2.setBounds(23, 68, 107, 25);
		panel_1_1.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Total");
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1_2_3.setBounds(23, 110, 120, 25);
		panel_1_1.add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel_2_3.setBounds(137, 21, 168, 25);
		panel_1_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("");
		lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel_2_4.setBounds(137, 68, 168, 25);
		panel_1_1.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("");
		lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel_2_5.setBounds(137, 110, 168, 25);
		panel_1_1.add(lblNewLabel_2_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(10, 374, 530, 173);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("COST OF DRINKS");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(29, 21, 150, 25);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("COST OF MEAL");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1_2.setBounds(29, 68, 150, 25);
		panel_2.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("COST OF DELIVERY");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1_1_1.setBounds(29, 110, 168, 25);
		panel_2.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(235, 21, 168, 25);
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel_2_1.setBounds(235, 68, 168, 25);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel_2_2.setBounds(235, 110, 168, 25);
		panel_2.add(lblNewLabel_2_2);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1_2.setBounds(886, 77, 456, 470);
		frame.getContentPane().add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(21, 29, 425, 430);
		panel_1_2.add(tabbedPane);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Recepit", null, tabbedPane_1, null);
		
		textField_4 = new JTextField();
		tabbedPane_1.addTab("New tab", null, textField_4, null);
		textField_4.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_3, null);
		
		JButton btnNewButton = new JButton("<-");
		btnNewButton.setBounds(58, 73, 59, 59);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.setLayout(null);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("C");
		btnNewButton_1.setBounds(127, 73, 59, 59);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("%");
		btnNewButton_1_1.setBounds(200, 73, 59, 59);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_3.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("+");
		btnNewButton_1_2.setBounds(269, 73, 59, 59);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_3.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("7");
		btnNewButton_1_3.setBounds(58, 132, 59, 59);
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_3.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("8");
		btnNewButton_1_4.setBounds(127, 132, 59, 59);
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_3.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("9");
		btnNewButton_1_5.setBounds(200, 132, 59, 59);
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_3.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("-");
		btnNewButton_1_6.setBounds(269, 132, 59, 59);
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_3.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_7 = new JButton("4");
		btnNewButton_1_7.setBounds(58, 193, 59, 59);
		btnNewButton_1_7.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_3.add(btnNewButton_1_7);
		
		JButton btnNewButton_1_8 = new JButton("5");
		btnNewButton_1_8.setBounds(127, 193, 59, 59);
		btnNewButton_1_8.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_3.add(btnNewButton_1_8);
		
		JButton btnNewButton_1_9 = new JButton("6");
		btnNewButton_1_9.setBounds(200, 193, 59, 59);
		btnNewButton_1_9.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_3.add(btnNewButton_1_9);
		
		JButton btnNewButton_1_10 = new JButton("*");
		btnNewButton_1_10.setBounds(269, 193, 59, 59);
		btnNewButton_1_10.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_3.add(btnNewButton_1_10);
		
		JButton btnNewButton_1_7_1 = new JButton("1");
		btnNewButton_1_7_1.setBounds(58, 254, 59, 59);
		btnNewButton_1_7_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_3.add(btnNewButton_1_7_1);
		
		JButton btnNewButton_1_7_2 = new JButton("2");
		btnNewButton_1_7_2.setBounds(127, 254, 59, 59);
		btnNewButton_1_7_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_3.add(btnNewButton_1_7_2);
		
		JButton btnNewButton_1_7_3 = new JButton("3");
		btnNewButton_1_7_3.setBounds(200, 254, 59, 59);
		btnNewButton_1_7_3.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_3.add(btnNewButton_1_7_3);
		
		JButton btnNewButton_1_7_4 = new JButton("/");
		btnNewButton_1_7_4.setBounds(269, 254, 59, 59);
		btnNewButton_1_7_4.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_3.add(btnNewButton_1_7_4);
		
		JButton btnNewButton_1_7_1_1 = new JButton("0");
		btnNewButton_1_7_1_1.setBounds(58, 313, 59, 59);
		btnNewButton_1_7_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_3.add(btnNewButton_1_7_1_1);
		
		JButton btnNewButton_1_7_1_1_1 = new JButton(".");
		btnNewButton_1_7_1_1_1.setBounds(127, 313, 59, 59);
		btnNewButton_1_7_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_3.add(btnNewButton_1_7_1_1_1);
		
		JButton btnNewButton_1_7_1_1_2 = new JButton("$");
		btnNewButton_1_7_1_1_2.setBounds(200, 313, 59, 59);
		btnNewButton_1_7_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_3.add(btnNewButton_1_7_1_1_2);
		
		JButton btnNewButton_1_7_1_1_3 = new JButton("=");
		btnNewButton_1_7_1_1_3.setBounds(269, 313, 59, 59);
		btnNewButton_1_7_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_3.add(btnNewButton_1_7_1_1_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 11, 367, 51);
		panel_3.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1_3.setBounds(-236, 572, 1578, 99);
		frame.getContentPane().add(panel_1_3);
		
		JLabel lblNewLabel = new JLabel("RESTAURANT MANAGEMENT SYSTEM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 70));
		lblNewLabel.setBounds(10, 0, 1332, 77);
		frame.getContentPane().add(lblNewLabel);
	}
}
