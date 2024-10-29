/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

public class carro extends veiculo {
    
    private byte numeroDePortas;
    
    public carro(String marca, String modelo, byte numeroDePortas){
        super(marca, modelo);
        this.numeroDePortas = numeroDePortas;        
    }
    
       public byte getNumeroDePortas()
    {
        return numeroDePortas;
    }
    
    @Override
    public String dirigir() {
        
        return String.format("\nMarca: %s\nModelo: %s", marca, modelo);
    }

    @Override
    public String exibirDetalhe() {
        
        return String.format("Digirindo um carro %s %s com %d portas", marca, modelo, numeroDePortas);
    }
    
}
