package View;

import Business.ProdutoBusiness;
import TableModels.CarrinhoTableModel;
import Model.Cliente;
import TableModels.GenericTableModel;
import Model.Ped_Prod;
import Model.Produto;
import TableModels.ClienteTableModel;
import TableModels.ProdutoTableModel;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.PatternSyntaxException;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.RowFilter;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author martin_ruediger
 */
public class ViewCarrinho extends javax.swing.JFrame {

    private GenericTableModel gtmProdutos;
    private GenericTableModel gtmCarrinho;
    private List<Ped_Prod> carro = new ArrayList();
    private Cliente cliente;

    public ViewCarrinho(Cliente cliente) {
        initComponents();
        gtmCarrinho = new CarrinhoTableModel(Ped_Prod.class, new String[]{"id", "Produto", "Preço Unitário", "Quantidade", "Preço Total"});
        tableCarrinho.setModel(gtmCarrinho);
        this.cliente = cliente;

        gtmProdutos = new ProdutoTableModel(Produto.class, new String[]{"id", "Nome", "Quantidade", "Preço"});
        tableProduto.setModel(gtmProdutos);
        gtmProdutos.setObjectList(ProdutoBusiness.findActive());
        client.setText(cliente.getNome());

        spinnQtd.setModel(new SpinnerNumberModel(1.0, Integer.MIN_VALUE, Double.MAX_VALUE, 0.5));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduto = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCarrinho = new javax.swing.JTable();
        spinnQtd = new javax.swing.JSpinner();
        cancelAll = new javax.swing.JButton();
        btnAddCart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        client = new javax.swing.JLabel();
        nextPed = new javax.swing.JButton();
        removeItem = new javax.swing.JButton();
        pesquisa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carrinho - HSystems");
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        tableProduto.setModel(new javax.swing.table.DefaultTableModel(
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
        tableProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProduto);

        tableCarrinho.setModel(new javax.swing.table.DefaultTableModel(
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
        tableCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCarrinhoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableCarrinho);

        spinnQtd.setValue(1);

        cancelAll.setText("Cancelar Pedido");
        cancelAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelAllActionPerformed(evt);
            }
        });

        btnAddCart.setText("Adicionar ao carrinho");
        btnAddCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCartActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("REALIZAÇÃO DE PEDIDO");

        jLabel2.setText("Valor Total:");

        jLabel3.setText("Cliente:");

        client.setText("cliente");

