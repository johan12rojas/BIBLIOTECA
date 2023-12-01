
package itp_library;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;


public class Returns extends javax.swing.JPanel {
    
    
    private Dashboard dashboard;
    public Returns(Dashboard dashboard) {
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
        nombreLibro = new javax.swing.JTextField();
        userr = new javax.swing.JTextField();
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
        Title.setText("Devolución de Libro");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Text1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text1.setText("Nombre del Libro");
        add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        Text2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text2.setText("Folio Usuario");
        add(Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 260, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 260, 10));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 10, 350));

        nombreLibro.setForeground(new java.awt.Color(102, 102, 102));
        nombreLibro.setText("Ingrese el Nombre del Libro a devolver");
        nombreLibro.setBorder(null);
        nombreLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreLibroMousePressed(evt);
            }
        });
        nombreLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreLibroActionPerformed(evt);
            }
        });
        add(nombreLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 260, 30));

        userr.setForeground(new java.awt.Color(102, 102, 102));
        userr.setText("Ingrese el folio del usuario");
        userr.setBorder(null);
        userr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userrMousePressed(evt);
            }
        });
        add(userr, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 260, 30));

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
        jLabel1.setText(" Devolver");
        button.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 260, 50));

        Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itp_library/images/pilas libros.png"))); // NOI18N
        Image.setMaximumSize(new java.awt.Dimension(750, 430));
        Image.setMinimumSize(new java.awt.Dimension(750, 430));
        add(Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void nombreLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreLibroActionPerformed

    private void userrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userrMousePressed
        if(userr.getText().equals("Ingrese el folio del usuario"))
        userr.setText("");
        if(nombreLibro.getText().equals("") || nombreLibro.getText() == null || nombreLibro.getText().equals(" "))
        nombreLibro.setText("Ingrese el Nombre del Libro a devolver");
    }//GEN-LAST:event_userrMousePressed

    private void nombreLibroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreLibroMousePressed
        if(nombreLibro.getText().equals("Ingrese el Nombre del Libro a devolver"))
        nombreLibro.setText("");
        if(userr.getText().equals("") || userr.getText() == null || userr.getText().equals(" "))
        userr.setText("Ingrese el folio del usuario");
    }//GEN-LAST:event_nombreLibroMousePressed

    private void buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseEntered
        setColor(button);
    }//GEN-LAST:event_buttonMouseEntered

    private void buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseExited
        resetColor(button);
    }//GEN-LAST:event_buttonMouseExited
    // DEVOLVER
    private void buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMousePressed
        
    }//GEN-LAST:event_buttonMousePressed

    private void buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseClicked
        String usuario=userr.getText().toLowerCase();
        String libro=nombreLibro.getText().toUpperCase();
        
        dashboard.returnBook(usuario, libro);
    }//GEN-LAST:event_buttonMouseClicked

    void setColor(JPanel panel){
        panel.setBackground(new Color(70,199,96));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(31,171,59));
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
    private javax.swing.JTextField nombreLibro;
    private javax.swing.JTextField userr;
    // End of variables declaration//GEN-END:variables
}
