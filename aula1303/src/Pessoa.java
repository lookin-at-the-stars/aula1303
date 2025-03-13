public class Pessoa{
    String nome;
    int idade;
    double altura;
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    // Construtor que recebe apenas nome e idade (altura padrão)
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
        public void printar() {
            System.out.println(nome);
            System.out.println(idade);
            System.out.println(altura);
           
    }
    
    
    
}