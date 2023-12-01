package itp_library;

import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Dashboard extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    
    //LISTAS PARA USUARIOS
    public List<String> usersNames = new ArrayList();
    public List<String> passWords = new ArrayList();
    public List<String> numbers = new ArrayList();
    public List<Integer> prestamos= new ArrayList();
    public String name="";
    
    //LISTAS PARA LIBROS
    public List<String> code = new ArrayList();
    public List<String> title = new ArrayList();
    public List<String> fechA = new ArrayList();
    public List<String> autor = new ArrayList();
    public List<String> categoria = new ArrayList();
    public List<String> edicion = new ArrayList();
    public List<String> idioma = new ArrayList();
    public List<String> paginas = new ArrayList();
    public List<Integer> stock = new ArrayList();
    public List<Integer> disponibles = new ArrayList();
    
    
    public Dashboard() {
        initComponents();
        this.setLocationRelativeTo(this);
        

        
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto"," ;Septiembre"
            ,"Octubre","Noviembre","Diciemrbre"};
        fecha.setText("Hoy es "+dia+" de "+meses[month - 1]+" de "+year);
        
        addUsers();
        addPass();
        addNums();
        addPrestamos();
        code();
        title();
        fechA();
        autor();
        categoria();
        edicion();
        idioma();
        paginas();
        stock();
        disponibles();
        
        
        Principal p1 = new Principal();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    //meotodos de añadir Usuarios
    private void addUsers(){
        usersNames.add("johan rojas");
        usersNames.add("alejandro pinilla");
        usersNames.add("klivert chiquiza");
        usersNames.add("kenny mccormick");
        usersNames.add("cristiano ronaldo");
        usersNames.add("lionel messi");
        usersNames.add("dominik toreto");
        usersNames.add("james rodriguez");
        usersNames.add("mbappe");
    }
    
    private void addPass(){
        passWords.add("domingo14");
        passWords.add("ronaldinho10");
        passWords.add("hesoyam");
        passWords.add("equisde");
        passWords.add("baretico420");
        passWords.add("regalitos.com");
        passWords.add("la Familia Lo es Todo");
        passWords.add("inch20");
        passWords.add("codigo345");
    }
    
    private void addNums(){
        numbers.add("3126754543");
        numbers.add("3005478902");
        numbers.add("3219870430");
        numbers.add("3136578900");
        numbers.add("3145678813");
        numbers.add("3126754553");
        numbers.add("3005470902");
        numbers.add("3219270430");
        numbers.add("3936578900");
        numbers.add("3145672813");
    }
    
    private void addPrestamos(){
        prestamos.add(0);
        prestamos.add(0);
        prestamos.add(0);
        prestamos.add(0);
        prestamos.add(0);
        prestamos.add(0);
        prestamos.add(0);
        prestamos.add(0);
        prestamos.add(0);
        prestamos.add(0);
    }
    
    public String searchUser(String user){
        name = "";
        int indx=0;
        for(int i=0;i<usersNames.size();i++){
            if(user.toLowerCase().equals(usersNames.get(i))){
                name = usersNames.get(i);
                indx = i;
            }
        }
        if(name.equals("")){
            return "Usuario no encontrado";
            
        }
        return "\n\n\tUsuario encontrado: "+name.toUpperCase()+"\n\n\n\t"+"Número telefónico: "+numbers.get(indx)+"\n\n\n\t"+"Codigo Estudiantil: "+passWords.get(indx)+"\n\n\n\t"+"Prestamos Realizados: "+prestamos.get(indx);
    }
    
    public void DeleteUser(String user){ 
        name = "";
        for(int i=0;i<usersNames.size();i++){
            if(user.toLowerCase().equals(usersNames.get(i))){
                name = usersNames.get(i);
                usersNames.remove(i);
                passWords.remove(i);
                numbers.remove(i);
                prestamos.remove(i);
                JOptionPane.showMessageDialog(null, "¡Usuario eliminado!");
            }
        }
    }
    
    public void mostrarTodosLosUsuarios(JTextArea txtAreaUsers) {
        StringBuilder result = new StringBuilder();
        result.append("************************ USUARIOS REGISTRADOS **************************");
        result.append("\n------------------------------------------------------------------------------------------");

        for (int i = 0; i < usersNames.size(); i++) {
            result.append("\n\n\tUsuario: ").append(usersNames.get(i).toUpperCase());
            result.append("\n\n\n\tNúmero telefónico: ").append(numbers.get(i));
            result.append("\n\n\n\tCodigo Estudiantil: ").append(passWords.get(i));
            result.append("\n\n\n\tPrestamos Realizados: ").append(prestamos.get(i).toString());
            result.append("\n------------------------------------------------------------------------------------------");
        }
        
        txtAreaUsers.setText(result.toString());
    }
    
    public void addUser(String user, String pass, String tel){
    if (!usersNames.contains(user)) {
        usersNames.add(user);
        passWords.add(pass);
        numbers.add(tel);
        prestamos.add(0);
        JOptionPane.showMessageDialog(null, "¡Usuario añadido con éxito!");
    } else {
        JOptionPane.showMessageDialog(null, "¡El usuario ya existe!");}
    }
    
    public void changePanel(JPanel newPanel) {
        content.removeAll();
        content.add(newPanel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    //metodos de añadir libros
    
    private void code(){
        code.add("4432");
        code.add("1122");
        code.add("3222");
        code.add("9900");
        code.add("0011");
        code.add("2234");
        code.add("1234");
        code.add("5566");
        code.add("1122");
    }
    
    private void title(){
        title.add("Programacion Avanzada".toUpperCase());
        title.add("Psicologia".toUpperCase());
        title.add("Derecho Penal".toUpperCase());
        title.add("Python Inicial".toUpperCase());
        title.add("Calculo I".toUpperCase());
        title.add("Calculo II".toUpperCase());
        title.add("Multivariable".toUpperCase());
        title.add("Cien Años de Soledad".toUpperCase());
        title.add("Maria".toUpperCase());
    }
    
    private void fechA(){
        fechA.add("09/02/2005");
        fechA.add("22/09/2013");
        fechA.add("15/04/2005");
        fechA.add("01/01/2020");
        fechA.add("27/07/2005");
        fechA.add("18/11/2009");
        fechA.add("23/02/2022");
        fechA.add("30/10/2007");
        fechA.add("01/02/2014");
    }
    
    private void autor(){
        autor.add("Programador A");
        autor.add("Mateo Perez");
        autor.add("Juan Villalba");
        autor.add("Miguel");
        autor.add("Profesor C");
        autor.add("Profesor C");
        autor.add("Profesor C");
        autor.add("Gabriel G.");
        autor.add("Escritor A");
    }
    
    private void categoria(){
        categoria.add("Educativo");
        categoria.add("Educativo");
        categoria.add("Educativo");
        categoria.add("Educativo");
        categoria.add("Educativo");
        categoria.add("Educativo");
        categoria.add("Educativo");
        categoria.add("Lectura/Clasico");
        categoria.add("Educativo");
    }
    
    private void edicion(){
        edicion.add("A");
        edicion.add("B");
        edicion.add("C");
        edicion.add("D");
        edicion.add("E");
        edicion.add("F");
        edicion.add("G");
        edicion.add("H");
        edicion.add("I");
    }
    
    private void idioma(){
        idioma.add("Español");
        idioma.add("Español");
        idioma.add("Español");
        idioma.add("Español");
        idioma.add("Español");
        idioma.add("Español");
        idioma.add("Español");
        idioma.add("Español");
        idioma.add("Español");
    }
    
    private void paginas(){
        paginas.add("230");
        paginas.add("300");
        paginas.add("180");
        paginas.add("240");
        paginas.add("190");
        paginas.add("150");
        paginas.add("380");
        paginas.add("400");
        paginas.add("287");
    }
    
    private void stock(){
        stock.add(5);
        stock.add(3);
        stock.add(4);
        stock.add(10);
        stock.add(6);
        stock.add(5);
        stock.add(1);
        stock.add(6);
        stock.add(4);
    }
    
    private void disponibles(){
        disponibles.add(4);
        disponibles.add(3);
        disponibles.add(1);
        disponibles.add(2);
        disponibles.add(2);
        disponibles.add(2);
        disponibles.add(1);
        disponibles.add(6);
        disponibles.add(4);
    }
    
    public void showAllBooks(JTextArea areaLibro) {
    StringBuilder result = new StringBuilder();
    result.append("\tLIBROS REGISTRADOS:");
    result.append("\n--------------------------------------------------------------------------------------");

    for (int i = 0; i < code.size(); i++) {
        result.append("\n\n\tCódigo: ").append(code.get(i));
        result.append("\n\n\n\tTítulo: ").append(title.get(i));
        result.append("\n\n\n\tFecha de publicación: ").append(fechA.get(i));
        result.append("\n\n\n\tAutor: ").append(autor.get(i));
        result.append("\n\n\n\tCategoría: ").append(categoria.get(i));
        result.append("\n\n\n\tEdición: ").append(edicion.get(i));
        result.append("\n\n\n\tIdioma: ").append(idioma.get(i));
        result.append("\n\n\n\tPáginas: ").append(paginas.get(i));
        result.append("\n\n\n\tStock total: ").append(stock.get(i));
        result.append("\n\n\n\tDisponibles: ").append(disponibles.get(i));
        result.append("\n--------------------------------------------------------------------------------------");
    }
    areaLibro.setText(result.toString());
    }
    
    public String searchBookByCode(String bookCode) {
    String result = "";
    int index = -1;

    for (int i = 0; i < code.size(); i++) {
        if (bookCode.equals(code.get(i))) {
            index = i;
            break;
        }
    }

    if (index != -1) {
        result += "\n\n\tCódigo: " + code.get(index);
        result += "\n\n\n\tTítulo: " + title.get(index);
        result += "\n\n\n\tFecha de publicación: " + fechA.get(index);
        result += "\n\n\n\tAutor: " + autor.get(index);
        result += "\n\n\n\tCategoría: " + categoria.get(index);
        result += "\n\n\n\tEdición: " + edicion.get(index);
        result += "\n\n\n\tIdioma: " + idioma.get(index);
        result += "\n\n\n\tPáginas: " + paginas.get(index);
        result += "\n\n\n\tStock total: " + stock.get(index);
        result += "\n\n\n\tDisponibles: " + disponibles.get(index);
    } else {
        result = "Libro no encontrado";
    }

    return result;
    }
    
    public void addBook(String codigo, String titulo, String fecha, String auto, String categori,
                    String edicio, String idiom, String pagina, int stoc, int disponible) {
    
        if (code.contains(codigo)) {
            JOptionPane.showMessageDialog(null, "¡El libro ya existe!");
            return; 
        }

        if (disponible > stoc) {
            JOptionPane.showMessageDialog(null, "¡La cantidad disponibles no puede ser mayor que el stock!");
            return; 
        }

        // Agregar el nuevo libro a las listas
        code.add(codigo);
        title.add(titulo);
        fechA.add(fecha);
        autor.add(auto);
        categoria.add(categori);
        edicion.add(edicio);
        idioma.add(idiom);
        paginas.add(pagina);
        stock.add(stoc);
        disponibles.add(disponible);

        JOptionPane.showMessageDialog(null, "¡Libro añadido con éxito!");
    }
    
    public void deleteBook(String codigo) {
        int index = code.indexOf(codigo);

        if (index != -1) {

            code.remove(index);
            title.remove(index);
            fechA.remove(index);
            autor.remove(index);
            categoria.remove(index);
            edicion.remove(index);
            idioma.remove(index);
            paginas.remove(index);
            stock.remove(index);
            disponibles.remove(index);

            JOptionPane.showMessageDialog(null, "¡Libro eliminado con éxito!");
        } else {
            JOptionPane.showMessageDialog(null, "¡El libro con el código " + codigo + " no existe!");
        }
    }
    
    public void loanBook(String usuario, String nombreLibro) {
        int indexUsuario = usersNames.indexOf(usuario);

        if (indexUsuario != -1) {
            int indexLibro = title.indexOf(nombreLibro);

            if (indexLibro != -1) {
                int disponiblesLibro = disponibles.get(indexLibro);

                if (disponiblesLibro > 0) {
                    disponibles.set(indexLibro, disponiblesLibro - 1);

                    int prestamosUsuario = prestamos.get(indexUsuario);
                    prestamos.set(indexUsuario, prestamosUsuario + 1);

                    String nombreUsuario = usuario + ", Debe un Libro";

                    JOptionPane.showMessageDialog(null, "¡Préstamo realizado con éxito!\nUsuario: " + nombreUsuario);
                } else {
                    JOptionPane.showMessageDialog(null, "¡El libro '" + nombreLibro + "' no está disponible!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "¡El libro '" + nombreLibro + "' no existe!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "¡El usuario '" + usuario + "' no existe!");
        }
    }
    
    public void returnBook(String usuario, String nombreLibro) {
        int indexUsuario = usersNames.indexOf(usuario);

        if (indexUsuario != -1) {
            int indexLibro = title.indexOf(nombreLibro);

            if (indexLibro != -1) {
                int prestamosUsuario = prestamos.get(indexUsuario);

                if (prestamosUsuario > 0) {
                    prestamos.set(indexUsuario, prestamosUsuario - 1);

                    int disponiblesLibro = disponibles.get(indexLibro);
                    disponibles.set(indexLibro, disponiblesLibro + 1);

                    JOptionPane.showMessageDialog(null, "¡Devolución realizada con éxito!");
                } else {
                    JOptionPane.showMessageDialog(null, "¡El usuario '" + usuario + "' no tiene libros prestados!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "¡El libro '" + nombreLibro + "' no existe!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "¡El usuario '" + usuario + "' no existe!");
        }
    }
    
    public String autorMasLeido() {
        HashMap<String, Integer> contadorAutores = new HashMap<>();

        for (String autor : autor) {
            contadorAutores.put(autor, contadorAutores.getOrDefault(autor, 0) + 1);
        }

        String autorMasLeido = "";
        int maxContador = 0;

        for (Map.Entry<String, Integer> entry : contadorAutores.entrySet()) {
            int contador = entry.getValue();
            if (contador > maxContador) {
                maxContador = contador;
                autorMasLeido = entry.getKey();
            }
        }

        return "\t"+autorMasLeido;
    }

    public String libroMasLeido() {
        String libroMasLeido = "";
        int maxPrestamos = 0;

        for (int i = 0; i < title.size(); i++) {
            int prestamos = stock.get(i) - disponibles.get(i);
            if (prestamos > maxPrestamos) {
                maxPrestamos = prestamos;
                libroMasLeido = title.get(i);
            }
        }

        return "\t"+libroMasLeido;
    }

    public String generoMasLeido() {
        HashMap<String, Integer> contadorGeneros = new HashMap<>();

        for (String genero : categoria) {
            contadorGeneros.put(genero, contadorGeneros.getOrDefault(genero, 0) + 1);
        }

        String generoMasLeido = "";
        int maxContador = 0;

        for (Map.Entry<String, Integer> entry : contadorGeneros.entrySet()) {
            int contador = entry.getValue();
            if (contador > maxContador) {
                maxContador = contador;
                generoMasLeido = entry.getKey();
            }
        }

        return "\t"+generoMasLeido;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        btn_prin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_returns = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_users = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_books = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_reports = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_lends = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        app_name = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Title = new javax.swing.JPanel();
        red_squr = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        slogan = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(19, 141, 44));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_prin.setBackground(new java.awt.Color(70, 199, 96));
        btn_prin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_prin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_prinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_prinMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_prinMousePressed(evt);
            }
        });
        btn_prin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itp_library/images/home-outline.png"))); // NOI18N
        btn_prin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Principal");
        btn_prin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_prin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 270, 50));

        btn_returns.setBackground(new java.awt.Color(31, 171, 59));
        btn_returns.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_returns.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_returns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_returnsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_returnsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_returnsMousePressed(evt);
            }
        });
        btn_returns.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itp_library/images/calendar-multiple-check.png"))); // NOI18N
        btn_returns.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Devoluciones");
        btn_returns.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_returns, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, -1));

        btn_users.setBackground(new java.awt.Color(31, 171, 59));
        btn_users.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_users.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_usersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_usersMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_usersMousePressed(evt);
            }
        });
        btn_users.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itp_library/images/account-multiple.png"))); // NOI18N
        btn_users.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Usuarios");
        btn_users.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        btn_books.setBackground(new java.awt.Color(31, 171, 59));
        btn_books.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_books.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_booksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_booksMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_booksMousePressed(evt);
            }
        });
        btn_books.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itp_library/images/book-open-page-variant.png"))); // NOI18N
        btn_books.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Libros");
        btn_books.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_books, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 270, -1));

        btn_reports.setBackground(new java.awt.Color(31, 171, 59));
        btn_reports.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_reports.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_reportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_reportsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_reportsMousePressed(evt);
            }
        });
        btn_reports.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itp_library/images/file-chart.png"))); // NOI18N
        btn_reports.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Estadisticas");
        btn_reports.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        btn_lends.setBackground(new java.awt.Color(31, 171, 59));
        btn_lends.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_lends.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_lends.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_lendsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_lendsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_lendsMousePressed(evt);
            }
        });
        btn_lends.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itp_library/images/calendar-plus.png"))); // NOI18N
        btn_lends.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Préstamos");
        btn_lends.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_lends, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        app_name.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        app_name.setForeground(new java.awt.Color(255, 255, 255));
        app_name.setText("UNISIMON");
        Menu.add(app_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOpaque(true);
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));
        Menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 190, 10));

        Background.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 640));

        Header.setBackground(new java.awt.Color(53, 191, 81));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administración/Control/Biblioteca");

        fecha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("Hoy es Sábado 28 de Abril de 2018");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itp_library/images/image-removebg-preview (19).png"))); // NOI18N

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(fecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(20, 20, 20))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Background.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 750, 210));

        Title.setBackground(new java.awt.Color(255, 255, 255));
        Title.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TitleMouseDragged(evt);
            }
        });
        Title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TitleMousePressed(evt);
            }
        });

        red_squr.setBackground(new java.awt.Color(255, 255, 255));
        red_squr.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        red_squr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                red_squrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                red_squrMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                red_squrMousePressed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(102, 102, 102));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout red_squrLayout = new javax.swing.GroupLayout(red_squr);
        red_squr.setLayout(red_squrLayout);
        red_squrLayout.setHorizontalGroup(
            red_squrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        red_squrLayout.setVerticalGroup(
            red_squrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleLayout.createSequentialGroup()
                .addGap(0, 984, Short.MAX_VALUE)
                .addComponent(red_squr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(red_squr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Background.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        slogan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Background.add(slogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 190, 30));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        Background.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 750, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void btn_prinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMousePressed
        setColor(btn_prin);
        resetColor(btn_lends);
        resetColor(btn_returns);
        resetColor(btn_users);
        resetColor(btn_books);
        resetColor(btn_reports);
        // Abrir sección
        Principal p1 = new Principal();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btn_prinMousePressed

    private void btn_lendsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lendsMousePressed
        resetColor(btn_prin);
        setColor(btn_lends);
        resetColor(btn_returns);
        resetColor(btn_users);
        resetColor(btn_books);
        resetColor(btn_reports);
        // Abrir sección
        Lendings p1 = new Lendings(this);
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btn_lendsMousePressed

    private void btn_returnsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_returnsMousePressed
        resetColor(btn_prin);
        resetColor(btn_lends);
        setColor(btn_returns);
        resetColor(btn_users);
        resetColor(btn_books);
        resetColor(btn_reports);
        // Abrir sección
        Returns p1 = new Returns(this);
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btn_returnsMousePressed

    private void btn_usersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usersMousePressed
        resetColor(btn_prin);
        resetColor(btn_lends);
        resetColor(btn_returns);
        setColor(btn_users);
        resetColor(btn_books);
        resetColor(btn_reports);
        // Abrir sección
        Users p1 = new Users(this);
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btn_usersMousePressed

    private void btn_booksMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_booksMousePressed
        resetColor(btn_prin);
        resetColor(btn_lends);
        resetColor(btn_returns);
        resetColor(btn_users);
        setColor(btn_books);
        resetColor(btn_reports);
        // Abrir sección
        Books p1 = new Books(this);
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btn_booksMousePressed

    private void btn_reportsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportsMousePressed
        resetColor(btn_prin);
        resetColor(btn_lends);
        resetColor(btn_returns);
        resetColor(btn_users);
        resetColor(btn_books);
        setColor(btn_reports);
        // Abrir sección
        Reports p1 = new Reports(this);
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btn_reportsMousePressed

    private void btn_lendsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lendsMouseEntered
        
    }//GEN-LAST:event_btn_lendsMouseEntered

    private void btn_lendsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lendsMouseExited
        
    }//GEN-LAST:event_btn_lendsMouseExited

    private void btn_prinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMouseEntered
        
    }//GEN-LAST:event_btn_prinMouseEntered

    private void btn_prinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMouseExited
        
    }//GEN-LAST:event_btn_prinMouseExited

    private void btn_returnsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_returnsMouseEntered
        
    }//GEN-LAST:event_btn_returnsMouseEntered

    private void btn_returnsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_returnsMouseExited
       
    }//GEN-LAST:event_btn_returnsMouseExited

    private void btn_usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usersMouseEntered
        
    }//GEN-LAST:event_btn_usersMouseEntered

    private void btn_usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usersMouseExited
        
    }//GEN-LAST:event_btn_usersMouseExited

    private void btn_booksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_booksMouseEntered
        
    }//GEN-LAST:event_btn_booksMouseEntered

    private void btn_booksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_booksMouseExited
        
    }//GEN-LAST:event_btn_booksMouseExited

    private void btn_reportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportsMouseEntered
        
    }//GEN-LAST:event_btn_reportsMouseEntered

    private void btn_reportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportsMouseExited
        
    }//GEN-LAST:event_btn_reportsMouseExited

    private void TitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_TitleMousePressed

    private void TitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_TitleMouseDragged

    private void red_squrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMousePressed
        System.exit(0);
    }//GEN-LAST:event_red_squrMousePressed

    private void red_squrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMouseExited
        red_squr.setBackground(new Color(255,255,255));
        exit.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_red_squrMouseExited

    private void red_squrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMouseEntered
        red_squr.setBackground(new Color(204,0,0));
        exit.setForeground(Color.white);
    }//GEN-LAST:event_red_squrMouseEntered

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        red_squr.setBackground(new Color(255,255,255));
        exit.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_exitMouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        red_squr.setBackground(new Color(204,0,0));
        exit.setForeground(Color.white);
    }//GEN-LAST:event_exitMouseEntered

    void setColor(JPanel panel){
        panel.setBackground(new Color(70,199,96));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(31,171,59));
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Title;
    private javax.swing.JLabel app_name;
    private javax.swing.JPanel btn_books;
    private javax.swing.JPanel btn_lends;
    private javax.swing.JPanel btn_prin;
    private javax.swing.JPanel btn_reports;
    private javax.swing.JPanel btn_returns;
    private javax.swing.JPanel btn_users;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel red_squr;
    private javax.swing.JLabel slogan;
    // End of variables declaration//GEN-END:variables
}
