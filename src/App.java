    import java.util.Scanner;

import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\t\tJEstatistics");
      //  Aplicando Lógica de Programação (Aristioteles e george boolean)
        Scanner leia = new Scanner(System.in);
    // Variável : é um espaço reservado para memória do computador 
    // Variável :serve para guarda valores 
    // Variável : ela tem um tiopo (Texto, número , Lo´gica...)


    /*
     * Ex-1 crie uma algoritmo para Jstatitics que leia a opção desejada:
     * "Qual o conjunto de dados : 1- populacinal 2-amostral"
     * 
     * o valor recebido deve ser um valor ineteiro 
     * 
     * 
     */
        int opcao;   // declarei a variavel em java 
        System.out.println("Qual o conjunto de dados : 1- populacinal 2-amostral");
        opcao = leia.nextInt();
        System.out.println(opcao);
        System.out.println("\t ------- \t -------  JEstatistics \t ------- \t ------- ");    


        System.out.println("que tipo de variável ele deseja cadastrar:");


/* Ex-2 
    Voocê deve criar um menu perguntando para o usuário:
    que tipo de variável ele deseja cadastrar:
    1-Quantitativa
    2-Qualitativa 
 * 
 * O menu deve ter as quebras de linha conforme o texto acima.
 * Tudo deve ser feito em apenas um System.out.ptintln()
 * Mostre a opção escolhida ( o número lido )
 */

        String opcaoVariavel = JOptionPane.showInputDialog(null,
        "que tipo de variável ele deseja cadastrar: \n  1-Quantitativa \n 2-Qualitativa ");
        int opVariavel = Integer.parseInt(opcaoVariavel);
        JOptionPane.showMessageDialog(null,"Sua escolha foi: "+opVariavel,"JStatistics",JOptionPane.INFORMATION_MESSAGE);


    }
}







