package com.Danny;

import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.ByteOrder;
import java.util.concurrent.Flow;
import javax.swing.*;
import javax.swing.border.Border;

public class Main {

    public static void main (String args[]) {
        /*
        int j = 0;
        Time timeObject = new Time();
        Number numberObject = new Number();
        QuestionPanel questionPanel = new QuestionPanel();

        JFrame mainJFrame;
        mainJFrame = new JFrame();
        mainJFrame.setSize(500,500);
        // Coding by magic!
        //mainJFrame.setLayout(BorderLayout());
        mainJFrame.setLayout(new BorderLayout());
        mainJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // don't do this, just call pack() later
        //mainJFrame.setSize(600,400);
        mainJFrame.setLayout(new BorderLayout());
        mainJFrame.setTitle("Travel Agent System");
        mainJFrame.setBackground(Color.BLUE);

        timeObject.selectButton();
        //mainJFrame.add(timeObject.getGUI());
        numberObject.selectButton();
        //mainJFrame.add(numberObject.getGUI());
        questionPanel.selectButton();
        mainJFrame.getContentPane().add(timeObject.getGUI(),BorderLayout.EAST);
        mainJFrame.getContentPane().add(numberObject.getGUI(),BorderLayout.WEST);
        mainJFrame.getContentPane().add(questionPanel.getGUI(),BorderLayout.CENTER);


        mainJFrame.pack();
        // should be last.
        mainJFrame.setVisible(true);
         */
        //ExampleMaletaview mv = new ExampleMaletaview();
        //mv.setVisible(true);
        QuestionPanelReal p = new QuestionPanelReal();

    }
}

class Time {

    private JPanel buttonPanel;

    // don't use static unless necessary - it is not necessary.
    //public static void selectButton() {
    public void selectButton() {
        JButton timeButton = new JButton("Time");
        JButton moneyButton = new JButton("Money");
        JButton hotelButton = new JButton("Hotel");
        JButton exitButton = new JButton("Exit");
        buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.RED);
        buttonPanel.add(timeButton);
        buttonPanel.add(moneyButton);
        buttonPanel.add(hotelButton);
        buttonPanel.add(exitButton);
    }

    public JComponent getGUI() {
        return buttonPanel;
    }
}

class Number implements ActionListener {

    private JPanel numberPanel;
    private int i = 2;

    // don't use static unless necessary - it is not necessary.
    //public static void selectButton() {
    JButton oneButton = new JButton("1");
    JButton twoButton = new JButton("2");
    JButton threeButton = new JButton("3");
    JButton fourButton = new JButton("4");
    public void selectButton() {
        numberPanel = new JPanel();
        numberPanel.setBackground(Color.RED);
        numberPanel.add(oneButton);
        numberPanel.add(twoButton);
        numberPanel.add(threeButton);
        numberPanel.add(fourButton);

        oneButton.addActionListener(this);
        twoButton.addActionListener(this);
        threeButton.addActionListener(this);
        fourButton.addActionListener(this);

    }

    public JComponent getGUI() {
        return numberPanel;
    }
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == oneButton)
            numberPanel.setBackground(Color.PINK);
        if(event.getSource() == twoButton)
            numberPanel.setBackground(Color.RED);
        if(event.getSource() == threeButton)
            numberPanel.setBackground(Color.BLACK);
        if (event.getSource() == fourButton)
            numberPanel.setBackground(Color.CYAN);
    }
}

class QuestionPanelReal extends JPanel{
    private JPanel questionPanel;
    private JLabel nameLabel;
    private JTextField nameTextField;
    private JLabel ageLabel;
    private JTextField ageTextField;

    public QuestionPanelReal(){
        nameLabel = new JLabel("Name");
        nameTextField = new JTextField(50);
        ageLabel = new JLabel("Age");
        ageTextField = new JTextField(50);
        this.setLayout(new GridLayout(4,1));
        this.setSize(300,300);
        this.add(nameLabel);
        this.add(nameTextField);
        this.add(ageLabel);
        this.add(ageTextField);

        this.setVisible(true);
    }

    public JComponent getGUI() {
        return questionPanel;
    }
}

class QuestionPanel{
    private JPanel questionPanel;
    private JLabel nameLabel;
    private JTextField nameTextField;
    private JLabel ageLabel;
    private JTextField ageTextField;

    public void selectButton() {
        nameLabel = new JLabel("Name");
        nameTextField = new JTextField(50);
        ageLabel = new JLabel("Age");
        ageTextField = new JTextField(50);
        questionPanel = new JPanel();
        questionPanel.add(nameLabel);
        questionPanel.add(nameTextField);
        questionPanel.add(ageLabel);
        questionPanel.add(ageTextField);
        questionPanel.setLayout(new GridLayout(4,1));
        questionPanel.setSize(300,300);

        //questionPanel.setBackground(Color.BLUE);
    }

    public JComponent getGUI() {
        return questionPanel;
    }
}

class ExampleMaletaview extends JFrame implements ActionListener{
    private JButton moreButton;
    private JTextField[] maletaTextField;
    private JLabel[] maletalabel;
    private JLabel background;
    private int i = 0;

