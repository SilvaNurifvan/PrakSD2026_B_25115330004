package pekan7_2511533004;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class GUIinsertionsort_2511533004 extends JFrame {

    private static final long serialVersionUID_3004 = 1L;
    private int[] array_3004;
    private JLabel[] labelArray_3004;
    private JButton stepButton_3004, resetButton_3004, setButton_3004;
    private JTextField inputField_3004;
    private JPanel panelArray_3004, controlPanel, inputPanel;
    private JTextArea stepArea_3004;
    private int i = 1, j_3004;
    private boolean sorting_3004 = false;
    private int stepCount_3004 = 1;

    public GUIinsertionsort_2511533004() {
        setTitle("Insertion Sort Langkah per Langkah");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        inputPanel = new JPanel(new FlowLayout());
        inputField_3004 = new JTextField(20);
        setButton_3004 = new JButton("Set Data");
        inputPanel.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
        inputPanel.add(inputField_3004);
        inputPanel.add(setButton_3004);

        panelArray_3004 = new JPanel();
        panelArray_3004.setLayout(new FlowLayout());

        controlPanel = new JPanel();
        stepButton_3004 = new JButton("Langkah Selanjutnya");
        resetButton_3004 = new JButton("Reset");
        stepButton_3004.setEnabled(false);
        controlPanel.add(stepButton_3004);
        controlPanel.add(resetButton_3004);

        stepArea_3004 = new JTextArea(8, 60);
        stepArea_3004.setEditable(false);
        stepArea_3004.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane_3004 = new JScrollPane(stepArea_3004);

        add(inputPanel, BorderLayout.NORTH);
        add(panelArray_3004, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
        add(scrollPane_3004, BorderLayout.EAST);

        setButton_3004.addActionListener(e -> setArrayFromInput_3004());
        stepButton_3004.addActionListener(e -> performStep_3004());
        resetButton_3004.addActionListener(e -> reset_3004());
    }

    private void setArrayFromInput_3004() {
        String text = inputField_3004.getText().trim();
        if (text.isEmpty()) return;
        String[] parts = text.split(",");
        array_3004 = new int[parts.length];
        
        try {
            for (int k = 0; k < parts.length; k++) {
                array_3004[k] = Integer.parseInt(parts[k].trim());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        i = 1;
        stepCount_3004 = 1;
        sorting_3004 = true;
        stepButton_3004.setEnabled(true);
        stepArea_3004.setText("");
        panelArray_3004.removeAll();
        
        labelArray_3004 = new JLabel[array_3004.length];
        for (int k = 0; k < array_3004.length; k++) {
            labelArray_3004[k] = new JLabel(String.valueOf(array_3004[k]));
            labelArray_3004[k].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray_3004[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_3004[k].setPreferredSize(new Dimension(50, 50));
            labelArray_3004[k].setHorizontalAlignment(SwingConstants.CENTER);
            panelArray_3004.add(labelArray_3004[k]);
        }
        panelArray_3004.revalidate();
        panelArray_3004.repaint();
    }

    private void performStep_3004() {
        if (i < array_3004.length && sorting_3004) {
            int key = array_3004[i];
            j_3004 = i - 1;

            StringBuilder stepLog = new StringBuilder();
            stepLog.append("Langkah ").append(stepCount_3004)
                   .append(": Memasukkan ").append(key).append("\n");

            while (j_3004 >= 0 && array_3004[j_3004] > key) {
                array_3004[j_3004 + 1] = array_3004[j_3004];
                j_3004--;
            }
            array_3004[j_3004 + 1] = key;

            updateLabels_3004();
            stepLog.append("Hasil: ").append(arrayToString_3004(array_3004)).append("\n\n");
            stepArea_3004.append(stepLog.toString());

            i++;
            stepCount_3004++;

            if (i == array_3004.length) {
                sorting_3004 = false;
                stepButton_3004.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Sorting selesai!");
            }
        }
    }

    private void updateLabels_3004() {
        for (int k = 0; k < array_3004.length; k++) {
            labelArray_3004[k].setText(String.valueOf(array_3004[k]));
        }
    }

    private void reset_3004() {
        inputField_3004.setText("");
        panelArray_3004.removeAll();
        panelArray_3004.revalidate();
        panelArray_3004.repaint();
        stepArea_3004.setText("");
        stepButton_3004.setEnabled(false);
        sorting_3004 = false;
        i = 1;
        stepCount_3004 = 1;
    }

    private String arrayToString_3004(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < arr.length; k++) {
            sb.append(arr[k]);
            if (k < arr.length - 1) sb.append(", ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GUIinsertionsort_2511533004 gui = new GUIinsertionsort_2511533004();
            gui.setVisible(true);
        });
    }
}