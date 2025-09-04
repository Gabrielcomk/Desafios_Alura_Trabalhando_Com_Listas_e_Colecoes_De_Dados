package Desafio4.Des2_3;

public class Titulo implements Comparable<Titulo> {
private String nome;
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Titulo(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "Nome do Titular: " + nome;
    }
}
 