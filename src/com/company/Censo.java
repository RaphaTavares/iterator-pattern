package com.company;

import java.util.Iterator;

public class Censo {

    public static Integer contarClientesAulasAcademia(Academia academia){
        int quantidade = 0;
        for(Cliente cliente : academia) {

        if(cliente.isAulas()){
            quantidade++;
            }
        }
        return quantidade;
    }

    public static void PromocaoAulasGratuitas(Academia academia){
        for(Cliente cliente: academia){
            cliente.setAulas(true);
        }
    }

    public static Integer contarTotalClientesAcademia(Academia academia){
        int quantidade = 0;
        for(Iterator a = academia.iterator(); a.hasNext(); ){
            quantidade++;
            a.next();
        }
        return quantidade;

    }
}
