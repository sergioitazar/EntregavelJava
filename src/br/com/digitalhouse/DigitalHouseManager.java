package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    private List<Aluno> alunos;
    private List<Professor> professores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
    private List<Matricula> matriculas = new ArrayList<>();

    public DigitalHouseManager(List<Aluno> alunos, List<Professor> professores, List<Curso> cursos, List<Matricula> matriculas) {
        this.alunos = alunos;
        this.professores = professores;
        this.cursos = cursos;
        this.matriculas = matriculas;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

   // by suporte Guilherme - metodo para adicionar um curso na lista
    public void registrarCurso(Curso curso) {
        this.cursos.add(curso);
    }

    public void registrarCurso(String nome, Integer codigoCurso,
                               Integer quantidadeMaximaDeAlunos) {
        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setQtdeMaxAlunos(quantidadeMaximaDeAlunos);
        curso.setCodigo(codigoCurso);
        this.cursos.add(curso);
    }


    //metodo para excluir um curso
    public void excluirCurso(Integer codigoCurso) {
        for (int i = 0; i < cursos.size(); i++) {
            Curso c = cursos.get(i);
            if (c.getCodigo() == codigoCurso) {
                cursos.remove(c);
            }
        }

    }

        // metodo adicionar professor adjunto na lista de professores
        public void registrarProfessorAdjunto(String nome, String
                sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras){
            ProfessorAdjunto professorAdj = new ProfessorAdjunto();
            professorAdj.setNome(nome);
            professorAdj.setSobrenome(sobrenome);
            professorAdj.setCodigo(codigoProfessor);
            professorAdj.setQtdeDeHorasMonitoria(quantidadeDeHoras);

        }
// metodo adicionar professor titular
        public void registrarProfessorTitular(String nome, String
        sobrenome, Integer codigoProfessor, String especialidade) {
            ProfessorTitular professorTit = new ProfessorTitular();
            professorTit.setNome(nome);
            professorTit.setSobrenome(sobrenome);
            professorTit.setCodigo(codigoProfessor);
            professorTit.setEspecialidade(especialidade);
        }

        //metodo excluir professor
        public void excluirProfessor (Integer codigoProfessor){
            for (int i = 0; i < professores.size(); i++) {
                Professor p = professores.get(i);
                if (p.getCodigo() == codigoProfessor) {
                    professores.remove(p);
                }
            }
        }
        // metodo matricular aluno
        public void matricularAluno (String nome, String sobrenome,
                Integer codigoAluno){



        }
        //metodo matricular aluno no curso
        public void matricularAluno (Integer codigoAluno, Integer
        codigoCurso){


        }
        // metodo alocar professor no curso
        public void alocarProfessores (Integer codigoCurso, Integer
        codigoProfessorTitular, Integer codigoProfessorAdjunto){

        }

    }




