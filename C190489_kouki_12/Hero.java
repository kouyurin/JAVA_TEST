public class Hero extends Character {
  private Weapon weapon;  //装備している武器
  private int mp;//MPを追加

  private final static String[] commands = {"攻撃する", "装備を変える", "スペシャルアタック"};  //操作できるコマンド
  
  private final static Weapon[] weapons = { //装備できる武器
    new Sword("ナイフ", 5),
    new Sword("ブロードソード", 10),
    new Sword("炎のつるぎ", 15),
    new Bow("アルクセロ", 15),//Bowの武器を追加
    new Bow("巨獣弓", 20),//Bowの武器を追加
    new Bow("ダードアルク", 25),//Bowの武器を追加
  };

  public Hero(String name) {
    setName(name);
    setHp(100);
    setMp(200);
  }

  public void setWeapon(Weapon w) {
    this.weapon = w;
  }

  public Weapon getWeapon() {
    return this.weapon;
  }

  public void setMp(int mp) {
    this.mp = mp;
    if(this.mp < 0) {this.mp = 0; }
  }

  public int getMp() {
    return mp;
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

  public void show(){ //初期のHP
    System.out.println(getName() + "のHP:" + getHp());
  }

  public void showCommand() {
    for(int i = 0; i < this.commands.length; i++) {
      System.out.print("[" + i + "]" + this.commands[i] + "\t");
    }
    System.out.println("[" + this.commands.length + "]ゲーム終了");
  }

  public boolean doCommand(int command) {
    if(command < 0 || command > this.commands.length) { return true; }
    
    switch(command) {
      case 0:
        attack(getTarget());
        break;

      case 1:
        Weapon w = createRandomWeapon();
        setWeapon(w);
        System.out.println(getName() + "は、" + w.getName() + "を装備した。");
        break;

      case 2:
        if(getWeapon() == null) {
          System.out.println("しかし、武器を装備していなかった。");
          return true;
        } else {
          System.out.println(getName() + "のスペシャルアタック！");
          getWeapon().specialAttack(getTarget());
        }
        break;
      
      default:
        Main.gameEnd();
        break;
    }

    return false;
  }

  public Weapon createRandomWeapon() {
    int rand = (int)(Math.random() * this.weapons.length);

    return this.weapons[rand];
  }
}