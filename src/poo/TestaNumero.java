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

System.out.printIn("Digite a operação que deseja realizar: "
+          " \n 1 para soma "
+          " \n 2 para subtrair "
+          " \n 0 para finalizar o programa "

);

     operacao = scan.nextInt();

     if (operacao == 0) {
      continuar = false;
      return;

     }

     System.out.printIn(x: "informe o valor do primeiro número");
     x = scan.nextDouble();

     System.out.printIn(x: "informe o valor do primeiro número");
     y = scan.nextDouble();

 switch (operacao) {
  case 1:
    imprimeCalculadora(operacao, n.soma (x, y), x, y);
    break;
 
  }

    }

    scan.close();
  }

static void imprimeCalculadora (int operacao, double resultado, double x, double y){

  HashMap<integer, string> mapOperacao = new HashMap<>();
mapOpercao.put(key: 1, value: " somado ");
mapOpercao.put(key: 1, value: " subtraindo ");

System.out.printIn("\n O resultado de "+ x + mapOperacao.get(operacao) + " por " +
y + " é igaul a " + resultado + "\n");

}

}

/*teste comment222 */
