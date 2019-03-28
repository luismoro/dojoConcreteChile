package com.example.dojo.service;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4ClassRunner.class)
public class DiamanteServiceTest {

    @Test
    public void onInputAPrintA(){
        DiamanteService diamanteService = new DiamanteService();
        String s = diamanteService.generaDiamante( "A");
        assertEquals("a", s);
    }

    @Test
    public void onInputBPrintB(){
        DiamanteService diamanteService = new DiamanteService();
        String s = diamanteService.generaDiamante( "B");
        assertEquals(" a\nb b\n a ", s);
    }

    @Test
    public void onInputCPrintDiamante(){
        DiamanteService diamanteService = new DiamanteService();
        String s = diamanteService.generaDiamante( "C");
        assertEquals(" a\nb b\nc  c\nb b\n a", s);
    }

    @Test
    public void onInputDPrintDiamante(){
        DiamanteService diamanteService = new DiamanteService();
        String s = diamanteService.generaDiamante( "D");
        assertEquals(" a\nb b\nc  c\nd   d\nc  c\nb b\n a", s);
    }

}