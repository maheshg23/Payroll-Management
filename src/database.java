/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * database.java
 *
 * Created on Aug 24, 2011, 1:37:10 PM
 */

/**
 *
 * @author Administrator
 */
import javax.swing.*;
import java.sql.*;
import javax.swing.table.*;
import java.util.Date;
public class database extends javax.swing.JFrame {

    /** Creates new form database */
    public database() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        b1 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DATABASE");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Download.PNG"))); // NOI18N
        b1.setText("Download Data");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, -1, -1));

        b5.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Home.PNG"))); // NOI18N
        b5.setText("Main Page");
        b5.setOpaque(false);
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, -1, 40));

        b2.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Insert.PNG"))); // NOI18N
        b2.setText("Insert");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        b3.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete.PNG"))); // NOI18N
        b3.setText("Delete");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        b4.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Update2.PNG"))); // NOI18N
        b4.setText("Update");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Data By", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Curlz MT", 0, 24), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel1.setOpaque(false);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Empno");
        jRadioButton1.setOpaque(false);
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Emp Name");
        jRadioButton2.setOpaque(false);
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2ItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("DOB");
        jRadioButton3.setOpaque(false);
        jRadioButton3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton3ItemStateChanged(evt);
            }
        });
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("DOJ");
        jRadioButton4.setOpaque(false);
        jRadioButton4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton4ItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Designation");
        jRadioButton5.setOpaque(false);
        jRadioButton5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton5ItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("Salary");
        jRadioButton6.setOpaque(false);
        jRadioButton6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton6ItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setText("Leaves");
        jRadioButton7.setOpaque(false);
        jRadioButton7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton7ItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setText("Rating");
        jRadioButton8.setOpaque(false);
        jRadioButton8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton8ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton8)
                            .addComponent(jRadioButton7))))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton8))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 250, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("DATABASE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 350, -1));

        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Empno", "Empname", "DOB", "DOJ", "Age", "Designation", "Salary", "Leaves", "Salary Due", "Rating"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb2.setOpaque(false);
        jScrollPane1.setViewportView(tb2);
        if (tb2.getColumnModel().getColumnCount() > 0) {
            tb2.getColumnModel().getColumn(0).setResizable(false);
            tb2.getColumnModel().getColumn(1).setResizable(false);
            tb2.getColumnModel().getColumn(2).setResizable(false);
            tb2.getColumnModel().getColumn(3).setResizable(false);
            tb2.getColumnModel().getColumn(4).setResizable(false);
            tb2.getColumnModel().getColumn(5).setResizable(false);
            tb2.getColumnModel().getColumn(6).setResizable(false);
            tb2.getColumnModel().getColumn(7).setResizable(false);
            tb2.getColumnModel().getColumn(8).setResizable(false);
            tb2.getColumnModel().getColumn(9).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 750, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Capture5.PNG"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
DefaultTableModel tb=(DefaultTableModel)tb2.getModel();
tb.setRowCount(0);
String sql;
sql="Select*from payroll1;";
try
{
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","info");
    Statement s=con.createStatement();
    ResultSet rs=s.executeQuery(sql);
    while(rs.next()==true)
    {
        int empno=rs.getInt(1);
        String name=rs.getString(2);
        String dob=rs.getString(3);
        String admn=rs.getString(4);
        String designation=rs.getString(5);
        float salary=rs.getFloat(6);
        int leave=rs.getInt(7);
        int rating=rs.getInt(8);
       float perday=0.0f,total=0.0f;
       perday=salary/30;
       total=salary-(leave*perday);
   
        Date d2 = new Date();
         String d1 = ""+d2;
          String a1 = d1.substring(24,28);
          int a =Integer.parseInt(a1);
          String g1 =""+dob;
          String d3 =g1.substring(0,4);
          int b=Integer.parseInt(d3);
           int age = a-b;
       tb.addRow(new Object[]{empno,name,dob,admn,age,designation,salary,leave,total,rating});
    }
    rs.close();
    s.close();
    con.close();

    }
    catch(Exception e)
{JOptionPane.showMessageDialog(this,e.getMessage());
    }

    }//GEN-LAST:event_b1ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
new main().setVisible(true);
dispose();

    }//GEN-LAST:event_b5ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
new insert().setVisible(true);
dispose();

    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
new delete().setVisible(true);
dispose();

    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
