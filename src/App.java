public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Fono!");
        
        Exercicio ex = new Exercicio();
            ex.nome = "Kiko";
            ex.descricao = "exercício de aquecimento, imitando o kiko";
            ex.tempoMin = 3;
            ex.som = "kiko.mp3";


        Exercicio ex1 = new Exercicio();
            ex.nome = "Vibração dos Lábios";
            ex.descricao = "exercício de aquecimento, imitando o kiko";
            ex.tempoMin = 3;
            ex.som = "kiko.mp3";

        Exercicio ex2 = new Exercicio();
            ex2.nome = "Respiração Diafragmática";
            ex2.descricao = "exercício para controle respiratório, inspirando pelo nariz e expirando lentamente pela boca";
            ex2.tempoMin = 5;
            ex2.som = "respiração_lenta.mp3";
            
        Exercicio ex3 = new Exercicio();
            ex3.nome = "Repetição de Sílabas";
            ex3.descricao = "exercício para melhorar a articulação, repetindo sílabas como 'pa-ta-ka' em diferentes velocidades";
            ex3.tempoMin = 4;
            ex3.som = "silabas_ritmadas.mp3";

        Exercicio ex4 = new Exercicio();
            ex4.nome = "Vogais Prolongadas";
            ex4.descricao = "exercício para projeção da voz, sustentando vogais como 'A', 'E', 'O' por 5 segundos cada";
            ex4.tempoMin = 6;
            ex4.som = "vogais_longas.mp3";
    }
}
