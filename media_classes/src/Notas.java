public class Notas {
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double media;
    boolean passorNot;


    public double Notas(double nota1, double nota2, double nota3, double nota4 , double media){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.media = nota1+nota2+nota3+nota4;



        return media / 4;

    }


}
