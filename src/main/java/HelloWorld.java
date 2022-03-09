import javax.swing.*;

public class HelloWorld extends JFrame{
    private JPanel panel1;
    private JLabel lblMensagem;

    public HelloWorld(){
        JLabel lblAdicional = new JLabel();
        lblAdicional.setText("estive aqui");
        panel1.add(lblAdicional);

        JLabel lblAdicional2 = new JLabel();
        lblAdicional2.setText("boas pinto, tive ca");
        panel1.add(lblAdicional2);

        setContentPane(panel1);
        pack();
    }
    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }

}