        nextPed.setText("Avançar");
        nextPed.setEnabled(false);
        nextPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPedActionPerformed(evt);
            }
        });

        removeItem.setText("Remover");
        removeItem.setEnabled(false);
        removeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemActionPerformed(evt);
            }
        });

        pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisaKeyReleased(evt);
            }
        });

        jLabel4.setText("Pesquisa de produtos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pesquisa)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spinnQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddCart)
                        .addGap(18, 18, 18)
                        .addComponent(removeItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelAll)
                        .addGap(218, 218, 218)
                        .addComponent(nextPed)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(total)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(client)
                        .addGap(286, 286, 286)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(client))
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeItem)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spinnQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddCart))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(total))
                    .addComponent(nextPed)
                    .addComponent(cancelAll))
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelAllActionPerformed
        this.dispose();
        new ViewPedido().setVisible(true);
    }//GEN-LAST:event_cancelAllActionPerformed

    public void atualizaCarro() {
        gtmCarrinho.setObjectList(carro);
        double valor = 0;
        for (Object listaCarrinho : gtmCarrinho.getObjectList()) {
            Ped_Prod pedProd = (Ped_Prod) listaCarrinho;
            valor += pedProd.getPrecoTotal();
        }
        total.setText(valor + "");
    }


    private void btnAddCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCartActionPerformed
        if (tableProduto.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um item antes de clicar em adicionar", "ERRO", 0);
        } else if ((Double) spinnQtd.getValue() <= 0.0) {
            JOptionPane.showMessageDialog(rootPane, "Quantidade inválida", "ERRO", 0);
        } else {
            Produto produto = (Produto) gtmProdutos.getObjectList().get(tableProduto.convertRowIndexToModel(tableProduto.getSelectedRow()));
            if ((Double) spinnQtd.getValue() > produto.getQuantidade()) {
                JOptionPane.showMessageDialog(rootPane, "Quantidade escolhida maior que o estoque", "ERRO", 0);
            } else {

                Ped_Prod pedProd = new Ped_Prod();

                boolean verif = false;

                for (int i = 0; i < carro.size(); i++) {
                    if (carro.get(i).getProduto() == produto) {
                        carro.get(i).setQuantidade(carro.get(i).getQuantidade() + (Double) spinnQtd.getValue());
                        produto.setQuantidade(produto.getQuantidade() - (Double) spinnQtd.getValue());
                        verif = true;
                        if (produto.getQuantidade() == 0) {
                            gtmProdutos.remove(produto);
                        }
                    }
                }

                if (!verif) {
                    pedProd.setProduto(produto);
                    pedProd.setPreco_item(produto.getPreco_referencia());
                    pedProd.setId(pedProd.getProduto().getId());
                    pedProd.setQuantidade((Double) spinnQtd.getValue());

                    produto.setQuantidade(produto.getQuantidade() - (Double) spinnQtd.getValue());
                    carro.add(pedProd);
                    if (produto.getQuantidade() == 0) {
                        gtmProdutos.remove(produto);
                    }
                    ativaNext();
                }

                gtmProdutos.fireTableDataChanged();
                atualizaCarro();
                
                pesquisa.setText("");
                pesquisaKeyReleased(null);
                spinnQtd.setValue(1.0);
            }
        }
    }//GEN-LAST:event_btnAddCartActionPerformed

    private void ativaNext() {
        if (carro.isEmpty()) {
            nextPed.setEnabled(false);
        } else {
            nextPed.setEnabled(true);
        }
    }

    private void nextPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPedActionPerformed
        this.dispose();
        new ViewPagamento(carro, cliente, total.getText()).setVisible(true);
    }//GEN-LAST:event_nextPedActionPerformed

    private void tableCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCarrinhoMouseClicked
        removeItem.setEnabled(true);
        tableProduto.clearSelection();
    }//GEN-LAST:event_tableCarrinhoMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        tableCarrinho.clearSelection();
        removeItem.setEnabled(false);
        tableProduto.clearSelection();
    }//GEN-LAST:event_formMouseClicked

    private void removeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemActionPerformed
        Ped_Prod pedProd = (Ped_Prod) gtmCarrinho.getObjectList().get(tableCarrinho.getSelectedRow());

        if ((Double) spinnQtd.getValue() > pedProd.getQuantidade() || (Double) spinnQtd.getValue() < 0) {
            JOptionPane.showMessageDialog(rootPane, "Você não possui tantos itens no carrinho", "ERRO", 2);
        } else {
            pedProd.setQuantidade(pedProd.getQuantidade() - (Double) spinnQtd.getValue());
            Produto produto = (Produto) pedProd.getProduto();

            if (produto.getQuantidade() == 0) {
                gtmProdutos.add(produto);
                produto.setQuantidade((Double) spinnQtd.getValue());
                gtmProdutos.fireTableDataChanged();
            } else {
                produto.setQuantidade(produto.getQuantidade() + (Double) spinnQtd.getValue());
            }

            if (pedProd.getQuantidade() == 0) {
                gtmCarrinho.remove(pedProd);
            }
            if (carro.isEmpty()) {
                nextPed.setEnabled(false);
            }
            atualizaCarro();
            gtmProdutos.fireTableDataChanged();
            removeItem.setEnabled(false);
            spinnQtd.setValue(1.0);
        }
    }//GEN-LAST:event_removeItemActionPerformed

    private void tableProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdutoMouseClicked
        tableCarrinho.clearSelection();
        removeItem.setEnabled(false);
    }//GEN-LAST:event_tableProdutoMouseClicked

    private void pesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaKeyReleased
        ProdutoTableModel tabela_produto = (ProdutoTableModel) tableProduto.getModel();
        final TableRowSorter<ProdutoTableModel> sorter = new TableRowSorter<ProdutoTableModel>(tabela_produto);
        tableProduto.setRowSorter(sorter);
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
            java.util.logging.Logger.getLogger(ViewCarrinho.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCarrinho.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCarrinho.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCarrinho.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCart;
    private javax.swing.JButton cancelAll;
    private javax.swing.JLabel client;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton nextPed;
    private javax.swing.JTextField pesquisa;
    private javax.swing.JButton removeItem;
    private javax.swing.JSpinner spinnQtd;
    private javax.swing.JTable tableCarrinho;
    private javax.swing.JTable tableProduto;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
