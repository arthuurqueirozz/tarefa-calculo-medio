public class CalculoMedio {

    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public CalculoMedio(double n1, double n2, double n3, double n4){
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
        this.nota4 = n4;
    }

    public void calcularMedia () {
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println(media);
    }

    public static void main(String[] args) {
        CalculoMedio calculoMedio = new CalculoMedio(2,2,2,5);
        calculoMedio.calcularMedia();
    }
}