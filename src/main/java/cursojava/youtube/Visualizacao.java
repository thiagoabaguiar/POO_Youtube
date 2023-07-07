package cursojava.youtube;

public class Visualizacao {

    private Aluno espectator;
    private Video filme;

    public Visualizacao(Aluno espectador, Video filme) {
        this.espectator = espectador;
        this.filme = filme;
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

    }
    
    public void avaliar(int nota){
    
    }
    
    public void avaliar(float porcentagem){
    
    }

}
