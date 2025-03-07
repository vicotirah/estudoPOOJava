public class Televisor2 {
    int canal = 1;
    int volume;
    boolean ligado = false;
    void ligarDesligar() {
        if (!ligado) ligado = true;
        else ligado = false;
    }

    void aumentaVolume(int volume) {
        if ((this.volume + volume) < 10) this.volume +=volume;
        else this.volume = 10;
        System.out.println("\nAlterado para Volume: " + this.volume);
    }

    void diminuiVolume(int volume) {
        if ((this.volume - volume) > 0) this.volume-=volume;
        else this.volume = 0;
        System.out.println("\nAlterado para Volume: " + this.volume);
    }

    void sobeCanal(int canal) {
        if ((this.canal+canal) < 16) this.canal+=canal;
        else this.canal=16;
        System.out.println("\nAlterado para Canal: " + this.canal);
    }

    void desceCanal(int canal) {
        if ((this.canal-canal) > 0) this.canal-=canal;
        else this.canal=1;
        System.out.println("\nAlterado para Canal: " + this.canal);
    }

    void mostrarStatus() {
        System.out.println("\nCanal: " + this.canal + "\nVolume: " + this.volume + "\nLigado: " + this.ligado);
    }

}
