package especial;

import entidade.conta;


public class contaEspecial extends Conta{
      private double limiteEmprestimo;
    

    public contaEspecial(int numero, String titular, double depInicial, double limiteEmprestimo) {
        super(numero, titular, depInicial);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public contaEspecial(int numero, String titular, double limiteEmprestimo) {
        super(numero, titular);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }
    
    public boolean emprestimo(double quantia) {
        if (quantia <= limiteEmprestimo) {
            super.deposito(quantia - 10.0); // desconta a taxa de 10.0
            limiteEmprestimo -= quantia;
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Limite de Empréstimo: R$ " + String.format("%.2f", limiteEmprestimo);
    }
 
    }

  
  
  
  
  
  
  
  
  
  
}
