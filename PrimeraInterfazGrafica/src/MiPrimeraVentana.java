import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MiPrimeraVentana extends JFrame {
    private JPanel  contentPane;
    private JPanel  panelBotones;
    private JButton btnNOk;
    private JButton btnCancel;
    private JPanel  panelVisual;
    private JButton btnDissapear;

    /**
     * Create the frame.
     */
    public MiPrimeraVentana() {
        initialize();
    }

    private void initialize() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 100, 674, 507);

        // Center the screen
        Dimension dimemsion = Toolkit.getDefaultToolkit().getScreenSize();

        this.setLocation(dimemsion.width / 2 - this.getSize().width / 2,
                         dimemsion.height / 2 - this.getSize().height / 2);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        GridBagLayout gbl_contentPane = new GridBagLayout();

        gbl_contentPane.columnWidths  = new int[] { 658, 0 };
        gbl_contentPane.rowHeights    = new int[] { 409, 35, 0 };
        gbl_contentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
        gbl_contentPane.rowWeights    = new double[] { 1.0, 0.0, Double.MIN_VALUE };
        contentPane.setLayout(gbl_contentPane);

        GridBagConstraints gbc_panelVisual = new GridBagConstraints();

        gbc_panelVisual.insets = new Insets(0, 0, 5, 0);
        gbc_panelVisual.fill   = GridBagConstraints.BOTH;
        gbc_panelVisual.gridx  = 0;
        gbc_panelVisual.gridy  = 0;
        contentPane.add(getPanelVisual(), gbc_panelVisual);

        GridBagConstraints gbc_panelBotones = new GridBagConstraints();

        gbc_panelBotones.anchor = GridBagConstraints.NORTH;
        gbc_panelBotones.fill   = GridBagConstraints.HORIZONTAL;
        gbc_panelBotones.gridx  = 0;
        gbc_panelBotones.gridy  = 1;
        contentPane.add(getPanelBotones(), gbc_panelBotones);
    }

    private void locatePane() {}

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
                                   public void run() {
                                       try {
                                           MiPrimeraVentana frame = new MiPrimeraVentana();

                                           frame.setVisible(true);
                                       } catch (Exception e) {
                                           e.printStackTrace();
                                       }
                                   }
                               });
    }

    private void makeBlinking() {
        this.setBounds(getRandomNumberInRange(0, 800), getRandomNumberInRange(0, 800), 674, 507);

        if (this.isVisible() == true) {
            this.setVisible(false);
        } else {
            this.setVisible(true);
        }

        System.out.println("Iniciado contador this.isVisible() returns->  " + this.isVisible());
        setTimeout(() -> makeBlinking(), 2000);
    }

    private JButton getBtnCancel() {
        if (btnCancel == null) {
            btnCancel = new JButton("Exit");
            btnCancel.addActionListener(e -> this.dispose());
        }

        return btnCancel;
    }

    private JButton getBtnDissapear() {
        if (btnDissapear == null) {
            btnDissapear = new JButton("Dissapear!");
            btnDissapear.setActionCommand("dissapear");
            btnDissapear.addActionListener(e -> makeBlinking());
        }

        return btnDissapear;
    }

    private JButton getBtnNOk() {
        if (btnNOk == null) {
            btnNOk = new JButton("Ok");
            btnNOk.addActionListener(e -> JOptionPane.showMessageDialog(this, "Hola"));
        }

        return btnNOk;
    }

    private JPanel getPanelBotones() {
        if (panelBotones == null) {
            panelBotones = new JPanel();
            panelBotones.add(getBtnNOk());
            panelBotones.add(getBtnDissapear());
            panelBotones.add(getBtnCancel());
        }

        return panelBotones;
    }

    private JPanel getPanelVisual() {
        if (panelVisual == null) {
            panelVisual = new JPanel();
        }

        return panelVisual;
    }

    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();

        return r.nextInt((max - min) + 1) + min;
    }

    public static void setTimeout(Runnable runnable, int delay) {
        new Thread(
            () -> {
                try {
                    Thread.sleep(delay);
                    runnable.run();
                } catch (Exception e) {
                    System.err.println(e);
                }
            }).start();
    }
}



