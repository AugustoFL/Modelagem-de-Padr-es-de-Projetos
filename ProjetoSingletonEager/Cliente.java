/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoSingletonEager;

/**
 *
 * @author Aluno
 */
public class Cliente {
    
    public static void main(String[] args) {
        
        // OBtendo a instância do Singleton
        DatabaseConnection conexao = DatabaseConnection.getInstance();

        // Usando a instância para executar consultas
        conexao.executarConsulta("SELECT * FROM usuarios");
        
        // Chamando novamente (não cria nova instância)
        DatabaseConnection outraConexao = DatabaseConnection.getInstance();
        outraConexao.executarConsulta("UPDATE usuarios SET ativo = 1");
        
        // Verificando se são a mesma instância
        System.out.println("Mesma instância? " + (conexao == outraConexao)); 
        
    }
    
    
    
}
