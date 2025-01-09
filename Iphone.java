public class Iphone implements ReprodutorMusica, Telefone, Navegador {

    
    @Override
    public void tocarMusica() {
        System.out.println("Reproduzindo música...");
    }
    
    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero + "...");
    }
    
    @Override
    public void navegarPara(String url) {
        System.out.println("Navegando para " + url + "...");
    }
    
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();
        
        // Usando o Reprodutor de Música
        meuIphone.tocarMusica();
        
        // Usando o Telefone
        meuIphone.fazerChamada("123-456-789");
        
        // Usando o Navegador
        meuIphone.navegarPara("https://www.exemplo.com");
    }
}

