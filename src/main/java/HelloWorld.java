import javax.swing.*;
public class HelloWorld extends JFrame {
    private JPanel panel1;

    private JLabel lblMensagem;
    public HelloWorld(){
        setContentPane(panel1);
        lblMensagem = new JLabel("Hello World", SwingConstants.CENTER);
        setContentPane(lblMensagem);
        pack();
    }
    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }

}