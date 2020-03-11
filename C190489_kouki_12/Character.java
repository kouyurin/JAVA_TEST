public abstract class Character{
  private String name;  //名前
  private int hp;  //HP
  private Character target;  //攻撃の対象

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setHp(int hp) {
    this.hp = hp;
    if(this.hp < 1) { this.hp = 0; }
  }

  public int getHp() {
    return hp;
  }

  public void setTarget(Character c) {
    this.target = c;
  }

  public Character getTarget() {
    return this.target;
  }

  public boolean isDead() {
    if(getHp() < 1) { return true; }
    else { return false; }
  }

  public void subtractHp(int damage) {
    setHp(getHp() - damage);
  }

  public abstract void attack(Character c);
  public abstract void show();
}