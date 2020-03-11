class Main {
  public static void main(String[] args) {
    int a,b,c;
    System.out.print("a->");
    a=new java.util.Scanner(System.in).nextInt();
    System.out.print("b->");
    b=new java.util.Scanner(System.in).nextInt();
    System.out.print("c->");
    c=new java.util.Scanner(System.in).nextInt();
    int max=a;
    int min=a;
    System.out.print("最大値:");
    if(b>=max){
      max=b;
    }
    if(c>=max){
      max=c;
    }
    System.out.println(max);
    if(b<=min){
      min=b;
    }
    if(c<=min){
      min=c;
    }
    System.out.println("最小値:"+min);
  }
}