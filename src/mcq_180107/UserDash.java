/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcq_180107;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author albert
 */
public class UserDash extends javax.swing.JFrame {
    
    String logged="";
    String loggedId="";
    /**
     * Creates new form UserDash
     */
    public UserDash() throws SQLException {
        
        
    }
    public void setVar(String s,String id) throws SQLException
    {
        this.logged=s;
        this.loggedId=id;
        initComponents();
        
        this.setLocationRelativeTo(null);
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cmbSubject = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dashboard");

        cmbSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSubjectActionPerformed(evt);
            }
        });

        jLabel3.setText("Select Subject");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(cmbSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(277, 277, 277))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSubject, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("Logged in as:");

        lblUser.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblUser))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLogout)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSubjectActionPerformed
        // TODO add your handling code here:
        jPanel4.removeAll();
        jPanel4.updateUI();
        if(cmbSubject.getSelectedItem()!=null){
            try {
                ResultSet rsSub=Connect.getResult("select * from subjects where name='"+cmbSubject.getSelectedItem()+"'");
                if(rsSub.next()){
                    ResultSet rs=Connect.getResult("select * from question_sets where subject_id="+rsSub.getInt("id")+"");
                    int x=10;
                    int y=10;
                    
                    while(rs.next()){
                        int id=rs.getInt("id");
                        
                        String setName=rs.getString("title");
                        int qCount=getQuestionCount(id);
                        ResultSet report=Connect.getResult("select * from reports where user_id="+loggedId+" AND question_set_id="+id+"");
                        
                        JButton j1=new JButton();
                        if(qCount<1){
                            j1.setEnabled(false);
                            
                        }
                        boolean chk=report.next();
                        if(chk){
                            j1.setForeground(Color.green);
                        }
                         
                        j1.addMouseListener(new MouseAdapter() {
                        @Override
                            public void mousePressed(MouseEvent e) {
                                if(qCount<1){
                                    JOptionPane.showMessageDialog(null, 
                                            "There are no question in this set right now. Please try again later.", 
                                            "Warning", JOptionPane.INFORMATION_MESSAGE);    
                                    
                                }
                                else{
                                    if(chk){
                                        int dialogButton = JOptionPane.YES_NO_OPTION;
                                        int dialogResult = JOptionPane.showConfirmDialog (null, 
                                                "You have already attempted this set. Do you want to view result of this set?",
                                                "Result?",dialogButton);
                                        if(dialogResult == JOptionPane.YES_OPTION){
                                            try {    
                                                JOptionPane.showMessageDialog(null, 
                                                        "User: "+logged+"\nTotal Question:"+report.getString("total_question")+"\n"
                                                                + "Correct Answer:"+report.getString("correct_answer")+"\n"
                                                                + "Percentage: "+report.getString("percentage")+"\n"
                                                                + "Result: "+report.getString("result")+" ", 
                                                        "Result", JOptionPane.INFORMATION_MESSAGE);
                                            } catch (SQLException ex) {
                                                Logger.getLogger(UserDash.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                    
                                        }
                                        
                                    }else{
                                        try {
                                            MCQ_Exam mc=new MCQ_Exam();
                                            mc.setVar(Integer.toString(id),logged,loggedId);

                                            mc.setVisible(true);
                                        } catch (SQLException ex) {
                                            Logger.getLogger(UserDash.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                        dispose();

                                        return;
                                    }
                                    
                                }
                            }
                        });
                        j1.setText(rs.getString("title"));
                        j1.setBounds(x,y,150,60);
                        jPanel4.add(j1);
                        if(x+150>jPanel4.getWidth()){
                            x=10;
                            y+=80;
                        }else{
                            x+=200;
                        }
                        
                        
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(UserDash.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_cmbSubjectActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        Login l=new Login();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed
    
    public int getQuestionCount(int id) throws SQLException
    {
        ResultSet r=Connect.getResult("select count(*) as count from questions where question_set_id="+id+"");
        if(r.next())
        {
            System.out.println(r.getInt("count"));
            return r.getInt("count");
        }
        return 0;
        
    }
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
            java.util.logging.Logger.getLogger(UserDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UserDash().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(UserDash.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void init() throws SQLException{
        
        lblUser.setText(this.logged);
        ResultSet rs = Connect.getResult("select * from subjects");
        
        while(rs.next())
        {
            cmbSubject.addItem(rs.getString("name"));
//            cmbSubject.set;
        }
//        cmbSubject.setSelectedItem(null);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JComboBox<String> cmbSubject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
}