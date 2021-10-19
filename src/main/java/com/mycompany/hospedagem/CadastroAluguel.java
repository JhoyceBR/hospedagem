package com.mycompany.hospedagem;

import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author joyce
 */

public class CadastroAluguel {
    private List<Aluguel> aluguel;
    
    public CadastroAluguel(){
        this.aluguel = new LinkedList<>();
    }
    public CadastroAluguel(Aluguel a){
        aluguel.add(a);
    }
}