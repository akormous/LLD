package Entities;

import java.util.List;

public class Airport {
    private String id;
    private String name;
    private String city;
    private List<Terminal> terminals;
    private List<Runway> runways;

    public Airport(String id, String name, String city, List<Terminal> terminals, List<Runway> runways) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.terminals = terminals;
        this.runways = runways;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Terminal> getTerminals() {
        return terminals;
    }

    public void setTerminals(List<Terminal> terminals) {
        this.terminals = terminals;
    }

    public List<Runway> getRunways() {
        return runways;
    }

    public void setRunways(List<Runway> runways) {
        this.runways = runways;
    }
}
