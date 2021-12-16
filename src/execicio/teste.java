package execicio;

public class teste {
    public static void main(String[] args) {
            conta cc = new conta();
            cc.saldo = 200.0;
            cc.numero = 123;
            cc.numero = 4567;

            cc.depositar(1000);

            System.out.println(cc.verificasaldo());

            conta poupanca = new conta( 100, 200,2000 );
            poupanca.retirada(500);
            System.out.println(poupanca.verificasaldo());
    }
}
