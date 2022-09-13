public class CalculadoraQuadrilateros{
    
    public static float calculaRetangulo(float largura , float comprimento){
        float area = largura * comprimento;
        
        return area;
    }

    public static float calculaQuadrado(float largura ){
        float area = largura * largura;
        
        return area;
    }

    public static float calculaTrapezio(float baseMaior , float baseMenor , float altura ){
        float area = ((baseMaior + baseMenor) * altura) / 2;
        
        return area;
    }
    
}