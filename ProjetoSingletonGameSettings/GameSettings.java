/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoSingletonGameSettings;

/**
 *
 * @author Aluno
 */
public class GameSettings {
    
    // SingletonEager
    private static final GameSettings instance = new GameSettings();
    
    private int volume = 50;
    private String dificuldade = "Normal";
    private boolean fullscreen = true;
    private String idioma = "pt-BR";
    private int resolucaoX = 1920;
    private int resolucaoY = 1080;
    
    // Construtor privado para impedir instanciamento externo
    private GameSettings() {
        System.out.println("Configurações iniciais carregadas.");
    }
    
    public static GameSettings getInstance(){
        return instance;
    }
    

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public boolean isFullscreen() {
        return fullscreen;
    }

    public void setFullscreen(boolean fullscreen) {
        this.fullscreen = fullscreen;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getResolucaoX() {
        return resolucaoX;
    }   

    public int getResolucaoY() {
        return resolucaoY;
    }

    public void setResolucao(int x, int y) {
        this.resolucaoY = x;
        this.resolucaoY = y;
    }
    
    public void exibirConfiguracoes(){
        System.out.println("===== Configuracoes do Jogo =====");
        System.out.println("Volume: " + volume);
        System.out.println("Dificuldade: " + dificuldade);
        System.out.println("Tela Cheia: " + fullscreen);
        System.out.println("Idioma: " + idioma);
        System.out.println("Resolucao: " + resolucaoX + "x" +resolucaoY);
    }
    
    
}
