public abstract class Weapon {
  protected String name;  //名前
  protected int damage; //与えるダメージ

  public Weapon(String name, int damage) {
    setName(name);
    setDamage(damage);
  }

  private void setName(String name) {
    if(name.equals("")) { this.name = "unknown"; }
    else { this.name = name; }
  }

  public String getName() {
    return this.name;
  }

  private void setDamage(int damage) {
    if(damage < 1) { this.damage = 1; }
    else { this.damage = damage; }
  }

  public int getDamage() {
    return this.damage;
  }

  public abstract void specialAttack(Character c);
}