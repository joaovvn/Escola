/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;
import model.Aluno;
import model.Curso;
import model.Professor;

/**
 *
 * @author joaov
 */
public class Cadastro extends javax.swing.JFrame {
    public static List<Aluno> alunos = new ArrayList();
    public static List<Professor> professores = new ArrayList();
    public static List<Curso> cursos = new ArrayList();
    
    public void addListaAlunos(Aluno a) {
        alunos.add(a);
    }
    
    public void addListaProfessores(Professor p) {
        professores.add(p);
    }
    
    public void addListaCursos(Curso c) {
        cursos.add(c);   
    }
    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        btCadastrarAlunos = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        btCadastrarProfessor = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btCadastrarCurso = new javax.swing.JMenuItem();
        btInscreverCurso = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Cadastro");
        setExtendedState(MAXIMIZED_BOTH);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        jMenu2.setText("Alunos");

        btCadastrarAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_add.png"))); // NOI18N
        btCadastrarAlunos.setText("Cadastrar");
        btCadastrarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarAlunosActionPerformed(evt);
            }
        });
        jMenu2.add(btCadastrarAlunos);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_suit.png"))); // NOI18N
        jMenu3.setText("Professores");

        btCadastrarProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_add.png"))); // NOI18N
        btCadastrarProfessor.setText("Cadastrar");
        btCadastrarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarProfessorActionPerformed(evt);
            }
        });
        jMenu3.add(btCadastrarProfessor);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pencil.png"))); // NOI18N
        jMenu4.setText("Cursos");

        btCadastrarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pencil_add.png"))); // NOI18N
        btCadastrarCurso.setText("Cadastrar");
        btCadastrarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarCursoActionPerformed(evt);
            }
        });
        jMenu4.add(btCadastrarCurso);

        btInscreverCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pencil_go.png"))); // NOI18N
        btInscreverCurso.setText("Inscrever-se");
        btInscreverCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInscreverCursoActionPerformed(evt);
            }
        });
        jMenu4.add(btInscreverCurso);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarAlunosActionPerformed
        Alunos al = new Alunos();
        jDesktopPane1.add(al);
        al.setVisible(true);
    }//GEN-LAST:event_btCadastrarAlunosActionPerformed

    private void btCadastrarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarProfessorActionPerformed
        Professores prof = new Professores();
        jDesktopPane1.add(prof);
        prof.setVisible(true);
    }//GEN-LAST:event_btCadastrarProfessorActionPerformed

    private void btCadastrarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarCursoActionPerformed
        Cursos c = new Cursos();
        jDesktopPane1.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_btCadastrarCursoActionPerformed

    private void btInscreverCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInscreverCursoActionPerformed
        MatriculaCurso mc = new MatriculaCurso();
        jDesktopPane1.add(mc);
        mc.setVisible(true);
    }//GEN-LAST:event_btInscreverCursoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btCadastrarAlunos;
    private javax.swing.JMenuItem btCadastrarCurso;
    private javax.swing.JMenuItem btCadastrarProfessor;
    private javax.swing.JMenuItem btInscreverCurso;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
