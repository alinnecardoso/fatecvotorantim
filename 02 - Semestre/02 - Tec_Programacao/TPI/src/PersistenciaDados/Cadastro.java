/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersistenciaDados;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alunos
 */
public class Cadastro extends javax.swing.JFrame {
    private Controller controller;
    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
        initComponents();
        controller = new Controller();
    }
    
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtVelocidade = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        btoCadastrar = new javax.swing.JButton();
        btoGravar = new javax.swing.JButton();
        btoLer = new javax.swing.JButton();
        btoDeletar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro");

        jLabel2.setText("Velocidade");

        jLabel3.setText("Marca");

        jLabel4.setText("Modelo");

        btoCadastrar.setText("Cadastrar");
        btoCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btoCadastrarMouseClicked(evt);
            }
        });
        btoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoCadastrarActionPerformed(evt);
            }
        });

        btoGravar.setText("Gravar Arquivo");
        btoGravar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btoGravarMouseClicked(evt);
            }
        });

        btoLer.setLabel("Ler Arquivo");
        btoLer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btoLerMouseClicked(evt);
            }
        });

        btoDeletar.setLabel("Deletar");
        btoDeletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btoDeletarMouseClicked(evt);
            }
        });

        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca", "Modelo", "Velocidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTabela);
        if (tblTabela.getColumnModel().getColumnCount() > 0) {
            tblTabela.getColumnModel().getColumn(0).setCellEditor(null);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVelocidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btoGravar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btoCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btoLer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btoDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btoCadastrar))
                    .addComponent(jLabel3))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btoGravar))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtVelocidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btoLer))
                .addGap(44, 44, 44)
                .addComponent(btoDeletar)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btoCadastrarActionPerformed

    private void btoCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btoCadastrarMouseClicked
        // TODO add your handling code here:
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        float velocidade = Float.parseFloat(txtVelocidade.getText());
        
        Motocicleta novaMotocicleta = controller.cadastrar(marca, modelo, velocidade);
        System.out.println("Nova moto adicionada:\n" + novaMotocicleta.getMarca());
        
        List<Motocicleta> listaMotocicletas = controller.addLista(marca, modelo, velocidade);
        System.out.println("Lista de motos adicionadas: " + listaMotocicletas);
        
        
        
        
    }//GEN-LAST:event_btoCadastrarMouseClicked

    private void btoGravarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btoGravarMouseClicked
        // TODO add your handling code here:
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        float velocidade = Float.parseFloat(txtVelocidade.getText());
        
        Motocicleta novaMotocicleta = new Motocicleta(marca, modelo, velocidade);
       
        try {
            Serializador.gravar("motoca.dat", novaMotocicleta);
        } catch (IOException ex) {
            System.out.println("Erro Gravar: " + ex.getMessage());
        }
        
        
        
        
    }//GEN-LAST:event_btoGravarMouseClicked

    private void btoLerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btoLerMouseClicked
        // TODO add your handling code here:
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        float velocidade = Float.parseFloat(txtVelocidade.getText());
        
        Motocicleta novaMotocicleta = new Motocicleta(marca, modelo, velocidade);
        try {
            novaMotocicleta = (Motocicleta)Serializador.ler("motocicleta.dat");
        } catch (Exception ex) {
            System.out.println("Erro Ler: " + ex.getMessage());
        }
        System.out.println("Objeto lido: " + novaMotocicleta);
        
    }//GEN-LAST:event_btoLerMouseClicked

    private void btoDeletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btoDeletarMouseClicked
        // TODO add your handling code here:
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        float velocidade = Float.parseFloat(txtVelocidade.getText());
        
        
        System.out.println(controller.deletar(marca, modelo, velocidade));
        
    }//GEN-LAST:event_btoDeletarMouseClicked

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
            @Override
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btoCadastrar;
    private javax.swing.JButton btoDeletar;
    private javax.swing.JButton btoGravar;
    private javax.swing.JButton btoLer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtVelocidade;
    // End of variables declaration//GEN-END:variables
}