package cursojava.youtube;

public abstract class Pessoa {

    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    protected String getNome() {
        return this.nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected int getIdade() {
        return this.idade;
    }

    protected void setIdade(int idade) {
        this.idade = idade;
    }

    protected String isSexo() {
        return this.sexo;
    }

    protected void setSexo(String sexo) {
        this.sexo = sexo;
    }

    protected float getExperiencia() {
        return this.experiencia;
    }

    protected void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    protected void ganharExperiencia() {
    }

}
