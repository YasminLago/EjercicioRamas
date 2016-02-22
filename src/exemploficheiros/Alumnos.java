package exemploficheiros;
/**
 *
 * @author ylagorebollar
 */
public class Alumnos {
    private String nome;
    private String telefono;
    private int nota;

    public Alumnos() {
    }
/**
 * Datos alumno
 * @param nome
 * @param telefono
 * @param nota 
 */
    public Alumnos(String nome, String telefono, int nota) {
        this.nome = nome;
        this.telefono = telefono;
        this.nota = nota;
    }
/**
 * Metodos de acceso
 * @return 
 */
    public String getNome() {
        return nome;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getNota() {
        return nota;
    }
/**
 * Metodo sobreescrito
 * @return 
 */
    @Override
    public String toString() {
        return "Alumnos{" + "nome=" + nome + ", telefono=" + telefono + ", nota=" + nota + '}';
    }
    
}
