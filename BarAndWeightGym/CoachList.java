/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BarAndWeightGym;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author memon
 */
public class CoachList extends javax.swing.JFrame {

    /**
     * Creates new form MemberList
     */
    public CoachList() {
        initComponents();
        displayCoach();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CBackBtn = new javax.swing.JButton();
        CDeleteBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        CTable.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        CTable.setForeground(new java.awt.Color(51, 0, 255));
        CTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        CTable.setRowHeight(28);
        CTable.setShowGrid(true);
        CTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CTable);

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\memon\\OneDrive\\Desktop\\Abdul gani DVOC\\Java Dvoc\\java_dvoc_lec\\src\\main\\java\\BarAndWeightGym\\images\\logo_1_sm.png")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 255));
        jLabel4.setText("Coach List");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(309, 309, 309)
                .addComponent(jLabel4))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        CBackBtn.setBackground(new java.awt.Color(255, 153, 153));
        CBackBtn.setFont(new java.awt.Font("Comic Sans MS", 0, 22)); // NOI18N
        CBackBtn.setForeground(new java.awt.Color(51, 0, 255));
        CBackBtn.setText("Back");
        CBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBackBtnActionPerformed(evt);
            }
        });

        CDeleteBtn1.setBackground(new java.awt.Color(255, 153, 153));
        CDeleteBtn1.setFont(new java.awt.Font("Comic Sans MS", 0, 22)); // NOI18N
        CDeleteBtn1.setForeground(new java.awt.Color(51, 0, 255));
        CDeleteBtn1.setText("Delete");
        CDeleteBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CDeleteBtn1MouseClicked(evt);
            }
        });
        CDeleteBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDeleteBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(CBackBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CDeleteBtn1)
                .addGap(152, 152, 152))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBackBtn)
                    .addComponent(CDeleteBtn1))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // for header customization - not working
//    private void theader() {
//        JTableHeader th = CTable.getTableHeader();
//        th.setForeground(Color.[51, 0, 255
//        ]);
//        th.setFont(new Font("Comic Sans MS ", Font.BOLD, 18));
//        TableColumn col1 = CTable.getColumnModel().getColumn(0);
//    }
    // displaying coach details
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null, rs1 = null;
    Statement st = null, st1 = null;

    private void displayCoach() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root", "BILALirfan@313");
            st = con.createStatement();
            rs = st.executeQuery("select * from coach");
            CTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
        }
    }
    private void CBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBackBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new CoachPage().setVisible(true);
    }//GEN-LAST:event_CBackBtnActionPerformed

    private void CDeleteBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDeleteBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CDeleteBtn1ActionPerformed

    int key = 0;
    private void CTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) CTable.getModel();
        int myIndex = CTable.getSelectedRow();
        key = Integer.parseInt(model.getValueAt(myIndex, 0).toString());
    }//GEN-LAST:event_CTableMouseClicked

    private void CDeleteBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CDeleteBtn1MouseClicked
        // TODO add your handling code here:
        if (key == 0) {
            JOptionPane.showMessageDialog(this, "Please select the coach to delete");
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym", "root", "BILALirfan@313");
                String query = ("Delete from Coach where CId = " + key);
                Statement del = con.createStatement();
                del.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Coach Deleted");
                displayCoach();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_CDeleteBtn1MouseClicked

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
            java.util.logging.Logger.getLogger(CoachList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoachList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoachList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoachList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoachList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CBackBtn;
    private javax.swing.JButton CDeleteBtn1;
    private javax.swing.JTable CTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
