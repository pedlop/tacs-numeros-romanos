package com.br.ufg.inf.numerosRomanos;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

public class NumerosRomanosTeste {
    @Test
    public void converteNumeroTest(){
    	NumerosRomanos numerosRomanos = new NumerosRomanos();
    	
    	Assert.assertEquals(6, numerosRomanos.converteNumero("VI"));
    	Assert.assertEquals(4999, numerosRomanos.converteNumero("MMMMDCCCCLXXXXVIIII"));
    	Assert.assertEquals(1, numerosRomanos.converteNumero("I"));
    	Assert.assertEquals(660, numerosRomanos.converteNumero("DCLX"));
    	Assert.assertEquals(0, numerosRomanos.converteNumero("W"));

    }
}
