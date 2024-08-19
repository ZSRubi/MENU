
package Restaurante;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
 import javax.swing.Timer;

public class MENU extends JFrame {

    private static final String RUTA_TXT = "RegistroDeClientes.txt";
    private static final List<Cliente> clientes = new ArrayList<>();

    private JTextField txtId;
    private JTextField txtNombre;
    private JTextArea txtAreaMensajes;
    private JButton btnRegistrar;
    private JButton btnAvanzar;
    private JLabel lblFecha; // JLabel para mostrar la fecha y hora actual
    private Timer timer; // Timer para actualizar la hora
  


    public MENU() {
        setTitle("Restaurante Rencito");
        setSize(500, 350); // Tamaño ajustado para incluir todos los componentes
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Cargar los clientes desde el archivo
        cargarClientesDesdeArchivo();

        // Crear componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel lblId = new JLabel("Ingrese ID:");
        txtId = new JTextField();
        JLabel lblNombre = new JLabel("Ingrese Nombre:");
        txtNombre = new JTextField();

        panel.add(lblId);
        panel.add(txtId);
        panel.add(lblNombre);
        panel.add(txtNombre);

        btnRegistrar = new JButton("Registrar");
        btnAvanzar = new JButton("Avanzar");

        txtAreaMensajes = new JTextArea();
        txtAreaMensajes.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtAreaMensajes);

        // Crear y añadir el JLabel para la fecha y hora actual
        lblFecha = new JLabel("Fecha y Hora Actual: ", SwingConstants.CENTER);
        lblFecha.setFont(new Font("Arial", Font.BOLD, 14));

        // Crear un panel para el título y la fecha
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        topPanel.add(new JLabel("------- RESTAURANTE RENCITO -------", SwingConstants.CENTER), BorderLayout.NORTH);
        topPanel.add(lblFecha, BorderLayout.SOUTH);

        // Añadir componentes a la ventana
        add(topPanel, BorderLayout.NORTH); // Usar el panel superior que incluye el título y la fecha
        add(panel, BorderLayout.CENTER);
        add(btnRegistrar, BorderLayout.SOUTH);
        add(btnAvanzar, BorderLayout.SOUTH);
        add(scrollPane, BorderLayout.EAST);

        // Configurar eventos
        btnRegistrar.addActionListener(e -> manejarRegistroCliente());

        btnAvanzar.addActionListener(e -> decidirSiAvanzar());

        // Configurar y empezar el Timer para actualizar la fecha y hora
        iniciarTimer();
    }

    private String obtenerFechaHoraActual() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(new Date());
    }
    //creacion del hilo
    private void iniciarTimer() {
    timer = new Timer(1000, e -> lblFecha.setText("Fecha y Hora Actual: " + obtenerFechaHoraActual()));
    timer.start();
    }


    private void manejarRegistroCliente() {
        try {
            int id = Integer.parseInt(txtId.getText().trim());
            String nombre = txtNombre.getText().trim();

            if (nombre.isEmpty()) {
                txtAreaMensajes.setText("El nombre no puede estar vacío.");
                return;
            }

            if (clientes.stream().anyMatch(c -> c.getId() == id)) {
                txtAreaMensajes.setText("Este código ya existe.");
            } else {
                clientes.add(new Cliente(id, nombre));
                txtAreaMensajes.setText("Bienvenido, " + nombre + "!");
            }
        } catch (NumberFormatException e) {
            txtAreaMensajes.setText("ID debe ser un número entero.");
        }
    }

    private void decidirSiAvanzar() {
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea avanzar?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            // Mostrar la segunda interfaz
            new Segunda_Interfaz().setVisible(true);
            dispose(); // Cerrar la ventana actual
        } else {
            guardarClientesEnArchivo();
            System.exit(0);
        }
    }

    private void cargarClientesDesdeArchivo() {
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA_TXT))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, ",");
                int id = Integer.parseInt(st.nextToken());
                String nombre = st.nextToken();
                clientes.add(new Cliente(id, nombre));
            }
        } catch (IOException e) {
            System.out.println("Error al cargar los clientes desde el archivo: " + e.getMessage());
        }
    }

    private void guardarClientesEnArchivo() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(RUTA_TXT))) {
            for (Cliente cliente : clientes) {
                pw.println(cliente.getId() + "," + cliente.getNombre());
            }
        } catch (IOException e) {
            System.out.println("Error al guardar los clientes en el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MENU gui = new MENU();
            gui.setVisible(true);
        });
    }
}

class Cliente {
    private int id;
    private String nombre;

    public Cliente(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
