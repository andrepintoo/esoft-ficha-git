import javax.swing.*;

public class HelloWorld extends JFrame{
    private JPanel panel1;
    private JLabel lblMensagem;

    public HelloWorld(){
        JLabel lblAdicional = new JLabel();
        lblAdicional.setText("estive aqui");
        panel1.add(lblAdicional);

        JLabel lblAdicional2 = new JLabel();
        JLabel lblAdicional3 = new JLabel();
//<<<<<<< HEAD
        lblAdicional3.setText("alterações - estive aqui");
//=======
        lblAdicional2.setText("boas pinto, tive ca");
//>>>>>>> e1b14ffd68722d7d1cfa4770ed43fb048b2be817
        panel1.add(lblAdicional2);
        panel1.add(lblAdicional3);

        setContentPane(panel1);
        pack();
    }
    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }

}
