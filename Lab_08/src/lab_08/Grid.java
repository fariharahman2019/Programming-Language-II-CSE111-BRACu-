public class Grid{
  public int x;
  public int y;
  public String[] sacred;
  private int index=0;
  
  public Grid(int x,int y){
    this.x=x;
    this.y=y;
    sacred=new String[(x+y)*2-4];
  }
  
  public boolean check(String c){
    if(index==0) return false;
    for(int i=0;i<index;i++){
      if(sacred[i].equals(c))
        return true;
    }
    return false;
  }
  
  public void write(String f){
    sacred[index]=f;
    index++;
  }
}