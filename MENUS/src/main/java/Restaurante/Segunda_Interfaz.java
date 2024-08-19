package Restaurante;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class Segunda_Interfaz extends JFrame {

    private JComboBox<String> comboComidas;
    private JComboBox<String> comboBebidas;

    private Map<String, Double> preciosComidas;
    private Map<String, Double> preciosBebidas;

    private Perceptron perceptron;

    public Segunda_Interfaz() {
        setTitle("Segunda Interfaz del Restaurante");
        setSize(400, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Inicializar precios
        inicializarPrecios();

        // Crear perceptrón (Ejemplo: 2 entradas, tasa de aprendizaje 0.01)
        perceptron = new Perceptron(2, 0.01);

        // Datos de entrenamiento (Ejemplo simple)
        double[][] trainingInputs = {
            {10.0, 2.0}, // Pizza y Agua
            {8.0, 3.0},  // Hamburguesa y Refresco
            {12.0, 5.0}, // Pasta y Cerveza
            {7.0, 6.0},  // Ensalada y Vino
        };
        double[] trainingLabels = {1.0, 0.0, 1.0, 0.0}; // Etiquetas correspondientes

        // Entrenar el perceptrón
        perceptron.train(trainingInputs, trainingLabels, 1000);

        // Crear componentes
        JLabel labelTitulo = new JLabel("¡Bienvenido a la selección de Comidas y Bebidas!", SwingConstants.CENTER);
        labelTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        add(labelTitulo, BorderLayout.NORTH);

        // Panel para las opciones
        JPanel panelOpciones = new JPanel();
        panelOpciones.setLayout(new GridLayout(3, 2));

        // Crear y agregar combos para comidas y bebidas
        JLabel labelComidas = new JLabel("Selecciona una comida:");
        panelOpciones.add(labelComidas);

        comboComidas = new JComboBox<>(prepararComboBox(preciosComidas));
        panelOpciones.add(comboComidas);

        JLabel labelBebidas = new JLabel("Selecciona una bebida:");
        panelOpciones.add(labelBebidas);

        comboBebidas = new JComboBox<>(prepararComboBox(preciosBebidas));
        panelOpciones.add(comboBebidas);

        add(panelOpciones, BorderLayout.CENTER);

        // Botones para confirmar la selección, mostrar la factura y predecir
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());

        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                confirmarSeleccion();
            }
        });
        panelBotones.add(btnConfirmar);

        JButton btnFactura = new JButton("Factura");
        btnFactura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarFactura();
            }
        });
        panelBotones.add(btnFactura);

        JButton btnPredecir = new JButton("Predecir Preferencia");
        btnPredecir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                predecirPreferencia();
            }
        });
        panelBotones.add(btnPredecir);

        add(panelBotones, BorderLayout.SOUTH);
    }

    private void inicializarPrecios() {
        preciosComidas = new HashMap<>();
        preciosComidas.put("Pizza", 10.0);
        preciosComidas.put("Hamburguesa", 8.0);
        preciosComidas.put("Pasta", 12.0);
        preciosComidas.put("Ensalada", 7.0);

        preciosBebidas = new HashMap<>();
        preciosBebidas.put("Agua", 2.0);
        preciosBebidas.put("Refresco", 3.0);
        preciosBebidas.put("Cerveza", 5.0);
        preciosBebidas.put("Vino", 6.0);
    }

    private String[] prepararComboBox(Map<String, Double> precios) {
        return precios.entrySet().stream()
                .map(entry -> entry.getKey() + " - $" + new DecimalFormat("0.00").format(entry.getValue()))
                .toArray(String[]::new);
    }

    private void confirmarSeleccion() {
        String comidaSeleccionada = (String) comboComidas.getSelectedItem();
        String bebidaSeleccionada = (String) comboBebidas.getSelectedItem();
        JOptionPane.showMessageDialog(this, "Has seleccionado:\nComida: " + comidaSeleccionada + "\nBebida: " + bebidaSeleccionada);
    }

    private void mostrarFactura() {
        // Obtener el nombre del producto seleccionado y el precio
        String comidaSeleccionada = (String) comboComidas.getSelectedItem();
        String bebidaSeleccionada = (String) comboBebidas.getSelectedItem();

        // Extraer los precios de las selecciones
        double precioComida = preciosComidas.getOrDefault(extraerNombre(comidaSeleccionada), 0.0);
        double precioBebida = preciosBebidas.getOrDefault(extraerNombre(bebidaSeleccionada), 0.0);

        double montoTotal = precioComida + precioBebida;

        String factura = String.format("Factura:\nComida: %s - $%.2f\nBebida: %s - $%.2f\nTotal a pagar: $%.2f",
                comidaSeleccionada, precioComida, bebidaSeleccionada, precioBebida, montoTotal);

        JOptionPane.showMessageDialog(this, factura);
    }

    private String extraerNombre(String seleccion) {
        return seleccion.split(" - ")[0];
    }

    private void predecirPreferencia() {
        double precioComida = preciosComidas.getOrDefault(extraerNombre((String) comboComidas.getSelectedItem()), 0.0);
        double precioBebida = preciosBebidas.getOrDefault(extraerNombre((String) comboBebidas.getSelectedItem()), 0.0);

        double[] input = {precioComida, precioBebida};
        double prediction = perceptron.predict(input);

        String mensaje = prediction > 0.5 ? "Alta probabilidad de preferencia" : "Baja probabilidad de preferencia";
        JOptionPane.showMessageDialog(this, "Predicción del perceptrón: " + mensaje);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Segunda_Interfaz interfaz = new Segunda_Interfaz();
            interfaz.setVisible(true);
        });
    }
}
