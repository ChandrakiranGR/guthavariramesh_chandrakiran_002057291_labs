/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.VitalSigns;
import model.VitalSignsHistory;

/**
 *
 * @author chandrkiran
 */
public class ViewJPanel extends javax.swing.JPanel {

    VitalSignsHistory vitalSignsHistory;
    /**
     * Creates new form ViewJPanel
     */
    public ViewJPanel(VitalSignsHistory vitalSignsHistory) {
        initComponents();
        this.vitalSignsHistory = vitalSignsHistory;
        
        populateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblViewTitle = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        lblTemperature = new javax.swing.JLabel();
        lblBloodPressure = new javax.swing.JLabel();
        lblPulse = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        txtBloodPressure = new javax.swing.JTextField();
        txtPulse = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVitals = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(857, 518));

        lblViewTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblViewTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewTitle.setText("View Vital Signs");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblTemperature.setText("Temperature");

        lblBloodPressure.setText("Blood Pressure");

        lblPulse.setText("Pulse");

        lblDate.setText("Date");

        txtTemperature.setEditable(false);

        txtBloodPressure.setEditable(false);

        txtPulse.setEditable(false);

        txtDate.setEditable(false);

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        tblVitals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Temperature", "Blood Pressure", "Pulse"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVitals);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblViewTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnView)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(11, 11, 11))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBloodPressure, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPulse, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTemperature, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(385, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtBloodPressure, txtDate, txtPulse, txtTemperature});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblBloodPressure, lblDate, lblPulse, lblTemperature});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblViewTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemperature)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloodPressure)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPulse)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(161, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tblVitals.getSelectedRow();
        
        if (selectedIndex <0){
            JOptionPane.showMessageDialog(this, "Please select a row first ", "Warning !!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblVitals.getModel();
        VitalSigns selectedVitals = (VitalSigns) model.getValueAt(selectedIndex,0);
        
        if(selectedVitals != null){
            txtTemperature.setText(Double.toString(selectedVitals.getTemperature()));
            txtBloodPressure.setText(Double.toString(selectedVitals.getBloodPressure()));
            txtPulse.setText(Integer.toString(selectedVitals.getPulse()));
            txtDate.setText(selectedVitals.getDate());
        }
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tblVitals.getSelectedRow();
        
        if (selectedIndex <0){
            JOptionPane.showMessageDialog(this, "Please select a row first ", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblVitals.getModel();
        VitalSigns selectedVitals = (VitalSigns) model.getValueAt(selectedIndex,0);
        
        if(selectedVitals != null){
            vitalSignsHistory.removeVitals(selectedVitals);
            JOptionPane.showMessageDialog(this, "Vital Sign Deleted", "Success", JOptionPane.INFORMATION_MESSAGE);
            txtTemperature.setText("");
            txtBloodPressure.setText("");
            txtPulse.setText("");
            txtDate.setText("");
        }
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblTemperature;
    private javax.swing.JLabel lblViewTitle;
    private javax.swing.JTable tblVitals;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblVitals.getModel();
        model.setRowCount(0);
        
        for(VitalSigns vs: vitalSignsHistory.getHistory()){
            
            Object[] row = new Object[4];
            row[0] = vs;
            row[1] = vs.getTemperature();
            row[2] = vs.getBloodPressure();
            row[3] = vs.getPulse();
            
            model.addRow(row);
        }
    }
}