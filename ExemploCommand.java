package exemplos;
public class ExemploCommand {
    public static void main(String[] args) {
        Luz luz = new Luz();
        ComandoLigarLuz ligarLuz = new ComandoLigarLuz(luz);
        ComandoDesligarLuz desligarLuz = new ComandoDesligarLuz(luz);

        ControleRemoto controle = new ControleRemoto();

        controle.setComando(ligarLuz);
        controle.pressionarBotao();

        controle.setComando(desligarLuz);
        controle.pressionarBotao();
    }
}