package fit;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Calcula IMC" );      
        double resultado = CalculaImc(100.3, 1.80);

        System.out.printf("O seu Imc é: %.2f ", resultado ); 

        if(resultado < 18.5){
            System.out.println(" MAGREZA");
        }else if(resultado < 24.9){
            System.out.println(" NORMAL");
        }else if(resultado < 30){
            System.out.println(" SOBREPESO");
        }else{
            System.out.println(" OBESO");
        }
       /*Magreza, quando o resultado é menor que 18,5 kg/m2;
        Normal, quando o resultado está entre 18,5 e 24,9 kg/m2;
        Sobrepeso, quando o resultado está entre 24,9 e 30 kg/m2;
        Obesidade, quando o resultado é maior que 30 kg/m2;*/
    }

    private static double CalculaImc(double peso, double altura) {
        double resultado = peso/(altura*altura);
        return resultado;
    }    
}
