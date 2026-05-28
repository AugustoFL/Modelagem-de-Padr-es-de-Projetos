/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoggerExemplo;

/**
 *
 * @author Aluno
 */
public class Logger {
 
    private static Logger instance;
    
    // Construtor privado para evitar instanciamento externo
    private Logger(){
        System.out.println("Logger iniciado");
    }
    
    /*
        Método sincronizado para garantir thread safety
        O synchronized em Java é uma palavra-chave que garante exclusão mútua,
        ou seja: Somente uma thread por vez pode executar um método ou bloco 
        synchronized em um dado objeto
    */
   
    public static synchronized Logger getInstance(){
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    
    // método que exibirá o nome da Thread - LOG: mensagem passada
    public void log(String mensagem){
        System.out.println(Thread.currentThread().getName() +
                " - LOG: " + mensagem);
    }
    
}
