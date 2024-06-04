package ContaBancoProject;

public class fluxo {
    
    public int Numero;
    public String Agencia;
    public String NomeCliente;
    public double Saldo;

    public fluxo(int numero, String agencia, String nomeCliente, double saldo) {
        Numero = numero;
        Agencia = agencia;
        NomeCliente = nomeCliente;
        Saldo = saldo;

    }

    public int getNumero() {
        return Numero;
    }

    public String getAgencia() {
        return Agencia;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public double getSaldo() {
        return Saldo;
    } 

    
}
