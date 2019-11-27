package Inheritance;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Competition {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Competition window = new Competition();
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
	public Competition() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1117, 613);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setForeground(new Color(230, 230, 250));
		panel.setBounds(20, 0, 1071, 101);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(448, 5, 0, 0);
		panel.add(label);
		
		JLabel lblRoyalEnfield = new JLabel("ROYAL ENFIELD");
		lblRoyalEnfield.setForeground(new Color(255, 0, 0));
		lblRoyalEnfield.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblRoyalEnfield.setBounds(21, 11, 202, 51);
		panel.add(lblRoyalEnfield);
		
		JLabel lblStandared = new JLabel("Standared");
		lblStandared.setForeground(new Color(255, 215, 0));
		lblStandared.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStandared.setBounds(272, 59, 82, 17);
		panel.add(lblStandared);
		
		JLabel lblClassic = new JLabel("Classic");
		lblClassic.setForeground(new Color(255, 215, 0));
		lblClassic.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblClassic.setBounds(380, 61, 82, 17);
		panel.add(lblClassic);
		
		JLabel lblHimalayan = new JLabel("Himalayan");
		lblHimalayan.setForeground(new Color(255, 215, 0));
		lblHimalayan.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHimalayan.setBounds(487, 61, 82, 17);
		panel.add(lblHimalayan);
		
		JLabel lblGt = new JLabel("Continental");
		lblGt.setForeground(new Color(255, 215, 0));
		lblGt.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGt.setBounds(591, 61, 82, 17);
		panel.add(lblGt);
		
		JLabel label_14 = new JLabel("Accssorries");
		label_14.setForeground(new Color(255, 215, 0));
		label_14.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_14.setBounds(701, 61, 82, 17);
		panel.add(label_14);
		
		JButton btnNewButton_2 = new JButton("Login");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBackground(new Color(255, 0, 0));
		btnNewButton_2.setBounds(944, 31, 89, 23);
		panel.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(230, 230, 250), new Color(230, 230, 250)));
		panel_1.setBounds(135, 100, 956, 464);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(255, 255, 255)));
		panel_7.setBackground(new Color(245, 245, 245));
		panel_7.setBounds(10, 191, 134, 79);
		panel_1.add(panel_7);
		
		JLabel lblShops = new JLabel("Shops");
		lblShops.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblShops.setBounds(23, 35, 82, 17);
		panel_7.add(lblShops);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 11, 134, 79);
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		panel_6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(255, 255, 255)));
		panel_6.setBackground(new Color(245, 245, 245));
		
		JLabel label_3 = new JLabel("Accssorries");
		label_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		label_3.setBounds(26, 34, 82, 17);
		panel_6.add(label_3);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(255, 255, 255)));
		panel_8.setBackground(new Color(245, 245, 245));
		panel_8.setBounds(10, 101, 134, 79);
		panel_1.add(panel_8);
		
		JLabel lblRides = new JLabel("Rides");
		lblRides.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblRides.setBounds(26, 34, 82, 17);
		panel_8.add(lblRides);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\a.gif"));
		btnNewButton.setBounds(154, 0, 555, 464);
		panel_1.add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(255, 255, 255)));
		panel_3.setBackground(new Color(245, 245, 245));
		panel_3.setBounds(10, 288, 134, 79);
		panel_1.add(panel_3);
		
		JLabel label_1 = new JLabel("Accssorries");
		label_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		label_1.setBounds(23, 35, 82, 17);
		panel_3.add(label_1);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\v.jpg"));
		btnNewButton_1.setBounds(721, 11, 225, 214);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(255, 255, 255)));
		panel_4.setBackground(new Color(245, 245, 245));
		panel_4.setBounds(10, 385, 134, 79);
		panel_1.add(panel_4);
		
		JLabel label_2 = new JLabel("Accssorries");
		label_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		label_2.setBounds(23, 35, 82, 17);
		panel_4.add(label_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\ss.png"));
		btnNewButton_3.setBounds(719, 227, 227, 237);
		panel_1.add(btnNewButton_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(20, 100, 115, 464);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblProfile = new JLabel("Profile");
		lblProfile.setForeground(Color.WHITE);
		lblProfile.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblProfile.setBounds(21, 65, 82, 17);
		panel_2.add(lblProfile);
		
		JLabel lblWallet = new JLabel("Wallet");
		lblWallet.setForeground(Color.WHITE);
		lblWallet.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblWallet.setBounds(21, 107, 82, 17);
		panel_2.add(lblWallet);
		
		JLabel lblSettings = new JLabel("Settings");
		lblSettings.setForeground(Color.WHITE);
		lblSettings.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSettings.setBounds(21, 146, 82, 17);
		panel_2.add(lblSettings);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setForeground(Color.WHITE);
		lblHelp.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHelp.setBounds(21, 189, 82, 17);
		panel_2.add(lblHelp);
		
		JLabel lblHome = new JLabel("Home");
		lblHome.setForeground(Color.WHITE);
		lblHome.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHome.setBounds(21, 22, 82, 17);
		panel_2.add(lblHome);
	}
}
