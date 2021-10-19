package com.mycompany.hospedagem;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * classe principal 
 * @author joyce
 */
public class MainClass {
    public static void main(String[] args){
        /*HospedeDao hospede01 = new HospedeDao();
        Hospede h = new Hospede("joao", "78845512366", "rua da caixa, sao joao, guarabira - pb", "83996546612", "joao@lmail.com");
        hospede01.adicionarHospede(h);
        
        System.out.println(hospede01.listarHospede());
        System.out.println(hospede01.getHospedePeloCpf("78845512366"));
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Calendar validade = Calendar.getInstance();
    validade.set(2021, 07, 15); 
    
    Calendar diadehoje = Calendar.getInstance();
    diadehoje.set(2021, 07, 12);
    long diffInMillisec = validade.getTimeInMillis() - diadehoje.getTimeInMillis();     
 
                       // Get difference between two dates in days
    long diffInDays = diffInMillisec / (24 * 60 * 60 * 1000);       
    System.out.println(diffInDays);*/
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date hora = Calendar.getInstance().getTime(); // Ou qualquer outra forma que tem
           String dataFormatada = sdf.format(hora);
           System.out.println(hora);
    }  
    
}
