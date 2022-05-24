// QUESTION 2
interface AntiLockBrakes {
    void AntiLockBrakes();
}

interface CruiseControl {
    void CruiseControl();
}

interface PowerSteering {
    void PowerSteering();
}

class Model1 extends Auto implements PowerSteering {
    public void PowerSteering() {
        System.out.println("PowerSteering is available for Model1 objects.");
    }
}

class Model2 extends Auto implements AntiLockBrakes, CruiseControl {
    public void AntiLockBrakes() {
        System.out.println("AntiLockBrakes is available for Model2 objects.");
    }

    public void CruiseControl() {
        System.out.println("CruiseControl is available for Model2 objects.");
    }
}

class Model3 extends Auto implements CruiseControl {
    public void CruiseControl() {
        System.out.println("CruiseControl is available for Model3 objects.");
    }
}

abstract class Auto {
    public static void main (String[] args) {
        Model1 m1 = new Model1();
        m1.PowerSteering();

        Model2 m2 = new Model2();
        m2.AntiLockBrakes();
        m2.CruiseControl();

        Model3 m3 = new Model3();
        m3.CruiseControl();
    }
}
