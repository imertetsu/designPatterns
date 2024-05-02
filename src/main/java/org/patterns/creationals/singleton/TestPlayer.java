package org.patterns.creationals.singleton;

public class TestPlayer {
    public static void main(String[] args) {
        Player player = Player.getPlayer("Pedro", "Mid lane");
        System.out.println(player.toString());
        Player player2 = Player.getPlayer("Juan", "Safe lane");
        System.out.println(player2.toString());
    }
}
