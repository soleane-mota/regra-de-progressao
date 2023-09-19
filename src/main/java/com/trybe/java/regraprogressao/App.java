package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de atividades para cadastrar: ");
    int quant = Integer.parseInt(scanner.nextLine());

    int parcialGrade = 0;
    int sumWeight = 0;

    for (int iterator = 1; iterator <= quant; iterator++) {
      System.out.printf("Digite o nome da atividade %d: \n", iterator);
      String activityName = scanner.nextLine();

      System.out.printf("Digite o peso da atividade %d: \n", iterator);
      int weight = Integer.parseInt(scanner.nextLine());

      System.out.printf("Digite a nota obtida para %s: \n", activityName);
      int grade = Integer.parseInt(scanner.nextLine());

      parcialGrade += weight * grade;
      sumWeight += weight;
    }

    double result = (double) parcialGrade / sumWeight;

      System.out.println("Parabéns! Você alcançou" + result
          + "%! E temos o prazer de informar que você obteve aprovação!");

    scanner.close();
  }
}