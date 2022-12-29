import java.util.Scanner;
public class RobotTester{
  public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    
    int gridx=input.nextInt();
    int gridy=input.nextInt();
    
    int botx;
    int boty;
    char direction;
    String cmd;
    
    Grid grid=new Grid(gridx,gridy);
    Robot bot;
    
    while(input.hasNext()){
      botx=input.nextInt();
      boty=input.nextInt();
      direction=input.next().charAt(0);
      input.nextLine();
      cmd=input.next();
      
      bot=new Robot(botx,boty,direction);
      bot.cmd(cmd,grid);
    }
  }
}