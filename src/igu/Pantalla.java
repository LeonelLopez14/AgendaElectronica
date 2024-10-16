package igu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Pantalla extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDNI;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtNac;
	private JButton btnCarga;
	private JButton btnDecrementar;
	private JButton btnIncrementar;
	private JTextField txtIndice;
	String nombre[] = new String[10];
	String apellido[] = new String[10];
	String direccion[] = new String[10];
	String fechaNacimiento[] = new String[10];
	String dni[] = new String[10];
	String telefono[] = new String[10];


	/**
	 * Create the frame.
	 */
	public Pantalla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 336);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Agenda Electronica");
		lblNewLabel.setBackground(UIManager.getColor("Button.disabledForeground"));
		lblNewLabel.setForeground(new Color(0, 51, 153));
		lblNewLabel.setFont(new Font("Ebrima", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(189, 11, 165, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DNI           :");
		lblNewLabel_1.setFont(new Font("Ebrima", Font.BOLD, 12));
		lblNewLabel_1.setForeground(new Color(0, 51, 153));
		lblNewLabel_1.setBounds(25, 69, 59, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre   :");
		lblNewLabel_2.setFont(new Font("Ebrima", Font.BOLD, 12));
		lblNewLabel_2.setForeground(new Color(0, 51, 153));
		lblNewLabel_2.setBounds(25, 94, 59, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido   :");
		lblNewLabel_3.setFont(new Font("Ebrima", Font.BOLD, 12));
		lblNewLabel_3.setForeground(new Color(0, 51, 153));
		lblNewLabel_3.setBounds(25, 119, 59, 14);
		contentPane.add(lblNewLabel_3);
		
		txtDNI = new JTextField();
		txtDNI.setBounds(97, 67, 132, 17);
		contentPane.add(txtDNI);
		txtDNI.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(97, 92, 132, 17);
		contentPane.add(txtNombre);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(97, 117, 132, 17);
		contentPane.add(txtApellido);
		
		lblNewLabel_4 = new JLabel("Direccion :");
		lblNewLabel_4.setFont(new Font("Ebrima", Font.BOLD, 12));
		lblNewLabel_4.setForeground(new Color(0, 51, 153));
		lblNewLabel_4.setBounds(297, 69, 59, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Telefono  :");
		lblNewLabel_5.setFont(new Font("Ebrima", Font.BOLD, 12));
		lblNewLabel_5.setForeground(new Color(0, 51, 153));
		lblNewLabel_5.setBounds(297, 94, 59, 14);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("F. Nac        :");
		lblNewLabel_6.setFont(new Font("Ebrima", Font.BOLD, 12));
		lblNewLabel_6.setForeground(new Color(0, 51, 153));
		lblNewLabel_6.setBounds(297, 119, 60, 14);
		contentPane.add(lblNewLabel_6);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(366, 66, 132, 17);
		contentPane.add(txtDireccion);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(366, 91, 132, 17);
		contentPane.add(txtTelefono);
		
		txtNac = new JTextField();
		txtNac.setColumns(10);
		txtNac.setBounds(367, 116, 132, 17);
		contentPane.add(txtNac);
		
		btnCarga = new JButton("Cargar");
		btnCarga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String indice = txtIndice.getText();
				int indi = Integer.parseInt(indice);
				nombre[indi] = txtNombre.getText();
				apellido[indi] = txtApellido.getText();
				direccion[indi] = txtApellido.getText();
				fechaNacimiento[indi] = txtNac.getText();
				dni[indi] = txtDNI.getText();
				telefono[indi] = txtTelefono.getText();
			}
		});
		btnCarga.setFont(new Font("Ebrima", Font.BOLD, 16));
		btnCarga.setBackground(UIManager.getColor("Button.foreground"));
		btnCarga.setForeground(Color.DARK_GRAY);
		btnCarga.setBounds(220, 185, 97, 29);
		contentPane.add(btnCarga);
		
		btnDecrementar = new JButton("<<");
		btnDecrementar.setBackground(UIManager.getColor("Button.shadow"));
		btnDecrementar.setFont(new Font("Ebrima", Font.BOLD, 16));
		btnDecrementar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String indice = txtIndice.getText();
				
				int indi = Integer.parseInt(indice);
				if (indi>0) {
					indi = indi-1;
					indice = String.valueOf(indi);
					txtIndice.setText(indice);
					txtDNI.setText(dni[indi]);
					txtNombre.setText(nombre[indi]);
					txtApellido.setText(apellido[indi]);
					txtDireccion.setText(direccion[indi]);
					txtTelefono.setText(telefono[indi]);
					txtNac.setText(fechaNacimiento[indi]);
				}
			}
		});
		btnDecrementar.setBounds(151, 188, 59, 23);
		contentPane.add(btnDecrementar);
		
		btnIncrementar = new JButton(">>");
		btnIncrementar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String indice = txtIndice.getText();
				int indi = Integer.parseInt(indice);
				
				if (indi<9) {
					indi = indi+1;
					indice = String.valueOf(indi);
					txtIndice.setText(indice);
					txtDNI.setText(dni[indi]);
					txtNombre.setText(nombre[indi]);
					txtApellido.setText(apellido[indi]);
					txtDireccion.setText(direccion[indi]);
					txtTelefono.setText(telefono[indi]);
					txtNac.setText(fechaNacimiento[indi]);
				}
			}
		});
		btnIncrementar.setBackground(UIManager.getColor("Button.shadow"));
		btnIncrementar.setFont(new Font("Ebrima", Font.BOLD, 16));
		btnIncrementar.setBounds(327, 188, 59, 23);
		contentPane.add(btnIncrementar);
		
		JLabel lblNewLabel_7 = new JLabel("Indice :");
		lblNewLabel_7.setFont(new Font("Ebrima", Font.BOLD, 14));
		lblNewLabel_7.setForeground(Color.DARK_GRAY);
		lblNewLabel_7.setBounds(162, 254, 48, 14);
		contentPane.add(lblNewLabel_7);
		
		txtIndice = new JTextField();
		txtIndice.setEditable(false);
		txtIndice.setForeground(Color.DARK_GRAY);
		txtIndice.setFont(new Font("Ebrima", Font.BOLD, 14));
		txtIndice.setHorizontalAlignment(SwingConstants.CENTER);
		txtIndice.setText("0");
		txtIndice.setBounds(220, 250, 97, 23);
		contentPane.add(txtIndice);
		txtIndice.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("____________________");
		textPane.setBounds(10, 51, 535, 14);
		contentPane.add(textPane);
	}
}
