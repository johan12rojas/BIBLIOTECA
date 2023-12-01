
package itp_library;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class UpBooks extends javax.swing.JPanel {

    
    private Dashboard dashboard;
    public UpBooks(Dashboard dashboard) {
        initComponents();
        this.dashboard = dashboard;
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        button = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Text3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Text6 = new javax.swing.JLabel();
        titu = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        Text7 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        Text8 = new javax.swing.JLabel();
        author = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        Text9 = new javax.swing.JLabel();
        category = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        edit = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        Text10 = new javax.swing.JLabel();
        Text4 = new javax.swing.JLabel();
        lang = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Text11 = new javax.swing.JLabel();
        pages = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        Text13 = new javax.swing.JLabel();
        cantida = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        available = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        Text15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Subir nuevo Libro");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 10, 350));

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
        jLabel1.setText("Subir");
        button.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 30));

        add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 260, 50));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Libro ID");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        id.setForeground(new java.awt.Color(102, 102, 102));
        id.setText("Ingrese el ID del Libro");
        id.setBorder(null);
        id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                idMousePressed(evt);
            }
        });
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 260, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 260, 10));

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("Título");
        add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        titu.setForeground(new java.awt.Color(102, 102, 102));
        titu.setText("Ingrese el Título");
        titu.setBorder(null);
        titu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tituMousePressed(evt);
            }
        });
        titu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituActionPerformed(evt);
            }
        });
        add(titu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 260, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 260, 10));

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("Fecha de Publicación");
        add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        date.setForeground(new java.awt.Color(102, 102, 102));
        date.setText("Ingrese la Fecha de Publicación");
        date.setBorder(null);
        date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dateMousePressed(evt);
            }
        });
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 260, 30));

        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 260, 10));

        Text8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text8.setText("Autor");
        add(Text8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        author.setForeground(new java.awt.Color(102, 102, 102));
        author.setText("Ingrese el nombre del Autor/es");
        author.setBorder(null);
        author.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                authorMousePressed(evt);
            }
        });
        author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorActionPerformed(evt);
            }
        });
        add(author, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 260, 30));

        jSeparator9.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator9.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 260, 10));

        Text9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text9.setText("Categoría");
        add(Text9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        category.setForeground(new java.awt.Color(102, 102, 102));
        category.setText("Ingrese la Categoría del Libro");
        category.setBorder(null);
        category.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                categoryMousePressed(evt);
            }
        });
        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });
        add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 260, 30));

        jSeparator10.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator10.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 260, 10));

        edit.setForeground(new java.awt.Color(102, 102, 102));
        edit.setText("Ingrese la edición");
        edit.setBorder(null);
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editMousePressed(evt);
            }
        });
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 260, 30));

        jSeparator11.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator11.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 260, 10));

        Text10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text10.setText("Edición");
        add(Text10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Idioma");
        add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        lang.setForeground(new java.awt.Color(102, 102, 102));
        lang.setText("Ingrese el idioma del Libro");
        lang.setBorder(null);
        lang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                langMousePressed(evt);
            }
        });
        lang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                langActionPerformed(evt);
            }
        });
        add(lang, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 260, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator5.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 260, 10));

        Text11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text11.setText("Páginas");
        add(Text11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        pages.setForeground(new java.awt.Color(102, 102, 102));
        pages.setText("Ingrese la cantidad de páginas totales");
        pages.setBorder(null);
        pages.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pagesMousePressed(evt);
            }
        });
        pages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagesActionPerformed(evt);
            }
        });
        add(pages, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 260, 30));

        jSeparator12.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator12.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 260, 10));

        jSeparator13.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator13.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 260, 10));

        Text13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text13.setText("Stock");
        add(Text13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        cantida.setForeground(new java.awt.Color(102, 102, 102));
        cantida.setText("Cantidad Total");
        cantida.setBorder(null);
        cantida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cantidaMousePressed(evt);
            }
        });
        cantida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidaActionPerformed(evt);
            }
        });
        add(cantida, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 80, 30));

        jSeparator14.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator14.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 80, 10));

        available.setForeground(new java.awt.Color(102, 102, 102));
        available.setText("Cantidad a prestar");
        available.setBorder(null);
        available.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                availableMousePressed(evt);
            }
        });
        available.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableActionPerformed(evt);
            }
        });
        add(available, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 100, 30));

        jSeparator16.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator16.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 100, 10));

        Text15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text15.setText("Disponibles");
        add(Text15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, -1));

        jLabel2.setText("CANTIDADES ENTERAS");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 130, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseEntered
        setColor(button);
    }//GEN-LAST:event_buttonMouseEntered

    private void buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseExited
        resetColor(button);
    }//GEN-LAST:event_buttonMouseExited

    private void idMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMousePressed
       if(id.getText().equals("Ingrese el ID del Libro"))
        id.setText("");
       if(titu.getText().equals("") || titu.getText() == null || titu.getText().equals(" "))
        titu.setText("Ingrese el Título");
       if(date.getText().equals("") || date.getText() == null || date.getText().equals(" "))
        date.setText("Ingrese la Fecha de Publicación");
       if(author.getText().equals("") || author.getText() == null || author.getText().equals(" "))
        author.setText("Ingrese el nombre del Autor/es");
       if(category.getText().equals("") || category.getText() == null || category.getText().equals(" "))
        category.setText("Ingrese la Categoría del Libro");
       if(edit.getText().equals("") || edit.getText() == null || edit.getText().equals(" "))
        edit.setText("Ingrese la edición");
       if(lang.getText().equals("") || lang.getText() == null || lang.getText().equals(" "))
        lang.setText("Ingrese el idioma del Libro");
       if(pages.getText().equals("") || pages.getText() == null || pages.getText().equals(" "))
        pages.setText("Ingrese la cantidad de páginas totales");
       
       if(cantida.getText().equals("") || cantida.getText() == null || cantida.getText().equals(" "))
        cantida.setText("Cantidad Total");
       if(available.getText().equals("") || available.getText() == null || available.getText().equals(" "))
        available.setText("Cantidad a prestar");

    }//GEN-LAST:event_idMousePressed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void tituMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituMousePressed
        if(titu.getText().equals("Ingrese el Título"))
        titu.setText("");
       if(id.getText().equals("") || id.getText() == null || id.getText().equals(" "))
        id.setText("Ingrese el ID del Libro");
       if(date.getText().equals("") || date.getText() == null || date.getText().equals(" "))
        date.setText("Ingrese la Fecha de Publicación");
       if(author.getText().equals("") || author.getText() == null || author.getText().equals(" "))
        author.setText("Ingrese el nombre del Autor/es");
       if(category.getText().equals("") || category.getText() == null || category.getText().equals(" "))
        category.setText("Ingrese la Categoría del Libro");
       if(edit.getText().equals("") || edit.getText() == null || edit.getText().equals(" "))
        edit.setText("Ingrese la edición");
       if(lang.getText().equals("") || lang.getText() == null || lang.getText().equals(" "))
        lang.setText("Ingrese el idioma del Libro");
       if(pages.getText().equals("") || pages.getText() == null || pages.getText().equals(" "))
        pages.setText("Ingrese la cantidad de páginas totales");
       
       if(cantida.getText().equals("") || cantida.getText() == null || cantida.getText().equals(" "))
        cantida.setText("Cantidad Total");
       if(available.getText().equals("") || available.getText() == null || available.getText().equals(" "))
        available.setText("Cantidad a prestar");

    }//GEN-LAST:event_tituMousePressed

    private void tituActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituActionPerformed

    private void dateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMousePressed
        if(date.getText().equals("Ingrese la Fecha de Publicación"))
        date.setText("");
       if(id.getText().equals("") || id.getText() == null || id.getText().equals(" "))
        id.setText("Ingrese el ID del Libro");
       if(titu.getText().equals("") || titu.getText() == null || titu.getText().equals(" "))
        titu.setText("Ingrese el Título");
       if(author.getText().equals("") || author.getText() == null || author.getText().equals(" "))
        author.setText("Ingrese el nombre del Autor/es");
       if(category.getText().equals("") || category.getText() == null || category.getText().equals(" "))
        category.setText("Ingrese la Categoría del Libro");
       if(edit.getText().equals("") || edit.getText() == null || edit.getText().equals(" "))
        edit.setText("Ingrese la edición");
       if(lang.getText().equals("") || lang.getText() == null || lang.getText().equals(" "))
        lang.setText("Ingrese el idioma del Libro");
       if(pages.getText().equals("") || pages.getText() == null || pages.getText().equals(" "))
        pages.setText("Ingrese la cantidad de páginas totales");
       
       if(cantida.getText().equals("") || cantida.getText() == null || cantida.getText().equals(" "))
        cantida.setText("Cantidad Total");
       if(available.getText().equals("") || available.getText() == null || available.getText().equals(" "))
        available.setText("Cantidad a prestar");

    }//GEN-LAST:event_dateMousePressed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void authorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authorMousePressed
        if(author.getText().equals("Ingrese el nombre del Autor/es"))
        author.setText("");
       if(id.getText().equals("") || id.getText() == null || id.getText().equals(" "))
        id.setText("Ingrese el ID del Libro");
       if(titu.getText().equals("") || titu.getText() == null || titu.getText().equals(" "))
        titu.setText("Ingrese el Título");
       if(date.getText().equals("") || date.getText() == null || date.getText().equals(" "))
        date.setText("Ingrese la Fecha de Publicación");
       if(category.getText().equals("") || category.getText() == null || category.getText().equals(" "))
        category.setText("Ingrese la Categoría del Libro");
       if(edit.getText().equals("") || edit.getText() == null || edit.getText().equals(" "))
        edit.setText("Ingrese la edición");
       if(lang.getText().equals("") || lang.getText() == null || lang.getText().equals(" "))
        lang.setText("Ingrese el idioma del Libro");
       if(pages.getText().equals("") || pages.getText() == null || pages.getText().equals(" "))
        pages.setText("Ingrese la cantidad de páginas totales");
       
       if(cantida.getText().equals("") || cantida.getText() == null || cantida.getText().equals(" "))
        cantida.setText("Cantidad Total");
       if(available.getText().equals("") || available.getText() == null || available.getText().equals(" "))
        available.setText("Cantidad a prestar");

    }//GEN-LAST:event_authorMousePressed

    private void authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorActionPerformed

    private void categoryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryMousePressed
        if(category.getText().equals("Ingrese la Categoría del Libro"))
        category.setText("");
       if(id.getText().equals("") || id.getText() == null || id.getText().equals(" "))
        id.setText("Ingrese el ID del Libro");
       if(titu.getText().equals("") || titu.getText() == null || titu.getText().equals(" "))
        titu.setText("Ingrese el Título");
       if(date.getText().equals("") || date.getText() == null || date.getText().equals(" "))
        date.setText("Ingrese la Fecha de Publicación");
       if(author.getText().equals("") || author.getText() == null || author.getText().equals(" "))
        author.setText("Ingrese el nombre del Autor/es");
       if(edit.getText().equals("") || edit.getText() == null || edit.getText().equals(" "))
        edit.setText("Ingrese la edición");
       if(lang.getText().equals("") || lang.getText() == null || lang.getText().equals(" "))
        lang.setText("Ingrese el idioma del Libro");
       if(pages.getText().equals("") || pages.getText() == null || pages.getText().equals(" "))
        pages.setText("Ingrese la cantidad de páginas totales");
       
       if(cantida.getText().equals("") || cantida.getText() == null || cantida.getText().equals(" "))
        cantida.setText("Cantidad Total");
       if(available.getText().equals("") || available.getText() == null || available.getText().equals(" "))
        available.setText("Cantidad a prestar");

    }//GEN-LAST:event_categoryMousePressed

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryActionPerformed

    private void editMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMousePressed
        if(edit.getText().equals("Ingrese la edición"))
        edit.setText("");
       if(id.getText().equals("") || id.getText() == null || id.getText().equals(" "))
        id.setText("Ingrese el ID del Libro");
       if(titu.getText().equals("") || titu.getText() == null || titu.getText().equals(" "))
        titu.setText("Ingrese el Título");
       if(date.getText().equals("") || date.getText() == null || date.getText().equals(" "))
        date.setText("Ingrese la Fecha de Publicación");
       if(author.getText().equals("") || author.getText() == null || author.getText().equals(" "))
        author.setText("Ingrese el nombre del Autor/es");
       if(category.getText().equals("") || category.getText() == null || category.getText().equals(" "))
        category.setText("Ingrese la Categoría del Libro");
       if(lang.getText().equals("") || lang.getText() == null || lang.getText().equals(" "))
        lang.setText("Ingrese el idioma del Libro");
       if(pages.getText().equals("") || pages.getText() == null || pages.getText().equals(" "))
        pages.setText("Ingrese la cantidad de páginas totales");
      
       if(cantida.getText().equals("") || cantida.getText() == null || cantida.getText().equals(" "))
        cantida.setText("Cantidad Total");
       if(available.getText().equals("") || available.getText() == null || available.getText().equals(" "))
        available.setText("Cantidad a prestar");

    }//GEN-LAST:event_editMousePressed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editActionPerformed

    private void langMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_langMousePressed
       if(lang.getText().equals("Ingrese el idioma del Libro"))
        lang.setText("");
       if(id.getText().equals("") || id.getText() == null || id.getText().equals(" "))
        id.setText("Ingrese el ID del Libro");
       if(titu.getText().equals("") || titu.getText() == null || titu.getText().equals(" "))
        titu.setText("Ingrese el Título");
       if(date.getText().equals("") || date.getText() == null || date.getText().equals(" "))
        date.setText("Ingrese la Fecha de Publicación");
       if(author.getText().equals("") || author.getText() == null || author.getText().equals(" "))
        author.setText("Ingrese el nombre del Autor/es");
       if(category.getText().equals("") || category.getText() == null || category.getText().equals(" "))
        category.setText("Ingrese la Categoría del Libro");
       if(edit.getText().equals("") || edit.getText() == null || edit.getText().equals(" "))
        edit.setText("Ingrese la edición");
       if(pages.getText().equals("") || pages.getText() == null || pages.getText().equals(" "))
        pages.setText("Ingrese la cantidad de páginas totales");
       
       if(cantida.getText().equals("") || cantida.getText() == null || cantida.getText().equals(" "))
        cantida.setText("Cantidad Total");
       if(available.getText().equals("") || available.getText() == null || available.getText().equals(" "))
        available.setText("Cantidad a prestar");

    }//GEN-LAST:event_langMousePressed

    private void langActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_langActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_langActionPerformed

    private void pagesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagesMousePressed
        if(pages.getText().equals("Ingrese la cantidad de páginas totales"))
        pages.setText("");
       if(id.getText().equals("") || id.getText() == null || id.getText().equals(" "))
        id.setText("Ingrese el ID del Libro");
       if(titu.getText().equals("") || titu.getText() == null || titu.getText().equals(" "))
        titu.setText("Ingrese el Título");
       if(date.getText().equals("") || date.getText() == null || date.getText().equals(" "))
        date.setText("Ingrese la Fecha de Publicación");
       if(author.getText().equals("") || author.getText() == null || author.getText().equals(" "))
        author.setText("Ingrese el nombre del Autor/es");
       if(category.getText().equals("") || category.getText() == null || category.getText().equals(" "))
        category.setText("Ingrese la Categoría del Libro");
       if(edit.getText().equals("") || edit.getText() == null || edit.getText().equals(" "))
        edit.setText("Ingrese la edición");
       if(lang.getText().equals("") || lang.getText() == null || lang.getText().equals(" "))
        lang.setText("Ingrese el idioma del Libro");
       
       if(cantida.getText().equals("") || cantida.getText() == null || cantida.getText().equals(" "))
        cantida.setText("Cantidad Total");
       if(available.getText().equals("") || available.getText() == null || available.getText().equals(" "))
        available.setText("Cantidad a prestar");

    }//GEN-LAST:event_pagesMousePressed

    private void pagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagesActionPerformed

    private void cantidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantidaMousePressed
        if(cantida.getText().equals("Cantidad Total"))
        cantida.setText("");
       if(id.getText().equals("") || id.getText() == null || id.getText().equals(" "))
        id.setText("Ingrese el ID del Libro");
       if(titu.getText().equals("") || titu.getText() == null || titu.getText().equals(" "))
        titu.setText("Ingrese el Título");
       if(date.getText().equals("") || date.getText() == null || date.getText().equals(" "))
        date.setText("Ingrese la Fecha de Publicación");
       if(author.getText().equals("") || author.getText() == null || author.getText().equals(" "))
        author.setText("Ingrese el nombre del Autor/es");
       if(category.getText().equals("") || category.getText() == null || category.getText().equals(" "))
        category.setText("Ingrese la Categoría del Libro");
       if(edit.getText().equals("") || edit.getText() == null || edit.getText().equals(" "))
        edit.setText("Ingrese la edición");
       if(lang.getText().equals("") || lang.getText() == null || lang.getText().equals(" "))
        lang.setText("Ingrese el idioma del Libro");
       if(pages.getText().equals("") || pages.getText() == null || pages.getText().equals(" "))
        pages.setText("Ingrese la cantidad de páginas totales");
       
       if(available.getText().equals("") || available.getText() == null || available.getText().equals(" "))
        available.setText("Cantidad a prestar");

    }//GEN-LAST:event_cantidaMousePressed

    private void cantidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidaActionPerformed

    private void availableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_availableMousePressed
        if(available.getText().equals("Cantidad a prestar"))
        available.setText("");
       if(id.getText().equals("") || id.getText() == null || id.getText().equals(" "))
        id.setText("Ingrese el ID del Libro");
       if(titu.getText().equals("") || titu.getText() == null || titu.getText().equals(" "))
        titu.setText("Ingrese el Título");
       if(date.getText().equals("") || date.getText() == null || date.getText().equals(" "))
        date.setText("Ingrese la Fecha de Publicación");
       if(author.getText().equals("") || author.getText() == null || author.getText().equals(" "))
        author.setText("Ingrese el nombre del Autor/es");
       if(category.getText().equals("") || category.getText() == null || category.getText().equals(" "))
        category.setText("Ingrese la Categoría del Libro");
       if(edit.getText().equals("") || edit.getText() == null || edit.getText().equals(" "))
        edit.setText("Ingrese la edición");
       if(lang.getText().equals("") || lang.getText() == null || lang.getText().equals(" "))
        lang.setText("Ingrese el idioma del Libro");
       if(pages.getText().equals("") || pages.getText() == null || pages.getText().equals(" "))
        pages.setText("Ingrese la cantidad de páginas totales");
       
       if(cantida.getText().equals("") || cantida.getText() == null || cantida.getText().equals(" "))
        cantida.setText("Cantidad Total");

    }//GEN-LAST:event_availableMousePressed

    private void availableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableActionPerformed

    }//GEN-LAST:event_availableActionPerformed

    // SUBIR
    private void buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMousePressed
        
    }//GEN-LAST:event_buttonMousePressed

    private void buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseClicked
        String codigo = id.getText();
        String titulo = titu.getText().toUpperCase();
        String fecha = date.getText();
        String autor = author.getText();
        String categoria = category.getText();
        String edicion = edit.getText();
        String idioma = lang.getText();
        String paginas = pages.getText();
        int stock = Integer.parseInt(cantida.getText());  
        int disponibles = Integer.parseInt(available.getText());  

        if (codigo.isEmpty() || titulo.isEmpty() || fecha.isEmpty() || autor.isEmpty() || categoria.isEmpty()
                || edicion.isEmpty() || idioma.isEmpty() || paginas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
        } else {
            dashboard.addBook(codigo, titulo, fecha, autor, categoria, edicion, idioma, paginas, stock, disponibles);

            id.setText("");
            titu.setText("");
            date.setText("");
            author.setText("");
            category.setText("");
            edit.setText("");
            lang.setText("");
            pages.setText("");
            cantida.setText("");
            available.setText("");
        }
        
        Books p1 = new Books(dashboard);
        p1.setSize(750, 430);
        p1.setLocation(0, 0);

        dashboard.changePanel(p1);
    }//GEN-LAST:event_buttonMouseClicked

    void setColor(JPanel panel){
        panel.setBackground(new Color(70,199,96));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(31,171,59));
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text10;
    private javax.swing.JLabel Text11;
    private javax.swing.JLabel Text13;
    private javax.swing.JLabel Text15;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Text8;
    private javax.swing.JLabel Text9;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField author;
    private javax.swing.JTextField available;
    private javax.swing.JPanel body;
    private javax.swing.JPanel button;
    private javax.swing.JTextField cantida;
    private javax.swing.JTextField category;
    private javax.swing.JTextField date;
    private javax.swing.JTextField edit;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField lang;
    private javax.swing.JTextField pages;
    private javax.swing.JTextField titu;
    // End of variables declaration//GEN-END:variables
}