    ExampleMaletaview(){
        this.setLayout(new GridLayout(7,1));
        this.setSize(300,400);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.RED);
        //background = new JLabel();
        //background.setBackground(Color.BLUE);
        maletaTextField = new JTextField[3];
        maletalabel = new JLabel[3];
        moreButton = new JButton("Agregar");
        moreButton.addActionListener(this);
        maletalabel[i] = new JLabel("Maleta "+(i+1));
        maletaTextField[i] = new JTextField(30);
        this.add(moreButton);
        this.add(maletalabel[i]);
        this.add(maletaTextField[i]);
        //this.add(background);
        i++;
    }
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == moreButton){
                maletalabel[i] = new JLabel("Maleta "+(i+1));
                maletaTextField[i] = new JTextField(30);
                this.add(maletalabel[i]);
                this.add(maletaTextField[i]);
                maletalabel[i].setVisible(true);
                maletaTextField[i].setVisible(true);
                i++;
                this.revalidate();
                this.repaint();
            }
        }
        catch (ArrayIndexOutOfBoundsException exception){
            JOptionPane.showMessageDialog(null,"Número de maletas excedido");
        }
    }
}

class TT extends JFrame {

    JTextField textField;
    JPanel panel;
    JButton button1;
    JButton button2;

    public TT() {
        //setSize(300, 300);  // better to use pack() (after components added)
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // better to use
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //setLocationRelativeTo(null);  // better to use..
        setLocationByPlatform(true);
        setTitle("Bla Blubb");
        setResizable(false);
        //setLayout(null); // better to use layouts with padding & borders

        // set a flow layout with large hgap and vgap.
        panel = new JPanel(new FlowLayout(SwingConstants.LEADING, 10, 10));
        // panel.setBounds(5, 5, 290, 290); // better to pack()
        add(panel);

        //textField = new JTextField(); // suggest a size in columns
        textField = new JTextField(8);
        //textField.setBounds(5, 5, 280, 50); // to get height, set large font
        textField.setFont(textField.getFont().deriveFont(50f));
        panel.add(textField);

        pack(); // make the GUI the minimum size needed to display the content
        setVisible(true);
    }

    public static void main(String[] args) {
        QuestionPanelReal p = new QuestionPanelReal();
    }
}

class loginPanel extends JPanel{
    private JLabel labelUsername = new JLabel("Enter username: ");
    private JLabel labelPassword = new JLabel("Enter password: ");
    private JTextField textUsername = new JTextField(20);
    private JPasswordField fieldPassword = new JPasswordField(20);
    private JButton buttonLogin = new JButton("Login");

    public loginPanel() {

        // create a new panel with GridBagLayout manager
        this.setLayout(new GridBagLayout());
        this.setBackground(Color.CYAN);
        GridBagConstraints constraints = new GridBagConstraints();
        //constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;
        this.add(labelUsername, constraints);

        constraints.gridx = 1;
        this.add(textUsername, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        this.add(labelPassword, constraints);

        constraints.gridx = 1;
        this.add(fieldPassword, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        this.add(buttonLogin, constraints);

        // set border for the panel
        this.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Login Panel"));
    }
}

class ExamplePanel extends JPanel{
    private JLabel labelUsername = new JLabel("Enter Name: ");
    private JLabel labelPassword = new JLabel("Enter age: ");
    private JTextField textUsername = new JTextField(20);
    private JPasswordField fieldPassword = new JPasswordField(20);
    private JLabel flightLabel = new JLabel("Flight: ");
    private JTextField flightField = new JTextField(20);

    public ExamplePanel() {

        // create a new panel with GridBagLayout manager
        this.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        //constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;
        this.add(labelUsername, constraints);

        constraints.gridx = 1;
        this.add(textUsername, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        this.add(labelPassword, constraints);

        constraints.gridx = 1;
        this.add(fieldPassword, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        //constraints.gridwidth = 2;
        this.add(flightLabel,constraints);

        constraints.gridx = 1;
        this.add(flightField,constraints);

        //constraints.anchor = GridBagConstraints.CENTER;

        // set border for the panel
        this.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Login Panel"));
    }

}

class SwingJPanelDemo extends JFrame {


    public SwingJPanelDemo() {
        super("JFrame Adding Panels");
        loginPanel panel = new loginPanel();
        ExamplePanel panel2 = new ExamplePanel();
        loginPanel panel3 = new loginPanel();
        ExamplePanel panel4 = new ExamplePanel();
        // add the panel to this frame
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        //this.setUndecorated(true);
        JPanel panelWest = new JPanel(new GridLayout(2,1));
        panelWest.add(panel);
        panelWest.add(panel2);
        this.setLayout(new BorderLayout());
        //this.setBackground(Color.BLUE);

        JPanel panelEast = new JPanel(new GridLayout(2,1));
        panelEast.add(panel3);
        panelEast.add(panel4);

        //this.getContentPane().add(panel,BorderLayout.NORTH);
        this.getContentPane().add(panelEast,BorderLayout.EAST);
        //this.getContentPane().add(panel3,BorderLayout.SOUTH);
        this.getContentPane().add(panelWest, BorderLayout.WEST);
        //add(panel);
        //add(panel2);

        pack();
        //setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingJPanelDemo d = new SwingJPanelDemo();
        d.setVisible(true);
    }
}
