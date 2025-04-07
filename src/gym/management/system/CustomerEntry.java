package gym.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Dawood Khatri
 */
public class CustomerEntry extends javax.swing.JFrame {

    private JTextField trainerIDField;
        private JComboBox<String> morningAttendanceCombo;
        private JComboBox<String> eveningAttendanceCombo;
    /**
     * Creates new form CustomerEntry
     */
    public CustomerEntry() {
        initComponents();
            // Frame setup
            setTitle("Customer Attendance");
            setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel setup
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 2));

        // Components setup
        JLabel trainerIDLabel = new JLabel("Customer ID:");
        trainerIDField = new JTextField();

        JLabel morningLabel = new JLabel("Morning Time:");
        morningAttendanceCombo = new JComboBox<>(new String[]{"Absent", "Present"});

        JLabel eveningLabel = new JLabel("Evening Time:");
        eveningAttendanceCombo = new JComboBox<>(new String[]{"Absent", "Present"});

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitAttendance();
            }
        });

        // Add components to panel
        mainPanel.add(trainerIDLabel);
        mainPanel.add(trainerIDField);

        mainPanel.add(morningLabel);
        mainPanel.add(morningAttendanceCombo);

        mainPanel.add(eveningLabel);
        mainPanel.add(eveningAttendanceCombo);

        mainPanel.add(new JLabel()); // Empty label for spacing
        mainPanel.add(submitButton);

        // Set layout and add panel to frame
        setLayout(new BorderLayout());
        add(mainPanel, BorderLayout.CENTER);
    }

    private void submitAttendance() {
                
    }                                    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
