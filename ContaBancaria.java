public class ContaBancaria {
    double saldo;
    double limite;
    int consultas;

    public ContaBancaria(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
        this.consultas = 0;
    }

    double getSaldo() {
        this.consultas++;
        return saldo;
    }

    protected void setSaldo(double valor) {
        this.saldo = valor;

    }

    double getLimite() {
        this.consultas++;
        return limite;
    }

    protected void setLimite(double valor) {
        this.limite = valor;
    }

    double getSaldoComLimite(){
        this.consultas++;
        return saldo + limite;
    }

    int getConsultas() {
        return consultas;
    }



}
