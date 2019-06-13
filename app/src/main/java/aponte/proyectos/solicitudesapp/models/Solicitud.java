package aponte.proyectos.solicitudesapp.models;

public class Solicitud {
    private Integer id;
    private String email;
    private String tipo;
    private String motivo;
    private String image;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", tipo='" + tipo + '\'' +
                ", motivo='" + motivo + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