new update().setVisible(true);
dispose();

    }//GEN-LAST:event_b4ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
     
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
DefaultTableModel tb=(DefaultTableModel)tb2.getModel();
tb.setRowCount(0);
String sql;
sql="Select*from payroll1 order by EmpNo;";
try
{
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","info");
    Statement s=con.createStatement();
    ResultSet rs=s.executeQuery(sql);
    while(rs.next()==true)
    {
        int empno=rs.getInt(1);
        String name=rs.getString(2);
        String dob=rs.getString(3);
        String admn=rs.getString(4);
        String designation=rs.getString(5);
        float salary=rs.getFloat(6);
        int leave=rs.getInt(7);
        int rating=rs.getInt(8);
       float perday=0.0f,total=0.0f;
       perday=salary/30;
       total=salary-(leave*perday);

       Date d2 = new Date();
         String d1 = ""+d2;
          String a1 = d1.substring(24,28);
          int a =Integer.parseInt(a1);
          String g1 =""+dob;
          String d3 =g1.substring(0,4);
          int b=Integer.parseInt(d3);
           int age = a-b;
       tb.addRow(new Object[]{empno,name,dob,admn,age,designation,salary,leave,total,rating});
    }
    rs.close();
    s.close();
    con.close();

    }
    catch(Exception e)
{JOptionPane.showMessageDialog(this,e.getMessage());
    }
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
DefaultTableModel tb=(DefaultTableModel)tb2.getModel();
tb.setRowCount(0);
String sql;
sql="Select*from payroll1 order by name;";
try
{
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","info");
    Statement s=con.createStatement();
    ResultSet rs=s.executeQuery(sql);
    while(rs.next()==true)
    {
        int empno=rs.getInt(1);
        String name=rs.getString(2);
        String dob=rs.getString(3);
        String admn=rs.getString(4);
        String designation=rs.getString(5);
        float salary=rs.getFloat(6);
        int leave=rs.getInt(7);
        int rating=rs.getInt(8);
       float perday=0.0f,total=0.0f;
       perday=salary/30;
       total=salary-(leave*perday);
        Date d2 = new Date();
         String d1 = ""+d2;
          String a1 = d1.substring(24,28);
          int a =Integer.parseInt(a1);
          String g1 =""+dob;
          String d3 =g1.substring(0,4);
          int b=Integer.parseInt(d3);
           int age = a-b;
       tb.addRow(new Object[]{empno,name,dob,admn,age,designation,salary,leave,total,rating});
    }
    rs.close();
    s.close();
    con.close();

    }
    catch(Exception e)
{JOptionPane.showMessageDialog(this,e.getMessage());
    }
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3ItemStateChanged
DefaultTableModel tb=(DefaultTableModel)tb2.getModel();
tb.setRowCount(0);
String sql;
sql="Select*from payroll1 order by dob;";
try
{
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","info");
    Statement s=con.createStatement();
    ResultSet rs=s.executeQuery(sql);
    while(rs.next()==true)
    {
        int empno=rs.getInt(1);
        String name=rs.getString(2);
        String dob=rs.getString(3);
        String admn=rs.getString(4);
        String designation=rs.getString(5);
        float salary=rs.getFloat(6);
        int leave=rs.getInt(7);
        int rating=rs.getInt(8);
       float perday=0.0f,total=0.0f;
       perday=salary/30;
       total=salary-(leave*perday);

       Date d2 = new Date();
         String d1 = ""+d2;
          String a1 = d1.substring(24,28);
          int a =Integer.parseInt(a1);
          String g1 =""+dob;
          String d3 =g1.substring(0,4);
          int b=Integer.parseInt(d3);
           int age = a-b;
       tb.addRow(new Object[]{empno,name,dob,admn,age,designation,salary,leave,total,rating});
    }
    rs.close();
    s.close();
    con.close();

    }
    catch(Exception e)
{JOptionPane.showMessageDialog(this,e.getMessage());
    }
    }//GEN-LAST:event_jRadioButton3ItemStateChanged

    private void jRadioButton4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton4ItemStateChanged
DefaultTableModel tb=(DefaultTableModel)tb2.getModel();
tb.setRowCount(0);
String sql;
sql="Select*from payroll1 order by doj desc;";
try
{
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","info");
    Statement s=con.createStatement();
    ResultSet rs=s.executeQuery(sql);
    while(rs.next()==true)
    {
        int empno=rs.getInt(1);
        String name=rs.getString(2);
        String dob=rs.getString(3);
        String admn=rs.getString(4);
        String designation=rs.getString(5);
        float salary=rs.getFloat(6);
        int leave=rs.getInt(7);
        int rating=rs.getInt(8);
       float perday=0.0f,total=0.0f;
       perday=salary/30;
       total=salary-(leave*perday);

        Date d2 = new Date();
         String d1 = ""+d2;
          String a1 = d1.substring(24,28);
          int a =Integer.parseInt(a1);
          String g1 =""+dob;
          String d3 =g1.substring(0,4);
          int b=Integer.parseInt(d3);
           int age = a-b;
       tb.addRow(new Object[]{empno,name,dob,admn,age,designation,salary,leave,total,rating});
    }
    rs.close();
    s.close();
    con.close();

    }
    catch(Exception e)
{JOptionPane.showMessageDialog(this,e.getMessage());
    }
    }//GEN-LAST:event_jRadioButton4ItemStateChanged

    private void jRadioButton5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton5ItemStateChanged
