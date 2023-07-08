import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hola_mundo {
    private JPanel rootpanel;
    private JTextField numero1;
    private JButton boton0;
    private JButton boton6;
    private JButton boton8;
    private JButton boton5;
    private JButton boton7;
    private JButton boton9;
    private JButton boton3;
    private JButton boton4;
    private JButton boton1;
    private JButton boton2;
    private JButton botonres;
    private JButton botonsum;
    private JButton botondiv;
    private JButton botonmul;
    private JButton resultado;
    private JSeparator separar;
    private JSeparator espacio;
    private JSeparator espacioo;
    private JSeparator espaciooo;
    private JToolBar.Separator sepa;
    private JToolBar.Separator sip;
    private JToolBar.Separator sep;
    private JToolBar.Separator dor;
    private JToolBar.Separator s;
    private JToolBar.Separator e;
    private JToolBar.Separator p;
    private JToolBar.Separator a;
    int i = 0;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hola_mundo");
        frame.setContentPane(new Hola_mundo().rootpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}

