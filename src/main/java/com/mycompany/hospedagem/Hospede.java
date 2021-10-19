package com.mycompany.hospedagem;

/**
 *
 * @author joyce
 */
public class Hospede {
    private String Nome;
    private String CPF;
    private String Endereco;
    private String Celular;
    private String Email;
    
    public Hospede(String Nome, String CPF, String Endereco, String Celular, String Email){
        this.Nome = Nome;
        this.CPF = CPF;
        this.Endereco = Endereco;
        this.Celular = Celular;
        this.Email = Email;
    }
    public Hospede(){
        
    }
    
    public String getNome(){
        return Nome;
    }
    public void setNome(String Nome){
        this.Nome = Nome;
    }
    
    public String getCPF(){
        return CPF;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    
    public String getEndereco(){
        return Endereco;
    }
    public void setEndereco(String Endereco){
        this.Endereco = Endereco;
    }
    
    public String getCelular(){
        return Celular;
    }
    public void setCelular(String Celular){
        this.Celular = Celular;
    }
    
    public String getEmail(){
        return Email;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }
    
    public String toString(){
        return "Dados do hospede: " + "\n" +
            "Nome: " + Nome + "\n" +
            "CPF: " + CPF + "\n" +
            "Endereço: " + Endereco + "\n" +
            "Celular: " + Celular + "\n" + 
            "Email: " + Email;
    }
}
