package entities;

import Exception.MovimentoInvalidoException;

public class Robo {
	protected int x;
	protected int y;
	protected String cor;
	protected int contadorMovimentosValidosRobo = 0;
	protected int contadorMovimentosInvalidosRobo = 0;

	public Robo() {
	}

	public Robo(int x, int y) {
		this.x = 0;
		this.y = 0;
	}

	public Robo(int x, int y, String cor) {
		this.x = 0;
		this.y = 0;
		this.cor = cor;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getContadorMovimentosValidosRobo() {
		return contadorMovimentosValidosRobo;
	}

	public void setContadorMovimentosValidosRobo(int contadorMovimentosValidosRobo) {
		this.contadorMovimentosValidosRobo = contadorMovimentosValidosRobo;
	}

	public int getContadorMovimentosInvalidosRobo() {
		return contadorMovimentosInvalidosRobo;
	}

	public void setContadorMovimentosInvalidosRobo(int contadorMovimentosInvalidosRobo) {
		this.contadorMovimentosInvalidosRobo = contadorMovimentosInvalidosRobo;
	}
	
	public void moverRobo(String direcao) {
		if (direcao.equalsIgnoreCase("up")) {
			try {
				if (y == 4) {
					contadorMovimentosInvalidosRobo++;
					throw new MovimentoInvalidoException("Movimento inválido: você já está na posição mais alta");
				} else {
					y++;
					contadorMovimentosValidosRobo++;
					System.out.print("Posição atual: ");
					System.out.println("(" + x + "," + y + ")");
				}
			} catch (MovimentoInvalidoException erro) {
				System.out.println(erro.getMessage());
			}
		} else if (direcao.equalsIgnoreCase("down")) {
			try {
				if (y == 0) {
					contadorMovimentosInvalidosRobo++;
					throw new MovimentoInvalidoException("Movimento inválido: você já está na posição mais baixa!");
				} else {
					y--;
					contadorMovimentosValidosRobo++;
					System.out.print("Posição atual: ");
					System.out.println("(" + x + "," + y + ")");
				}
			} catch (MovimentoInvalidoException erro) {
				System.out.println(erro.getMessage());
			}
		} else if (direcao.equalsIgnoreCase("right")) {
			try {
				if (x == 4) {
					contadorMovimentosInvalidosRobo++;
					throw new MovimentoInvalidoException("Movimento inválido: você já está na posição mais à direita!");
				} else {
					x++;
					contadorMovimentosValidosRobo++;
					System.out.print("Posição atual: ");
					System.out.println("(" + x + "," + y + ")");
				}
			} catch (MovimentoInvalidoException erro) {
				System.out.println(erro.getMessage());
			}
		} else if (direcao.equalsIgnoreCase("left")) {
			try {
				if (x == 0) {
					contadorMovimentosInvalidosRobo++;
					throw new MovimentoInvalidoException("Movimento inválido: você já está na posição mais à esquerda!");
				} else {
					x--;
					contadorMovimentosValidosRobo++;
					System.out.print("Posição atual: ");
					System.out.println("(" + x + "," + y + ")");
				}
			} catch (MovimentoInvalidoException erro) {
				System.out.println(erro.getMessage());
			}
		} else {
			System.out.println("Movimento inválido!");
		}
	}

	public void moverRobo(int numero) {
		if (numero == 1) {
			try {
				if (y == 4) {
					contadorMovimentosInvalidosRobo++;
					throw new MovimentoInvalidoException("Movimento inválido: você já está na posição mais alta!");
				} else {
					y++;
					contadorMovimentosValidosRobo++;
					System.out.print("Posição atual: ");
					System.out.println("(" + x + "," + y + ")");
				}
			} catch (MovimentoInvalidoException erro) {
				System.out.println(erro.getMessage());
			}
		} else if (numero == 2) {
			try {
				if (y == 0) {
					contadorMovimentosInvalidosRobo++;
					throw new MovimentoInvalidoException("Movimento inválido: você já está na posição mais baixa!");
				} else {
					y--;
					contadorMovimentosValidosRobo++;
					System.out.print("Posição atual: ");
					System.out.println("(" + x + "," + y + ")");
				}
			} catch (MovimentoInvalidoException erro) {
				System.out.println(erro.getMessage());
			}
		} else if (numero == 3) {
			try {
				if (x == 4) {
					contadorMovimentosInvalidosRobo++;
					throw new MovimentoInvalidoException("Movimento inválido: você já está na posição mais à direita!");
				} else {
					x++;
					contadorMovimentosValidosRobo++;
					System.out.print("Posição atual: ");
					System.out.println("(" + x + "," + y + ")");
				}
			} catch (MovimentoInvalidoException erro) {
				System.out.println(erro.getMessage());
			}
		} else if (numero == 4) {
			try {
				if (x == 0) {
					contadorMovimentosInvalidosRobo++;
					throw new MovimentoInvalidoException("Movimento inválido: você já está na posição mais à esquerda!");
				} else {
					x--;
					contadorMovimentosValidosRobo++;
					System.out.print("Posição atual: ");
					System.out.println("(" + x + "," + y + ")");
				}
			} catch (MovimentoInvalidoException erro) {
				System.out.println(erro.getMessage());
			}
		} else {
			System.out.println("Movimento inválido!");
			contadorMovimentosInvalidosRobo++;
		}
	}

	public boolean verificarPosicao(int x, int y, int xAlimento, int yAlimento) {
		if (getX() == xAlimento && getY() == yAlimento) {
			return true;
		} else {
			return false;
		}
	}
	
	public void informarDirecao(int movimento) {
		if(movimento == 1) {
			System.out.println("Cima");
		}
		else if(movimento == 2) {
			System.out.println("Baixo");
		}
		else if(movimento == 3) {
			System.out.println("Direita");
		}
		else if(movimento == 4) {
			System.out.println("Esquerda");
		}
	}
}