package View;

import Business.ClienteBusiness;
import DAO.ClienteDAO;
import Model.Cliente;
import TableModels.ClienteTableModel;
import TableModels.GenericTableModel;
import java.util.regex.PatternSyntaxException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author martin_ruediger
 */
public class ViewCliente extends javax.swing.JFrame {

    boolean editing;
    private GenericTableModel gtmCliente;

    public ViewCliente() {
        initComponents();
        gtmCliente = new ClienteTableModel(Cliente.class, new String[]{"id", "nome", "Status"});
        TablesCliente.setModel(gtmCliente);
        gtmCliente.setObjectList(ClienteBusiness.findAll());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablesCliente = new javax.swing.JTable();
        saveCli = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        estado = new javax.swing.JComboBox();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        pesquisa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listagem de clientes - HSystems");
        setResizable(false);

        TablesCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Estado"
            }
        ));
        TablesCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablesClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablesCliente);

        saveCli.setText("Salvar Cliente");
        saveCli.setEnabled(false);
        saveCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCliActionPerformed(evt);
            }
        });

        txtNome.setEnabled(false);

        estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativar", "Desativar" }));
        estado.setEnabled(false);

        txtID.setEditable(false);
        txtID.setEnabled(false);

        jLabel1.setText("ID");

        jLabel2.setText("Nome");

        jButton1.setText("Novo Cliente");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Status");

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisaKeyReleased(evt);
            }
        });

        jLabel4.setText("Pesquisa pro nome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel2)
                                .addGap(111, 111, 111)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveCli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisa)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveCli))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCliActionPerformed
        Cliente cliente = new Cliente();
        cliente.setNome(txtNome.getText());
        cliente.setStatus(true);

        if (!editing) {
            if (!gtmCliente.getObjectList().contains(cliente)) {
                txtNome.setEnabled(true);
                if (txtNome.getText().isEmpty() || txtNome.getText().equalsIgnoreCase(" ") || txtNome.getText().contains("  ") || txtNome.getText().contains(".") || txtNome.getText().contains("-")) {
                    JOptionPane.showMessageDialog(rootPane, "Nome inválido, tente novamente", "ERRO 404", 2);
                } else {
                    ClienteBusiness.create(cliente);
                    gtmCliente.add(cliente);
                    txtNome.setText("");
                    txtNome.setEnabled(false);
                    saveCli.setEnabled(false);
                    estado.setEnabled(false);
                    pesquisa.setText("");
                    pesquisaKeyReleased(null);
                }
            }
        } else {
            if (txtNome.getText().isEmpty() || txtNome.getText().equalsIgnoreCase(" ") || txtNome.getText().contains("  ") || txtNome.getText().contains(".") || txtNome.getText().contains("-")) {
                JOptionPane.showMessageDialog(rootPane, "Nome inválido, tente novamente", "ERRO 404", 2);
            } else {
                Cliente cliente2 = (Cliente) gtmCliente.getObjectList().get(TablesCliente.convertRowIndexToModel(TablesCliente.getSelectedRow()));
                cliente.setId(cliente2.getId());
                ClienteBusiness.update(cliente);
                if (cliente2.isStatus() == true && estado.getSelectedIndex() == 0 || cliente2.isStatus() == false && estado.getSelectedIndex() == 1) {
                } else if (cliente2.isStatus() == true && estado.getSelectedIndex() == 1 || cliente2.isStatus() == false && estado.getSelectedIndex() == 0) {
                    ClienteBusiness.changeStatus((Cliente) gtmCliente.getObjectList().get(TablesCliente.convertRowIndexToModel(TablesCliente.getSelectedRow())));
                }
                gtmCliente.setObjectList(ClienteBusiness.findAll());
                gtmCliente.fireTableDataChanged();
                txtNome.setText("");
                txtNome.setEnabled(false);
                estado.setEnabled(false);
                saveCli.setEnabled(false);
                jButton1.setEnabled(true);
                TablesCliente.getSelectionModel().clearSelection();
                pesquisa.setText("");
                pesquisaKeyReleased(null);
            }

        }
    }//GEN-LAST:event_saveCliActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtNome.setEnabled(true);
        saveCli.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TablesClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablesClienteMouseClicked
        txtNome.setEnabled(true);
        Cliente cliente1 = (Cliente) gtmCliente.getObjectList().get(TablesCliente.convertRowIndexToModel(TablesCliente.getSelectedRow()));
        estado.setSelectedIndex((cliente1.isStatus()) ? 0 : 1);
        txtNome.setText(cliente1.getNome());
        estado.setEnabled(true);
        saveCli.setEnabled(true);
        txtID.setText(cliente1.getId() + "");
        editing = true;

        if (editing) {
            jButton1.setEnabled(false);
        }
    }//GEN-LAST:event_TablesClienteMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        editing = false;
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new View().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaKeyReleased
        ClienteTableModel tabela_clientes = (ClienteTableModel) TablesCliente.getModel();
        final TableRowSorter<ClienteTableModel> sorter = new TableRowSorter<ClienteTableModel>(tabela_clientes);
        TablesCliente.setRowSorter(sorter);
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
                new ViewCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablesCliente;
    private javax.swing.JComboBox estado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pesquisa;
    private javax.swing.JButton saveCli;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
