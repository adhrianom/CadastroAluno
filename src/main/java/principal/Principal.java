package principal;

import javax.swing.JOptionPane;
import model.Aluno;
import view.FrmTelaPrincipal;
public class Principal {

    public static void main(String[] args) {

        Aluno objetoaluno = new Aluno();
        FrmTelaPrincipal objetotela = new FrmTelaPrincipal();
        objetotela.setVisible(true);
        
    }//Fim main
}//Fim classe

