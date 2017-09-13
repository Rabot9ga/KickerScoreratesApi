package commons;

public class Player {

    private String id;
    private String name;
    private Role role;

    public String getId() {
        return id;
    }

    public Player setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Player setName(String name) {
        this.name = name;
        return this;
    }

    public Role getRole() {
        return role;
    }

    public Player setRole(Role role) {
        this.role = role;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Player{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", role=").append(role);
        sb.append('}');
        return sb.toString();
    }
}
