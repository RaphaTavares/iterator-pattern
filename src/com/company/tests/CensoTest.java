package com.company.tests;

import com.company.Academia;
import com.company.Censo;
import com.company.Cliente;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CensoTest {

    @Test
    public void deveContarClientesAulasAcademia(){
        Academia academia = new Academia(
                new Cliente("Raphael", true),
                new Cliente( "Raphaela", true),
                new Cliente("Flavio", false),
                new Cliente("Natalia", false)
        );
        assertEquals(2, Censo.contarClientesAulasAcademia(academia));
    }

    public void deveContarTotalClientesAcademia(){
        Academia academia = new Academia(
                new Cliente("Raphael", true),
                new Cliente( "Raphaela", true),
                new Cliente("Flavio", false),
                new Cliente("Natalia", false)
        );
        assertEquals(4, Censo.contarTotalClientesAcademia(academia));
    }

    public void deveDarPromocaoClientes(){
        Academia academia = new Academia(
                new Cliente("Raphael", true),
                new Cliente( "Raphaela", true),
                new Cliente("Flavio", false),
                new Cliente("Natalia", false)
        );
        Censo.PromocaoAulasGratuitas(academia);
        assertEquals(4, Censo.contarClientesAulasAcademia(academia));
    }
}
