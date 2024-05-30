public class Celular{
    public static void main(String[] args) {
        Aparelho iphone = new Aparelho();
        
        System.out.println("-=-=-=-=- Utilizando o navegador Safari -=-=-=-=-");
        iphone.novaAba("Countryle");
        iphone.atualizarPagina();
        iphone.exibirPagina("Countryle");
        
        System.out.println("-=-=-=-=- Utilizando o reprodutor musical -=-=-=-=-");
        iphone.tocar("The Beatles");
        iphone.pausar();
        iphone.parar();
        
        System.out.println("-=-=-=-=- Utilizando o telefone -=-=-=-=-");
        iphone.ligar("Ana", "9999-6365");
        iphone.atender();
        iphone.iniciarCorreioDeVoz();
        
    }

}
