import java.util.Scanner;

public class dz2_task1 {

  /* Задание №1
   * Реализуйте метод, который запрашивает у пользователя ввод дробного числа
   * (типа float), и возвращает введенное значение.
   * Ввод текста вместо числа не должно приводить к падению приложения, вместо
   * этого, необходимо повторно запросить у пользователя ввод данных.
   */

  static Scanner scan = new Scanner(System.in);

  public static float newNumber() {
    while (true) {
      System.out.println("Введите число в формате float:");
      try {
        return Float.parseFloat(scan.nextLine());
      } catch (RuntimeException ex) {
        System.out.println("Введен текст или неверное число. Повторите ввод... \n");
      }
    }
  }

  public static void main(String[] args) {
    System.out.printf("Вами было введено число - %f", newNumber());
    scan.close();
  }
}