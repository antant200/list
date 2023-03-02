import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> purchase = new ArrayList<>();
        String[] operation = {"Добавить покупки", "Показать покупки", "Удалить покупки", "Поиск покупок"};
        while (true) {
            System.out.println("Выберите операцию: ");
            for (int i = 0; i < operation.length; i++) {
                System.out.println((i + 1) + ") " + operation[i]);
            }
            System.out.println("Для завершения программы напишите <end>");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                if (purchase.isEmpty()) {
                    System.out.println("Вы не сделали покупок! :(");
                    break;
                } else {
                    System.out.println("Ваш список покупок:");
                    for (int i = 0; i < purchase.size(); i++) {
                        System.out.println((i + 1) + ". " + purchase.get(i));
                    }
                    System.out.println("Программа завершена!");
                    break;
                }
            }
            int choice = Integer.parseInt(input);
            if (choice == 1) {
                System.out.println("Какую покупку хотите добавить?");
                String product = scanner.nextLine();
                purchase.add(product);
                System.out.println("Итого в списке покупок: " + purchase.size());
            } else if (choice == 2) {
                if (purchase.isEmpty()) {
                    System.out.println("Ваша корзина пуста! Добавьте покупки");
                } else {
                    System.out.println("Ваш список покупок:");
                    for (int i = 0; i < purchase.size(); i++) {
                        System.out.println((i + 1) + ". " + purchase.get(i));
                    }
                }
            } else if (choice == 3) {
                if (purchase.isEmpty()) {
                    System.out.println("Ваша корзина пуста! Добавьте покупки");
                } else {
                    System.out.println("Ваш список покупок:");
                    for (int i = 0; i < purchase.size(); i++) {
                        System.out.println((i + 1) + ". " + purchase.get(i));
                    }
                    System.out.println("Какую покупку хотите удалить?");
                    String deleted = scanner.nextLine();
                    try {
                        int deleted1 = (Integer.parseInt(deleted) - 1);
                        System.out.println("Покупка <" + purchase.get(deleted1) + "> удалена. Список оставшихся покупок:");
                        purchase.remove(deleted1);
                        if (purchase.isEmpty()) {
                            System.out.println("Ваша корзина пуста! Добавьте покупки");
                        } else {
                            for (int i = 0; i < purchase.size(); i++) {
                                System.out.println((i + 1) + ". " + purchase.get(i));
                            }
                        }
                    } catch (NumberFormatException e) {
                        purchase.remove(deleted);
                        System.out.println("Покупка <" + deleted + "> удалена. Список оставшихся покупок:");
                        for (int i = 0; i < purchase.size(); i++) {
                            System.out.println((i + 1) + ". " + purchase.get(i));
                        }
                    }
                }
            } else if (choice == 4) {
                if (purchase.isEmpty()) {
                    System.out.println("Ваша корзина пуста! Добавьте покупки");
                } else {
                    System.out.println("Введите текст для поиска по покупкам:");
                    String queryLower = scanner.nextLine().toLowerCase();
                    System.out.println("Найдено по вашему запросу:");
                    for (int i = 0; i < purchase.size(); i++) {
                        String itemLower = purchase.get(i).toLowerCase();
                        if (itemLower.contains(queryLower)) {
                            System.out.println((i + 1) + ". " + purchase.get(i));
                        }
                    }
                    System.out.println("Ничего не найдено, попробуйте снова!");
                        }
                    }
                }
            }
        }





