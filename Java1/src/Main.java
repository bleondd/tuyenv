import Jp1.CreatePlayer;
import Jp1.FootballPlayer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FootballPlayer> players = CreatePlayer.createPlayers();
        for (FootballPlayer player : players) {
            System.out.println("name: " + player.name);
            System.out.println("shirt no: " + player.shirtNo);
            System.out.println("position: " + player.position);
            System.out.println("height: " + player.height);
            System.out.println("weight: " + player.weight);
            System.out.println("age: " + player.age);

            player.shoot();
            player.pass();
            player.runFaster();
            player.jumpHigher();

        }

    }
}