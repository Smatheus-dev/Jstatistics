import javax.swing.JOptionPane;

public class duvida10 {
    public static void main(String[] args) {
         
        double areaJardin1 = 200;
        double areaJardin2 = 300;
        double areaJardin3 = 500;

        double[] areasJardins = {200,300,500};
        System.out.println(areasJardins[0]);
        System.out.println(areasJardins[1]);
        System.out.println(areasJardins[2]);
        double acumuladora =0;
        for(int i = 0;i <areasJardins.length;i++){
            JOptionPane.showMessageDialog(null, areasJardins[i]);
        }
        double media = (areaJardin1+areaJardin2+areaJardin3)/3;
        JOptionPane.showMessageDialog(null, media);
        acumuladora = acumuladora + areasJardins[1];
    }       // 
    
}
