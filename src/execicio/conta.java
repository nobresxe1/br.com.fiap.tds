package execicio;

public class conta {

    int agencia;
    int numero;
    double saldo;

    public conta (){}

    public conta(int agencia, int numero, double saldo){
        this.agencia = agencia;
        this. numero = numero;
        this. saldo = saldo;
    }

    public void depositar (double valor){

        this.saldo += valor;
    }
    public void retirada (double valor){
        this.saldo -= valor;
    }
    public double verificasaldo (){
        return this.saldo;
    }
}
