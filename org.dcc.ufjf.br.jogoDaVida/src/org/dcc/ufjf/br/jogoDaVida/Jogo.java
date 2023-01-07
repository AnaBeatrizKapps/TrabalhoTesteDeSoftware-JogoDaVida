package org.dcc.ufjf.br.jogoDaVida;

import java.util.Random;

public class Jogo {
	public static final int TAMANHO = 6;

	public Integer[][] atualizaTabuleiro(Integer[][] b) {
		Integer tabuleiro [][] = new Integer[TAMANHO][TAMANHO];
		copiaTabuleiro(b, tabuleiro);
		
		for (int row = 0; row < TAMANHO; row++) {  
			for (int col = 0; col < TAMANHO; col++) {

				if(tabuleiro[row][col] == 1 && quantidadeVizinhos(row, col, tabuleiro) < 2) {
					System.out.println("Célula (" + row + ", " + col + ") morre - menos 2 vizinhos vivos.");
					tabuleiro[row][col] = 0;
				}

                if(tabuleiro[row][col] == 1 && quantidadeVizinhos(row, col, tabuleiro) > 3) {
                	System.out.println("Célula (" + row + ", " + col + ") morre - mais de 3 vizinhos vivos.");
                	tabuleiro[row][col] = 0;
                }

                if(tabuleiro[row][col] == 0 && quantidadeVizinhos(row, col, tabuleiro) == 3){
                	System.out.println("Célula (" + row + ", " + col + ") vive - tem exatamente 3 vizinhos vivos.");
                	tabuleiro[row][col] = 1;
                }
                
                if(quantidadeVizinhos(row, col, tabuleiro) == 2){
                	System.out.println("Célula (" + row + ", " + col + ") mantém - tem exatamente 2 vizinhos vivos.");
                }
			}
		}
		
		return tabuleiro;
	}
	
	public void copiaTabuleiro(Integer[][] b1, Integer[][] b2){
		for(int i = 0; i < TAMANHO; i++){
			for(int j = 0; j < TAMANHO; j++){
				b2[i][j] = b1[i][j];
			}
		}
	}
	
	public int quantidadeVizinhos(int i, int j, Integer[][] tabuleiro) {
		int limiteEsquerda = j - 1 >= 0? j - 1 : -1;
        int limiteDireita = j + 1 < TAMANHO? j + 1 : -1;
        int limiteBaixo = i + 1 < TAMANHO? i + 1 : -1;
        int limiteCima = i - 1 >= 0? i - 1 : -1;
        
        int quantidadeVizinhos = 0;
        
        for (int row = 0; row < TAMANHO; row++) {  
			for (int col = 0; col < TAMANHO; col++) {
				
				if(row == i && col == j)
                    continue;
				
                if(limiteEsquerda == -1 && limiteCima == -1){
                    if((row <= limiteBaixo) && (col <= limiteDireita)){
                        if(tabuleiro[row][col] == 1)
                            quantidadeVizinhos ++;
                    }
                    continue;
                }
                
                if(limiteDireita == -1 && limiteCima == -1){
                    if((row <= limiteBaixo) && (col >= limiteEsquerda)){
                        if(tabuleiro[row][col] == 1)
                            quantidadeVizinhos ++;
                    }
                    continue;
                }
                
                if(limiteEsquerda == -1  && limiteBaixo == -1){
                    if((row >= limiteCima) && (col <= limiteDireita )){
                    	if(tabuleiro[row][col] == 1)
                            quantidadeVizinhos ++;
                    }
                    continue;
                }

                if(limiteDireita == -1 && limiteBaixo == -1){
                    if((row >= limiteCima) && (col >= limiteEsquerda)){
                    	if(tabuleiro[row][col] == 1)
                            quantidadeVizinhos ++;
                    }
                    continue;
                }
                
                if(limiteEsquerda == -1){
                    if((row <= limiteBaixo && row >= limiteCima) && (col <= limiteDireita)){
                    	if(tabuleiro[row][col] == 1)
                            quantidadeVizinhos ++;
                    }
                    continue;
                }

                if(limiteDireita == -1){
                    if((row <= limiteBaixo && row >= limiteCima) && (col >= limiteEsquerda)){
                    	if(tabuleiro[row][col] == 1)
                            quantidadeVizinhos ++;
                    }
                    continue;
                }

                if(limiteBaixo == -1){
                    if((row >= limiteCima) && (col >= limiteEsquerda && col <= limiteDireita )){
                    	if(tabuleiro[row][col] == 1)
                            quantidadeVizinhos ++;
                    }
                    continue;
                }

                if(limiteCima == -1){
                    if((row <= limiteBaixo) && (col >= limiteEsquerda && col <= limiteDireita )){
                    	if(tabuleiro[row][col] == 1)
                            quantidadeVizinhos ++;
                    }
                    continue;
                }
                
                if((row <= limiteBaixo && row >= limiteCima) && (col >= limiteEsquerda && col <= limiteDireita )){
                	if(tabuleiro[row][col] == 1)
                        quantidadeVizinhos ++;
                }
			}
        }
		
		return quantidadeVizinhos;
	}
	
}
