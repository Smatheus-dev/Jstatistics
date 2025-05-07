        import java.util.Random;
        import javax.swing.JOptionPane;
        import javax.swing.UIManager;
        import javax.swing.UnsupportedLookAndFeelException;
        import java.awt.Color;

        public class App {
            public static void main(String[] args) throws Exception {

                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        
                    // Cores de fundo
                    UIManager.put("control", Color.BLACK);
                    UIManager.put("nimbusBase", new Color(0, 100, 0)); // Verde escuro para base
                    UIManager.put("nimbusLightBackground", Color.DARK_GRAY);
                    UIManager.put("background", Color.BLACK);
                    UIManager.put("OptionPane.background", Color.BLACK);
        
                    // Cor do texto
                    UIManager.put("OptionPane.messageForeground", Color.GREEN);
                    UIManager.put("text", Color.GREEN);
                    UIManager.put("Label.foreground", Color.GREEN);
                    UIManager.put("nimbusBlueGrey", new Color(40, 40, 40));
                  
        
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }

 // ---------------------------------------------------------------------------------------------------------------------------               
                System.out.println("Desafio Dado!"); 
                String[] espacoAmostral = {"1","2","3","4","5","6"};                            
                
    // Declaração de Variavel                     
                int cont1 = 0;
                int cont2 = 0;
                int cont3 = 0;
                int cont4 = 0;
                int cont5 = 0;
                int cont6 = 0;
                String mensagem = "Suas Possibilidades são:1,2,3,4,5,6\n" + 
                                    "Probabilidade de cada lado: Aproximadamente 16.67%\n" + "\n" +            
                                    "Deseja lançar o Dado ?";

                Random random = new Random();                              

    //loop de lançamento 
                    while (true) {  // interação com usuário
                    int opcao = JOptionPane.showConfirmDialog(null, mensagem, "Lançando Dado", JOptionPane.YES_NO_OPTION);
                        if (opcao != JOptionPane.YES_NO_OPTION){

    // Estatísticas 
                                String estatistica = "JOGO FINALIZADO!\n" +"\n" +
                                "Total de Dados Lançados: "+(cont1+cont2+cont3+cont4+cont5+cont6)+ "\n"  +
                                "Lado 1 Sorteado "  +cont1 +" vez" + "\n" + 
                                "Lado 2 Sorteado " +cont2 +" vez"  + "\n" + 
                                "Lado 3 Sorteado "   +cont3 +" vez" + "\n" + 
                                "Lado 4 Sorteado "    +cont4 +" vez"+"\n" + 
                                "Lado 5 Sorteado "  + cont5 +" vez" +"\n" + 
                                "Lado 6 Sorteado " +cont6 +" vez" +"\n"; 


                                JOptionPane.showMessageDialog(null, estatistica, "Resultado da Partida ", JOptionPane.INFORMATION_MESSAGE);

                            break;
                    }
                        int resultado = random.nextInt(6);  
                        if (resultado == 0) {
                            cont1++;
                        } else if (resultado == 1) {
                            cont2++;
                        } else if (resultado == 2) {
                            cont3++;
                        } else if (resultado == 3) {
                            cont4++;
                        } else if (resultado == 4) {
                            cont5++;
                        } else if (resultado == 5) {
                            cont6++;
                        }
                    String saida = "Resultado do Lançamento:" +"\n" + "                    "+ espacoAmostral[resultado] ;
            
                        JOptionPane.showMessageDialog(null, saida, "Resultado", JOptionPane.INFORMATION_MESSAGE);

                }
                
        }
    }
