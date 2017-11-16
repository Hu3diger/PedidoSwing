/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Business.ClienteBusiness;
import Business.ProdutoBusiness;
import Model.Cliente;
import TableModels.GenericTableModel;
import Model.Produto;
import TableModels.ProdutoTableModel;
import java.util.regex.PatternSyntaxException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author martin_ruediger
 */
public class ViewProduto extends javax.swing.JFrame {

    boolean editing;
    private GenericTableModel gtmProduto;
    

    public ViewProduto() {
        initComponents();
        gtmProduto = new ProdutoTableModel(Produto.class, new String[]{"id", "Nome", "Quantidade", "Preço", "Status"});
        tableProd.setModel(gtmProduto);
        gtmProduto.setObjectList(ProdutoBusiness.findAll());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableProd = new javax.swing.JTable();
        txtQtd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        txtPreco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        pesquisa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listagem de produtos - HSystems");

        tableProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProd);

        txtQtd.setEnabled(false);

        jLabel1.setText("Quantidade");

        txtNome.setEnabled(false);

        jLabel2.setText("Nome");

        btnAdd.setText("Adicionar produto");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSave.setText("Salvar Produto");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtPreco.setEnabled(false);

        jLabel4.setText("Preço");

        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativar", "Desativar" }));
        status.setEnabled(false);

        jLabel5.setText("Status");

        txtID.setEnabled(false);

        jLabel3.setText("ID");

        back.setText("Voltar");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisaKeyReleased(evt);
            }
        });

        jLabel6.setText("Pesquisa de produtos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtQtd, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jLabel1))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5))
                            .addComponent(status, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(back))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pesquisa)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btnAdd)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(back)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        txtQtd.setEnabled(true);
        txtPreco.setEnabled(true);
        txtNome.setEnabled(true);
        btnSave.setEnabled(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            Produto produto = new Produto();
            produto.setNome(txtNome.getText());
            produto.setPreco_referencia(Double.parseDouble(txtPreco.getText()));
            produto.setQuantidade(Double.parseDouble(txtQtd.getText()));

            if (!editing) {
                if (!gtmProduto.getObjectList().contains(produto)) {
                    if (txtNome.getText().isEmpty() || txtNome.getText().contains("  ") || txtNome.getText().equalsIgnoreCase(" ") || txtNome.getText().contains(".")) {
                        JOptionPane.showMessageDialog(rootPane, "Nome inválido, tente novamente", "ERRO 404", 2);
                    } else {
                        if (txtQtd.getText().contains("-") || txtPreco.getText().contains("-")) {
                            JOptionPane.showMessageDialog(rootPane, "Quantidade ou preço inválido(a), tente novamente", "ERRO 404", 2);
                        } else {
                            produto.setStatus(true);
                            ProdutoBusiness.create(produto);
                            gtmProduto.add(produto);
                            txtNome.setText("");
                            txtNome.setEnabled(false);
                            txtPreco.setEnabled(false);
                            txtPreco.setText("");
                            txtQtd.setText("");
                            txtQtd.setEnabled(false);
                            btnSave.setEnabled(false);
                            btnAdd.setEnabled(true);
                        }
                    }
                }
            } else {
                if (txtNome.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "Nome inválido, tente novamente", "ERRO 404", 0);
                } else {
                    if (txtNome.getText().isEmpty() || txtNome.getText().contains("  ") || txtNome.getText().equalsIgnoreCase(" ") || txtNome.getText().contains(".")) {
                        JOptionPane.showMessageDialog(rootPane, "Nome inválido, tente novamente", "ERRO 404", 2);
                    } else {
                        if (txtQtd.getText().contains("-") || txtPreco.getText().contains("-")) {
                            JOptionPane.showMessageDialog(rootPane, "Quantidade ou preço inválido(a), tente novamente", "ERRO 404", 2);
                        } else {
                            Produto produto2 = (Produto) gtmProduto.getObjectList().get(tableProd.convertRowIndexToModel(tableProd.getSelectedRow()));
                            produto.setId(produto2.getId());
                            ProdutoBusiness.update(produto);
                            if (produto2.isStatus() == true && status.getSelectedIndex() == 0 || produto2.isStatus() == false && status.getSelectedIndex() == 1) {
                            } else if (produto2.isStatus() == true && status.getSelectedIndex() == 1 || produto.isStatus() == false && status.getSelectedIndex() == 0) {
                                ProdutoBusiness.desable((Produto) gtmProduto.getObjectList().get(tableProd.convertRowIndexToModel(tableProd.getSelectedRow())));
                            }
                            gtmProduto.setObjectList(ProdutoBusiness.findAll());
                            gtmProduto.fireTableDataChanged();
                            txtNome.setText("");
                            txtNome.setEnabled(false);
                            txtPreco.setEnabled(false);
                            txtPreco.setText("");
                            txtQtd.setText("");
                            txtQtd.setEnabled(false);
                            btnSave.setEnabled(false);
                            status.setEnabled(false);
                            btnAdd.setEnabled(true);
                            tableProd.getSelectionModel().clearSelection();
                            pesquisa.setText("");
                            pesquisaKeyReleased(null);
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Tentativa de cadastro nulo bloqueado", "ERRO 404", 2);
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        editing = false;
    }//GEN-LAST:event_btnAddMouseClicked

    private void tableProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdMouseClicked
        editing = true;
        btnAdd.setEnabled(false);
        Produto produto1 = (Produto) gtmProduto.getObjectList().get(tableProd.convertRowIndexToModel(tableProd.getSelectedRow()));
        status.setSelectedIndex((produto1.isStatus()) ? 0 : 1);
        txtID.setText(produto1.getId() + "");
        txtNome.setText(produto1.getNome());
        txtNome.setEnabled(true);
        txtPreco.setEnabled(true);
        txtPreco.setText(produto1.getPreco_referencia() + "");
        txtQtd.setEnabled(true);
        btnSave.setEnabled(true);
        txtQtd.setText(produto1.getQuantidade() + "");
        status.setEnabled(true);
    }//GEN-LAST:event_tableProdMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
        new View().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void pesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaKeyReleased
        ProdutoTableModel tabela_produto = (ProdutoTableModel) tableProd.getModel();
        final TableRowSorter<ProdutoTableModel> sorter = new TableRowSorter<ProdutoTableModel>(tabela_produto);
        tableProd.setRowSorter(sorter);
        String text = pesquisa.getText();
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            try {
                sorter.setRowFilter(RowFilter.regexFilter(text));
            } catch (PatternSyntaxException pse) {
            }
        }
    }//GEN-LAST:event_pesquisaKeyReleased
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pesquisa;
    private javax.swing.JComboBox status;
    private javax.swing.JTable tableProd;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables
}
