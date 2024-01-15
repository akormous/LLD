package Entities;

import java.util.List;

public class Terminal {
    private String id;
    private String name;
    private List<String> gates;

    public Terminal(String id, String name, List<String> gates) {
        this.id = id;
        this.name = name;
        this.gates = gates;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getGates() {
        return gates;
    }

    public void setGates(List<String> gates) {
        this.gates = gates;
    }
}