DefaultTableModel tb=(DefaultTableModel)tb2.getModel();
tb.setRowCount(0);
String sql;
sql="Select*from payroll1 order by designation;";
try
{
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","info");
    Statement s=con.createStatement();
    ResultSet rs=s.executeQuery(sql);
    while(rs.next()==true)
    {
        int empno=rs.getInt(1);
        String name=rs.getString(2);
        String dob=rs.getString(3);
        String admn=rs.getString(4);
        String designation=rs.getString(5);
        float salary=rs.getFloat(6);
        int leave=rs.getInt(7);
        int rating=rs.getInt(8);
       float perday=0.0f,total=0.0f;
       perday=salary/30;
       total=salary-(leave*perday);

       Date d2 = new Date();
         String d1 = ""+d2;
          String a1 = d1.substring(24,28);
          int a =Integer.parseInt(a1);
          String g1 =""+dob;
          String d3 =g1.substring(0,4);
          int b=Integer.parseInt(d3);
           int age = a-b;
       tb.addRow(new Object[]{empno,name,dob,admn,age,designation,salary,leave,total,rating});
    }
    rs.close();
    s.close();
    con.close();

    }
    catch(Exception e)
{JOptionPane.showMessageDialog(this,e.getMessage());
    }
    }//GEN-LAST:event_jRadioButton5ItemStateChanged

    private void jRadioButton6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton6ItemStateChanged
DefaultTableModel tb=(DefaultTableModel)tb2.getModel();
tb.setRowCount(0);
String sql;
sql="Select*from payroll1 order by salary desc;";
try
{
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","info");
    Statement s=con.createStatement();
    ResultSet rs=s.executeQuery(sql);
    while(rs.next()==true)
    {
        int empno=rs.getInt(1);
        String name=rs.getString(2);
        String dob=rs.getString(3);
        String admn=rs.getString(4);
        String designation=rs.getString(5);
        float salary=rs.getFloat(6);
        int leave=rs.getInt(7);
        int rating=rs.getInt(8);
       float perday=0.0f,total=0.0f;
       perday=salary/30;
       total=salary-(leave*perday);

        Date d2 = new Date();
         String d1 = ""+d2;
          String a1 = d1.substring(24,28);
          int a =Integer.parseInt(a1);
          String g1 =""+dob;
          String d3 =g1.substring(0,4);
          int b=Integer.parseInt(d3);
           int age = a-b;
       tb.addRow(new Object[]{empno,name,dob,admn,age,designation,salary,leave,total,rating});
    }
    rs.close();
    s.close();
    con.close();

    }
    catch(Exception e)
{JOptionPane.showMessageDialog(this,e.getMessage());
    }
    }//GEN-LAST:event_jRadioButton6ItemStateChanged

    private void jRadioButton7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton7ItemStateChanged
DefaultTableModel tb=(DefaultTableModel)tb2.getModel();
tb.setRowCount(0);
String sql;
sql="Select*from payroll1 order by leaves_in_month desc;";
try
{
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","info");
    Statement s=con.createStatement();
    ResultSet rs=s.executeQuery(sql);
    while(rs.next()==true)
    {
        int empno=rs.getInt(1);
        String name=rs.getString(2);
        String dob=rs.getString(3);
        String admn=rs.getString(4);
        String designation=rs.getString(5);
        float salary=rs.getFloat(6);
        int leave=rs.getInt(7);
        int rating=rs.getInt(8);
       float perday=0.0f,total=0.0f;
       perday=salary/30;
       total=salary-(leave*perday);
        Date d2 = new Date();
         String d1 = ""+d2;
          String a1 = d1.substring(24,28);
          int a =Integer.parseInt(a1);
          String g1 =""+dob;
          String d3 =g1.substring(0,4);
          int b=Integer.parseInt(d3);
           int age = a-b;
       tb.addRow(new Object[]{empno,name,dob,admn,age,designation,salary,leave,total,rating});
    }
    rs.close();
    s.close();
    con.close();

    }
    catch(Exception e)
{JOptionPane.showMessageDialog(this,e.getMessage());
    }
    }//GEN-LAST:event_jRadioButton7ItemStateChanged

    private void jRadioButton8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton8ItemStateChanged
DefaultTableModel tb=(DefaultTableModel)tb2.getModel();
tb.setRowCount(0);
String sql;
sql="Select*from payroll1 order by ratings desc;";
try
{
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","info");
    Statement s=con.createStatement();
    ResultSet rs=s.executeQuery(sql);
    while(rs.next()==true)
    {
        int empno=rs.getInt(1);
        String name=rs.getString(2);
        String dob=rs.getString(3);
        String admn=rs.getString(4);
        String designation=rs.getString(5);
        float salary=rs.getFloat(6);
        int leave=rs.getInt(7);
        int rating=rs.getInt(8);
       float perday=0.0f,total=0.0f;
       perday=salary/30;
       total=salary-(leave*perday);

        Date d2 = new Date();
         String d1 = ""+d2;
          String a1 = d1.substring(24,28);
          int a =Integer.parseInt(a1);
          String g1 =""+dob;
          String d3 =g1.substring(0,4);
          int b=Integer.parseInt(d3);
           int age = a-b;
       tb.addRow(new Object[]{empno,name,dob,admn,age,designation,salary,leave,total,rating});
    }
    rs.close();
    s.close();
    con.close();

    }
    catch(Exception e)
{JOptionPane.showMessageDialog(this,e.getMessage());
    }
    }//GEN-LAST:event_jRadioButton8ItemStateChanged

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new database().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb2;
    // End of variables declaration//GEN-END:variables

}