package universidade;

/**
 *
 * @author berna
 */
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private String coordenador;
    private List <Disciplina> disciplinas;
    
    public Curso(String nome, String coordenador){
        this.nome = nome;
        this.coordenador = coordenador;
        this.disciplinas = new ArrayList<Disciplina>();
    }        

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }
    
    public void removerDisciplina(Disciplina disciplina) {
        this.disciplinas.remove(disciplina);
    }
}
