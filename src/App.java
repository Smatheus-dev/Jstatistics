 //   ------------------------------------------------Ex 1 ------------------------------------------------------------------------------ 
    import javax.swing.JOptionPane;


    public class App {                                                  
        public static void main(String[] args) throws Exception {
            JOptionPane.showMessageDialog(null," Bem - Vindo ao Exercício de Java-Aula 7    "); 
            JOptionPane.showMessageDialog(null,"            Alô Jardim!          ");

            String nomeCliente = "";
            String telefone = "";
            String enderecoCliente = "";
            boolean cadastrado = false;
        
                while (!cadastrado) {
                    JOptionPane.showMessageDialog(null, " Por favor, informe seus dados: "); 
                    
                    nomeCliente = JOptionPane.showInputDialog(null, "Informe seu nome:");
                                if (nomeCliente == null){
                                    break;
                                 }
                            telefone = JOptionPane.showInputDialog(null, "Informe seu Número:");
                                if (telefone == null) {
                                    break;                        
                                }
                            enderecoCliente = JOptionPane.showInputDialog(null, "Informe seu endereço:");   
                                if (enderecoCliente == null) {
                                    break;                        
                                }
                String MenssagemConfirmacao = "Confirme suas informações:\n" +
                                                "Nome: " + nomeCliente + "\n" +
                                                "telefone: " + telefone + "\n" + 
                                                "Endereço :" + enderecoCliente;   
                int escolha = JOptionPane.showConfirmDialog(null, MenssagemConfirmacao, "Confirmação", JOptionPane.YES_NO_OPTION);
                            if (escolha == JOptionPane.YES_OPTION) {
                                JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                                cadastrado = true; // Para sair do loop após o sucesso
                            } else {
                                JOptionPane.showMessageDialog(null, "Cadastro cancelado. Por favor, insira as informações novamente.", "Aviso", JOptionPane.WARNING_MESSAGE);
                            }

                 }

                 JOptionPane.showMessageDialog(null, " Informe o tamanho da área do seu jardim: ");

            Double largura =  Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a Largura: "));
            Double comprimento = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o Comprimento: " ));
                 
            Double area = largura * comprimento;        
                JOptionPane.showMessageDialog(null, "A área do jardim é: " + area + " m²");

 //   ------------------------------------------------Ex 2 ------------------------------------------------------------------------------           
            String classificacao;
                        if (area >= 100 ) {
                            classificacao = "Grande";  
                        }else{
                            classificacao = "Pequeno";
                        }
                 JOptionPane.showMessageDialog(null, "Classificação do jardim: " + classificacao, "Classificação", JOptionPane.INFORMATION_MESSAGE);



                String[] opcoesService = {
                            "1 - Manutenção de Jardins",
                            "2 - Paisagismo e Projetos de Jardim",
                            "3 - Instalação de Sistema de Irrigação",
                            "4 - Plantio de Horta e Jardim Vertical",
                            "5 - Controle de Pragas e Doenças"
                };

                        
        } 
    }


     
    