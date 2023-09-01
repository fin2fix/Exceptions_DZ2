import java.util.Scanner;

/*
   * Задание №4
   * Разработайте программу, которая выбросит Exception, когда пользователь вводит
   * пустую строку. Пользователю должно показаться сообщение, что пустые строки
   * вводить нельзя.
   * 
   */

class MyExceptionEmptyString extends Exception {
  public MyExceptionEmptyString(String message) {
    super(message);
  }
}

public class dz2_task4 {
  static Scanner scan = new Scanner(System.in);

  public static String newString() throws MyExceptionEmptyString {
    System.out.println("Введите данные:");
    String newData = scan.nextLine();
    if (newData.isEmpty()) {
      throw new MyExceptionEmptyString("Введена пустая строка. Повторите ввод.  \n");
    } else {
      return newData;
    }
  }

  public static void main(String[] args) {
    boolean flag = true;
    while (flag) {
      try {
        System.out.printf("Вами было введено - %s", newString());
        flag = false;
      } catch (MyExceptionEmptyString ex) {
        System.out.println("Exception - " + ex.getMessage());
      }
    }
    scan.close();
  }
}
