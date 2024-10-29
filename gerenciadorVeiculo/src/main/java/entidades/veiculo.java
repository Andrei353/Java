/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;


public abstract class veiculo {
    
    protected String marca;
    protected String modelo;
    
    public veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo; 
    }
    
    public abstract String dirigir();
    public abstract String exibirDetalhe();

    public boolean exibirDetalhes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean digirir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
}
