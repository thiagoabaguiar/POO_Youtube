package cursojava.youtube;
/**
 * @author Thiago Aguiar
 */
public class Youtube {

    public static void main(String[] args) {
        
        Video myVideos[] = new Video[3];
        
        myVideos[0] = new Video("Aprendendo POO em Java");
        myVideos[1] = new Video("Design Patterns");
        myVideos[2] = new Video("Linguagem Java");
        
//        System.out.println(myVideos[0].toString());
//        System.out.println(myVideos[1].toString());
//        System.out.println(myVideos[2].toString());
        
        
        Aluno a1 = new Aluno("Thiago Aguiar", 37, "M", "taguiar");
//        System.out.println(a1.getIdade());
        
        System.out.println(a1.toString());
        
    }
}
