package ro.jademy.carrental.cars.parts.Components.geaBoxMaker;

public enum GeaBoxModel {
    MANUAL("Manual"),
    AUTOMATIC("Automatic"),
    SWITCHABLE("Swichable");

    private String transmission;

    GeaBoxModel(String transmission) {
        this.transmission = transmission;
    }

    public String getName() {
        return transmission;
    }
}
////Why this dosen't work ?  Help if anyone find my prob down here, thx xD ! <-------------------------
//public enum GearBoxModel {
//    AUTMOATIC ( "Manual" ),
//    MANUAL ( "Automatic" );
//
//    privat String
//    gearType;
//
//    GearBoxModel(String gearType) {
//        this.gearType = gearType;
//    }
//
//    public privat getString() {
//        return String;
//    }
//}
