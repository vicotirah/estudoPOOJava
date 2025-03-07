public class Televisor1 {
    int canal = 1;
    int volume;
    boolean ligado = false;

    public Televisor1() {
        this.canal = canal;
        this.volume = volume;
        this.ligado = ligado;
    }

    public void ligar() {
        if (!this.ligado) this.ligado = true;
    }
    public void desligar() {
        if (this.ligado) this.ligado = false;
    }

    public void aumentarVolume(int volume) {
        if ((this.volume + volume) < 10) this.volume +=volume;
        else this.volume = 10;
        System.out.println("\nAlterado para Volume: " + this.volume);
    }

    public void reduzirVolume(int volume) {
        if ((this.volume - volume) > 0) this.volume-=volume;
        else this.volume=0;
        System.out.println("\nAlterado para Volume: " + this.volume);
    }

    public void subirCanal(int canal) {
        if ((this.canal+canal) < 16) this.canal+=canal;
        else this.canal=16;
        System.out.println("\nAlterado para Canal: " + this.canal);
    }
    public void descerCanal(int canal) {
        if ((this.canal-canal) > 0) this.canal-=canal;
        else this.canal=1;
        System.out.println("\nAlterado para Canal: " + this.canal);
    }

    public void mostraStatus() {
        System.out.println("\nCanal: " + this.canal + "\nVolume: " + this.volume + "\nLigado: " + this.ligado);
    }

}
