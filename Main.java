import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    public static void main(String[] args) {
        int op;

        do{
            System.out.print("\nExercícios:\n1->Exercício 1: Definições de POO\n2->Exercício 2: : Classes, atributos " +
                    "e métodos, instaciação de Objetos, entrada/saída de dados \n3->Exercício 3:" +
                    " Sobrecarga e Modificadores de Acesso\n0->Sair\nOpção: ");
            op = sc.nextInt();
            switch (op) {
                case 1: exercicio1(); break;
                case 2: exercicio2(); break;
                case 3: exercicio3(); break;
                case 0: System.out.println("Programa finalizado."); break;
                default: System.out.println("Insira uma opção válida");
            }
        } while(op != 0);



    }

    public static int mensagem (String msg) {
        System.out.println(msg + ": ");
        int valor = sc.nextInt();
        return valor;
    }

    public static void exercicio1() {
        Televisor1 tv = new Televisor1();
        tv.ligar();
        tv.subirCanal(5);
        tv.aumentarVolume(10);
        tv.mostraStatus();
        tv.descerCanal(5);
        tv.reduzirVolume(2);
        tv.mostraStatus();
        tv.desligar();

    }

    public static void exercicio2() {
        Televisor2 tv2 = new Televisor2();
        int op;

        do{
            System.out.print("\nMenu:\n1-Ligar/Desligar\n2-Aumantar Volume\n3-Diminuir Volume\n4-Subir Canal\n" +
                    "5-Descer Canal\n6-Mostrar Status\n0-Sair\nOpção: ");
            op = sc.nextInt();
            switch (op) {
                case 1: tv2.ligarDesligar(); break;
                case 2: tv2.aumentaVolume(mensagem("Volume")); break;
                case 3: tv2.diminuiVolume(mensagem("Volume")); break;
                case 4: tv2.sobeCanal(mensagem("Canal")); break;
                case 5: tv2.desceCanal(mensagem("Canal")); break;
                case 6: tv2.mostrarStatus(); break;
                case 0: System.out.println("Programa finalizado."); break;
                default: System.out.println("Insira uma opção válida");
            }
        } while(op != 0);
    }

    public static void exercicio3() {
        ContaBancaria cb = new ContaBancaria(0,0);

        cb.setSaldo(1000);
        cb.setLimite(500);
        System.out.println("Saldo: R$" + cb.getSaldo());
        System.out.println("Limite: R$" +cb.getLimite());
        System.out.println("Saldo com Limite: R$" +cb.getSaldoComLimite());
        System.out.println("Consultas: " +cb.getConsultas());
    }

}
