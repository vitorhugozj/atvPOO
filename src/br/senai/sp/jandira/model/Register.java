package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Register {

    Scanner teclado = new Scanner(System.in);
    Player player = new Player();
    Enemy enemy = new Enemy();

    public void BothRegister() {
        PlayerRegister();
        EnemyRegister();
    }
    public void PlayerRegister() {
        System.out.println("-----------------Cadastrar Player--------------------");
        System.out.print("Qual é o seu nome?: ");
        player.nome = teclado.nextLine();
        System.out.println("Escolha sua skin (red - blue - purple) : ");
        player.skin = teclado.nextLine();
        System.out.println("---------Player Cadastrado com Sucesso---------------");
    }
    public void EnemyRegister(){
        System.out.println("-----------------Cadastrar Enemy--------------------");
        System.out.print("Qual é o seu nome?: ");
        enemy.nome = teclado.nextLine();
        System.out.println("Escolha sua skin (red - blue - purple) : ");
        enemy.skin = teclado.nextLine();
        System.out.println("---------Enemy Cadastrado com Sucesso---------------");
    }
    public void Decision(){

        String decision;

        System.out.println("Seja Bem Vindo!!!");
        System.out.println("Deseja Cadastrar / Player - Enemy - Ambos: ");
        decision = teclado.nextLine();

        switch (decision){

            case "Player":
                PlayerRegister();
                break;

            case "Enemy":
                EnemyRegister();
                break;

            case "Ambos":
                BothRegister();

            default:
        }


    }
}

