import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
  public static void main(String[] args) {
    Curso curso = new Curso();
    curso.setTitulo("Curso de Java");
    curso.setDescricao("Java");
    curso.setCargaHoraria(300);
    System.out.println(curso);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso de Java");
    curso2.setDescricao("Java");
    curso2.setCargaHoraria(300);
    System.out.println(curso2);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria de Java");
    mentoria.setDescricao("Java");
    mentoria.setData(LocalDate.now());
    System.out.println(mentoria);

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descrição Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devEdmar = new Dev();
    devEdmar.setNome("Edmar");
    devEdmar.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos Edmar:" + devEdmar.getConteudosInscritos());
    devEdmar.progredir();
    devEdmar.progredir();
    System.out.println("----------");
    System.out.println("Conteúdos Concluídos Edmar:" + devEdmar.getConteudosConcluidos());
    System.out.println("Conteúdos Inscritos Edmar:" + devEdmar.getConteudosInscritos());
    System.out.println("XP:" + devEdmar.calcularTotalXp());

    System.out.println("-------");

    Dev devJoao = new Dev();
    devJoao.setNome("Joao");
    devJoao.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
    devJoao.progredir();
    devJoao.progredir();
    devJoao.progredir();
    System.out.println("-");
    System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
    System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
    System.out.println("XP:" + devJoao.calcularTotalXp());
  }
}
