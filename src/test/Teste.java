package test;
import relogio.Relogio;
public class Teste {
    public static void main(String[] args) {
        // Testes positivos
        Relogio relogio = new Relogio(12, 0, 0);
        relogio.definirAlarme(12, 5);
        relogio.mostrarHora();
        relogio.definirHora(12, 4, 30);
        relogio.ativarAlarme();
        System.out.println("Alarme Ativo: " + relogio.verificarAlarmeAtivo());
        relogio.verificarAlarme();

        // Testes negativos
        Relogio relogio2 = new Relogio(15, 30, 0);
        relogio2.definirAlarme(16, 0);
        relogio2.mostrarHora();
        relogio2.definirHora(15, 59, 30);
        relogio2.desativarAlarme();
        System.out.println("Alarme Ativo: " + relogio2.verificarAlarmeAtivo());
        relogio2.verificarAlarme();
    }
}