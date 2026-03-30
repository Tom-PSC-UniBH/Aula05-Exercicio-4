// Nome: Tom Alexander
// Matrícula: 1261933671

void main() throws InterruptedException {
  try (Scanner input = new Scanner(System.in)) {
    System.out.print("Digite N: ");
    int limit = input.nextInt();

    if (limit <= 0) {
      System.err.println("Valor inválido. O limite da contagem deve ser maior que zero!");
      return;
    }

    int counter = 1;

    while (counter <= limit) {
      System.out.println(counter);
      counter++;
    }

    System.out.println("Contagem concluída!");
  }
}
