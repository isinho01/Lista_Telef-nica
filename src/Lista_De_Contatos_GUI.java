import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lista_De_Contatos_GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lista_De_Contatos_GUI frame = new Lista_De_Contatos_GUI();
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
	public Lista_De_Contatos_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 664);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Minha Lista de Contatos");
		lblNewLabel.setForeground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 0, 196, 46);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(216, 16, 137, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("🔎");
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(364, 15, 91, 26);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(0, 128, 255));
		btnNewButton_1.setBounds(459, 15, 91, 26);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Remover");
		btnNewButton_2.setBackground(new Color(0, 128, 255));
		btnNewButton_2.setBounds(364, 51, 186, 21);
		contentPane.add(btnNewButton_2);
	}
}
