package ProjetoSingleton;

public class ConfigManager {
    
    private static ConfigManager instance;
    
    private ConfigManager() {
        System.out.println("Carregando configuracoes...");
    }
    
    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }
    
    public void mostrarConfiguracoes(String msg) {
        System.out.println("Exibindo configurações do sistema.\n" + msg);
    }
}
