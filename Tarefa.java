public class Tarefa {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTarefa(String nome) {
        setNome(nome);
    }

    public void setTarefa(String nome, int dia, int mes, int ano) {
        setNome(nome);
        Data data = new Data(dia, mes, 1992);

    }

    public String toString() {
        return String.format("%s", getNome());
    }
}
