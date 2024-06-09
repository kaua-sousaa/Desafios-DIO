package AbstraindoBootcamp.br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso javascript");
        curso2.setDescricao("Descricao curso javascript");
        curso2.setCargaHoraria(4);



        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setData(LocalDate.now());
//
//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java");
        bootcamp.setDescricao("Descricao bootcamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devKaua = new Dev();
        devKaua.setNome("Kaua");
        devKaua.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devKaua.getConteudoInscritos());
        devKaua.progredir();
        devKaua.progredir();
        devKaua.progredir();
        System.out.println("Progredir...");
        System.out.println("Conteudos concluidos: " + devKaua.getConteudoConcluidos());
        System.out.println("Conteudos inscritos apos progredir: " + devKaua.getConteudoInscritos());
        System.out.println("XP: "+ devKaua.calcularTotalXp());

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devCamila.getConteudoInscritos());
        devCamila.progredir();
        System.out.println("Progredir...");
        System.out.println("Conteudos concluidos: " + devCamila.getConteudoConcluidos());
        System.out.println("Conteudos inscritos apos progredir: " + devCamila.getConteudoInscritos());
        System.out.println("XP: "+ devCamila.calcularTotalXp());
    }
}
