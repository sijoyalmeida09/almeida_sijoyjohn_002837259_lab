/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.VitalSignHist;
import model.VitalSign;

/**
 *
 * @author sijoy
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    VitalSignHist history;
    public ViewJPanel(VitalSignHist history) {
        initComponents();
        this.history = history;
        populatetable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbltittle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblview = new javax.swing.JTable();
        btnview = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        txtdate = new javax.swing.JTextField();
        lblpressure = new javax.swing.JLabel();
        lbltemperature1 = new javax.swing.JLabel();
        lblpulse = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        txttemperature = new javax.swing.JTextField();
        txtpressure = new javax.swing.JTextField();
        txtpulse = new javax.swing.JTextField();

        lbltittle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbltittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltittle.setText("View Vital Events");

        tblview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "Temperature", "Pulse"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblview);

        btnview.setText("View");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        lblpressure.setText("Blood Pressure :");

        lbltemperature1.setText("Temperature :");

        lblpulse.setText("Pulse :");

        lbldate.setText("Date :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(lbltittle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblpulse)
                            .addComponent(lblpressure)
                            .addComponent(lbltemperature1)
                            .addComponent(lbldate))
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txttemperature)
                                .addComponent(txtpressure)
                                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtpulse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnview, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btndelete))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(148, 148, 148))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbltittle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnview)
                    .addComponent(btndelete))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltemperature1)
                    .addComponent(txttemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpressure)
                    .addComponent(txtpressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpulse)
                    .addComponent(txtpulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldate)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(190, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblview.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select the row to delete");
            return;
            
        }
        DefaultTableModel model = (DefaultTableModel) tblview.getModel();
        VitalSign selectedVital = (VitalSign) model.getValueAt(selectedRowIndex, 0);
        history.deleteVitals(selectedVital);
        JOptionPane.showMessageDialog(this, "Vital Sign deleted");
        populatetable();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        
         int selectedRowIndex = tblview.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select the row to delete");
            return;
            
        }
        DefaultTableModel model = (DefaultTableModel) tblview.getModel();
        VitalSign selectedVital = (VitalSign) model.getValueAt(selectedRowIndex, 0);
        
        txttemperature.setText(String.valueOf(selectedVital.getTemperature()));
         txtpressure.setText(String.valueOf(selectedVital.getBloodpressure()));
         txtpulse.setText(String.valueOf(selectedVital.getPulse()));
         txtdate.setText(selectedVital.getDate());
         
        
        
        
    }//GEN-LAST:event_btnviewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnview;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblpressure;
    private javax.swing.JLabel lblpulse;
    private javax.swing.JLabel lbltemperature1;
    private javax.swing.JLabel lbltittle;
    private javax.swing.JTable tblview;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtpressure;
    private javax.swing.JTextField txtpulse;
    private javax.swing.JTextField txttemperature;
    // End of variables declaration//GEN-END:variables

    private void populatetable() {
        
        DefaultTableModel model = (DefaultTableModel) tblview.getModel();
        model.setRowCount(0);
        
        for(VitalSign vs : history.getHistory()){
            Object[] row = new Object[3];
            row[0]= vs;
            row[1]= vs.getTemperature();
            row[2]= vs.getPulse();
            
            model.addRow(row);
            
            
            
        }
        
           }
}
