package by.it.demidovich.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 26
*/

import java.util.Scanner;

class TaskC1 {
    public static void main(String[] args){
        Scanner scan01=new Scanner(System.in);
        Scanner scan02=new Scanner(System.in);
        int a=scan01.nextInt();
        int b=scan02.nextInt();
        int sum=a + b;
        System.out.println("Sum = " + sum);
    }
}
