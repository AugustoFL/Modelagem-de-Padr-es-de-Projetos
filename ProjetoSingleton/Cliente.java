package ProjetoSingleton;

public class Cliente {

    public static void main(String[] args) {

        ConfigManager config = ConfigManager.getInstance();
        config.mostrarConfiguracoes("Configuracao 1");

        ConfigManager outraConfig = ConfigManager.getInstance();
        outraConfig.mostrarConfiguracoes("Configuracao 2");

        // Verificando se são a mesma instância
        System.out.println("Mesma instancia? " + (config == outraConfig));

        // Carregando configurações aparecerá uma única vez,
        // pois é só uma instância
    }
}