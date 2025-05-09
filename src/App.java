import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Alô Git!");

        
                    //  Classe é um conjunto de objetos
                    //  Nosso objetivo nesse código é entender a diferença entre método com o tipo VOID e com o tipo String 
                    // Entre método com o tipo void e método com o o tipo String
                    Mamifero m1 = new Mamifero();
                    m1.setNomeCientifico("Bos Taurus");
                    JOptionPane.showMessageDialog(null, "Nome Cientifico"+ "\n" + m1.getNomeCientifico());

                    Mamifero m2 = new Mamifero();
                    m2.setNomeCientifico("Macropus");
                    JOptionPane.showMessageDialog(null, "Nome Cientifico"+ "\n" + m2.getNomeCientifico());

                    Mamifero m3 = new Mamifero();
                    m3.setNomeCientifico("Panthera tigris");
                    JOptionPane.showMessageDialog(null,  "Nome Cientifico"+ "\n" + m3.getNomeCientifico());
                    
                    Mamifero m4 = new Mamifero();
                    m4.setNomeCientifico("Loxodonta africana");
                    JOptionPane.showMessageDialog(null,  "Nome Cientifico"+ "\n" + m4.getNomeCientifico());

    } 
}