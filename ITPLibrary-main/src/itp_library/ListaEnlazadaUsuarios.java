package itp_library;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ListaEnlazadaUsuarios {
    
    private List<String> usersNames = new ArrayList();
    private List<String> passWords = new ArrayList();
    private List<String> numbers = new ArrayList();
    private String name="";
    
    public ListaEnlazadaUsuarios(){
        addUsers();
        addPass();
        addNums();
    }
    
    private void addUsers(){
        usersNames.add("johan rojas");
        usersNames.add("alejandro pinilla");
        usersNames.add("klivert chiquiza");
        usersNames.add("kenny mccormick");
        usersNames.add("cristiano ronaldo");
        usersNames.add("lionel messi");
        usersNames.add("dominik toreto");
        usersNames.add("jhonny sins");
        usersNames.add("abella danger");
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
        return "\n\n\tUsuario encontrado: "+name.toUpperCase()+"\n\n\n\t"+"Número telefónico: "+numbers.get(indx)+"\n\n\n\t"+"Codigo Estudiantil: "+passWords.get(indx);
    }
    
    public void DeleteUser(String user){ 
        name = "";
        for(int i=0;i<usersNames.size();i++){
            if(user.toLowerCase().equals(usersNames.get(i))){
                name = usersNames.get(i);
                usersNames.remove(i);
                passWords.remove(i);
                numbers.remove(i);
                JOptionPane.showMessageDialog(null, "¡Usuario eliminado!");
            }
        }
    }
    
    public void mostrarTodosLosUsuarios(JTextArea txtAreaUsers) {
        StringBuilder result = new StringBuilder();
        result.append("\tUSUARIOS REGISTRADOS:");
        result.append("\n------------------------------------------------------------------------------------------");

        for (int i = 0; i < usersNames.size(); i++) {
            result.append("\n\n\tUsuario: ").append(usersNames.get(i).toUpperCase());
            result.append("\n\n\n\tNúmero telefónico: ").append(numbers.get(i));
            result.append("\n\n\n\tCodigo Estudiantil: ").append(passWords.get(i));
            result.append("\n------------------------------------------------------------------------------------------");
        }
        txtAreaUsers.setText(result.toString());
    }
    
    public void addUser(String user, String pass, String tel){
    if (!usersNames.contains(user)) {
        usersNames.add(user);
        passWords.add(pass);
        numbers.add(tel);
        JOptionPane.showMessageDialog(null, "¡Usuario añadido con éxito!");
    } else {
        JOptionPane.showMessageDialog(null, "¡El usuario ya existe!");}
    }
}
