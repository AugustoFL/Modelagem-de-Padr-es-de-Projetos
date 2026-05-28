/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoSingletonEager;

/**
 *
 * @author Aluno
 */
public class DatabaseConnection {
    
    /*
        Esse código é executado
        
    */
    
    // Instância é criada no momento da carga da classe
    private static final DatabaseConnection instance = 
            new DatabaseConnection();
    
    // Construtor privado para impedir criação externa
    private DatabaseConnection(){
        System.out.println("Conectado ao banco de dados!");
    }
    
    public static DatabaseConnection getInstance(){
        return instance;
    }
    
    // Para simular uma consulta SQL sendo feito em um BD
    public void executarConsulta(String sql) {
        System.out.println("Executando consulta: " + sql);
    }
    
}
