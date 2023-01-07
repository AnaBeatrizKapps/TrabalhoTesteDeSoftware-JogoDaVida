package org.dcc.ufjf.br.jogoDaVida.test;

import org.junit.Assert;

import org.dcc.ufjf.br.jogoDaVida.Jogo;
import org.junit.Test;

public class jogoDaVidaTest {

	@Test
	public void test() {
		Jogo f = new Jogo();
		Integer[][] entrada = {
			{0, 1, 0, 1, 0, 0},
			{0, 0, 1, 1, 1, 0},
			{0, 0, 1, 0, 1, 1},
			{0, 0, 0, 0, 0, 1},
			{0, 1, 0, 0, 0, 1},
			{1, 0, 0, 1, 1, 1}
		};
		
		Integer[][] saidaEsperada = {
			{0, 0, 1, 0, 0, 0},
			{0, 1, 0, 0, 1, 1},
			{0, 0, 0, 0, 0, 1},
			{0, 0, 0, 0, 1, 1},
			{0, 0, 0, 1, 0, 0},
			{0, 0, 0, 1, 1, 0}
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.atualizaTabuleiro(entrada));
	}
	
	@Test
	public void test2() {
		Jogo f = new Jogo();
		Integer[][] entrada = {
			{0, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 0, 0},
			{0, 1, 1, 1, 0, 0},
			{0, 1, 1, 1, 0, 0},
			{0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0}
		};
		
		Integer[][] saidaEsperada = {
			{0, 0, 1, 1, 0, 0},
			{0, 0, 0, 0, 0, 0},
			{0, 1, 0, 1, 0, 0},
			{0, 1, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0}
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.atualizaTabuleiro(entrada));
	}
	
	@Test
	public void test3() {
		Jogo f = new Jogo();
		Integer[][] entrada = {
				{1, 0, 0, 1, 0, 1}, 
				{0, 1, 1, 1, 1, 1}, 
				{1, 1, 1, 1, 1, 0}, 
				{1, 0, 1, 1, 1, 1}, 
				{1, 1, 1, 0, 1, 0}, 
				{0, 0, 1, 1, 1, 1}, 
		};
		
		Integer[][] saidaEsperada = {
				{0, 0, 0, 1, 0, 1}, 
				{1, 0, 0, 0, 0, 1}, 
				{1, 0, 1, 0, 0, 1}, 
				{1, 0, 0, 0, 1, 1}, 
				{1, 0, 1, 0, 0, 0}, 
				{0, 1, 1, 1, 1, 0}, 
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.atualizaTabuleiro(entrada));
	}
	
	@Test
	public void test4() {
		Jogo f = new Jogo();
		Integer[][] entrada = {
				{0, 0, 0, 1, 1, 0}, 
				{0, 0, 1, 1, 0, 0}, 
				{0, 1, 0, 0, 0, 1}, 
				{0, 1, 1, 1, 0, 0}, 
				{0, 0, 0, 0, 1, 1}, 
				{1, 0, 1, 1, 0, 0}, 
		};
		
		Integer[][] saidaEsperada = {
				{0, 0, 1, 0, 0, 0}, 
				{0, 1, 0, 0, 0, 0}, 
				{1, 0, 0, 0, 0, 0}, 
				{0, 1, 1, 1, 1, 1}, 
				{0, 0, 0, 0, 0, 1}, 
				{0, 0, 0, 0, 0, 0},
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.atualizaTabuleiro(entrada));
	}
	
	@Test
	public void test5() {
		Jogo f = new Jogo();
		Integer[][] entrada = {
				{1, 1, 1, 0, 1, 0}, 
				{1, 1, 0, 0, 0, 1}, 
				{0, 1, 0, 1, 1, 1}, 
				{0, 1, 0, 1, 0, 1}, 
				{0, 1, 0, 0, 1, 0}, 
				{1, 0, 0, 1, 1, 1}, 
		};
		
		Integer[][] saidaEsperada = {
				{1, 0, 0, 0, 0, 0}, 
				{1, 1, 1, 1, 0, 1}, 
				{0, 0, 0, 0, 0, 1}, 
				{0, 0, 0, 0, 1, 1}, 
				{0, 0, 0, 0, 0, 0}, 
				{0, 0, 0, 0, 0, 0}, 
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.atualizaTabuleiro(entrada));
	}
	
	@Test
	public void test6() {
		Jogo f = new Jogo();
		Integer[][] entrada = {
				{0, 0, 1, 0, 0, 0}, 
				{0, 1, 0, 1, 0, 1}, 
				{1, 1, 0, 1, 1, 1}, 
				{1, 1, 0, 1, 1, 0}, 
				{1, 1, 0, 0, 1, 0}, 
				{1, 1, 0, 0, 0, 1},
		};
		
		Integer[][] saidaEsperada = {
				{0, 0, 1, 0, 0, 0}, 
				{1, 0, 0, 1, 0, 1}, 
				{0, 1, 0, 0, 0, 1}, 
				{0, 1, 0, 1, 1, 1}, 
				{0, 1, 0, 1, 0, 1}, 
				{1, 1, 1, 0, 1, 1},
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.atualizaTabuleiro(entrada));
	}
	
