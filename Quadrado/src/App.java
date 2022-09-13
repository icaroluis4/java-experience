import java.util.Scanner; 

public class App {
    public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    
    float comprimento;
    float largura;
    
    System.out.println("Escolha uma opção");
    System.out.println("1 : Calcula Area Quadrado ");
    System.out.println("2 : Calcula Area Retangulo ");
    System.out.println("3 : Calcula Area Trapezio ");
    
    int opcao = scan.nextInt();
    
        switch(opcao){
            case 1 :
                
                System.out.println("Digite a largura: ");
                largura = scan.nextFloat();

                System.out.println( "AREA = " + CalculadoraQuadrilateros.calculaQuadrado( largura)); // largura sendo usada como 'lado'

                break;

            case 2 :

                System.out.println("Digite a largura: ");
                largura = scan.nextFloat();

                System.out.println("Digite o comprimento: ");
                comprimento = scan.nextFloat();

                System.out.println( "AREA = " + CalculadoraQuadrilateros.calculaRetangulo(comprimento , largura));

                break;
            
            case 3 :
                System.out.println("Digite o valor da Base Maior: ");
                largura = scan.nextFloat(); // largura como base maior afim de usar menos alocação de memória

                System.out.println("Digite o valor da Base Menor: ");
                comprimento = scan.nextFloat(); // comprimento como base menor usar menos alocação de memória

                System.out.println("Digite a altura: "); // scan foi usado diretamente no Sysout afim de acelerar os processos e reduzir a alocação de memória
                System.out.println( "AREA = " + CalculadoraQuadrilateros.calculaTrapezio(comprimento , largura , scan.nextFloat()));

                break;
        }

    }
}

