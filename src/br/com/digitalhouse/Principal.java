package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {

        Professor professor1 = new Professor();
        professor1.setNome("João");
        professor1.setCodigo(1234);
        professor1.setSobrenome("das Couves");
        professor1.setTempoDeCasa(20);
        professor1.setEspecialidade("Matematica");
        professor1.setQtdeDeHorasMonitoria(0);

        Professor professor2 = new Professor();
        professor2.setNome("Maria");
        professor2.setCodigo(4321);
        professor2.setSobrenome("José");
        professor2.setTempoDeCasa(5);
        professor2.setEspecialidade("Portugues");
        professor2.setQtdeDeHorasMonitoria(0);

        Professor professor3 = new Professor();
        professor3.setNome("Chico");
        professor3.setCodigo(5678);
        professor3.setSobrenome("Mineiro");
        professor3.setTempoDeCasa(2);
        professor3.setEspecialidade("Fisica");
        professor3.setQtdeDeHorasMonitoria(30);

        Professor professor4 = new Professor();
        professor4.setNome("Terezinha");
        professor4.setCodigo(8765);
        professor4.setSobrenome("Pequena");
        professor4.setTempoDeCasa(22);
        professor4.setEspecialidade("História");
        professor4.setQtdeDeHorasMonitoria(420);

        Curso curso1 = new Curso();
        curso1.setCodigo(20001);
        curso1.setNome("Full Stack");
        curso1.setQtdeMaxAlunos(3);
        curso1.setProfessor(professor3);
        curso1.setProfessorTitular(professor1);

        Curso curso2 = new Curso();
        curso2.setCodigo(20002);
        curso2.setNome("Android");
        curso2.setQtdeMaxAlunos(2);
        curso2.setProfessorAdjunto(professor4);
        curso2.setProfessorTitular(professor2);

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno(1,"Juquinha","Santos"));
        alunos.add(new Aluno(2,"Zezinho","Silva"));
        alunos.add(new Aluno(3,"Huguinho","Souza"));
        alunos.add(new Aluno(4,"Luisinho","Oliveira"));
        alunos.add(new Aluno(5,"Manezinho","Carioca"));

        Date dataDoDia = new Date();
        Matricula matricula1 = new Matricula();
        matricula1.setAluno("Juquinha");
        matricula1.setCurso("Android");
        matricula1.setDataMatricula(dataDoDia);

        Matricula matricula2 = new Matricula();
        matricula2.setAluno("Manezinho");
        matricula2.setCurso("Android");
        matricula2.setDataMatricula(dataDoDia);

        Matricula matricula3 = new Matricula();
        matricula3.setAluno("Huguinho");
        matricula3.setCurso("Android");
        matricula3.setDataMatricula(dataDoDia);

        Matricula matricula4 = new Matricula();
        matricula4.setAluno("Zezinho");
        matricula4.setCurso("Full Stack");
        matricula4.setDataMatricula(dataDoDia);

        Matricula matricula5 = new Matricula();
        matricula5.setAluno("Luisinho");
        matricula5.setCurso("Full Stack");
        matricula5.setDataMatricula(dataDoDia);


    }
}
