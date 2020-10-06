/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestaodeeficienciadealunos.forms;

import br.com.gestaodeeficienciadealunos.Aluno;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormAluno extends javax.swing.JFrame {

    DefaultTableModel modelo_tabela = new DefaultTableModel();
    FormMain main_screen;
    Aluno ap;
    

   public FormAluno(FormMain main_screen) {
        this.main_screen = main_screen;    

        initComponents();
        
        tabela_area_pesquisa.setModel(modelo_tabela);
        
        modelo_tabela.addColumn("Registro Acadêmico");
        modelo_tabela.addColumn("Código Curso");        
        modelo_tabela.addColumn("Nome");
        modelo_tabela.addColumn("E-mail");
        modelo_tabela.addColumn("Data matrícula");
        modelo_tabela.addColumn("Média");        

        
        ap = new Aluno(modelo_tabela);
        try
        {
            ap.iniciar();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campo_des_email = new javax.swing.JTextField();
        campo_dta_matricula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        campo_num_media_global = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campo_cod_curso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_area_pesquisa = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        campo_cod_ra_aluno = new javax.swing.JTextField();
        campo_nom_aluno = new javax.swing.JTextField();
        btn_consultar = new javax.swing.JButton();
        btn_resetar = new javax.swing.JButton();
        btn_incluir = new javax.swing.JButton();
        btn_atualizar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Alunos");
        setPreferredSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Registro Acadêmico:");

        jLabel2.setText("Nome:");

        jLabel3.setText("E-mail:");

        jLabel4.setText("Média:");

        jLabel5.setText("Data matrícula:");

        tabela_area_pesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabela_area_pesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_area_pesquisaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_area_pesquisa);

        jLabel6.setText("Código Curso:");

        btn_consultar.setText("Consultar");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        btn_resetar.setText("Resetar");
        btn_resetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetarActionPerformed(evt);
            }
        });

        btn_incluir.setText("Incluir");
        btn_incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_incluirActionPerformed(evt);
            }
        });

        btn_atualizar.setText("Atualizar");
        btn_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atualizarActionPerformed(evt);
            }
        });

        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btn_consultar)
                .addGap(18, 18, 18)
                .addComponent(btn_resetar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(btn_incluir)
                .addGap(18, 18, 18)
                .addComponent(btn_atualizar)
                .addGap(150, 150, 150)
                .addComponent(btn_excluir)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campo_num_media_global, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_cod_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campo_des_email, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(campo_dta_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_cod_ra_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(campo_nom_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(campo_cod_ra_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_nom_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(campo_des_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_dta_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campo_num_media_global, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(campo_cod_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_incluir)
                    .addComponent(btn_atualizar)
                    .addComponent(btn_excluir)
                    .addComponent(btn_consultar)
                    .addComponent(btn_resetar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Cadastro de Alunos");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed

        if(campo_cod_ra_aluno.getText().equals(""))
        {
            ap.setCod_ra_aluno(0);
        }
        else
        {
            ap.setCod_ra_aluno(Integer.parseInt(campo_cod_ra_aluno.getText()));
        }
        
        ap.setNom_aluno(campo_nom_aluno.getText());
        ap.setDes_email(campo_des_email.getText());
        ap.setDta_matricula(campo_dta_matricula.getText());  
        ap.setNum_media_global(Integer.parseInt(campo_num_media_global.getText()));        
        ap.setCod_curso(Integer.parseInt(campo_cod_curso.getText()));       
        
        try
        {
            ap.consultar(ap);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void btn_resetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetarActionPerformed
        try
        {
            ap.resetTable();
            campo_cod_ra_aluno.setText("");
            campo_nom_aluno.setText("");
            campo_des_email.setText("");
            campo_dta_matricula.setText("");
            campo_num_media_global.setText("");
            campo_cod_curso.setText("");            
               
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_resetarActionPerformed

    private void btn_incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_incluirActionPerformed
        String[] DataStr = campo_dta_matricula.getText().split("/");
        String DataStrCompleta = DataStr[2] + "-" + DataStr[1] + "-" + DataStr[0];
        ap.setNom_aluno(campo_nom_aluno.getText());
        ap.setDes_email(campo_des_email.getText());       
        ap.setDta_matricula(DataStrCompleta);        
        ap.setNum_media_global(Integer.parseInt(campo_num_media_global.getText()));        
        ap.setCod_curso(Integer.parseInt(campo_cod_curso.getText()));       
        
        try
        {
            ap.salvar(ap);
            modelo_tabela.addRow((Object[]) ap.getRowObject());
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_incluirActionPerformed

    private void btn_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atualizarActionPerformed
        String[] DataStr = campo_dta_matricula.getText().split("/");
        String DataStrCompleta = DataStr[2] + "-" + DataStr[1] + "-" + DataStr[0];
        ap.setCod_ra_aluno(Integer.parseInt(campo_cod_ra_aluno.getText()));
        ap.setNom_aluno(campo_nom_aluno.getText());
        ap.setDes_email(campo_des_email.getText());       
        ap.setDta_matricula(DataStrCompleta);        
        ap.setNum_media_global(Integer.parseInt(campo_num_media_global.getText()));        
        ap.setCod_curso(Integer.parseInt(campo_cod_curso.getText()));   

        try
        {
            ap.editar(ap);
            ap.resetTable();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_atualizarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed

        int id = (int) modelo_tabela.getValueAt(tabela_area_pesquisa.getSelectedRow(), 0);

        try{
            if(JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir este item?") == 0)
            {
                ap.deletar(id);
                modelo_tabela.removeRow(tabela_area_pesquisa.getSelectedRow());
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void tabela_area_pesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_area_pesquisaMouseClicked
       
        String ra = modelo_tabela.getValueAt(tabela_area_pesquisa.getSelectedRow(), 0).toString();
        String curso = modelo_tabela.getValueAt(tabela_area_pesquisa.getSelectedRow(), 1).toString();
        String aluno = modelo_tabela.getValueAt(tabela_area_pesquisa.getSelectedRow(), 2).toString();
        String email = modelo_tabela.getValueAt(tabela_area_pesquisa.getSelectedRow(), 3).toString();        
        String mat = modelo_tabela.getValueAt(tabela_area_pesquisa.getSelectedRow(), 4).toString();
        String med = modelo_tabela.getValueAt(tabela_area_pesquisa.getSelectedRow(), 5).toString();
        
        campo_cod_ra_aluno.setText(ra);
        campo_cod_curso.setText(curso);       
        campo_nom_aluno.setText(aluno);
        campo_des_email.setText(email);      
        campo_dta_matricula.setText(mat);
        campo_num_media_global.setText(med);

        
    }//GEN-LAST:event_tabela_area_pesquisaMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        main_screen.setEnabled(true);
        main_screen.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atualizar;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_incluir;
    private javax.swing.JButton btn_resetar;
    private javax.swing.JTextField campo_cod_curso;
    private javax.swing.JTextField campo_cod_ra_aluno;
    private javax.swing.JTextField campo_des_email;
    private javax.swing.JTextField campo_dta_matricula;
    private javax.swing.JTextField campo_nom_aluno;
    private javax.swing.JTextField campo_num_media_global;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_area_pesquisa;
    // End of variables declaration//GEN-END:variables


}