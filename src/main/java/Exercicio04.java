// Nome: Tom Alexander
// Matrícula: 1261933671

void main() {
  try (Scanner input = new Scanner(System.in)) {
    System.out.print("Digite um número inteiro: ");
    int number = input.nextInt();

    if (number % 2 == 0) {
      System.out.println(number + " é par.");
    } else {
      System.out.println(number + " é ímpar.");
    }
  }
}
