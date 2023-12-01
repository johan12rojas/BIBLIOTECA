
package itp_library;

import java.awt.Color;

import javax.swing.JPanel;


public class Reports extends javax.swing.JPanel {

    private Dashboard dashboard;
    public Reports(Dashboard dashboard) {
        initComponents();
        this.dashboard = dashboard;
        
        libro.setText(dashboard.libroMasLeido());
        autor.setText(dashboard.autorMasLeido());
        genero.setText(dashboard.generoMasLeido());
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        genero = new javax.swing.JLabel();
        libro = new javax.swing.JLabel();
        autor = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Estadisticas");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itp_library/images/DIAGRAMA (1) (1).png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 340, 330));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("LIBRO MAS POPULAR ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("GENERO MAS LEIDO");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("AUTOR MAS LEIDO ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        genero.setBackground(new java.awt.Color(31, 171, 59));
        genero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        genero.setForeground(new java.awt.Color(255, 255, 255));
        genero.setOpaque(true);
        add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 280, 30));

        libro.setBackground(new java.awt.Color(31, 171, 59));
        libro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        libro.setForeground(new java.awt.Color(255, 255, 255));
        libro.setOpaque(true);
        add(libro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 280, 30));

        autor.setBackground(new java.awt.Color(31, 171, 59));
        autor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        autor.setForeground(new java.awt.Color(255, 255, 255));
        autor.setOpaque(true);
        add(autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 280, 30));
    }// </editor-fold>//GEN-END:initComponents

    void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JLabel autor;
    private javax.swing.JPanel body;
    private javax.swing.JLabel genero;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel libro;
    // End of variables declaration//GEN-END:variables
}
