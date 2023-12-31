package cursojava.youtube;

public class Visualizacao {

    private Aluno espectator;
    private Video filme;

    public Visualizacao(Aluno espectador, Video filme) {
        this.espectator = espectador;
        this.filme = filme;
        this.espectator.viuMaisUm();
        this.filme.vistoMaisUm();
    }

    public Aluno getEspectador() {
        return this.espectator;
    }

    public void setEspectador(Aluno espectador) {
        this.espectator = espectador;
    }

    public Video getFilme() {
        return this.filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectator=" + espectator + ", filme=" + filme + '}';
    }    

    public void avaliar() {        
        this.filme.setAvaliacao(this.filme.getAvaliacao() + 0.1f);
    } 
    
    public void avaliar(float nota){
        this.filme.setAvaliacao(this.filme.getAvaliacao() + nota);    
    }

}
