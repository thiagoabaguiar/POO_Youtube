package cursojava.youtube;

public class Pessoa {

    protected String nome;
    protected int idade;
    protected boolean sexo;
    protected float experiencia;
    
    protected String getNome(){
        return this.nome;
    }
    
    protected void setNome(String nome){
        this.nome = nome;
    }
   
    protected int getIdade(){
        return this.idade;
    }
    
    protected void setIdade(int idade){
        this.idade = idade;
    }
            
    protected boolean isSexo(){
        return this.sexo;
    }
    
    protected void setSexo(boolean sexo){
        this.sexo = sexo;
    }
            
    protected float getExperiencia(){
        return this.experiencia;
    }
    
    protected void setExperiencia(float experiencia){
        this.experiencia = experiencia;
    }
            
    protected void ganharExperiencia() {
    }

}
