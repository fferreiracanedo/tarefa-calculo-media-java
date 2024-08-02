//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      Notas notas = new Notas();


      notas.nota1 = 1;
      notas.nota2 = 3;
      notas.nota3 = 1;
      notas.nota4 = 1;
      notas.media = (notas.nota1 + notas.nota2 + notas.nota3 + notas.nota4) / 4;

        if(notas.media < 8.5){
            System.out.println(notas.media);
            System.out.println("Aluno reprovado");

        }else{
            System.out.println(notas.media);
            System.out.println("Aluno aprovado");

        }


    }
}
