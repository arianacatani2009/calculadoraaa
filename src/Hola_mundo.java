import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hola_mundo extends JFrame implements ActionListener{
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
    private JButton Borrar;
    private JButton CEBoton;
    private JButton punto;
    private JButton botonmas;
    private String valor;
    private String x;
    private String y;
    int o;
    public Hola_mundo() {
        add(rootpanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(370,300);
        setTitle("PRINCIPAL");
        boton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = numero1.getText();
                if (valor.length() == 1 && valor.equals("0")) {
                    numero1.setText("0");
                } else {
                    numero1.setText(valor + "0");
                }
            }
        });
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = numero1.getText();
                if (valor.equals("0")) {
                    numero1.setText("1");
                } else {
                    numero1.setText(valor + "1");
                }
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = numero1.getText();
                if (valor.equals("0")) {
                    numero1.setText("2");
                } else {
                    numero1.setText(valor + "2");
                }
            }
        });
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = numero1.getText();
                if (valor.equals("0")) {
                    numero1.setText("3");
                } else {
                    numero1.setText(valor + "3");
                }
            }
        });
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = numero1.getText();
                if (valor.equals("0")) {
                    numero1.setText("4");
                } else {
                    numero1.setText(valor + "4");
                }
            }
        });

        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = numero1.getText();
                if (valor.equals("0")) {
                    numero1.setText("5");
                } else {
                    numero1.setText(valor + "5");
                }
            }
        });

        boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = numero1.getText();
                if (valor.equals("0")) {
                    numero1.setText("6");
                } else {
                    numero1.setText(valor + "6");
                }
            }
        });
        boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = numero1.getText();
                if (valor.equals("0")) {
                    numero1.setText("7");
                } else {
                    numero1.setText(valor + "7");
                }
            }
        });
        boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = numero1.getText();
                if (valor.equals("0")) {
                    numero1.setText("8");
                } else {
                    numero1.setText(valor + "8");
                }
            }
        });
        boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = numero1.getText();
                if (valor.equals("0")) {
                    numero1.setText("9");
                } else {
                    numero1.setText(valor + "9");
                }
            }
        });

        punto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = numero1.getText();
                if (!valor.contains(".")) {
                    numero1.setText(valor + ".");
                }
            }
        });

        botonmas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = numero1.getText();
                int longitud = valor.length();
                int m = longitud;
                if (valor.contains("-")) {
                    numero1.setText(valor.substring(1, m));
                } else {
                    numero1.setText("-" + valor);
                }
            }
        });


        Borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = numero1.getText();
                int longitud = valor.length();
                int m = longitud - 1;
                if (m >= 1) {
                    numero1.setText(valor.substring(0, m));
                } else {
                    numero1.setText("0");
                }
            }
        });

        botonsum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = numero1.getText();
                numero1.setText("0");
                o = 1;
            }
        });
        resultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                y = numero1.getText();
                if (o == 1) {
                    float xa = Float.parseFloat(x);
                    float ya = Float.parseFloat(y);
                    float z = (xa + ya);
                    numero1.setText(String.valueOf(z));
                }
                if (o == 2) {
                    float xa = Float.parseFloat(x);
                    float ya = Float.parseFloat(y);
                    float z = (xa - ya);
                    numero1.setText(String.valueOf(z));
                }
                if (o == 3) {
                    float xa = Float.parseFloat(x);
                    float ya = Float.parseFloat(y);
                    float z = (xa / ya);
                    numero1.setText(String.valueOf(z));
                }
                if (o == 4) {
                    float xa = Float.parseFloat(x);
                    float ya = Float.parseFloat(y);
                    float z = (xa * ya);
                    numero1.setText(String.valueOf(z));
                }
            }
        });

        botonres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = numero1.getText();
                numero1.setText("0");
                o = 2;
            }
        });

        CEBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = numero1.getText();
                if (!valor.equals("0")) {
                    numero1.setText("0");
                } else {
                    numero1.setText("0");
                }
            }
        });

        botonmul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = numero1.getText();
                numero1.setText("0");
                o = 4;
            }
        });

        botondiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = numero1.getText();
                numero1.setText("0");
                o = 3;
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}