package cursojava.youtube;

public class Video implements AcoesVideo {
    
    private String titulo;
    private float avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    public Video(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public float getAvaliacao() {
        return avaliacao;
    }
    
    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }
    
    public int getViews() {
        return views;
    }
    
    public void setViews(int views) {
        this.views = views;
    }
    
    public int getCurtidas() {
        return curtidas;
    }
    
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    
    public boolean isReproduzindo() {
        return reproduzindo;
    }
    
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Video{");
        sb.append("titulo=").append(titulo);
        sb.append(", avaliacao=").append(avaliacao);
        sb.append(", views=").append(views);
        sb.append(", curtidas=").append(curtidas);
        sb.append(", reproduzindo=").append(reproduzindo);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public void play() {
        this.reproduzindo = true;
    }
    
    @Override
    public void pause() {
        this.reproduzindo = false;
    }
    
    @Override
    public void like() {
        this.curtidas++;
    }
    
    public void vistoMaisUm() {
        setViews(getViews() + 1);
    }
    
}
