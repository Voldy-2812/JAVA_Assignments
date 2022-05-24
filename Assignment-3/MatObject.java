// QUESTION 1
interface Material {
    String ball = "BALL";
    String coin = "COIN";
    String ring = "RING";

    void display();
}

class Ball extends MatObject {
    Ball(String material) {
        this.material = material;
    }
    public void display() {
        System.out.println(this.getClass().getName() + " in capital letter will be " + this.material);
    }
}

class Coin extends MatObject {
    Coin(String material) {
        this.material = material;
    }
    public void display() {
        System.out.println(this.getClass().getName() + " in capital letter will be " + this.material);
    }
}

class Ring extends MatObject {
    Ring(String material) {
        this.material = material;
    }

    public void display() {
        System.out.println(this.getClass().getName() + " in capital letter will be " + this.material);
    }
}

abstract class MatObject implements Material {
    String material;
    public static void main(String[] args) {
        MatObject _ball = new Ball(Material.ball);
        _ball.display();

        MatObject _coin = new Coin(Material.coin);
        _coin.display();

        MatObject _ring = new Ring(Material.ring);
        _ring.display();
    }
}
