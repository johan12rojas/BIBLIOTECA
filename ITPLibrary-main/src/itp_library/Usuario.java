package itp_library;

public class Usuario {
    private String nombreCompleto;
    private String carrera;
    private String codigoUsuario;
    private String numeroTelefono;

    // Constructor
    public Usuario(String nombreCompleto, String carrera, String codigoUsuario, String numeroTelefono) {
        this.nombreCompleto = nombreCompleto;
        this.carrera = carrera;
        this.codigoUsuario = codigoUsuario;
        this.numeroTelefono = numeroTelefono;
    }

    // Métodos getters y setters (puedes generarlos automáticamente en muchos IDEs)
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    
    @Override
    public String toString() {
        return "Usuario{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", carrera='" + carrera + '\'' +
                ", codigoUsuario='" + codigoUsuario + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                '}';
    }
}
