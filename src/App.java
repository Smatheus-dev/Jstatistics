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
                // Variáveis para estatísticas
                double somaAreas = 0;
                int quantidadeJardins = 0;
                int jardinsGrandes = 0;
                boolean cadastrarJardins = true;

                            while (cadastrarJardins) {
                                JOptionPane.showMessageDialog(null, " Informe o tamanho da área do seu jardim: ");

                Double largura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a Largura: "));
                Double comprimento = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o Comprimento: "));
                                
                Double area = largura * comprimento;        
                            JOptionPane.showMessageDialog(null, "A área do jardim é: " + area + " m²");

                                // Classificação e contagem de jardins grandes
                String classificacao;
                                if (area >= 100) {
                                    classificacao = "Grande";
                                    jardinsGrandes++;
                                } else {
                                    classificacao = "Pequeno";
                                }
                            JOptionPane.showMessageDialog(null, "Classificação do jardim: " + classificacao, "Classificação", JOptionPane.INFORMATION_MESSAGE);

                                // Acumula para média
                                somaAreas += area;
                                quantidadeJardins++;

                                // Pergunta se quer cadastrar outro jardim
                            int resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro jardim?", "Continuar", JOptionPane.YES_NO_OPTION);
                                if (resposta != JOptionPane.YES_OPTION) {
                                    cadastrarJardins = false;
                    }
                }

                                // Mostra estatísticas
                                if (quantidadeJardins > 0) {
                double mediaAreas = somaAreas / quantidadeJardins;
                            JOptionPane.showMessageDialog(null, 
                                    "Estatísticas:\n" +
                                    "Total de jardins cadastrados: " + quantidadeJardins + "\n" +
                                    "Jardins grandes (>100m²): " + jardinsGrandes + "\n" +
                                    "Média das áreas: " + String.format("%.2f", mediaAreas) + " m²");
                }

 //   ------------------------------------------------Ex 2 ------------------------------------------------------------------------------           
         



                 Double precoTotal = 0.0;
                 Double contServico1 = 0.0; 
                 Double contServico2 = 0.0; 
                 Double contServico3 = 0.0;
                 Double contServico4 = 0.0; 
                 Double contServico5 = 0.0; 
                 boolean continuar = true;
                 

                 while (continuar) {
                 String menu = "Menu de Opções:\n"
                              + "1. Manutenção de jardins\n"
                              + "2. Implantação de jardins\n"
                              + "3. Poda de árvores e arbustos\n"
                              + "4. Corte de grama\n"
                              + "5. Limpeza de jardins\n"
                              + "\nDigite a opção desejada:";
                 
                     String opcaoStr = JOptionPane.showInputDialog(menu);
                     
                     if (opcaoStr == null) {
                         JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário.");
                         break;
                     }
                     
                     try {
                         int opcao = Integer.parseInt(opcaoStr);
                         
                         switch (opcao) {
                            case 1:
                            JOptionPane.showMessageDialog(null, "Manutenção de jardins: " +
                            "\nCuidados regulares para manter seu jardim sempre bonito e saudável." +
                            "\nValor: R$200,00");
                                contServico1++;
                                precoTotal += 200;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Implantação de jardins:  " +
                                 "\n Criação de um novo jardim ou renovação de espaços verdes." +
                                 "\nValor: R$150,00");
                                contServico2++;
                                precoTotal += 150;
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Poda de árvores e arbustos: "+ 
                                "\nServiço especializado para dar forma e saúde às suas plantas maiores." +
                                "\nValor: R$500,00");
                                contServico3++;
                                precoTotal += 500;
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(null, "Corte de grama: " +
                                "Aparo profissional para um gramado impecável. " +
                                "\nValor: R$300,00");
                                contServico4++;
                                precoTotal += 300;
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "Limpeza de jardins: " +
                                "\nRemoção de folhas secas, lixo e outros resíduos para um ambiente agradável." +
                                "\nValor: R$300,00");
                                contServico5++;
                                precoTotal += 300;
                                break;
                            case 6:
                                continuar = false;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida! Digite um número entre 1 e 6.");
                        }
                        
                        // Mostrar resumo parcial após cada serviço adicionado
                        if (opcao >= 1 && opcao <= 5) {
                            int continuarCompra = JOptionPane.showConfirmDialog(null, 
                                "Serviço adicionado com sucesso!\nDeseja adicionar outro serviço?", 
                                "Continuar", JOptionPane.YES_NO_OPTION);
                            
                            if (continuarCompra == JOptionPane.NO_OPTION) {
                                continuar = false;
                            }
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Entrada inválida! Digite apenas números.");
                    }
                }
                
                // Cálculo do desconto progressivo (5% por serviço diferente, máximo 20%)
                            int servicosDiferentes = 0;
                            if (contServico1 > 0) servicosDiferentes++;
                            if (contServico2 > 0) servicosDiferentes++;
                            if (contServico3 > 0) servicosDiferentes++;
                            if (contServico4 > 0) servicosDiferentes++;
                            if (contServico5 > 0) servicosDiferentes++;
                
                    double percentualDesconto = Math.min(servicosDiferentes * 5, 20); // Máximo de 20%
                    double desconto = precoTotal * (percentualDesconto / 100);
                    double precoFinal = precoTotal - desconto;
                
                // Mostrar resumo final
                JOptionPane.showMessageDialog(null, 
                    "RESUMO DA COMPRA:\n\n" +
                    "Serviços contratados:\n" +
                    (contServico1 > 0 ? "Manutenção de jardins: " + contServico1 + "x (R$" + (contServico1 * 200) + ")\n" : "") +
                    (contServico2 > 0 ? "Implantação de jardins: " + contServico2 + "x (R$" + (contServico2 * 150) + ")\n" : "") +
                    (contServico3 > 0 ? "Poda de árvores e arbustos: " + contServico3 + "x (R$" + (contServico3 * 500) + ")\n" : "") +
                    (contServico4 > 0 ? "Corte de grama: " + contServico4 + "x (R$" + (contServico4 * 300) + ")\n" : "") +
                    (contServico5 > 0 ? "Limpeza de jardins: " + contServico5 + "x (R$" + (contServico5 * 300) + ")\n" : "") +
                    "\nTotal de serviços diferentes: " + servicosDiferentes +
                    "\nSubtotal: R$" + precoTotal +
                    "\nDesconto (" + percentualDesconto + "%): R$" + desconto +
                    "\nTOTAL A PAGAR: R$" + precoFinal, 
                    "Compra Finalizada", JOptionPane.INFORMATION_MESSAGE);

 //   ------------------------------------------------Ex 3 ------------------------------------------------------------------------------  
                /*
                 *  while (cadastrarJardins) {
                                JOptionPane.showMessageDialog(null, " Informe o tamanho da área do seu jardim: ");

                Double largura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a Largura: "));
                Double comprimento = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o Comprimento: "));
                                
                Double area = largura * comprimento;        
                            JOptionPane.showMessageDialog(null, "A área do jardim é: " + area + " m²");

                                // Classificação e contagem de jardins grandes
                String classificacao;
                                if (area >= 100) {
                                    classificacao = "Grande";
                                    jardinsGrandes++;
                                } else {
                                    classificacao = "Pequeno";
                                }
                            JOptionPane.showMessageDialog(null, "Classificação do jardim: " + classificacao, "Classificação", JOptionPane.INFORMATION_MESSAGE);

                                // Acumula para média
                                somaAreas += area;
                                quantidadeJardins++;

                                // Pergunta se quer cadastrar outro jardim
                            int resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro jardim?", "Continuar", JOptionPane.YES_NO_OPTION);
                                if (resposta != JOptionPane.YES_OPTION) {
                                    cadastrarJardins = false;
                    }
                }

                                // Mostra estatísticas
                                if (quantidadeJardins > 0) {
                double mediaAreas = somaAreas / quantidadeJardins;
                            JOptionPane.showMessageDialog(null, 
                                    "Estatísticas:\n" +
                                    "Total de jardins cadastrados: " + quantidadeJardins + "\n" +
                                    "Jardins grandes (>100m²): " + jardinsGrandes + "\n" +
                                    "Média das áreas: " + String.format("%.2f", mediaAreas) + " m²");
                } 
                 */
        

                
            }
        }