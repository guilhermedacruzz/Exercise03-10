package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Car cars[] = new Car[4];

        cars[0] = new Car("Branco", "Volkswagen", "Up!", 2015,
                75.6f, 60.0f, 60, 80);

        cars[1] = new Car("Preto", "BMW", "320i");
        cars[1].setAno(2015);
        cars[1].setPotencia(200);
        cars[1].setVelocidade(240.6f);
        cars[1].setTanqueAtual(80);
        cars[1].setTanqueMax(110);

        cars[2] = new Car("Prata", "Ford", "Fusion", 2011,
                220f, 115.7f, 80, 120);

        cars[3] = new Car("Prata", "Ford", "Fusion", 2011,
                220f, 115.7f, 80, 120);

        int car, op, value;
        float aux;

        do{
            car = menuCar(cars, sc) - 1;

            if(car != -1) {
                op = menuBar(cars[car], sc);
                switch (op) {
                    case 1:
                        limparTela();

                        System.out.printf("Digite quantos litros vai colocar:\t");
                        value = sc.nextInt();

                        aux = cars[car].abastecer(value);
                        System.out.printf("Agora o carro está com %f litrso!\n", aux);

                        sc.next();
                        break;

                    case 2:
                        limparTela();

                        System.out.println("Acelerando........");
                        cars[car].acelerar();

                        sc.next();
                        break;

                    case 3:
                        limparTela();

                        System.out.println(cars[car].toString());

                        sc.next();
                        break;

                    case 4:
                        limparTela();

                        aux = cars[car].frear();

                        System.out.println("Freiando 10%..........");
                        System.out.println("Velocidade atual: " + aux);

                        sc.next();
                        break;

                    case 5:
                        limparTela();

                        System.out.printf("Digite o quantos quilometros quer reduzir:\t");
                        value = sc.nextInt();
                        aux = cars[car].frear(value);

                        System.out.println("Freiando 10%..........");
                        System.out.println("Velocidade atual: " + aux);

                        sc.next();
                        break;

                }
            }
            else{
                System.out.println("Encerrando...........");
            }

        }while(car != -1);

        if(cars[2] == cars[3]){ // Não funciona dá que são diferentes Sempre
            System.out.println("Os carros 3 e 4 são iguais!");
        }
        else {
            System.out.println("Os carros 3 e 4 são diferentes!");
        }
    }

    public static int menuCar(Car[] cars, Scanner sc) {

        int leitura;

        do{
            limparTela();

            System.out.printf("\t/*********************************|\n");
            System.out.printf("\t|*********    MENU    ***** ->   *|\n\n");
            System.out.printf("\t|  1 -\t%s                  \n", cars[0].getModelo());
            System.out.printf("\t|  2 -\t%s                  \n", cars[1].getModelo());
            System.out.printf("\t|  3 -\t%s                  \n", cars[2].getModelo());
            System.out.printf("\t|  0 -\tSair                      |\n\n");
            System.out.printf("\t|*********************************/\n\n");
            System.out.printf("\t[Controle pelas setas ou digite o número correspondente]\n\n\t");

            leitura = sc.nextInt();

        }while (leitura < 0 || leitura > 3);

        return leitura;
    }

    public static int menuBar(Car car, Scanner sc) {

        int leitura;

        do{
            limparTela();

            System.out.printf("\t/*********************************|\n");
            System.out.printf("\t|*********    MENU    ***** -> %s\n\n", car.getModelo());
            System.out.printf("\t|  1 -\tAbastecer                 |\n");
            System.out.printf("\t|  2 -\tAcelerar                  |\n");
            System.out.printf("\t|  3 -\tStatus                    |\n");
            System.out.printf("\t|  4 -\tFrear                     |\n");
            System.out.printf("\t|  5 -\tFrear Controlado          |\n");
            System.out.printf("\t|  0 -\tSair                      |\n\n");
            System.out.printf("\t|*********************************/\n\n");
            System.out.printf("\t[Controle pelas setas ou digite o número correspondente]\n\n\t");

            leitura = sc.nextInt();

        }while (leitura < 0 || leitura > 5);

        return leitura;
    }

    public static void limparTela() {
        for(int i = 0; i < 100; i++)
            System.out.println();
    }
}