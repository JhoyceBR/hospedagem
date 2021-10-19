/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hospedagem;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author joyce
 */
public class CadastroResidencia {
    
    private List<Residencia> residencia;
    
    public CadastroResidencia(){
        this.residencia = new LinkedList<>();
    }
    public CadastroResidencia(Residencia r){
        residencia.add(r);
    
    }
}
