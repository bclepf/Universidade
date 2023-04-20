package universidade;

/**
 *
 * @author berna
 */
import java.util.ArrayList;
import java.util.List;

public class Unidade {
    private String nome;
    private String gestor;
    private List<Curso> cursos;

    public Unidade(String nome, String gestor) {
        this.nome = nome;
        this.gestor = gestor;
        this.cursos = new ArrayList<Curso>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGestor() {
        return gestor;
    }

    public void setGestor(String gestor) {
        this.gestor = gestor;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
    }

    public void removerCurso(Curso curso) {
        this.cursos.remove(curso);
    }
}

