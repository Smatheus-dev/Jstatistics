import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula3- Switch e Loops");

                        // O switch é uma estrutura de seleção múltipla 
                        // Um if mais organizado 
                        // Escolha
                        // Caso 
                        // Indicado para Resolver listas ou constantes. 
                        // Menu
                            // opção1
                            //opção2
                            //opção3
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opção \n1-Estatística Descricitiva\n 2-probabilidade \n3-Modelos probablilidade \n 4-sair"  ));

            if(op!=4){
                switch(op){
                    case 1: JOptionPane.showMessageDialog(null,"Estatística Descricitiva");break;
                    case 2: JOptionPane.showMessageDialog(null, "probabilidade");break;
                    case 3: JOptionPane.showMessageDialog(null," Modelos probablilidade");break;
        
                    default:
                    JOptionPane.showMessageDialog(null,"Opção Inválida");break;
            }   // != diferente
       

         }else{
            JOptionPane.showMessageDialog(null,"Encerrando Sistema...");
         }
         
                            // Como funciona os loops
                            // while - teste no inicio 
                            // for - while compacto
                            // do while - teste no final 
                            /*
                             * inicio  =
                             * condição <=5
                             * incremento/decremento i=+1
                             */
            int contador = 1;
            while (contador<3) {
                JOptionPane.showMessageDialog(null, "Viva o Senai!");
                contador = contador+1;
            }
            int i=1;
            while (i<=5) {
                System.out.println(1);
                i++;
            }
            for (int cont= 1;cont<=10;cont++){
            System.out.println(cont);
            }
            String sair;

            do{
                 System.out.println(" sair: s ou n");
                sair =JOptionPane.showInputDialog( "Deseja sair");    
               }while (sair.equalsIgnoreCase("não"));{

               }

               
      
            }

    }

