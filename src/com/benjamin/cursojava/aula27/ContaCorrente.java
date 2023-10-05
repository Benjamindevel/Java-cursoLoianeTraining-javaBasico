package com.benjamin.cursojava.aula27;

public class ContaCorrente {
	
	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;
	
	
	boolean realizarSaque(double quantiaASacar) {
		
		//tem saldo na conta.
		
		if(saldo >= quantiaASacar) {
		   saldo -= quantiaASacar;
			return true;
		}else {//não tem saldo em conta. 
			if(especial) {
			   //verificar se o limete é especial, e tem saldo.
				double limite = limiteEspecial + saldo;
				if(limite >= quantiaASacar) {
					saldo -= quantiaASacar;
					return true;
				} else {
					return false;
				}
			}else {
				return false;//não é especial e não tem saldo suficiente.
			}
		}
	}

	
	void depositar( double valorDepositado) {
		
		saldo+=valorDepositado;
	}
	
	void consultarSaldo() {
	     System.out.println("Saldo atual da conta = "+ saldo);
    }
	
	boolean verificarUsoChequeEspecial() {
		return saldo < 0;
	}


	}


	
	


