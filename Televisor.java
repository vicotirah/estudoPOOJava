

public class Televisor {
    int canal;
    int volume;
    boolean ligado = false;

    public Televisor() {
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
        if ((this.volume+=volume) < 10) {
            this.volume +=volume;
            System.out.println("\nVolume: " + this.volume);}
        else System.out.println("\nVolume Máximo");
    }

    public void reduzirVolume(int volume) {
        if ((this.volume-=volume) > 0) {
            this.volume-=volume;
            System.out.println("\nVolume: " + this.volume);
        }
        else System.out.println("\nVolume Mínimo");
    }

    public void subirCanal(int canal) {
        if ((this.canal+=canal) <16) {
            this.canal+=canal;
            System.out.println("Canal: " + this.canal);
        }
        else System.out.println("\nÚltimo Canal");
    }
    public void descerCanal(int canal) {
        if ((this.canal-=canal) > 0) {
            this.canal-=canal;
            System.out.println("Canal: " + this.canal);
        }
        else System.out.println("\nPrimeiro Canal");
    }

    public void mostraStatus() {
        System.out.println("\nCanal: " + this.canal + "\nVolume: " + this.volume + "\nLigado: " + this.ligado);
    }

}
