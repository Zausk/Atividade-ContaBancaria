class ContaBancaria {
    
    String numerodaconta;
    Double saldo;
    String titular;
    Double limitedesaque;
    
    public void ContaBancaria() {
        System.out.println("numerodaconta: " + numerodaconta);
        System.out.println("saldo: " + saldo);
        System.out.println("titular: " + titular);
        System.out.println("limitedesaque: " + limitedesaque);
    }
}
    
    public class ContaBancaria {

        public static void main(String[] args) {
            
            ContaBancaria minhaConta = new ContaBancaria();

            ContaEspecial minhaConta2 = new ContaEspecial();

            minhaConta.saldo(1000);
            minhaConta.limitedesaque(3000);
            minhaConta2.saldo(1000);
            minhaConta2.limitedesaque(3000);
            
            minhaConta.imprimirInformacoes();
    }
}
