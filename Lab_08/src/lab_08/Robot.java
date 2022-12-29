public class Robot{
  public int x;
  public int y;
  public char direction;
  public boolean flag=false;
  
  public Robot(int x,int y, char c){
    this.x=x;
    this.y=y;
    direction=c;
  }
  
  private void movement(char m){
    if(m=='R')
      turnRight();
    else if(m=='L')
      turnLeft();
    else if(m=='F')
      moveForward();
  }
  
  private void turnRight(){
    if (direction=='N')
      direction='E';
    else if (direction=='E')
      direction='S';
    else if (direction=='S')
      direction='W';
    else if (direction=='W')
      direction='N';
    
  }
  
  private void turnLeft(){
    if (direction=='N')
      direction='W';
    else if (direction=='E')
      direction='N';
    else if (direction=='S')
      direction='E';
    else if (direction=='W')
      direction='S';
  }
  
  private void moveForward(){
    if (direction=='N')
      y++;
    else if (direction=='E')
      x++;
    else if (direction=='S')
      y--;
    else if (direction=='W')
      x--;    
  }
  
  public void cmd(String c,Grid g){
    char temp;
    String command;
    for(int i=0;i<c.length();i++){
      temp=c.charAt(i);
      
      if(temp=='F'){
        command=String.valueOf(x)+String.valueOf(y)+String.valueOf(direction);
        if(!g.check(command))
          movement(temp);
      }
      else
        movement(temp);
      
      if(lostCheck(g))
        break; 
    }
    position();
  }
  
  public void position(){
    if(flag)
      System.out.println( x+" "+y+" "+direction+" LOST");
    else
      System.out.println( x+" "+y+" "+direction); 
  }
  private boolean lostCheck(Grid g){
    if(x<0 || y<0 || x>g.x || y>g.y){
      scent();
      flag=true;
      String sacred=x+""+y+""+direction;
      g.write(sacred);
      return true;
    }
    return false;
  }
  private void scent(){
    if (direction=='N')
      y--;
    else if (direction=='E')
      x--;
    else if (direction=='S')
      y++;
    else if (direction=='W')
      x++;
  }
}