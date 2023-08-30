package relogio;

public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;
    private int alarmeHora;
    private int alarmeMinuto;
    private boolean alarmeAtivo;

    public Relogio(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        this.alarmeHora = 0;
        this.alarmeMinuto = 0;
        this.alarmeAtivo = false;
    }

    public  void definirHora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void definirAlarme(int hora, int minuto) {
        this.alarmeHora = hora;
        this.alarmeMinuto = minuto;
    }

    public void ativarAlarme() {
        this.alarmeAtivo = true;
        System.out.println("Alarme ativado para " + alarmeHora + ":" + alarmeMinuto);
    }

    public void desativarAlarme() {
        this.alarmeAtivo = false;
        System.out.println("Alarme desativado.");
    }

    public void mostrarHora() {
        System.out.println("Hora atual: " + hora + ":" + minuto + ":" + segundo);
    }

    public void cronometro() {
        
    }
    public boolean getAlarmeAtivo() {
        return true;
    }
    public boolean verificarAlarmeAtivo() {
        return alarmeAtivo;
    }

    public void verificarAlarme() {
        if (alarmeAtivo && hora == alarmeHora && minuto == alarmeMinuto) {
            System.out.println("Alarme disparado!");
        } else {
            System.out.println("Nenhum alarme foi disparado.");
        }
    }

    
}