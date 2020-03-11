public class SuperHero extends Hero implements FlyingCreature {

  private boolean flying;

  public SuperHero(String name) {
    super(name);
    setHp(300);
    setMp(400);
    this.flying = false;
  }

 public void setFlying(boolean flying) {
    this.flying = flying;
  }

  public boolean getFlying() {
    return flying;
  }

  public void attack(Character c) {
    Weapon w = getWeapon();
    int damage;

    if(w instanceof Sword) {
      damage = w.getDamage();
      System.out.println(getName() + "は、切りつけた！");
      System.out.println(c.getName() + "に" + damage + "ダメージ！");
      c.subtractHp(damage);
      System.out.println(c.getName() + "のHP:" + c.getHp());
    } else if(w instanceof Bow) {
      damage = w.getDamage();
      System.out.println(getName() + "は、矢を放った！");
      System.out.println(c.getName() + "に" + damage + "ダメージ！");
      c.subtractHp(damage);
      System.out.println(c.getName() + "のHP:" + c.getHp());
    } else {
      damage = 3;
      System.out.println(getName() + "の攻撃！");
      System.out.println(c.getName() + "に" + damage + "ダメージ！");
      c.subtractHp(damage);
      System.out.println(c.getName() + "のHP:" + c.getHp());
    }
  }

  public void fly() {
    if(getFlying()) { return; }
    setFlying(true);
    System.out.println(getName() + "は、進化した！");
  }

  public void land() {
    if(!getFlying()) { return; }
    setFlying(false);
    System.out.println(getName() + "は、元に戻っていた！");
  }
}