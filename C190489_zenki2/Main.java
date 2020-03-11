class Main {
  public static void main(String[] args) {
    System.out.println("0:グー 1:チョキ 2:パー");
    int Rock=0;
    int Scissors=1;
    int Paper=2;
    int p,c;
    int win=0;
    int lose=0;
    for(;win<3&&lose<3;){
      System.out.print("プレイヤー:");
      p=new java.util.Scanner(System.in).nextInt();
      c=new java.util.Random().nextInt(3);
      System.out.println("コンピュータ:"+c);
      if(p==c){
      System.out.println("[あいこ]");
      }else if(p==Rock&&c==Scissors||p==Scissors&&c==Paper||p==Paper&&c==Rock){
      System.out.println("[勝ち]");
      win++;
      }else if(p==Rock&&c==Paper||p==Scissors&&c==Rock||p==Paper&&c==Scissors){
      System.out.println("[負け]");
      lose++;
      }
    }
    System.out.println("「最終勝ち」");
    System.out.println("プレイヤー:"+win);
    System.out.println("コンピュータ:"+lose);
    if(win>lose){
      System.out.println("プレイヤーの勝ち");
    }else{
      System.out.println("コンピュータの勝ち");
    }
  }
}