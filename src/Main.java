import br.com.abstraindoBootcamp.desafio.dominio.Conteudo;
import br.com.abstraindoBootcamp.desafio.dominio.Curso;
import br.com.abstraindoBootcamp.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java Bootcamp Santander ");
        curso1.setDescricao("Descrição: curso Java");
        curso1.setCargaHoraria(200);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de C# Bootcamp ");
        curso2.setDescricao("Descrição: curso C# ");
        curso2.setCargaHoraria(150);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Individual");
        mentoria.setDescricao("Curso intensivo individual");
        mentoria.setData(LocalDate.now());

        //Conteudo conteudo = new Curso(); quando usamos esse jeito de instanciar estamos usando o pilar de polimorfismo

        System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria);
    }
}