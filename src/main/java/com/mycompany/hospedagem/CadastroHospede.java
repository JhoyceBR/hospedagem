
package com.mycompany.hospedagem;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author joyce
 */
public class CadastroHospede {
    private List<Hospede> hospedes;
    
    public CadastroHospede(){
        this.hospedes = new LinkedList<>();
    }
    public CadastroHospede(Hospede h){
        hospedes.add(h);
    }
    
}
