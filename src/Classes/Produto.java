package Classes;

import java.util.ArrayList;

public class Produto {
    String nomeProduto;
    int codigoProduto;
    float precoProduto;
    String categoriaProduto;
    String tipoProduto;
    String fornecedorProduto;
    String faixaProduto;
    ArrayList <Produto> listaProdutos;
    
    public Produto(){
        listaProdutos = new ArrayList();
    }

    public Produto(String nomeProduto, int codigoProduto, float precoProduto, String categoriaProduto, String tipoProduto, String fornecedorProduto, String faixaProduto) {
        this.nomeProduto = nomeProduto;
        this.codigoProduto = codigoProduto;
        this.precoProduto = precoProduto;
        this.categoriaProduto = categoriaProduto;
        this.tipoProduto = tipoProduto;
        this.fornecedorProduto = fornecedorProduto;
        this.faixaProduto = faixaProduto;
        listaProdutos = new ArrayList();
    }

    public Produto(String warzone) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public float getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(float precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getFornecedorProduto() {
        return fornecedorProduto;
    }

    public void setFornecedorProduto(String fornecedorProduto) {
        this.fornecedorProduto = fornecedorProduto;
    }

    public String getFaixaProduto() {
        return faixaProduto;
    }

    public void setFaixaProduto(String faixaProduto) {
        this.faixaProduto = faixaProduto;
    }
    public void adicionarProdutos(Produto produto){
        listaProdutos.add(produto);
    }
    
    public void removerProdutos(Produto produto){
        listaProdutos.remove(produto);
    }
    public String visualizarProdutos() {
        return "Nome: " + nomeProduto +
                "\nCodigo: " + codigoProduto +
                "\nPreço: R$" + precoProduto +
                "\nCategoria: " + categoriaProduto +
                "\nTipo: " + tipoProduto + 
                "\nFornecedor: " + fornecedorProduto +
                "\nFaixa etária:" + faixaProduto;
    }
}
