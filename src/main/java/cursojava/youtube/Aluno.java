package cursojava.youtube;

public class Aluno extends Pessoa {

    private String login;
    private int totAssistido;

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
