/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcq_180107;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author albert
 */
public class AdminQuestion extends javax.swing.JFrame {
    int operation =0;
    int row=0;
    String qsId="4";
    String qId="";
    String subId="";
    
    public void setSubId(String id){
        this.subId=id;
        
        
    }
    public void setQsId(String id){
        this.qsId=id;
        loadData();
    }
    /**
     * Creates new form AdminQuestion
     */
    public AdminQuestion() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        reset();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtQuestion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        txtA1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtA3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtA2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtA4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbC = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Quesition", "Answer 1", "Answer 2", "Answer 3", "Answer 4", "Correct"
            }
        ));
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setShowVerticalLines(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel1.setText("Question");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("Add New");
        btnClear.setToolTipText("");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSave.setLabel("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Question Control");

        lblInfo.setForeground(new java.awt.Color(204, 0, 51));
        lblInfo.setText("jLabel4");

        jLabel2.setText("Answer a");

        jLabel4.setText("Answer c");

        jLabel5.setText("Answer b");

        jLabel6.setText("Answer d");

        cmbC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "a", "b", "c", "d" }));
        cmbC.setToolTipText("");

        jLabel7.setText("Corrct Answer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtA1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtA2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtA3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtA4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbC, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:

        btnDelete.setEnabled(true);

        operation=1;

        // code to set selected value on form

        int column = table.getColumnCount();
        row = table.getSelectedRow();

        if(row>=0)
        {
            btnDelete.setEnabled(true);
        }

        lblInfo.setText("Update or Delete the question set "+ table.getModel().getValueAt(row,1).toString());
        //         String value = table.getModel().getValueAt(row,0).toString();
        qId=table.getModel().getValueAt(row,0).toString();
        txtQuestion.setText(table.getModel().getValueAt(row,1).toString());
        
        txtA1.setText(table.getModel().getValueAt(row,2).toString());
        
        txtA2.setText(table.getModel().getValueAt(row,3).toString());
        
        txtA3.setText(table.getModel().getValueAt(row,4).toString());
        
        txtA4.setText(table.getModel().getValueAt(row,5).toString());
        
        cmbC.setSelectedItem(table.getModel().getValueAt(row,6).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdminQuestionSet aqc= new AdminQuestionSet();
        aqc.subId(subId);
        aqc.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if(operation==0)
        {
            JOptionPane.showMessageDialog(null, "No questions selected to delete.", "Delete", JOptionPane.ERROR_MESSAGE);
            return;
        }else{
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to delete this questions?","Warning",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                // Saving code here
                Connection con= Connect.getConnection();
                PreparedStatement pst = null;
                try {
                    pst = con.prepareStatement("delete from questions where id=?");

                    pst.setString(1, qId);
                    pst.executeUpdate();
                } catch (SQLException ex) {
                    Logger.getLogger(AdminQuestion.class.getName()).log(Level.SEVERE, null, ex);
                    return;
                }
                JOptionPane.showMessageDialog(null, "Question Deleted", "Deleted", JOptionPane.INFORMATION_MESSAGE);
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.removeRow(row);
                reset();
                return;
            }
            return;

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(operation==1){
            Connection con= Connect.getConnection();
           
            if(checkField()){
                try {

                    PreparedStatement pst= con.prepareStatement("update questions set question=?,answer_1=?,answer_2=?,answer_3=?,answer_4=?,correct_answer=? where id=?");
                    pst.setString(1, txtQuestion.getText());
                    pst.setString(2, txtA1.getText());
                    pst.setString(3, txtA2.getText());
                    pst.setString(4, txtA3.getText());
                    pst.setString(5, txtA4.getText());

                    pst.setString(6, cmbC.getSelectedItem().toString());

                    pst.setString(7,qId);
                    pst.executeUpdate();

                } catch (SQLException ex) {
                    Logger.getLogger(AdminQuestion.class.getName()).log(Level.SEVERE, null, ex);
                    ex.printStackTrace();

                }
                DefaultTableModel model = (DefaultTableModel) table.getModel();

                model.setValueAt(qId, row, 0);
                model.setValueAt(txtQuestion.getText(), row, 1);
                model.setValueAt(txtA1.getText(), row, 2);
                model.setValueAt(txtA2.getText(), row, 3);
                model.setValueAt(txtA3.getText(), row, 4);
                model.setValueAt(txtA4.getText(), row, 5);
                model.setValueAt(cmbC.getSelectedItem().toString(), row, 6);


                JOptionPane.showMessageDialog(null, "Successfully updated", "Updated", JOptionPane.INFORMATION_MESSAGE);
                reset();
                return;
                
            }else return;

            //

        }
        else{
            if(checkField()){
                
                Connection con= Connect.getConnection();
                PreparedStatement pst;
                try {
                    pst = con.prepareStatement("insert into questions (question_set_id,question,answer_1,answer_2,answer_3,answer_4,correct_answer) values (?,?,?,?,?,?,?)");
                    pst.setString(1, qsId);
                    
                    pst.setString(2, txtQuestion.getText());
                    
                    pst.setString(3, txtA1.getText());
                    pst.setString(4, txtA2.getText());
                    pst.setString(5, txtA3.getText());
                    pst.setString(6, txtA4.getText());
                    pst.setString(7, cmbC.getSelectedItem().toString());
                    pst.execute();

                } catch (SQLException ex) {
                    Logger.getLogger(AdminQuestion.class.getName()).log(Level.SEVERE, null, ex);
                    return;
                }
                ResultSet rs;
                int last_inserted_id=0;
                try {
                    rs = pst.getGeneratedKeys();
                    if(rs.next())
                    {
                        last_inserted_id = rs.getInt(1);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AdminQuestion.class.getName()).log(Level.SEVERE, null, ex);
                }

                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.addRow(new Object[]{last_inserted_id, txtQuestion.getText(),txtA1.getText(),txtA2.getText(),txtA3.getText(),txtA4.getText(),cmbC.getSelectedItem().toString()});
                JOptionPane.showMessageDialog(null, "Question Set Added Successfully", "Added", JOptionPane.INFORMATION_MESSAGE);
                reset();
                return;

                
            }

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminQuestion().setVisible(true);
            }
        });
    }
    
    public void reset()
    {
        lblInfo.setText("Please fill up the form to add new question set");
        qId="";
        txtQuestion.setText("");
        txtA1.setText("");
        txtA2.setText("");
        txtA3.setText("");
        txtA4.setText("");
        cmbC.setSelectedIndex(0);
        operation=0;
        btnDelete.setEnabled(false);
    }
    
    
    boolean checkField(){
        if(txtQuestion.getText().equals("") && txtA1.getText().equals("") && txtA2.getText().equals("") && txtA3.getText().equals("") && txtA4.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill all the field", "Error", JOptionPane.ERROR_MESSAGE);
            return false;	 
        }
        return true; 
    }
    
    void loadData()
    {
        
       try {
           java.sql.ResultSet rs;
           
           java.sql.ResultSet count;
           rs = Connect.getResult("SELECT q.id,q.question,q.answer_1,q.answer_2,q.answer_3,q.answer_4,q.correct_answer,qs.title from questions as q, question_sets as qs where q.question_set_id=qs.id and question_set_id="+qsId+"");
//           rs = Connect.getResult("SELECT * FROM `question_sets`");
           
           DefaultTableModel model = (DefaultTableModel) table.getModel();
           while(rs.next())
           {
            model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7)}); 
            jLabel3.setText("Question Control for "+rs.getString(8));
           }     
       } catch (SQLException ex) {
           Logger.getLogger(AdminSubject.class.getName()).log(Level.SEVERE, null, ex);
           ex.printStackTrace();
       }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbC;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtA1;
    private javax.swing.JTextField txtA2;
    private javax.swing.JTextField txtA3;
    private javax.swing.JTextField txtA4;
    private javax.swing.JTextField txtQuestion;
    // End of variables declaration//GEN-END:variables
}