package org.patterns.creationals.singleton;

public class Player {
    private final String name;
    private final String role;
    public static Player player;

    private Player(String name, String role){
        this.name = name;
        this.role = role;
    }

    public static Player getPlayer(String name, String role){
        if(player == null){
            player = new Player(name, role);
        }
        return player;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
