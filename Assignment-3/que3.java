interface LuminousObject {
    void lightOff();
    void lightOn();
}

class Cone extends SolidObject {}

class SolidObject implements LuminousObject {
    public void lightOff() {
        System.out.println("LuminousObject lightOff");
    }

    public void lightOn() {
        System.out.println("LuminousObject lightOn");
    }
}

class LuminousCone extends Cone implements LuminousObject {
    @Override
    public void lightOn() {
        System.out.println("LuminousCone lightOn");
    }

    @Override
    public void lightOff() {
        System.out.println("LuminousCone lightOff");
    }
}

class Cube {}

class LuminousCube extends Cube implements LuminousObject {

    @Override
    public void lightOff() {
        System.out.println("LuminousCube lightsOff");
    }

    @Override
    public void lightOn() {
        System.out.println("LuminousCube lightsOn");
    }
}

public class que3 {
    public static void main (String[] args) {
        SolidObject SolidObj = new SolidObject();
        SolidObj.lightOn();
        SolidObj.lightOff();

        LuminousObject LumObj1 = new LuminousCone();
        LumObj1.lightOn();
        LumObj1.lightOff();

        LuminousObject LumObj2 = new LuminousCube();
        LumObj2.lightOn();
        LumObj2.lightOff();
    }
}