	@Test
	public void test7() {
		Jogo f = new Jogo();
		Integer[][] entrada = {
				{0, 1, 0, 1, 1, 1}, 
				{0, 0, 1, 0, 1, 0}, 
				{0, 1, 0, 0, 0, 0}, 
				{1, 0, 1, 0, 0, 1}, 
				{0, 0, 0, 1, 0, 0}, 
				{1, 1, 1, 1, 1, 0}, 
		};
		
		Integer[][] saidaEsperada = {
				{0, 0, 0, 1, 1, 1}, 
				{0, 0, 1, 0, 1, 1}, 
				{0, 1, 1, 0, 1, 0}, 
				{0, 1, 0, 1, 0, 0}, 
				{1, 0, 0, 0, 1, 0}, 
				{1, 1, 1, 1, 1, 0},
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.atualizaTabuleiro(entrada));
	}
	
	@Test
	public void test8() {
		Jogo f = new Jogo();
		Integer[][] entrada = {
				{1, 0, 1, 0, 0, 0}, 
				{1, 0, 1, 0, 0, 0}, 
				{0, 1, 0, 0, 1, 1}, 
				{0, 1, 0, 1, 1, 0}, 
				{0, 1, 0, 1, 0, 1}, 
				{0, 1, 0, 0, 1, 0},
		};
		
		Integer[][] saidaEsperada = {
				{0, 1, 1, 0, 0, 0}, 
				{1, 0, 1, 1, 1, 1}, 
				{1, 0, 0, 0, 0, 1}, 
				{1, 1, 0, 1, 0, 0}, 
				{0, 1, 0, 1, 0, 0}, 
				{0, 0, 0, 0, 0, 0}, 
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.atualizaTabuleiro(entrada));
	}
	
	@Test
	public void test9() {
		Jogo f = new Jogo();
		Integer[][] entrada = {
				{0, 0, 0, 0, 1, 1}, 
				{0, 1, 0, 0, 1, 0}, 
				{1, 1, 1, 1, 1, 1}, 
				{0, 1, 0, 1, 0, 1}, 
				{1, 0, 1, 0, 0, 1}, 
				{0, 0, 0, 1, 0, 1},
		};
		
		Integer[][] saidaEsperada = {
				{0, 0, 0, 0, 1, 1}, 
				{1, 0, 1, 0, 0, 0}, 
				{1, 0, 0, 1, 0, 0}, 
				{1, 0, 1, 1, 0, 0}, 
				{0, 1, 0, 1, 0, 0}, 
				{0, 0, 1, 1, 1, 0},
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.atualizaTabuleiro(entrada));
	}
	
	@Test
	public void test10() {
		Jogo f = new Jogo();
		Integer[][] entrada = {
				{1, 1, 1, 1, 0, 0}, 
				{0, 1, 0, 1, 0, 1}, 
				{1, 0, 1, 0, 0, 1}, 
				{1, 1, 1, 0, 1, 0}, 
				{0, 0, 0, 1, 1, 0}, 
				{0, 0, 1, 1, 1, 0},
		};
		
		Integer[][] saidaEsperada = {
				{1, 1, 0, 0, 0, 0}, 
				{0, 0, 1, 1, 1, 1}, 
				{1, 0, 0, 0, 0, 1}, 
				{1, 1, 1, 0, 1, 1}, 
				{0, 0, 0, 0, 0, 1}, 
				{0, 0, 0, 0, 0, 0},
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.atualizaTabuleiro(entrada));
	}
	
	@Test
	public void test11() {
		Jogo f = new Jogo();
		Integer[][] entrada = {
				{1, 1, 0, 0, 0, 1}, 
				{0, 1, 0, 1, 0, 0}, 
				{1, 1, 0, 0, 0, 1}, 
				{0, 0, 1, 0, 0, 0}, 
				{1, 1, 0, 1, 0, 0}, 
				{1, 1, 0, 1, 1, 1}, 
		};
		
		Integer[][] saidaEsperada = {
				{1, 1, 1, 0, 0, 0}, 
				{0, 0, 0, 0, 0, 0}, 
				{0, 0, 0, 0, 0, 0}, 
				{0, 1, 1, 0, 0, 0}, 
				{0, 0, 0, 1, 0, 0}, 
				{0, 0, 0, 1, 1, 0},
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.atualizaTabuleiro(entrada));
	}
	
