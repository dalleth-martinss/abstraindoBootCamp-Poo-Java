import br.com.abstraindoBootcamp.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java Bootcamp Santander ");
        curso1.setDescricao("Descrição: curso Java");
        curso1.setCargaHoraria(30);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de C# Bootcamp ");
        curso2.setDescricao("Descrição: curso C# ");
        curso2.setCargaHoraria(45);

        Curso curso3 = new Curso();
        curso2.setTitulo("Curso de JavaScript ");
        curso2.setDescricao("Descrição: curso Js ");
        curso2.setCargaHoraria(50);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Individual");
        mentoria.setDescricao("Curso intensivo individual");
        mentoria.setData(LocalDate.now());

        //Conteudo conteudo = new Curso(); quando usamos esse jeito de instanciar estamos usando o pilar de polimorfismo

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição: Mergulhando no mundo do Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("--");
        Dev devDalleth = new Dev();
        devDalleth.setNome("Dálleth");
        devDalleth.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devDalleth.getConteudosInscritos());
        devDalleth.progredir();
        devDalleth.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos: " + devDalleth.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devDalleth.getConteudosConcluidos());
        System.out.println( "XP: " + devDalleth.calcularTotalXp());

        System.out.println("-----------------------------------------------");

        Dev devIsaac = new Dev();
        devIsaac.setNome("Isaac");
        devIsaac.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devIsaac.getConteudosInscritos());
        devIsaac.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos: " + devDalleth.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devIsaac.getConteudosConcluidos());
        System.out.println( "XP: " + devIsaac.calcularTotalXp());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);
    }
}