public class Main {
  public static void main(String[] args) {
    int command;  //入力したコマンド
    java.util.Scanner scan = new java.util.Scanner(System.in);  //キーボードからの入力
    
    Hero player = new SuperHero("ミナト");
    Dragon com = new Dragon();

    player.setTarget(com);
    com.setTarget(player);

    while(!(player.isDead() || com.isDead())) {
      player.showCommand();
      player.show();
      com.show();
      boolean isError;
      do {
        System.out.print("コマンド:");
        command = scan.nextInt();
        isError = player.doCommand(command);
      } while(isError);

      System.out.println();

      com.doRandomAction();

      System.out.println();
    }

    checkResult(player, com);
  }

  public static void checkResult(Hero player, Dragon com) {
    if(player.isDead()) {
      System.out.println("ざんねん！あなたの負けです...");
      System.out.println(player.getName() + "のHP:" + player.getHp());
      System.out.println(com.getName() + "のHP:" + com.getHp());
    } else if(com.isDead()) {
      System.out.println("おみごと！敵を倒しました！");
      System.out.println(player.getName() + "のHP:" + player.getHp());
      System.out.println(com.getName() + "のHP:" + com.getHp());
    } else {
      System.out.println("戦いはまだまだ続きます。");
      System.out.println(player.getName() + "のHP:" + player.getHp());
      System.out.println(com.getName() + "のHP:" + com.getHp());
    }
  }

  public static void gameEnd() {
    System.out.println("ゲームを終了します。");
    System.exit(0);
  }
}
