public class Bow extends Weapon {
  public Bow(String name, int damage) {
    super(name, damage);
  }

  public void specialAttack(Character c) {
    double rand = Math.random();
    int damage;

    if(rand < 0.5) {
      damage = getDamage() * 4;
      System.out.println("ボロボロになっている、" + c.getName() + "に" + damage + "ダメージを与えた！");
      c.subtractHp(damage);
    }
    else {
      System.out.println("攻撃が、効かなかった。");
    }
  }
}
