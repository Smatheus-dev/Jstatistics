import javax.swing.JOptionPane;

public class duvida1 {

    public static void main(String[] args) {
        
// ----------------------------------  Tipos de Variáveis ---------------------------------------------------------------------------------
        String msg = "JGarden"; 
        int idAgendamento = 2147483647;     // número (Max:2147483647)
        byte numFerramentas = 123;      
        short agendamentosMes = 153;        // número (Max:32767)
        long  dataAgendamento = System.currentTimeMillis();
        float  precoServiço = 90.90f;
        double  areaJardim = 120.75;
        char  tipoServico = 'p';
        boolean concluido = true;
        String cliente = "Matheus Santos";

        JOptionPane.showMessageDialog(null,msg);
        JOptionPane.showMessageDialog(null, "ID " + idAgendamento);
        JOptionPane.showMessageDialog(null, "Número de Ferramentas: " + numFerramentas);
        JOptionPane.showMessageDialog(null, "Número de Agendamentos Mês: " + agendamentosMes);
        JOptionPane.showMessageDialog(null, "Data atual em milisssegundo: " + dataAgendamento);
        JOptionPane.showMessageDialog(null, "Preço de Serviço: " + precoServiço);
        JOptionPane.showMessageDialog(null, "Área do Jardim : " + areaJardim);
        JOptionPane.showMessageDialog(null, "Tipo de serviço: " + (tipoServico =='p'? "Poda":"Corte Grama"));
        if (concluido) {
            JOptionPane.showMessageDialog(null, "Faz o Pix AGORA: " + cliente+ " Voçê sabia que seu nome tem: " + cliente.length()+ " letras");
        }else{
            JOptionPane.showMessageDialog(null, "Serviço em andamento (aguarde poer favor)");
        }
        JOptionPane.showMessageDialog(null, cliente.charAt(3)); // p
        
    }
}

// Contagem Humana:                       1-m 2-a 3-t 4-h 5-e 6-u 7-s 
// Contagem Computacional (Base Zero):    0-m 1-a 2-t 3-h 4-e 5-u 6-s
