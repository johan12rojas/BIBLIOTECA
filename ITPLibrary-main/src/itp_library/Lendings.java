
package itp_library;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JPanel;


public class Lendings extends javax.swing.JPanel {
    
    private final Dashboard dashboard;
    public Lendings(Dashboard dashboard) {
        initComponents();
        this.dashboard = dashboard;
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Text1 = new javax.swing.JLabel();
        Text2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        nameLibro = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        button = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Nuevo Préstamo");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Text1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text1.setText("Nombre del libro");
        add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        Text2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text2.setText("Usuario");
        add(Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 260, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 260, 10));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 10, 350));

        nameLibro.setForeground(new java.awt.Color(102, 102, 102));
        nameLibro.setText("Ingresa Nombre del Libro");
        nameLibro.setBorder(null);
        nameLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nameLibroMousePressed(evt);
            }
        });
        nameLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameLibroActionPerformed(evt);
            }
        });
        add(nameLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 260, 30));

        user.setForeground(new java.awt.Color(102, 102, 102));
        user.setText("Ingrese usuario");
        user.setBorder(null);
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userMousePressed(evt);
            }
        });
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 260, 30));

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
        jLabel1.setText("Prestar");
        button.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 260, 50));

        Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itp_library/images/prestamo2 (1).png"))); // NOI18N
        Image.setMaximumSize(new java.awt.Dimension(750, 430));
        Image.setMinimumSize(new java.awt.Dimension(750, 430));
        add(Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 270, 310));
    }// </editor-fold>//GEN-END:initComponents

    private void nameLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameLibroActionPerformed

    private void userMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMousePressed
       if(user.getText().equals("Ingrese usuario"))
        user.setText("");
       if(nameLibro.getText().equals("") || nameLibro.getText() == null || nameLibro.getText().equals(" "))
        nameLibro.setText("Ingresa Nombre del Libro");
    }//GEN-LAST:event_userMousePressed

    private void nameLibroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameLibroMousePressed
        if(nameLibro.getText().equals("Ingresa Nombre del Libro"))
            nameLibro.setText("");
        if(user.getText().equals("") || user.getText() == null || user.getText().equals(" "))
            user.setText("Ingrese usuario");
    }//GEN-LAST:event_nameLibroMousePressed

    private void buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseEntered
        setColor(button);
    }//GEN-LAST:event_buttonMouseEntered

    private void buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseExited
        resetColor(button);
    }//GEN-LAST:event_buttonMouseExited
    
    private void buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMousePressed
        
    }//GEN-LAST:event_buttonMousePressed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseClicked
        String userr=user.getText().toLowerCase();
        String nombreL=nameLibro.getText().toUpperCase();
        
        dashboard.loanBook(userr,nombreL );
        
        user.setText("");
        nameLibro.setText("");
    }//GEN-LAST:event_buttonMouseClicked

    void setColor(JPanel panel){
        panel.setBackground(new Color(70,199,96));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(31,171,59));
    }
    
    
    public static String getFechaActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        return formateador.format(ahora);
    }
    
    public static java.sql.Date sumarFechasDias(java.util.Date fch, int dias) {
        Calendar cal = new GregorianCalendar();
        cal.setTimeInMillis(fch.getTime());
        cal.add(Calendar.DATE, dias);
        return new java.sql.Date(cal.getTimeInMillis());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JPanel button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField nameLibro;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
