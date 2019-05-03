package br.com.digitalhouse;
import java.util.List;

public class Curso {
    private String nome;
    private int codigo;
    private int qtdeMaxAlunos;
    private List<Aluno> alunos;
    private String professor;

    public Curso(String nome, int codigo, int qtdeMaxAlunos, List<Aluno> alunos, String professor) {
        this.nome = nome;
        this.codigo = codigo;
        this.qtdeMaxAlunos = qtdeMaxAlunos;
        this.alunos = alunos;
        this.professor = professor;
    }


    public int getQtdeMaxAlunos() {
        return qtdeMaxAlunos;
    }

   public void setQtdeMaxAlunos(int qtdeMaxAlunos) {
        this.qtdeMaxAlunos = qtdeMaxAlunos;
    }


    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Curso() {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /// parte H adicionar aluno se houver vaga disponivel
    public Boolean adicionarUmAluno(Aluno umAluno) {
        return true;
    }

    ///excluir um aluno da lista de alunos do curso
    public void excluirAluno(Aluno umAluno) {
        for (int i = 0; i >= alunos.size(); i++) {
            Aluno a = alunos.get(i);
            if (a.getCodigo() == Aluno ) {
                alunos.remove(a);
         //nao consegui referenciar
        }
    }

}






