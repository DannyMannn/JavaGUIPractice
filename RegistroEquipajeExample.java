import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RegistroEquipajeExample extends JFrame implements ActionListener {
    private JButton moreButton;
    private int i = 0;
    private MaletaView[] maletaViews;

    RegistroEquipajeExample(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        maletaViews = new MaletaView[3];
        this.setLayout(new GridLayout(4,1));
        this.setSize(400,400);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.RED);

        moreButton = new JButton("Agregar");
        moreButton.addActionListener(this);
        this.add(moreButton);
        this.add(maletaViews[i] = new MaletaView());
        i++;
    }
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == moreButton){
                this.getContentPane().add(maletaViews[i] = new MaletaView());
                i++;
                this.revalidate();
                this.repaint();
            }
        }
        catch (ArrayIndexOutOfBoundsException exception){
            JOptionPane.showMessageDialog(null,"Número de maletas excedido");
        }
    }

    public static void main(String[] args) {
        RegistroEquipajeExample view = new RegistroEquipajeExample();
        view.setVisible(true);

    }
}
class MaletaView extends JPanel {
    private JLabel pesoMaletaLabel = new JLabel("Ingrese Peso");
    private JTextField pesoMaletaTextField = new JTextField(20);

    private double pesoMaletaEntrada = 0;

    public double getPesoMaletaEntrada() {
        return pesoMaletaEntrada;
    }

    MaletaView() {
        this.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);

        constraints.gridx = 0;
        constraints.gridy = 0;
        this.add(pesoMaletaLabel, constraints);

        constraints.gridx = 1;
        this.add(pesoMaletaTextField, constraints);

        this.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Registrar Maleta"));
    }
}