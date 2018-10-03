package ro.jademy.carrental.cars.parts.Components;

import ro.jademy.carrental.cars.parts.Components.geaBoxMaker.GeaBoxModel;

public class GearBox {

    private GeaBoxModel type;

    public GearBox(GeaBoxModel type) {
        this.type = type;
    }

    public GeaBoxModel getType() {
        return type;
    }

    @Override
    public String toString() {
        return "  "  +type                ;
    }
}