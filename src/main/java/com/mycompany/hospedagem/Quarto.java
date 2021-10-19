package com.mycompany.hospedagem;

/**
 * @author joyce
 */
public class Quarto {
    private String id; 
    private String codResidencia; // fk
    private double ValorDiaria;
    private int NumeroMaxHospede;
    private boolean ArCondicionado;
    private boolean Hidromassagem;
    
    public Quarto(String ID_Quarto, String codResidencia, double ValorDiaria, int NumeroMaxHospede, boolean ArCondicionado, boolean Hidromassagem){
        this.id = ID_Quarto;
        this.codResidencia = codResidencia;
        this.ValorDiaria = ValorDiaria;
        this.NumeroMaxHospede = NumeroMaxHospede;
        this.ArCondicionado = ArCondicionado;
        this.Hidromassagem = Hidromassagem;
    }
    
    public Quarto(){
        
    }
    
    public String getCodResidencia(){
        return codResidencia;
    }
    public void setCodResidencia(String codResidencia){
        this.codResidencia = codResidencia;
        
    }
    public String getID(){
        return id;
    }
    public void setID(String ID_Quarto){
        this.id = ID_Quarto;
    }
    
    public double getValorDiaria(){
        return ValorDiaria;
    }
    public void setValorDiaria(double ValorDiaria){
        this.ValorDiaria = ValorDiaria;
    }
    
    public int getNumeroMaxHospede(){
        return NumeroMaxHospede;
    }
    public void setNumeroMaxHospede(int NumeroMaxHospede){
        this.NumeroMaxHospede = NumeroMaxHospede;
    }
    
    public boolean getArCondicionado(){
        return ArCondicionado;
    }
    public void setArCondicionado(boolean ArCondicionado){
        this.ArCondicionado = ArCondicionado;
    }
    
    public boolean getHidromassagem(){
        return Hidromassagem;
    }
    public void setHidromassagem(boolean Hidromassagem){
        this.Hidromassagem = Hidromassagem;
    }
    
    public String toString(){
        return "Dados do quarto: " + "\n" + 
                "ID do quarto: " + id + "\n" +
                "Valor da diária: " + ValorDiaria + "\n" +
                "Número máximo de hospedes: " + NumeroMaxHospede + "\n" +
                "Possui ar condicionado: " + ArCondicionado + "\n" + 
                "Possui hidromassagem: " + Hidromassagem;
    }
}
