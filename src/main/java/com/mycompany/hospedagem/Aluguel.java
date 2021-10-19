package com.mycompany.hospedagem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * formatat a hora e olhar a questão do retorno. 
 * @author joyce
 */
public class Aluguel {
    private Double Valor;
    private long NDiarias;
    private String id;

    private Hospede hospede; 
    private Quarto quarto;
    private Calendar DataEntrada = Calendar.getInstance();
    private Calendar DataSaida = Calendar.getInstance();

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    
    public Aluguel(Hospede InfHospede, Quarto InfQuarto, String dataEntrada, String dataSaida, String id){
        this.hospede = InfHospede;
        this.quarto = InfQuarto;
        
        try {
            DataEntrada.setTime(sdf.parse(dataEntrada));
        } catch (ParseException ex) {
            Logger.getLogger(Aluguel.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            DataSaida.setTime(sdf.parse(dataSaida));
        } catch (ParseException ex) {
            Logger.getLogger(Aluguel.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.id = id;
    }

    public Hospede getHospede(){
        return hospede;
    }
    public void setHospede(Hospede InfHospede){
        this.hospede = InfHospede;
    }
    
    public Quarto getQuarto(){
        return quarto;
    }
    public void setQuarto(Quarto InfQuarto){
        this.quarto = InfQuarto;
    }
    
    public Calendar getDataEntrada(){
        return DataEntrada;
    }
    public void setDataEntrada(Calendar DataEntrada){
        this.DataEntrada = DataEntrada;
    }
    
    public Calendar getDataSaida(){
        return DataSaida;
    }
    public void setDataSaida(Calendar DataSaida){
        this.DataSaida = DataSaida;
    }
    
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    
    public String toString(){
        return "Dados do aluguel: " + "\n" +
                "Hospede: " + hospede + "\n" +
                "Quarto: " + quarto + "\n" +
                "Data de Entrada: " + DataEntrada + "\n" +  
                "Data de Saída: " + DataSaida + "\n"; 
    }
    
    public int CalcularDiarias(){
 
        long diferenca = DataSaida.getTimeInMillis() - DataEntrada.getTimeInMillis(); // subtrai em milissegundos    
 
        NDiarias = diferenca / (24 * 60 * 60 * 1000); // converte para dias
        
        int hora = DataSaida.get(Calendar.HOUR_OF_DAY);
       
        if((hora > 12)){ 
            NDiarias ++;
        }
        
        return (int) NDiarias;
    }
    
    public Double CalcularValorFinal(){
        Valor = quarto.getValorDiaria() * NDiarias;
        return Valor * (int) NDiarias;
    }
}
