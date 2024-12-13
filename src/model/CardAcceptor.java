package model;

import java.util.Scanner;

public class CardAcceptor implements MoneyAcceptor {
    private int amount;

    public CardAcceptor(int amount) {
        this.amount = amount;
    }

    @Override
    public void setAmount(int amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер карты: ");
        String cardNumber = scanner.nextLine();
        System.out.print("Введите одноразовый пароль: ");
        String otp = scanner.nextLine();
        System.out.println("Транзакция подтверждена!");
        this.amount += amount;
    }

    @Override
    public int getAmount() {
        return amount;
    }
}
