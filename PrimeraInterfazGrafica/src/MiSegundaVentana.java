import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MiSegundaVentana extends JFrame {
    private JPanel  contentPane;
    private JPanel  panelBotones;
    private JButton btnNOk;
    private JButton btnCancel;
    private JPanel  panelVisual;

    /**
     * Create the frame.
     */
    public MiSegundaVentana() {
        initialize();
    }

    private void initialize() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 674, 507);
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

    private JButton getBtnCancel() {
        if (btnCancel == null) {
            btnCancel = new JButton("Cancel");
        }

        return btnCancel;
    }

    private JButton getBtnNOk() {
        if (btnNOk == null) {
            btnNOk = new JButton("Ok");
            btnNOk.addActionListener(e -> JOptionPane.showMessageDialog(this, "Hola"));
        }

        return btnNOk;
    }

    private Controlador getControlador(Controlador controlador) {
        if (controlador == null) {
            controlador = new Controlador();
        }

        return controlador;
    }

    private JPanel getPanelBotones() {
        if (panelBotones == null) {
            panelBotones = new JPanel();
            panelBotones.add(getBtnNOk());
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

    private class Controlador implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("OK")) {
                JOptionPane.showMessageDialog(MiSegundaVentana.this, "Hola");
            }
        }
    }
}



