package itp_library;

import static itp_library.Dashboard.content;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class UpUsers extends javax.swing.JPanel {
    
    private Dashboard dashboard;
     
    public UpUsers(Dashboard dashboard) {
        initComponents();
         this.dashboard = dashboard;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Text1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        tel = new javax.swing.JTextField();
        button = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Text3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Text4 = new javax.swing.JLabel();
        ap1 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Registrar nuevo Usuario");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Text1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text1.setText("Teléfono");
        add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 260, 10));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 10, 350));

        tel.setForeground(new java.awt.Color(102, 102, 102));
        tel.setText("Ingrese un número telefónico");
        tel.setBorder(null);
        tel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                telMousePressed(evt);
            }
        });
        tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telActionPerformed(evt);
            }
        });
        add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 260, 30));

        button.setBackground(new java.awt.Color(31, 171, 59));
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonMousePressed(evt);
            }
        });
        button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar");
        button.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 260, 50));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Nombre");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        name.setForeground(new java.awt.Color(102, 102, 102));
        name.setText("Ingrese el nombre");
        name.setBorder(null);
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nameMousePressed(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 260, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 260, 10));

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Código Estudiantil");
        add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        ap1.setForeground(new java.awt.Color(102, 102, 102));
        ap1.setText("Ingrese código estudiantil");
        ap1.setBorder(null);
        ap1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ap1MousePressed(evt);
            }
        });
        ap1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ap1ActionPerformed(evt);
            }
        });
        add(ap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 260, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator5.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 260, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itp_library/images/image-removebg-preview (22) (1).png"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 260, 200));
    }// </editor-fold>//GEN-END:initComponents

    private void telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telActionPerformed

    private void telMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telMousePressed
        if(tel.getText().equals("Ingrese un número telefónico"))
        tel.setText("");
        if(name.getText().equals("") || name.getText() == null || name.getText().equals(" "))
        name.setText("Ingrese el nombre");
        if(ap1.getText().equals("") || ap1.getText() == null || ap1.getText().equals(" "))
        ap1.setText("Ingrese código estudiantil");
    }//GEN-LAST:event_telMousePressed

    private void buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseEntered
        setColor(button);
    }//GEN-LAST:event_buttonMouseEntered

    private void buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseExited
        resetColor(button);
    }//GEN-LAST:event_buttonMouseExited

    private void nameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMousePressed
        if(name.getText().equals("Ingrese el nombre"))
        name.setText("");
        if(ap1.getText().equals("") || ap1.getText() == null || ap1.getText().equals(" "))
        ap1.setText("Ingrese código estudiantil");
        if(tel.getText().equals("") || tel.getText() == null || tel.getText().equals(" "))
        tel.setText("Ingrese un número telefónico");
    }//GEN-LAST:event_nameMousePressed

    private void ap1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ap1MousePressed
        if(ap1.getText().equals("Ingrese código estudiantil"))
        ap1.setText("");
        if(name.getText().equals("") || name.getText() == null || name.getText().equals(" "))
        name.setText("Ingrese el nombre");
        if(tel.getText().equals("") || tel.getText() == null || tel.getText().equals(" "))
        tel.setText("Ingrese un número telefónico");
    }//GEN-LAST:event_ap1MousePressed

    private void ap1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ap1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ap1ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed
    // REGISTRAR
    private void buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMousePressed
        
    }//GEN-LAST:event_buttonMousePressed

    private void buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseClicked
            String nombre = name.getText().toLowerCase();
            String password = ap1.getText().toLowerCase();
            String telefono = tel.getText().toLowerCase();
           

            if (nombre.isEmpty() || password.isEmpty() || telefono.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            } else {
                dashboard.addUser(nombre, password, telefono);

                // Limpiar los JTextField después de agregar el usuario
                name.setText("");
                ap1.setText("");
                tel.setText("");
            }

            Users p1 = new Users(dashboard);
            p1.setSize(750, 430);
            p1.setLocation(0, 0);

            dashboard.changePanel(p1);
    }//GEN-LAST:event_buttonMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        
    }//GEN-LAST:event_formMousePressed

    void setColor(JPanel panel){
        panel.setBackground(new Color(70,199,96));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(31,171,59));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField ap1;
    private javax.swing.JPanel body;
    private javax.swing.JPanel button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField name;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}
