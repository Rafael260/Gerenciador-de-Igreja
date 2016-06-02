/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.de.igreja;

import Classes.*;
import Util.HibernateUtil;
import Util.MembroDao;
import Util.PessoaDao;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Rafael
 */
public class GerenciadorDeIgreja {

    public static void main(String args[]) {
        /* Set the Nimbus look and feel 
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GerenciadorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciadorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciadorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciadorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciadorFrame().setVisible(true);
            }
        });*/
        
        /*Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        List<Pessoa> p = (List<Pessoa>)s.createQuery("from Pessoa").list();
        for (Pessoa p1: p){
            System.out.println(p1.getNome());
        }
        s.getTransaction().commit();
          */      
        
        //Testando consulta pelo id da pessoa
        PessoaDao pessoaDao = new PessoaDao();
        Pessoa pessoa = pessoaDao.selectPessoaPk(1);
        System.out.println(pessoa.getNome());
    }
    
}
