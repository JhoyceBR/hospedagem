package com.mycompany.hospedagem;

/**
 *
 * @author joyce
 */
public class Residencia {
    private String codResidencia;
    private String Rua;
    private int Numero;
    private String Bairro;
    private String Cep;
    private String Telefone;
    private String Email;
    private int quartos;
    
    public Residencia(String codResidencia, String Rua, int Numero, String Bairro, String Cep, String Telefone, String Email, int quartos){
        this.codResidencia = codResidencia;
        this.Rua = Rua;
        this.Numero = Numero;
        this.Bairro = Bairro;
        this.Cep = Cep;
        this.Telefone = Telefone;
        this.Email = Email;
        this.quartos = quartos;
    }
    public Residencia(){
        
    }
    public String getCodResidencia(){
        return codResidencia;
    }
    public void setCodResidencia(String codResidencia){
        this.codResidencia = codResidencia;
    }
    
    public String getRua(){
        return Rua;
    }
    public void setRua(String Rua){
        this.Rua = Rua;
    }
    
    public int getNumero(){
        return Numero;
    }
    public void setNumero(int Numero){
        this.Numero = Numero;
    }
    
    public String getBairro(){
        return Bairro;
    }
    public void setBairro(String Bairro){
        this.Bairro = Bairro;
    }
    
    public String getCep(){
        return Cep;
    }
    public void setCep(String Cep){
        this.Cep = Cep;
    }
    
    public String getTelefone(){
        return Telefone;
    }
    public void setTelefone(String Telefone){
        this.Telefone = Telefone;
    }
    
    public String getEmail(){
        return Email;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }
    
    public int getQuartos(){
        return quartos;
    }
    public void setQuartos(int quartos){
        this.quartos = quartos;
    }
    
    public String toString(){
        return "Rua: " + Rua + "\n" + 
                "Número: " + Numero + "\n" +
                "Bairro: " + Bairro + "\n" +
                "Cep: " + Cep + "\n" +
                "Telefone: " + Telefone + "\n" +
                "Email: " + Email + "\n" + 
                "Quartos: " + quartos;
    }
}
