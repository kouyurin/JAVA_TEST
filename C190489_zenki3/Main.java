class Main {
  public static void main(String[] args) {
    long[] fn=new long[51];
    fn[0]=0;
    fn[1]=1;
    long sum=0;
    for(int i=2;i<fn.length;i++){
      fn[i]=fn[i-1]+fn[i-2];
    }
    for(int i=46;i<fn.length;i++){
     sum +=fn[i];
     System.out.println("fn"+"["+i+"]"+fn[i]);
    }
    System.out.println("合計:"+sum);
  }
}