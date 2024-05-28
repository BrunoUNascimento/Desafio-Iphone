package iphone;
public class Principal {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.ligar("12345678");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        iphone.exibirPagina("Site do iphone");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
