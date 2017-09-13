package commons;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String id;
    private String name;
    private List<Player> players;

    public String getId() {
        return id;
    }

    public Team setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Team setName(String name) {
        this.name = name;
        return this;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Team setPlayers(List<Player> players) {
        this.players = players;
        return this;
    }

    public Team setPlayer(Player player){
        if (this.players == null){
            this.players = new ArrayList<>();
        }
        this.players.add(player);
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Team{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", players=").append(players);
        sb.append('}');
        return sb.toString();
    }
}
