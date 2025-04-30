
import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
                                // if
                                // if else
                                //switch
                                // ternário (?) (:)

    int op=  Integer.parseInt(JOptionPane.showInputDialog("Qual o resultado de uma população ?" + "\n 1- Parâmetro \n 2- Estatistica"));

        if (op ==1)  {  
            JOptionPane.showMessageDialog(null, "Certa Resposta");                             
        }else{
            JOptionPane.showMessageDialog(null, "Resposta Errada","Errado",JOptionPane.ERROR_MESSAGE);
    }
                                // if else
                                // Exercícios (para cada pergunta crie um if)
                                // Considerando os números 30,50,80,90 Digite o valor da média aritmética simples?
                                // gabarito: 62,5
                                // Considerando os valores 10,40,50,80,10. Digite qual é a moda ?
                                // 10 
                                // Qual a medida de tendência central que mostra o centro da amostra?
                                // mediana

                                // String nome;  
                                // if nome.equals("mediana")
                                // double resposta= double.perseDouble()
                                //  10:45 ----- 11:15    (10 minutos)

    // Exercício 1 - Média ------------------------------------------------------------------------------------------------------------------------------------------------------------------

        Double media =  Double.parseDouble(JOptionPane.showInputDialog(null,"Considerando os números \n30\n50\n80\n90 \n" +
        "Digite o valor da média aritmética simples?"));
            if ( media ==62.5) {  
                JOptionPane.showMessageDialog(null, "Certa Resposta");                             
            }else{
                JOptionPane.showMessageDialog(null, "Resposta Errada","Errado",JOptionPane.ERROR_MESSAGE);
            }

    // Exercício 2 - Moda ------------------------------------------------------------------------------------------------------------------------------------------------------------------

        int moda= Integer.parseInt(JOptionPane.showInputDialog(null,"Considerando os valores \n10\n40\n50\n80\n10. \nDigite qual é a moda ?"));
            if (moda ==10) {
                JOptionPane.showMessageDialog(null, "Certa Resposta");
            }else{
                    JOptionPane.showMessageDialog(null, "Certa Resposta");
                }

    // Exercício 1 - Mediana ------------------------------------------------------------------------------------------------------------------------------------------------------------------

        String mediana = JOptionPane.showInputDialog(null,"Qual a medida de tendência central que mostra o centro da amostra?");
            if ( mediana == mediana) {  
                JOptionPane.showMessageDialog(null, "Certa Resposta");                             
            }else{
                JOptionPane.showMessageDialog(null, "Resposta Errada","Errado",JOptionPane.ERROR_MESSAGE);
        } 
    }

}


