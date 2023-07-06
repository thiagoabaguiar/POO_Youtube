package cursojava.youtube;

public class Aluno extends Pessoa {

    private String login;
    private int totAssistido;

    public Aluno(String nome, int idade, String sexo, String login) {

        super(nome, idade, sexo);
        this.login = login;
        
    }

    @Override
    public String toString() {
        return "Aluno{" + "Login=" + login + ", Nome=" + nome + ", Idade=" + idade + ", Sexo=" + sexo + ", Total Vídeos Assistidos=" + totAssistido + '}';
    } 
    
    protected String getLogin() {
        return this.login;
    }

    protected void setLogin(String login) {
        this.login = login;
    }

    protected int getTotAssistido() {
        return this.totAssistido;
    }

    protected void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public void viuMaisUm() {
    }

}
