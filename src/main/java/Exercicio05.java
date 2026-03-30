// Nome: Tom Alexander
// Matrícula: 1261933671

void main() {
  try (Scanner input = new Scanner(System.in).useLocale(Locale.UK)) {
    int total = 0;
    int number = -1;

    while (number != 0) {
      System.out.print("Digite um número (0 para encerrar): ");
      number = input.nextInt();
      total += number;
    }

    System.out.print("Soma total: " + total);
  }
}