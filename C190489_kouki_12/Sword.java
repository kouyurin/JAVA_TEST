public class Sword extends Weapon {
  public Sword(String name, int damage) {
    super(name, damage);
  }

  public void specialAttack(Character c) {
    double rand = Math.random();
    int damage;

    if(rand < 0.5) {
      damage = getDamage() * 3;
      System.out.println("するどく突き刺し、" + c.getName() + "に" + damage + "ダメージ！");
      c.subtractHp(damage);
    }
    else {
      System.out.println("しかし、失敗した。");
    }
  }
}
