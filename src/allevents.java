/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * allevents.java
 *
 * Created on 17 Oct, 2011, 11:08:58 PM
 */

/**
 *
 * @author Home
 */
import javax.swing.*;
import java.sql.*;
import javax.swing.table.*;
public class allevents extends javax.swing.JFrame {

    /** Creates new form allevents */
    public allevents() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Events", "Date", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb2);
        if (tb2.getColumnModel().getColumnCount() > 0) {
            tb2.getColumnModel().getColumn(0).setResizable(false);
            tb2.getColumnModel().getColumn(1).setResizable(false);
            tb2.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 400, 100));

        b2.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Back.PNG"))); // NOI18N
        b2.setText("Back");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        b1.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Download.PNG"))); // NOI18N
        b1.setText("Load Data");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        b3.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete.PNG"))); // NOI18N
        b3.setText("Delete Events");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setText("EVENTS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 210, 80));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stunning_003.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
new todolist().setVisible(true);
dispose();
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
DefaultTableModel tb=(DefaultTableModel)tb2.getModel();
tb.setRowCount(0);
String sql;
sql="Select*from todolist;";
try
{
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","info");
    Statement s=con.createStatement();
    ResultSet rs=s.executeQuery(sql);
    while(rs.next()==true)
    {
        String event=rs.getString(1);
        String date=rs.getString(2);
        String time=rs.getString(3);
        tb.addRow(new Object[]{event,date,time});
    }
    rs.close();
    s.close();
    con.close();

    }
    catch(Exception e)
{JOptionPane.showMessageDialog(this,e.getMessage());
    }
    }//GEN-LAST:event_b1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
     new delevent().setVisible(true);
dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new allevents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb2;
    // End of variables declaration//GEN-END:variables

}
