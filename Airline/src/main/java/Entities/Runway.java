package Entities;

import Enums.RunwayStatus;

public class Runway {
    private RunwayStatus status;

    public Runway(RunwayStatus status) {
        this.status = status;
    }

    public RunwayStatus getStatus() {
        return status;
    }

    public void setStatus(RunwayStatus status) {
        this.status = status;
    }
}
