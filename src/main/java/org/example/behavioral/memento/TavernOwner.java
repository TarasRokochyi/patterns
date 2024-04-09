package org.example.behavioral.memento;

public class TavernOwner {
    private TavernMemento memento;

    public void saveTavernState(TavernE tavern) {
        this.memento = tavern.saveToMemento();
    }

    public void restoreTavernState(TavernE tavern) {
            tavern.restore(memento);
    }
}
