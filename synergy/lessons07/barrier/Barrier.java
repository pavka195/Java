package synergy.lessons07.barrier;

import synergy.lessons07.sportsman.Sportsman;

public abstract class Barrier {
    private final String name;

    public Barrier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract boolean action(Sportsman sportsman);


}
