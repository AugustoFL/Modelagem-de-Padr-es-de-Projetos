/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoggerExemplo;

/**
 *
 * @author Aluno
 */
public class Cliente {
    
    public static void main(String[] args) {
        
        /*
            Uma expressão lambda (()-> { ... };)
            define uma tarefa que cada thread irá executar
        */
        
        Runnable tarefa = () -> {
            Logger logger = Logger.getInstance();
            logger.log("Mensagem de log.");
        };
        
        
        // Criando várias threads para simular
        // acesso concorrente ao singleton
        Thread thread1 = new Thread(tarefa, "Thread-1");
        Thread thread2 = new Thread(tarefa, "Thread-2");
        Thread thread3 = new Thread(tarefa, "Thread-3");
        
        thread1.start();
        thread2.start();
        thread3.start();
        
    }
    
    
}
