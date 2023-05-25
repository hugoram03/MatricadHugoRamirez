/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package matricadd;

import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Alumno
 */
public class MatricadNGTest {

    String[] dada = {"hola", "hoja", "taburete"};
    public MatricadNGTest() {
        String nulo = null;
        String[] vacio = new String[5];
    }

    @Test
    public void testMatricad() {
        String[] prueba = {"hola", "que", "tal", "como", "estas", "hola"};
        Matricad instance = new Matricad(prueba);
    }

    @Test
    public void testMatricad2() {
        Matricad instance = new Matricad(null);
    }

    @Test
    public void testMatricad3() {
        String[] vacio = new String[5];
        Matricad instance = new Matricad(vacio);
    }
    
    /**
     * Test of getCantidadCadenasQueEmpiezanCon method, of class Matricad.
     */
    @Test
    public void testGetCantidadCadenasQueEmpiezanCon() {
        System.out.println("getCantidadCadenasQueEmpiezanCon");
        char letra = 'h';
        Matricad instance = new Matricad(dada);
        int expResult = 2;
        int result = instance.getCantidadCadenasQueEmpiezanCon(letra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of hayCadenasQueEmpiezanPor method, of class Matricad.
     */
    @Test
    public void testHayCadenasQueEmpiezanPor() {
        System.out.println("hayCadenasQueEmpiezanPor");
        char letra = 't';
        Matricad instance = new Matricad(dada);
        boolean expResult = true;
        boolean result = instance.hayCadenasQueEmpiezanPor(letra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getConcatenacionCadenas method, of class Matricad.
     */
    @Test
    public void testGetConcatenacionCadenas() {
        System.out.println("getConcatenacionCadenas");
        Matricad instance = new Matricad(dada);
        String expResult = "hola hoja taburete";
        String result = instance.getConcatenacionCadenas();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getPosicionesDe method, of class Matricad.
     */
    @Test
    public void testGetPosicionesDe() {
        System.out.println("getPosicionesDe");
        String unaCadena = null;
        Matricad instance = new Matricad(dada);
        ArrayList expResult = null;
        ArrayList result = instance.getPosicionesDe(unaCadena);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.

    }

}
