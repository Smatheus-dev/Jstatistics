import java.util.Random;

import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Alô Git!");

                            // cara ou coroa - probabilidade
                            // a probabilidade de cara ou coroa e de 50%
                            // quando já sabemos se é cara ou coroa isso é um espaço amostral 
                            // variavel que recebe a intereação do Jogo                             
                            //Random
                            // Switch
                            // for, do while e while
        String[] espacoAmostral = {"cara","coroa"};    
                            // Objeto Random realiza o sorteio 
        Random random = new Random();
                            //Contadores para verificar a distribuição
        int contCara = 0;
        int contCoroa = 0;
        String mensagem = "Espaço amostral:{Cara,Coroa}\n" + 
                            "Probabilidade de Cara: 50%\n" + 
                            "Probabilidade de Coroa: 50%\n" + 
                            "Deseja lançar a moeda ?";

                            //loop de lançamento 
            while (true) {  // interação com usuário
            int opcao = JOptionPane.showConfirmDialog(null, mensagem, "Lançando moedas", JOptionPane.YES_NO_OPTION);
                if (opcao != JOptionPane.YES_NO_OPTION){

                        // Estatísticas 
                        String estatistica = "Jogo finalizado!\n"  +
                        "Total de Lançamentos: "+(contCara+contCoroa)+ "\n" +
                        "Caras:" +contCara + "\n" + 
                        "Coroas:" +contCoroa;
                        JOptionPane.showMessageDialog(null, estatistica, "Resultado da Rodada ", JOptionPane.INFORMATION_MESSAGE);

                    break;
            }
                int resultado = random.nextInt(2); //0-Cara 1-Coroa
                if (resultado == 0) {
                    contCara++;
                }else{
                    contCoroa++;
                }

            String saida = "Resultafp do Lançamento:" + espacoAmostral[resultado] +
                            "\n(Índice gerado: " +resultado+")";
                JOptionPane.showMessageDialog(null, saida, "Resultado", JOptionPane.INFORMATION_MESSAGE);

          }
            
    }
}
