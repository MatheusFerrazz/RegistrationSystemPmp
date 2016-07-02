/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.registrationsystempmp.modelo;

/**
 *
 * @author Matheus
 */
public class Funcionario {
    private long idfuncionario;
    private String nome;
    private String secretaria;
    private String vinculo;
    private String setor;
    private String identificacao;
    private String endereco;
    private String numero;
    private String bairro;
    private String cidade;
    private String telefone;
    private String username;
    private String acesso;

    public Funcionario() {
    }
           
    @Override
    public String toString() {
        return "Funcionario{" + "idfuncion\u00e1rio=" + idfuncionario + ", nome=" + nome + ", secretaria=" + secretaria + ", vinculo=" + vinculo + ","
                + " setor=" + setor + ", identificacao=" + identificacao + ", endereco=" + endereco + ", numero=" + numero + ", bairro=" + bairro + ","
                + " cidade=" + cidade + ", telefone=" + telefone + ", username=" + username + ", acesso=" + acesso + '}';
    }
      
    public long getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(long idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(String secretaria) {
        this.secretaria = secretaria;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAcesso() {
        return acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }
    
    
    
}
