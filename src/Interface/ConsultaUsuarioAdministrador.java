package Interface;

import Classes.Funcionario;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ConsultaUsuarioAdministrador extends javax.swing.JFrame {

    
    ArrayList<Funcionario> listaFuncionario;       
    DefaultListModel defaultListModel;

    public ConsultaUsuarioAdministrador() {
        initComponents();
        
                
        //Criação ArrayList de Usuários pré cadastrados.
        listaFuncionario = new ArrayList();
        
        //Colocando todos os funcionarios dentro da lista.
        Funcionario funcionario1 = new Funcionario("João Mota", 01, "Atendente", "joao.mota", "projeto");
        Funcionario funcionario2 = new Funcionario("Matheus André", 02, "Administrador", "matheus.andre", "projeto");
        Funcionario funcionario3 = new Funcionario("Giuliano Neto", 03, "Administrador", "giuliano.neto", "projeto");
        Funcionario funcionario4 = new Funcionario("Lucas Ruggeri", 04, "Atendente", "lucas.ruggeri", "projeto");
        Funcionario funcionario5 = new Funcionario("Julia Alves", 01, "Administrador", "julia.alves", "projeto");
        listaFuncionario.add(funcionario1);
        listaFuncionario.add(funcionario2);
        listaFuncionario.add(funcionario3);
        listaFuncionario.add(funcionario4);
        listaFuncionario.add(funcionario5);
        //Colocando os nomes dos usuarios dentro de uma lsita default
        defaultListModel = new DefaultListModel();
        defaultListModel.addElement(funcionario1.getNome());
        defaultListModel.addElement(funcionario2.getNome());
        defaultListModel.addElement(funcionario3.getNome());
        defaultListModel.addElement(funcionario4.getNome());
        defaultListModel.addElement(funcionario5.getNome());
        //Colocando cada nome da lista default dentro da lista de usuários cadastrados.
        ListaUsuariosCadastradosConsulta.setModel(defaultListModel);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaUsuariosCadastradosConsulta = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInformacoesConsulta = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        ButtonAdicionarProduto = new javax.swing.JButton();
        ButtonRelatorioConsulta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtRelatorioUsuarioConsulta = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuSairConsulta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta (Usuários) - Administrador");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ListaUsuariosCadastradosConsulta.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaUsuariosCadastradosConsultaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListaUsuariosCadastradosConsulta);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Usuário");

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
        jLabel3.setText("Visão Geral ");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/png-transparent-xbox-controller-game-controllers-video-games-television-black-technology-black-and-white-joystick-thumbnail-removebg-preview.png"))); // NOI18N

        txtRelatorioUsuarioConsulta.setColumns(20);
        txtRelatorioUsuarioConsulta.setRows(5);
        jScrollPane4.setViewportView(txtRelatorioUsuarioConsulta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonRelatorioConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonAdicionarProduto))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel2))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2))
                                .addGap(8, 8, 8)))))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void ListaUsuariosCadastradosConsultaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaUsuariosCadastradosConsultaValueChanged
        String nome = ListaUsuariosCadastradosConsulta.getSelectedValue();
        for (Funcionario funcionario : listaFuncionario) {
            if (funcionario.getNome().equalsIgnoreCase(nome)) {
                txtInformacoesConsulta.setText(funcionario.visualizarFuncionarios());
            }
        }
    }//GEN-LAST:event_ListaUsuariosCadastradosConsultaValueChanged

    private void ButtonRelatorioConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRelatorioConsultaActionPerformed
        String relatorio = "";
                String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
        for (Funcionario funcionario : listaFuncionario) {
            relatorio += "\nSolicitação: "+ timeStamp+ "\n\n" +  funcionario.visualizarFuncionarios() + "\n--";
        }
        txtRelatorioUsuarioConsulta.setText(relatorio);
    }//GEN-LAST:event_ButtonRelatorioConsultaActionPerformed

    private void ButtonAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAdicionarProdutoActionPerformed
        Object[] opcoes = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null,
                "Adicionar mais produtos?", "Adicionar produto",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                opcoes, opcoes[0]);
        if (i == JOptionPane.YES_OPTION) {
            new CadastroUsuario().setVisible(true);
            this.dispose();
        }
        
        
    }//GEN-LAST:event_ButtonAdicionarProdutoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaUsuarioAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAdicionarProduto;
    private javax.swing.JButton ButtonRelatorioConsulta;
    private javax.swing.JList<String> ListaUsuariosCadastradosConsulta;
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
    private javax.swing.JTextArea txtRelatorioUsuarioConsulta;
    // End of variables declaration//GEN-END:variables
}
