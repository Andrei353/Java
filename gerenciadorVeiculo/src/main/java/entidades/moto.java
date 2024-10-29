/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

public class moto extends veiculo{
    private final short cilindrada;
    
    public moto(String marca, String modelo, short cilindrada){
        
        super(marca, modelo);
        this.cilindrada = cilindrada;
        
    }
    
    public short getCilindrada(){
        return cilindrada;
    }
    
    @Override
    public String dirigir(){
        return String.format("Dirigindo minha moto %s %s com %d cilindradas", marca, modelo , cilindrada);
    }
    


    @Override
    public String exibirDetalhe() {
        return String.format("\nMarca: %s\nModelo: %s",marca,modelo);
    }
    
}
