import javax.swing.*;
public class HelloWorld extends JFrame {
    private JPanel panel1;

    private JLabel lblMensagem;
    private JLabel lblMensagem2;
    public HelloWorld(){
        setContentPane(panel1);
        lblMensagem = new JLabel("Hello World", SwingConstants.CENTER);
        lblMensagem2 = new JLabel("Rubão passou por aqui", SwingConstants.CENTER);
        setContentPane(lblMensagem);
        pack();
    }
    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }

}