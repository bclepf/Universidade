package universidade;

/*
 Feito por:
Bernardo Alexander Prado Clepf 
Gustavo Bueno de OLiveira 
Gabriel Braga de Sá
Matheus Martins de Aguiar
Jhonatan Oliveira Landim Costa
Kayky de Castro Manso Ribeiro
 */
import java.util.List;

public class Universidade {
    private String nome;
    private String endereco;
    private String cidade;
    private List<Unidade> unidades;

    public Universidade(String nome, String endereco, String cidade, List<Unidade> unidades) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.unidades = unidades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public List<Unidade> getUnidades() {
        return unidades;
    }

    public void setUnidades(List<Unidade> unidades) {
        this.unidades = unidades;
    }
    public void adicionarUnidade(Unidade unidade) {
        this.unidades.add(unidade);
    }

    public void removerUnidade(Unidade unidade) {
        this.unidades.remove(unidade);
    }
}
