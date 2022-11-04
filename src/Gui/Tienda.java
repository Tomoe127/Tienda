package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;

public class Tienda extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
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
	public Tienda() {
		setForeground(Color.WHITE);
		setResizable(false);
		setBackground(Color.WHITE);
		setTitle("Tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnArchivo.add(mntmSalir);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		JMenuItem mntmConsultarColchn = new JMenuItem("Consultar colch\u00F3n");
		mnMantenimiento.add(mntmConsultarColchn);
		
		JMenuItem mntmModificarColchn = new JMenuItem("Modificar colch\u00F3n");
		mnMantenimiento.add(mntmModificarColchn);
		
		JMenuItem mntmListarColchn = new JMenuItem("Listar colch\u00F3n");
		mnMantenimiento.add(mntmListarColchn);
		
		JMenu mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		JMenuItem mntmVender = new JMenuItem("Vender");
		mnVentas.add(mntmVender);
		
		JMenuItem mntmGenerarReportes = new JMenuItem("Generar reportes");
		mnVentas.add(mntmGenerarReportes);
		
		JMenu mnConfiguracin = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracin);
		
		JMenuItem mntmConfigurarDescuentos = new JMenuItem("Configurar descuentos");
		mnConfiguracin.add(mntmConfigurarDescuentos);
		
		JMenuItem mntmConfigurarObsequios = new JMenuItem("Configurar obsequios");
		mnConfiguracin.add(mntmConfigurarObsequios);
		
		JMenuItem mntmConfigurarCantidadptima = new JMenuItem("Configurar cantidad \u00F3ptima");
		mnConfiguracin.add(mntmConfigurarCantidadptima);
		
		JMenuItem mntmConfigurarCuotaDiaria = new JMenuItem("Configurar cuota diaria");
		mnConfiguracin.add(mntmConfigurarCuotaDiaria);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		mnAyuda.add(mntmAcercaDeTienda);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(123, 104, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