	@Test
	public void test12() {
		Jogo f = new Jogo();
		Integer[][] entrada = {
				{1, 0, 0, 0, 0, 0}, 
				{0, 0, 1, 0, 1, 1}, 
				{0, 1, 1, 0, 1, 1}, 
				{1, 0, 1, 1, 0, 0}, 
				{0, 0, 1, 1, 1, 0}, 
				{0, 0, 1, 0, 0, 0}, 
		};
		
		Integer[][] saidaEsperada = {
				{0, 0, 0, 0, 0, 0}, 
				{0, 1, 1, 0, 1, 1}, 
				{1, 0, 0, 0, 0, 1}, 
				{0, 1, 0, 1, 0, 0}, 
				{0, 1, 0, 1, 1, 0}, 
				{0, 0, 1, 1, 1, 0}, 
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.atualizaTabuleiro(entrada));
	}
	
	@Test
	public void test13() {
		Jogo f = new Jogo();
		Integer[][] entrada = {
				{0, 1, 1, 0, 0, 1}, 
				{1, 1, 1, 1, 1, 0}, 
				{0, 1, 1, 0, 1, 1}, 
				{0, 1, 1, 1, 1, 1}, 
				{1, 1, 0, 1, 1, 0}, 
				{0, 0, 1, 1, 0, 1}, 
		};
		
		Integer[][] saidaEsperada = {
				{1, 0, 1, 0, 1, 1}, 
				{1, 0, 0, 0, 0, 0}, 
				{1, 0, 1, 0, 0, 1}, 
				{0, 0, 0, 0, 0, 1}, 
				{0, 0, 1, 0, 1, 1}, 
				{0, 0, 1, 1, 0, 1}, 
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.atualizaTabuleiro(entrada));
	}
	
	@Test
	public void test14() {
		Jogo f = new Jogo();
		Integer[][] entrada = {
				{1, 1, 1, 0, 0, 0}, 
				{1, 1, 1, 0, 0, 0}, 
				{1, 0, 0, 1, 0, 0}, 
				{0, 0, 1, 1, 0, 1}, 
				{1, 0, 1, 1, 1, 0}, 
				{0, 0, 1, 0, 1, 1}, 
		};
		
		Integer[][] saidaEsperada = {
				{1, 0, 1, 0, 0, 0}, 
				{1, 0, 1, 1, 0, 0}, 
				{0, 1, 0, 0, 1, 0}, 
				{0, 0, 0, 0, 0, 1}, 
				{0, 0, 1, 0, 1, 0}, 
				{0, 0, 0, 1, 1, 1},
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.atualizaTabuleiro(entrada));
	}
	
	@Test
	public void test15() {
		Jogo f = new Jogo();
		Integer[][] entrada = {
				{0, 1, 0, 1, 1, 1}, 
				{1, 0, 0, 0, 1, 0}, 
				{1, 1, 1, 1, 1, 0}, 
				{0, 0, 1, 0, 1, 0}, 
				{0, 0, 0, 1, 0, 1}, 
				{1, 1, 1, 0, 0, 0},
		};
		
		Integer[][] saidaEsperada = {
				{0, 0, 0, 1, 1, 1}, 
				{1, 0, 0, 0, 0, 1}, 
				{1, 0, 1, 0, 1, 1}, 
				{0, 1, 1, 0, 0, 1}, 
				{1, 0, 0, 1, 1, 1}, 
				{1, 1, 1, 1, 0, 0},
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.atualizaTabuleiro(entrada));
	}
	
	@Test
	public void test16() {
		Jogo f = new Jogo();
		Integer[][] entrada = {
				{1, 0, 1, 1, 0, 1}, 
				{1, 0, 1, 0, 0, 1}, 
				{0, 1, 1, 1, 1, 0}, 
				{1, 0, 1, 1, 0, 0}, 
				{0, 0, 1, 0, 1, 0}, 
				{0, 1, 1, 0, 0, 1}, 
		};
		
		Integer[][] saidaEsperada = {
				{0, 1, 1, 1, 1, 1}, 
				{1, 0, 0, 0, 0, 1}, 
				{1, 0, 1, 0, 1, 0}, 
				{0, 0, 1, 0, 0, 0}, 
				{0, 0, 1, 0, 0, 0}, 
				{0, 1, 1, 0, 0, 0}, 
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.atualizaTabuleiro(entrada));
	}
	
	@Test
	public void test17() {
		Jogo f = new Jogo();
		Integer[][] entrada = {
				{0, 1, 0, 1, 0, 0}, 
				{0, 0, 0, 0, 0, 1}, 
				{0, 0, 1, 1, 1, 1}, 
				{1, 0, 1, 1, 0, 0}, 
				{0, 0, 1, 1, 0, 1}, 
				{0, 1, 0, 1, 0, 0}, 
		};
		
		Integer[][] saidaEsperada = {
				{0, 0, 0, 0, 0, 0}, 
				{0, 0, 0, 1, 0, 1}, 
				{0, 1, 0, 0, 0, 0}, 
				{0, 1, 0, 1, 1, 0}, 
				{0, 1, 0, 1, 0, 0}, 
				{0, 0, 1, 1, 0, 0}, 
		};
		
		Assert.assertArrayEquals(saidaEsperada, f.atualizaTabuleiro(entrada));
	}
	
}
