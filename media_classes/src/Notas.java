public class Notas {
    int nota1;
    int nota2;
    int nota3;
    int nota4;
    double media;
    boolean passorNot;


    public double Notas(int nota1, int nota2, int nota3, int nota4 , double media){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.media = nota1+nota2+nota3+nota4;



        return media;

    }


}
