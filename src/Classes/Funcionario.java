package Classes;

import java.util.ArrayList;

public class Funcionario {
    String nome;
    int id;
    String permissao;
    String usuario;
    String senha;
    ArrayList<Funcionario> listaFuncionarios;
    
    
    
    
    public Funcionario(){
        listaFuncionarios = new ArrayList();
    }

    public Funcionario(String nome, int id, String permissao, String usuario, String senha) {
        this.nome = nome;
        this.id = id;
        this.permissao = permissao;
        this.usuario = usuario;
        this.senha = senha;
        listaFuncionarios = new ArrayList();
    }

    public Funcionario(String nome, String sobrenome, int id, String permissao, String usuario, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public Funcionario(String nome, int id, String permissao, String usuario, char[] senha) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String isPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String visualizarFuncionarios(){
             return "Nome: " + nome + "\nIdentificação: " + id + "\nPermissão: " + permissao + "\nUsuário: " + usuario + "\nSenha: " + senha;
    }
}
