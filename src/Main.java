import br.com.dio.desafio.dominio.*;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso focado em aprendizado Java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Curso focado em aprendizado Js");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Mentoria focada em java");
        mentoria.setDatas(LocalDate.now());

/*        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
*/
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Projeto Java");
        bootcamp.setDescricao("Criação de um projeto em java para devs");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJopa = new Dev();
        devJopa.setNome("Jopa");
        devJopa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jopa" + devJopa.getConteudosInscritos());

        devJopa.progredir();
        devJopa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos Jopa" + devJopa.getConteudosConcluidos());
        System.out.println("Conteúdos Ainda Inscritos Jopa" + devJopa.getConteudosInscritos());
        System.out.println("XP" + devJopa.calcularTotalXp());

        System.out.println("-------------------------------------------------------------------------------------------------------");

        Dev devAleatorio = new Dev();
        devAleatorio.setNome("Mario");
        devAleatorio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devAleatorio.getNome() + devAleatorio.getConteudosInscritos());

        devAleatorio.progredir();
        devAleatorio.progredir();
        devAleatorio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos " + devAleatorio.getNome() + devAleatorio.getConteudosConcluidos());
        System.out.println("Conteúdos Ainda Inscritos " + devAleatorio.getNome() + devAleatorio.getConteudosInscritos());
        System.out.println("XP" + devAleatorio.calcularTotalXp());


    }
}