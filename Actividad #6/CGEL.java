package act6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CGEL {
    private JFrame frame;
    private JPanel panel;
    private JTextField campoNombre;
    private JTextField campoNumero;
    private JTextArea textArea;
    private JButton botonCargar;
    private JButton botonGuardar;
    private JButton botonEliminar;
    private JButton botonLimpiar;
    private File archivo;
    
    public CGEL() {
        frame = new JFrame("Editor de Archivo de Texto");
        panel = new JPanel();
        campoNombre = new JTextField(15);
        campoNumero = new JTextField(15);
        textArea = new JTextArea(25, 50);
        botonCargar = new JButton("Cargar");
        botonGuardar = new JButton("Guardar");
        botonEliminar = new JButton("Eliminar");
        botonLimpiar = new JButton("Limpiar");

        archivo = new File("archivo.txt");

        botonCargar.addActionListener((ActionEvent e) -> {
            cargarArchivo();
        });

        botonGuardar.addActionListener((ActionEvent e) -> {
            guardarArchivo();
        });

        botonEliminar.addActionListener((ActionEvent e) -> {
            eliminarArchivo();
        });

        botonLimpiar.addActionListener((ActionEvent e) -> {
            limpiarTextArea();
        });
    }
    public void crearymostrar() {
        panel.add(new JLabel("Nombre: "));
        panel.add(campoNombre);
        panel.add(new JLabel("Número: "));
        panel.add(campoNumero);
        panel.add(botonCargar);
        panel.add(botonGuardar);
        panel.add(botonEliminar);
        panel.add(botonLimpiar);
        frame.add(panel, BorderLayout.NORTH);
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    private void cargarArchivo() {
        try {
            String contenido = new String(Files.readAllBytes(Paths.get(archivo.getAbsolutePath())));
            textArea.setText(contenido);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(frame, "Error al cargar el archivo: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void guardarArchivo() {
        String nombre = campoNombre.getText();
        String numero = campoNumero.getText();

        if (nombre.isEmpty() || numero.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Ingresa nombre y número.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String contenido = "Nombre: " + nombre + "\nNúmero: " + numero;
            try (FileWriter escritor = new FileWriter(archivo)) {
                escritor.write(contenido);
            }
            JOptionPane.showMessageDialog(frame, "Archivo guardado.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(frame, "Error al guardar el archivo: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void eliminarArchivo() {
        if (archivo.exists()) {
            if (archivo.delete()) {
                JOptionPane.showMessageDialog(frame, "Archivo eliminado.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                textArea.setText("");
            } else {
                JOptionPane.showMessageDialog(frame, "Error al eliminar el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(frame, "El archivo no existe.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void limpiarTextArea() {
        textArea.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CGEL editor = new CGEL();
            editor.crearymostrar();
        });
    }
}
