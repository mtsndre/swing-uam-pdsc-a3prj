package Interface;

import Classes.Produto;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ConsultaProdutoAtendente extends javax.swing.JFrame {

    ArrayList<Produto> listaProdutos;
    DefaultListModel defaultListModel;

    public ConsultaProdutoAtendente() {
        initComponents();
        listaProdutos = new ArrayList();
        Produto produto1 = new Produto("Warzone", 9876, (float) 0.00, "Sobrevivência", "Jogos Digitais", "Actvision", "18");
        Produto produto2 = new Produto("FIFA 22", 9999, (float) 200.00, "Esportes", "Jogos Digitais", "Eletronic Arts", "Livre");
        Produto produto3 = new Produto("Apple Store R$30,00", 0011, (float) 30.00, "Outros", "Gift Card", "Apple", "Livre");
        Produto produto4 = new Produto("2400 COD POINTS", 0055, (float) 140.00, "Outros", "Pacote", "Activision", "18");
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);
        defaultListModel = new DefaultListModel();
        defaultListModel.addElement(produto1.getNomeProduto());
        defaultListModel.addElement(produto2.getNomeProduto());
        defaultListModel.addElement(produto3.getNomeProduto());
        defaultListModel.addElement(produto4.getNomeProduto());
        ListaProdutosCadastradosConsulta.setModel(defaultListModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaProdutosCadastradosConsulta = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInformacoesConsulta = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        ButtonAdicionarProduto = new javax.swing.JButton();
        ButtonRelatorioConsulta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtRelatorioProdutoConsulta = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuSairConsulta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta (Produtos) - Atendente");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ListaProdutosCadastradosConsulta.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaProdutosCadastradosConsultaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListaProdutosCadastradosConsulta);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Produtos");

        txtInformacoesConsulta.setColumns(20);
        txtInformacoesConsulta.setRows(5);
        jScrollPane2.setViewportView(txtInformacoesConsulta);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Informações");

        ButtonAdicionarProduto.setBackground(new java.awt.Color(204, 204, 255));
        ButtonAdicionarProduto.setText("Adicionar");
        ButtonAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAdicionarProdutoActionPerformed(evt);
            }
        });

        ButtonRelatorioConsulta.setBackground(new java.awt.Color(204, 204, 255));
        ButtonRelatorioConsulta.setText("Exibir Tudo");
        ButtonRelatorioConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRelatorioConsultaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Visão Geral");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/png-transparent-xbox-controller-game-controllers-video-games-television-black-technology-black-and-white-joystick-thumbnail-removebg-preview.png"))); // NOI18N

        txtRelatorioProdutoConsulta.setColumns(20);
        txtRelatorioProdutoConsulta.setRows(5);
        jScrollPane4.setViewportView(txtRelatorioProdutoConsulta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonRelatorioConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonAdicionarProduto))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel2))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                                .addComponent(jScrollPane2)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonRelatorioConsulta)
                            .addComponent(ButtonAdicionarProduto)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4)))
                .addGap(15, 15, 15))
        );

        jMenu1.setText("Finalizar Sessão");

        MenuSairConsulta.setText("Sair");
        MenuSairConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSairConsultaActionPerformed(evt);
            }
        });
        jMenu1.add(MenuSairConsulta);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuSairConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairConsultaActionPerformed
        Object[] opcoes = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null,
                "Tem certeza que deseja sair?", "Saída",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                opcoes, opcoes[0]);
        if (i == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_MenuSairConsultaActionPerformed

    private void ListaProdutosCadastradosConsultaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaProdutosCadastradosConsultaValueChanged
        String nomeProduto = ListaProdutosCadastradosConsulta.getSelectedValue();
        for (Produto produto : listaProdutos) {
            if (produto.getNomeProduto().equalsIgnoreCase(nomeProduto)) {
                txtInformacoesConsulta.setText(produto.visualizarProdutos());
            }
        }
    }//GEN-LAST:event_ListaProdutosCadastradosConsultaValueChanged

    private void ButtonRelatorioConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRelatorioConsultaActionPerformed
        String relatorio = "";
        String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
        for (Produto produto : listaProdutos) {
            relatorio += "\nSolicitação: " + timeStamp + "\n\n" + produto.visualizarProdutos() + "\n--";
        }
        txtRelatorioProdutoConsulta.setText(relatorio);
    }//GEN-LAST:event_ButtonRelatorioConsultaActionPerformed

    private void ButtonAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAdicionarProdutoActionPerformed
        JOptionPane.showMessageDialog(null, "Você não possui permissão para realizar essa ação.");
    }//GEN-LAST:event_ButtonAdicionarProdutoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaProdutoAtendente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAdicionarProduto;
    private javax.swing.JButton ButtonRelatorioConsulta;
    private javax.swing.JList<String> ListaProdutosCadastradosConsulta;
    private javax.swing.JMenuItem MenuSairConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txtInformacoesConsulta;
    private javax.swing.JTextArea txtRelatorioProdutoConsulta;
    // End of variables declaration//GEN-END:variables
}
