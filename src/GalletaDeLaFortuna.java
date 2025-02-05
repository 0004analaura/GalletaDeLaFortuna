import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class GalletaDeLaFortuna extends JFrame {

    private ArrayList<String> mensajes;
    private JLabel mensajeLabel;

    public GalletaDeLaFortuna() {
        super("Galleta de la Fortuna");


        mensajes = new ArrayList<>();
        mensajes.add("Si te caes 7 veces, levántate 8");
        mensajes.add("Hoy es el momento de explorar: no temas.");
        mensajes.add("No te rindas, cada paso te acerca más a tu meta.");
        mensajes.add("La mejor manera de predecir el futuro es crearlo.");
        mensajes.add("Cree en ti mismo y todo será posible.");
        mensajes.add("La fortuna está en ti, no en la galleta");
        mensajes.add("Confía en ti");


        JButton boton = new JButton("Obtener mensaje");
        mensajeLabel = new JLabel("Presiona el botón para obtener un mensaje", SwingConstants.CENTER);
        mensajeLabel.setFont(new Font("Arial", Font.BOLD, 14));
        mensajeLabel.setForeground(new Color(50, 50, 50));


        boton.setBackground(new Color(255, 140, 0));
        boton.setForeground(Color.WHITE);
        boton.setFocusPainted(false);
        boton.setFont(new Font("Arial", Font.BOLD, 14));


        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(255, 228, 181));
        panel.add(mensajeLabel, BorderLayout.CENTER);
        panel.add(boton, BorderLayout.SOUTH);


        add(panel);


        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarMensajeAleatorio();
            }
        });


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void mostrarMensajeAleatorio() {
        Random random = new Random();
        int indice = random.nextInt(mensajes.size());
        String mensaje = mensajes.get(indice);
        mensajeLabel.setText(mensaje);
    }

    public static void main(String[] args) {
        new GalletaDeLaFortuna();
    }
}


