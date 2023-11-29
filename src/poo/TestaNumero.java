package poo;

import java.util.HashMap;
import java.util.Scanner;


public class TestaNumero {
  public static void main(String[] args) {
    Numero n = new Numero ();

    boolean continuar = true;

    Scanner scan = new Scanner(System.in);
    while(continuar) {
double x = 0;
double y = 0;
int operacao = 0;

System.out.println(x: "Digite a operação que deseja realizar:"
+          " \n 1 para soma "
           "\n 0 para finalizar o programa"

);

     opercao = sacn.nextInt();

     if (operacao == 0) {
      continuar = false;
      return;

     }

     System.out.printIn(x: "informe o valor do primeiro número");
     x = scan.nextDouble();

     System.out.printIn(y: "informe o valor do primeiro número");
     y = scan.nextDouble();

 switch (opercao) {
  case 1:
    imprimeCalculadora(operacao, n.soma (x, y), x, y);
    break;
 
  }

    }

    scan.close();
  }

static void imprimeCalculadora (int opercao, double resultado, double x, double y){

  HashMap<integer, string>/ mapOperacao = new HashMap<>();
mapOpercao.pu(key: 1, value: " somado ");

System.out,printIn("\n O resultado de "+ x + mapOperacao.get(key: 1 ) + " por " +
y + " é igaul a " + resultado + "\n");

}

}
