public class Aparelho implements NavegadorInternet, Telefone, ReprodutorMusical {

    //Navegador
    @Override
    public void exibirPagina(String url) {
        System.out.println("Mostrando pagina sobre " + url);
    }

    @Override
    public void novaAba(String pesquisa) {
        System.out.println("Abrindo uma nova aba sobre " + pesquisa);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("F5! Atualizando a pagina");
    }

    //Telefone
    @Override
    public void ligar(String contato, String  numero) {
        System.out.println("Discando para " + numero);
        System.out.println("Ligando para " + contato);
    }

    @Override
    public void atender() {
        System.out.println("Trimm, trimm");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }

    //Reprodutor Musical
    @Override
    public void pausar() {
        System.out.println("Musica em pausa");
    }

    @Override
    public void tocar(String artista) {
        System.out.println("Tocando agora " + artista);
    }

    @Override
    public void parar() {
        System.out.println("Parando de tocar..");
    }
    
}
