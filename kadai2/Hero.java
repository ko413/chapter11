package kadai2;

public class Hero extends Character {
    public void attack(Matango target) {
        System.out.println("敵に10のダメージを与えた");
        target.hp -= 10;
    }
}
