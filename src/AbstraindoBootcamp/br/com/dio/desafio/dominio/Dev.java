package AbstraindoBootcamp.br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        conteudoInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
//        Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
//        if(conteudo.isPresent()) {
//            this.conteudoConcluidos.add(conteudo.get());
//            this.conteudoInscritos.remove(conteudo.get());
//        } else {
//            System.err.println("Você não está matriculado em nenhum conteúdo!");
//        }
//    }

        if (!conteudoInscritos.isEmpty()) {
            Conteudo primeiroConteudo = conteudoInscritos.iterator().next();
            conteudoConcluidos.add(primeiroConteudo);
            conteudoInscritos.remove(primeiroConteudo);
        } else {
            System.err.println("Voce nao esta em nenhum conteudo");
        }
    }

    public double calcularTotalXp() {
//        return conteudoConcluidos.stream()
//                .mapToDouble(conteudo -> conteudo.calcularXp())
//                .sum();
        double sum =0.0;
        for (Conteudo valor : getConteudoConcluidos()){
              sum += valor.calcularXp();
        }
        return sum;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }

    public Set<Conteudo> getConteudoConcluidos() {
        return conteudoConcluidos;
    }

    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
        this.conteudoConcluidos = conteudoConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscritos, dev.conteudoInscritos) && Objects.equals(conteudoConcluidos, dev.conteudoConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscritos, conteudoConcluidos);
    }
}
