import java.util.Scanner;

public class Calc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summa, payMonthly, rate, result;

// тут я сделала калькулятор, который вроде работает и считает процент по платежу для лиц типа Human

                System.out.println("Введите сумму: ");
                summa = scanner.nextInt();
                System.out.println("Ежемесячный платеж и процентная ставка 10%: " + (summa / 100) * 10);
                rate = (summa/100) * 10;
                payMonthly = (summa + rate);
                result = payMonthly;
                System.out.println("Общая сумма к оплате: " + result);
// тут я пыталась создать другой калькулятор чтобы посчитать платеж для лиц типа Business
                int summa1, payMonthly1, rate1, result1;
                System.out.println("Введите сумму: ");
                summa1 = scanner.nextInt();

                payMonthly1 = 1; // это один месяц хех

               // не разобралась с циклом чтобы сделать след платеж через 12 месяцев :(

                while (payMonthly1 > 12){}
                System.out.println("Ежемесячный платеж и процентная ставка 10%: " + (summa1/100)*10);
                rate1 = (summa1/100)*10;
                payMonthly1 = (summa1 + rate1);
                result1 = payMonthly1;
                System.out.println("Общая сумма к оплате: " + result1);
        }





    }



