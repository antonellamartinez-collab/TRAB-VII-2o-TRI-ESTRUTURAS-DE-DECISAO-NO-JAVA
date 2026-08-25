// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner teclado = new Scanner(System.in);

//         double litros, preco, desconto, total;
//         char tipo;

//         System.out.print("Digite a quantidade de litros: ");
//         litros = teclado.nextDouble();

//         System.out.print("Digite o tipo de combustivel (A ou G): ");
//         tipo = teclado.next().charAt(0);

//         if (tipo == 'A' || tipo == 'a') {
//             preco = 3.98;

//             if (litros <= 20) {
//                 desconto = 0.03;
//             } else {
//                 desconto = 0.05;
//             }

//             total = litros * preco;
//             total = total - (total * desconto);

//             System.out.println("Valor a pagar: R$ " + total);

//         } else if (tipo == 'G' || tipo == 'g') {
//             preco = 6.49;

//             if (litros <= 20) {
//                 desconto = 0.04;
//             } else {
//                 desconto = 0.06;
//             }

//             total = litros * preco;
//             total = total - (total * desconto);

//             System.out.println("Valor a pagar: R$ " + total);

//         } else {
//             System.out.println("Combustivel invalido");
//         }
//     }
// }

// exercicio 2

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner teclado = new Scanner(System.in);

//         double morango, maca;
//         double valorMorango, valorMaca;
//         double totalKg, total;

//         System.out.print("Digite a quantidade de morangos em Kg: ");
//         morango = teclado.nextDouble();

//         System.out.print("Digite a quantidade de macas em Kg: ");
//         maca = teclado.nextDouble();

//         if (morango <= 5) {
//             valorMorango = morango * 2.50;
//         } else {
//             valorMorango = morango * 2.20;
//         }

//         if (maca <= 5) {
//             valorMaca = maca * 1.80;
//         } else {
//             valorMaca = maca * 1.50;
//         }

//         totalKg = morango + maca;
//         total = valorMorango + valorMaca;

//         if (totalKg > 8 || total > 25) {
//             total = total - (total * 0.10);
//         }

//         System.out.println("Valor a pagar: R$ " + total);
//     }
// }

// exercicio 3

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner teclado = new Scanner(System.in);

//         int tipo;
//         double kg, preco, total, desconto, valorFinal;
//         char pagamento;
//         String carne;

//         System.out.println("1 - File Duplo");
//         System.out.println("2 - Alcatra");
//         System.out.println("3 - Picanha");
//         System.out.print("Escolha o tipo de carne: ");
//         tipo = teclado.nextInt();

//         System.out.print("Digite a quantidade em Kg: ");
//         kg = teclado.nextDouble();

//         if (tipo == 1) {
//             carne = "File Duplo";

//             if (kg <= 5) {
//                 preco = 4.90;
//             } else {
//                 preco = 5.80;
//             }

//         } else if (tipo == 2) {
//             carne = "Alcatra";

//             if (kg <= 5) {
//                 preco = 5.90;
//             } else {
//                 preco = 6.80;
//             }

//         } else {
//             carne = "Picanha";

//             if (kg <= 5) {
//                 preco = 6.90;
//             } else {
//                 preco = 7.80;
//             }
//         }

//         total = kg * preco;

//         System.out.print("Pagamento no cartao? (S ou N): ");
//         pagamento = teclado.next().charAt(0);

//         if (pagamento == 'S' || pagamento == 's') {
//             desconto = total * 0.05;
//             valorFinal = total - desconto;
//         } else {
//             desconto = 0;
//             valorFinal = total;
//         }

//         System.out.println("\n--- CUPOM FISCAL ---");
//         System.out.println("Tipo de carne: " + carne);
//         System.out.println("Quantidade: " + kg + " Kg");
//         System.out.println("Preco total: R$ " + total);

//         if (pagamento == 'S' || pagamento == 's') {
//             System.out.println("Pagamento: Cartao");
//         } else {
//             System.out.println("Pagamento: Outro");
//         }

//         System.out.println("Desconto: R$ " + desconto);
//         System.out.println("Valor a pagar: R$ " + valorFinal);
//     }
// }

// exercicio 4

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner teclado = new Scanner(System.in);

//         int numero;
//         double salario, percentual, aumento, salarioNovo;

//         System.out.print("Digite o numero do funcionario: ");
//         numero = teclado.nextInt();

//         System.out.print("Digite o salario atual: ");
//         salario = teclado.nextDouble();

//         if (salario <= 400) {
//             percentual = 15;
//         } else if (salario <= 700) {
//             percentual = 12;
//         } else if (salario <= 1000) {
//             percentual = 10;
//         } else if (salario <= 1800) {
//             percentual = 7;
//         } else if (salario <= 2500) {
//             percentual = 4;
//         } else {
//             percentual = 0;
//         }

//         aumento = salario * percentual / 100;
//         salarioNovo = salario + aumento;

//         System.out.println("Numero do funcionario: " + numero);
//         System.out.println("Salario atual: R$ " + salario);
//         System.out.println("Percentual de aumento: " + percentual + "%");
//         System.out.println("Salario corrigido: R$ " + salarioNovo);
//     }
// }

// exercicio 5

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner teclado = new Scanner(System.in);

//         int horaInicio, minutoInicio;
//         int horaFim, minutoFim;
//         int inicio, fim, duracao;
//         int horas, minutos;

//         System.out.print("Digite a hora inicial: ");
//         horaInicio = teclado.nextInt();

//         System.out.print("Digite o minuto inicial: ");
//         minutoInicio = teclado.nextInt();

//         System.out.print("Digite a hora final: ");
//         horaFim = teclado.nextInt();

//         System.out.print("Digite o minuto final: ");
//         minutoFim = teclado.nextInt();

//         inicio = horaInicio * 60 + minutoInicio;
//         fim = horaFim * 60 + minutoFim;

//         if (fim > inicio) {
//             duracao = fim - inicio;
//         } else {
//             duracao = (24 * 60 - inicio) + fim;
//         }

//         horas = duracao / 60;
//         minutos = duracao % 60;

//         System.out.println("Duracao do jogo: " + horas + " hora(s) e " + minutos + " minuto(s)");
//     }
// }

// exercicio 6

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner teclado = new Scanner(System.in);

//         int cabecas, patas;
//         int patos, coelhos;

//         System.out.print("Digite o total de cabecas: ");
//         cabecas = teclado.nextInt();

//         System.out.print("Digite o total de patas: ");
//         patas = teclado.nextInt();

//         coelhos = (patas - (2 * cabecas)) / 2;
//         patos = cabecas - coelhos;

//         System.out.println("Quantidade de patos: " + patos);
//         System.out.println("Quantidade de coelhos: " + coelhos);
//     }
// }


