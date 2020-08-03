import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Tic_Tac_Toe_First_Game_Self_Way extends PApplet {

char [][] board = new char[3][3];//{{'X','O','X'},{'O','X','O'},{'X','O','O'}};

int available[][] = new int[3][3];

int previous = 0;

int winArray[][] = new int[3][3];

PFont win;
public void setup()
{
  
  background(210);
  win = createFont("Serif", 32);
  textFont(win);
  
}

public void draw()
{
  
  //ellipse(200,200,100,100);
  int w = width/3;
  int h = height/3;
  
  strokeWeight(4);
  line(w,0,w,height);
  line(2*w,0,2*w,height);
  line(0,h,width,h);
  line(0,2*h,width,2*h);
  
}
public void Cross(float x1,float y1)
{
    x1 = x1 + 70;
    y1 = y1 + 70;
    float x2 = x1+50;
    float y2 = y1;
    float x3 = x1+50;
    float y3 = y1+50;
    float x4 = x1;
    float y4 = y1+50;
    line(x1,y1,x3,y3);
    line(x2,y2,x4,y4);
}

public void xWon()
{
  background(255);
  fill(0);
  textSize(72);
  //textFont(win);
  noStroke();
  text("X Won the match!!", 0,100);
  
  
}
public void oWon()
{
  background(255);
  fill(0);
  textSize(72);
  //textFont(win);
  noStroke();
  
  text("0 Won the match!!", 0,100);
}
public void tie()
{
  background(255);
  fill(0);
  textSize(72);
  //textFont(win);
  noStroke();
  
  text("Well played guys!!", 0,100);
}
public void mousePressed()
{
  if( winArray[0][0] == winArray[0][1] && winArray[0][0] == winArray[0][2])
  {
    if(winArray[0][0] == 2)
    {
      //println("O won");
      
      oWon();
      //background(150);
      
    }
    else if(winArray[0][0] == 1)
    {
      println("X won");
      xWon();
    }
  }
  if( winArray[1][0] == winArray[1][1] && winArray[1][0] == winArray[1][2])
  {
    if(winArray[1][0] == 2)
    {
      println("O won");
      oWon();
    }
    else if(winArray[1][0] == 1)
    {
      println("X won");
      xWon();
    }
  }
  if( winArray[2][0] == winArray[2][1] && winArray[2][0] == winArray[2][2])
  {
    if(winArray[2][0] == 2)
    {
      println("O won");
      oWon();
    }
    else if(winArray[2][0] == 1)
    {
      println("X won");
      xWon();
    }
  }
  if( winArray[0][0] == winArray[1][0] && winArray[0][0] == winArray[2][0])
  {
    if(winArray[0][0] == 2)
    {
      println("O won");
      oWon();
    }
    else if(winArray[0][0] == 1)
    {
      println("X won");
      xWon();
    }
  }
  if( winArray[0][1] == winArray[1][1] && winArray[0][1] == winArray[2][1])
  {
    if(winArray[0][1] == 2)
    {
      println("O won");
      oWon();
    }
    else if(winArray[0][1] == 1)
    {
      println("X won");
      xWon();
    }
  }
  if( winArray[0][2] == winArray[1][2] && winArray[0][2] == winArray[2][2])
  {
    if(winArray[0][2] == 2)
    {
      println("O won");
      oWon();
    }
    else if(winArray[0][2] == 1)
    {
      println("X won");
      xWon();
    }
  }
  if( winArray[0][0] == winArray[1][1] && winArray[0][0] == winArray[2][2])
  {
    if(winArray[0][0] == 2)
    {
      println("O won");
      oWon();
    }
    else if(winArray[0][0] == 1)
    {
      println("X won");
      xWon();
    }
  }
  if( winArray[0][2] == winArray[1][1] && winArray[0][2] == winArray[2][0])
  {
    if(winArray[0][2] == 2)
    {
      println("O won");
      oWon();
    }
    else if(winArray[0][2] == 1)
    {
      println("X won");
      xWon();
    }
  }
  int checkFull = 0;
  for(int i = 0; i < 3;i++)
  {
    for(int j = 0; j < 3;j++)
    {
      if(available[i][j] == 1)
      {
        checkFull++;
      }
    }
  }
  if(checkFull == 9)
  {
    tie();
  }
  ellipseMode(CORNER);
  int w = width/3;
  int h = height/3;
  if(mouseX <w && mouseY <h)
  {
    if(available[0][0] == 0 && previous == 0)
    {
      Cross(0,0);
      previous = 1;
      available[0][0] = 1;
      winArray[0][0] = 1;
    }
    else if(available[0][0] == 0 && previous == 1)
    {
      ellipse(70,70,50,50);
      previous = 0;
      available[0][0] = 1;
      winArray[0][0] = 2;
    }
    
    
    println("I am in "+1);
  }
  else if(mouseX > w && mouseX < 2*w && mouseY < h)
  {
    //available[0][1] = 1;
    //println("I am in "+2);
    if(available[0][1] == 0 && previous == 0)
    {
      Cross(w,0);
      previous = 1;
      available[0][1] = 1;
      winArray[0][1] = 1;
    }
    else if(available[0][1] == 0 && previous == 1)
    {
      ellipse(w+70,70,50,50);
      previous = 0;
      available[0][1] = 1;
      winArray[0][1] = 2;
    }
  }
  else if(mouseX > 2*w && mouseX < 3*w && mouseY < h)
  {
    //available[0][2] = 1;
    //println("I am in "+3);
    if(available[0][2] == 0 && previous == 0)
    {
      Cross(2*w,0);
      previous = 1;
      available[0][2] = 1;
      winArray[0][2] = 1;
    }
    else if(available[0][2] == 0 && previous == 1)
    {
      ellipse(2*w+70,70,50,50);
      previous = 0;
      available[0][2] = 1;
      winArray[0][2] = 2;
    }
    
  }
  else if(mouseX < w && mouseY > h && mouseY < 2*h)
  {
    //available[1][0] = 1;
    //println("I am in "+4);
    if(available[1][0] == 0 && previous == 0)
    {
      Cross(0,h);
      previous = 1;
      available[1][0] = 1;
      winArray[1][0] = 1;
    }
    else if(available[1][0] == 0 && previous == 1)
    {
      ellipse(70,70+h,50,50);
      previous = 0;
      available[1][0] = 1;
      winArray[1][0] = 2;
    }
  }
  else if(mouseX > w && mouseX< 2*w && mouseY > h && mouseY < 2*h)
  {
    //available[1][1] = 1;
    //println("I am in "+5);
    if(available[1][1] == 0 && previous == 0)
    {
      Cross(w,h);
      previous = 1;
      available[1][1] = 1;
      winArray[1][1] = 1;
    }
    else if(available[1][1] == 0 && previous == 1)
    {
      ellipse(w+70,70+h,50,50);
      previous = 0;
      available[1][1] = 1;
      winArray[1][1] = 2;
    }
  }
  else if(mouseX > 2*w && mouseX< 3*w && mouseY > h && mouseY < 2*h)
  {
    //available[1][2] = 1;
    //println("I am in "+6);
    if(available[1][2] == 0 && previous == 0)
    {
      Cross(2*w,h);
      previous = 1;
      available[1][2] = 1;
      winArray[1][2] = 1;
    }
    else if(available[1][2] == 0 && previous == 1)
    {
      ellipse(2*w+70,70+h,50,50);
      previous = 0;
      available[1][2] = 1;
      winArray[1][2] = 2;
    }
  }
  else if(mouseX < w && mouseY > 2*h && mouseY < 3*h)
  {
    //available[2][0] = 1;
    //println("I am in "+7);
    if(available[2][0] == 0 && previous == 0)
    {
      Cross(0,2*h);
      previous = 1;
      available[2][0] = 1;
      winArray[2][0] = 1;
    }
    else if(available[2][0] == 0 && previous == 1)
    {
      ellipse(70,70+2*h,50,50);
      previous = 0;
      available[2][0] = 1;
       winArray[2][0] = 2;
    }
  }
  else if(mouseX > w && mouseX< 2*w && mouseY > 2*h && mouseY < 3*h)
  {
    //available[2][1] = 1;
    //println("I am in "+8);
    if(available[2][1] == 0 && previous == 0)
    {
      Cross(w,2*h);
      previous = 1;
      available[2][1] = 1;
       winArray[2][1] = 1;
    }
    else if(available[2][1] == 0 && previous == 1)
    {
      ellipse(70+w,70+2*h,50,50);
      previous = 0;
      available[2][1] = 1;
       winArray[2][1] = 2;
    }
  }
  else if(mouseX > 2*w && mouseX< 3*w && mouseY > 2*h && mouseY < 3*h)
  {
    //available[2][2] = 1;
    //println("I am in "+9);
    if(available[2][2] == 0 && previous == 0)
    {
      Cross(2*w,2*h);
      previous = 1;
      available[2][2] = 1;
       winArray[2][2] = 1;
    }
    else if(available[2][2] == 0 && previous == 1)
    {
      ellipse(2*w+70,70+2*h,50,50);
      previous = 0;
      available[2][2] = 1;
       winArray[2][2] = 2;
    }
  }
  
  //println(available[0][1]);
}
  public void settings() {  size(600,600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Tic_Tac_Toe_First_Game_Self_Way" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
