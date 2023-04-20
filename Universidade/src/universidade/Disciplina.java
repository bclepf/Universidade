package universidade;

/**
 *
 * @author berna
 */
public class Disciplina {
   private String nome;
   private int cargaHoraria;
   private String professor;

   public Disciplina(String nome, int cargaHoraria, String professor){
       this.nome = nome;
       this.cargaHoraria = cargaHoraria;
       this.professor = professor;
   } 
   
   public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHorária() {
        return cargaHoraria;
    }

    public void setCargaHorária(int cargaHorária) {
        this.cargaHoraria = cargaHorária;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
}
