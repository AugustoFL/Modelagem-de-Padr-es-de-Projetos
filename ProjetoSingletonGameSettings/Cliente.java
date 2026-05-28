/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoSingletonGameSettings;

/**
 *
 * @author Aluno
 */
public class Cliente {
    
    
    public static void main(String[] args) {
        
        GameSettings settings = GameSettings.getInstance();
        System.out.println("\nConfiguracao Padrao Inicial da Unica Instancia Criada: ");
        settings.exibirConfiguracoes();
        
        // Alterar configurações no menu de opções
        settings.setVolume(80);
        settings.setDificuldade("Dificil");
        settings.setIdioma("en-US");
        settings.setFullscreen(false);
        settings.setResolucao(1280, 720);
        
        System.out.println("\nConfiguracoes modificadas em settings: ");
        settings.exibirConfiguracoes();
        
        // Em outra parte do jogo (por exemplo, dentro do gameplay)
        GameSettings gameSettings = GameSettings.getInstance();
        System.out.println("\nAcessando configurações gameplaySettings) durante o jogo");
        gameSettings.exibirConfiguracoes();
        
    }
}
