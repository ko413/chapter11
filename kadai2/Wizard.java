package kadai2;

public class Wizard extends Character {
    public void attack(Matango target) {
        System.out.println("魔法使いは火の玉を放った！");
        System.out.println("敵に7のダメージを与えた");
        target.hp -= 7;
    }
}
