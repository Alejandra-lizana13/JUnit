package tests;

import static org.junit.Assert.*; 


import org.junit.Test;

import syspagos.Empleado;
import excepciones.*;

public class TestEmpleado 
{
	@Test 
	public void establecerNumeroDeEmpleadoCorrecto() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerNumeroEmpleado("4");
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals(4,e.getNumeroEmpleado());
	}
	@Test
	public void estableceNombreEmpleadoCorrecto() {
		Empleado e = new Empleado();
		try {
			 e.estableceNombreEmpleado("AlejandraLizana");
		} catch (NombreEmpleadoException ex) {
			fail();
		}
		assertEquals("AlejandraLizana",e.getNombreEmpleado());
	}
	@Test 
	public void estableceMesesTrabajoCorrecto() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceMesesTrabajo("14");
        } catch (MesesTrabajoException ex) 
        {
        	fail();
        }
        assertEquals(14,e.getMesesTrabajo());
	}
	@Test
	public void establecerSerDirectivoCorrecto() {
		Empleado e = new Empleado();
		try {
			e.establecerSerDirectivo("-");
		} catch (CargoException ex) {
			fail();
		}
		assertEquals(false,e.getDirectivo());
	}
	@Test 
	public void calcularPrima() {
		Empleado e = new Empleado();
		try 
        {
            e.establecerNumeroEmpleado("4");
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals(4,e.getNumeroEmpleado());
        try {
			 e.estableceNombreEmpleado("AlejandraLizana");
		} catch (NombreEmpleadoException ex) {
			fail();
		}
		assertEquals("AlejandraLizana",e.getNombreEmpleado());
		try 
        {
            e.estableceMesesTrabajo("14");
        } catch (MesesTrabajoException ex) 
        {
        	fail();
        }
        assertEquals(14,e.getMesesTrabajo());
        try {
			e.establecerSerDirectivo("+");
		} catch (CargoException ex) {
			fail();
		}
		assertEquals(true,e.getDirectivo());
		
	}
	
	
}
