package gerenciador.gerenciarveiculo;

import entidades.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class gerenciarVeiculo 
{
    public static void main(String[] args) 
    {
        int quantidadeDeVeiculo;
        String marca,
               modelo;
        
        Scanner scan = new Scanner(System.in);
        List<veiculo> automovel = new ArrayList<>();
        
        System.out.print("Digite a quantidade de automóveis: ");
        quantidadeDeVeiculo = scan.nextInt();
        scan.nextLine(); // Limpar Buff da tecla Enter do teclado
        
        for (int a = 0; a < quantidadeDeVeiculo; a++)
        {
            System.out.print("\nInforme a marca/fabricante do automóvel: ");
            marca = scan.nextLine();
            System.out.print("Informe o modelo: ");
            modelo = scan.nextLine();
            System.out.print("Informe se o automóvel é um Carro ou Moto: ");
            String tipoAutomovel = scan.nextLine();            
            
            // equalsIgnoreCase ignora as letras maiúsculas e minúsculas, aceitando o que é digitando conforme está nos parenteses
            
            if (tipoAutomovel.equalsIgnoreCase("carro"))
            {
                System.out.print("\nDigite a quantidade de portas: ");
                byte numeroDePortas = scan.nextByte();
                scan.nextLine();
                automovel.add(new carro(marca, modelo, numeroDePortas));
            }
            else if (tipoAutomovel.equalsIgnoreCase("moto"))
            {
                System.out.print("\nDigite a cilindrada da moto: ");
                short cilindrada = scan.nextShort();
                scan.nextLine();
                automovel.add(new moto(marca, modelo, cilindrada));
            }
            else 
            {
                a--;
            }
        }
        
        // Impressão de ArrayList sem ForEach
        // .size() -> Retorna o tamanho do ArrayList
        // .get() -> Busca um elemento do ArrayList pelo index
        
        for (int x = 0; x < automovel.size(); x++)
        {
            System.out.println(automovel.get(x).exibirDetalhes());
            System.out.println(automovel.get(x).digirir());
        }
    }
}