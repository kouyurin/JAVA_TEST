public class Dragon extends Character implements FlyingCreature {
  private boolean flying; //飛行状態

  public Dragon() {
    setName("ドラゴン");
    setHp(100);
    setFlying(true);
  }

  public void setFlying(boolean flying) {
    this.flying = flying;
  }

  public boolean getFlying() {
    return flying;
  }

  public void attack(Character c) {
    int damage;
    if(getFlying()) {
      damage = 30;
      System.out.println(getName() + "は、空から押しつぶした！");
      System.out.println(c.getName() + "に" + damage + "ダメージ！");
      c.subtractHp(damage);
      System.out.println(c.getName() + "のHP:" + c.getHp());
    } else {
      damage = 20;
      System.out.println(getName() + "は、かみついた！");
      System.out.println(c.getName() + "に" + damage + "ダメージ！");
      c.subtractHp(damage);
      System.out.println(c.getName() + "のHP:" + c.getHp());
    }
  }

  public void show(){ //初期のHP
    System.out.println(getName() + "のHP:" + getHp());
  }

  public void fly() {
    if(getFlying()) { return; }
    setFlying(true);
    System.out.println(getName() + "は、大空へ羽ばたいた！");
    System.out.println(getName()+"のHP:"+getHp());
  }

  public void land() {
    if(!getFlying()) { return; }
    setFlying(false);
    System.out.println(getName() + "は、地上に降りた！");
    System.out.println(getName()+"のHP:"+getHp());
  }

  public void doRandomAction() {
    int rand = (int)(Math.random() * 5);

    switch(rand) {
      case 0:
      case 1:
      case 2:
      case 3:
        attack(getTarget());
        break;

      case 4:
        if(getFlying()) { land(); }
        else { fly(); }

      default:
    }
  }
}