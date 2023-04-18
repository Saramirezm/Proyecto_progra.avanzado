public class Pasajero {
    private String nombres;
    private String apellidos;
    private String numero_de_pasajeros;
    private String asiento;
    private Integer edad;

    public Pasajero(){}

    public Pasajero(String nombres, String apellidos, String numero_de_pasajeros, String asiento, Integer edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numero_de_pasajeros = numero_de_pasajeros;
        this.asiento = asiento;
        this.edad = edad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumero_de_pasajeros() {
        return numero_de_pasajeros;
    }

    public void setNumero_de_pasajeros(String numero_de_pasajeros) {
        this.numero_de_pasajeros = numero_de_pasajeros;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public static Integer comparar(Pasajero p1,Pasajero p2){
        if(p1.getEdad()>p2.getEdad()){
            return p2.getEdad();
        }else {
            return p1.getEdad();
        }
    }
}
