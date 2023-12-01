package itp_library;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class Users extends javax.swing.JPanel {
    
    private Dashboard dashboard;
    public Users(Dashboard dashboard) {
        
        initComponents();
        this.dashboard = dashboard;
        dashboard.mostrarTodosLosUsuarios(txtAreaUsers);
    }
    
    private void showNewUserPanel() {
    UpUsers p1 = new UpUsers(dashboard);
    p1.setSize(750, 430);
    p1.setLocation(0, 0);
    
    dashboard.changePanel(p1);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        usrnm = new javax.swing.JTextField();
        delete = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nuevo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaUsers = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Usuarios");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(250, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 620, 10));

        usrnm.setForeground(new java.awt.Color(102, 102, 102));
        usrnm.setText("Ingrese el nombre de usuario a buscar");
        usrnm.setBorder(null);
        usrnm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usrnmMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                usrnmMouseReleased(evt);
            }
        });
        add(usrnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 620, 30));

        delete.setBackground(new java.awt.Color(31, 171, 59));
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteMousePressed(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Borrar");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        delete.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 80, -1));

        nuevo.setBackground(new java.awt.Color(31, 171, 59));
        nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nuevoMousePressed(evt);
            }
        });
        nuevo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nuevo");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        nuevo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        add(nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 80, -1));

        txtAreaUsers.setEditable(false);
        txtAreaUsers.setBackground(new java.awt.Color(70, 73, 75));
        txtAreaUsers.setColumns(20);
        txtAreaUsers.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtAreaUsers.setForeground(new java.awt.Color(204, 204, 204));
        txtAreaUsers.setRows(5);
        txtAreaUsers.setText("Usuarios encontrados");
        txtAreaUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(txtAreaUsers);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 460, 280));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itp_library/images/icono.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 220, 240));

        btnSearch.setBackground(new java.awt.Color(31, 171, 59));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 0, 0));
        btnSearch.setText("Buscar");
        btnSearch.setOpaque(true);
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchMouseEntered(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 90, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void usrnmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usrnmMousePressed
        if(usrnm.getText().equals("Ingrese el nombre de usuario a buscar"))
        usrnm.setText("");
    }//GEN-LAST:event_usrnmMousePressed

    private void nuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoMouseEntered

    private void nuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoMouseExited

    private void nuevoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoMousePressed
        showNewUserPanel();
    }//GEN-LAST:event_nuevoMousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        showNewUserPanel();
    }//GEN-LAST:event_jLabel3MousePressed

    private void usrnmMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usrnmMouseReleased
        //nothing
    }//GEN-LAST:event_usrnmMouseReleased

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       
        txtAreaUsers.setText(dashboard.searchUser(usrnm.getText()));
    }//GEN-LAST:event_btnSearchActionPerformed

//GEN-FIRST:event_deleteMousePressed
    private void deleteMousePressed(java.awt.event.MouseEvent evt) {                                   
        resetColor(delete);
    }
//GEN-LAST:event_deleteMousePressed

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        resetColor(delete);
    }//GEN-LAST:event_deleteMouseExited

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        setColor(delete);
    }//GEN-LAST:event_deleteMouseEntered

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        setColor(delete);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        resetColor(delete);
    }//GEN-LAST:event_jLabel1MouseExited

    private void btnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseEntered
        
    }//GEN-LAST:event_btnSearchMouseEntered

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        setColor(nuevo);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        resetColor(nuevo);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
      
        if(!usrnm.getText().isEmpty()){
            dashboard.DeleteUser(usrnm.getText());
            usrnm.setText("Ingrese el nombre de usuario a buscar");
            dashboard.mostrarTodosLosUsuarios(txtAreaUsers);
        }else{
            JOptionPane.showMessageDialog(null, "User not found");
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    void setColor(JPanel panel){
        panel.setBackground(new Color(84,236,114));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(31,171,59));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel nuevo;
    private javax.swing.JTextArea txtAreaUsers;
    private javax.swing.JTextField usrnm;
    // End of variables declaration//GEN-END:variables
}
