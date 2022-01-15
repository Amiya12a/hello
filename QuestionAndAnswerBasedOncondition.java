public class QuestionAndAnswerBasedOncondition{
    public static void main (String[] args){
//         Find output or error
// 1 
        // boolean i;
        // if(i=(true,false,true)) //Syntax error on token "="
        // System.out.println("bye");
        // else
        // System.out.println("hello");
        // System.out.println("hi");
// 2 
        // boolean i=false,x=false,y=true;
        // if(i=(x=i=y)) 
        // System.out.println("bye");//bye
        // else
        // System.out.println("hello");
        // System.out.println("hi");//hi
// 3 
        // boolean i=false;
        // if(!i&& i==true) 
        // System.out.println("bye");
        // else
        // System.out.println("hello");//hello
        // System.out.println(i);//false
// 4 
        // int n=5;
        // if(n<=4)
        // System.out.println("n is less than 4");
        // System.out.println("checking");
        // else//syntax error on token "else"
        // System.out.println("n is greater than equal to 4");
// 5 
        // boolean i=false;
        // if(i!=true & !i!=false) 
        // System.out.println("bye");//bye
        // else
        // System.out.println("hello");
        // System.out.println("hi");//hi
// 6 
        // if (true) {
        // System.out.println("Hello");
        // break;} //break cannot be used outside of a loop or a switch
// 7
        // int x=2,y=2;
        // int z;
        // if (x>2) {
        //     if(y>2){
        //         z=x+y;
        //         System.out.println("z="+z);
        //     }
        // }
        // else
        // System.out.println("x="+x);//x=2
// 8 class Test1
        // {
        // public static void main(String s[])
        // {
        // float f = 75.0f;
        // double d = 75.0;
        // int i = 75;
        // if( f == d )
        // {
        // if( f == i )
        // {
        // System.out.println("f, d and i are equal");
        // }
        // else
        // {
        // System.out.println("f, d are equal but i is not equal");
        // }
        // }
        // else
        // {
        // System.out.println("f and d are not equal");
        // }
              //error beacuse of shortage of braces at the end
//  9 
        // class Test { 
        // public
        // static void main(String[] args) 
        // { 
        // int x = 10; 
        // if (++x < 10 && (x / 0 > 10)) { 
        // System.out.println("Hello"); 
        // } else { 
        // System.out.println("HIIII"); //HIIII
        // } 
        // } 
        // }
// 10 public class demo {
        // public static void main(String[] args) {
        // int k = 65;
        //  switch (k) {
        //  default :
        //  System.out.print("Website");
        //  case 65 :
        //  System.out.print("Merit");//Merit
        //  case 'k' :
        //  System.out.print("Campus");//Campus
        //  case 'j' :
        //  System.out.print("Java");//Java
        //  break;
        //  }
        // }
        // }
// 11 
        // public class Main
        // {
        // public static void main(String[] args) {
        //  boolean x = true;
        //  boolean y = false;
        //  if ((x && y)|(x||y)) {
        //  System.out.println(true);//true
        //  } else {
        //  System.out.println(false);
        //  }
        // }
        // }
// 12 
        // public class temp
        // {
        //  public static void main(String args[])
        //  {
        //  int ok=10;
        //  switch(ok)
        //  {
        //  case 10:// Duplicate case
        //  case 10: // Duplicate case
        //  case 10: System.out.println("True"); // Duplicate case
        //  }
        //  }
        // }
// 13 
        // public class Main
        // {
        // public static void main(String[] args) {
        // if(if( 2 > 1 ))// Syntax error on token "if", delete this token
        //  {
        //  System.out.println(" 2 is greater than 1");
        //  }
        // }
        // }
// 14 
        // class Directions
        // {
        //  public static void main(String s[])
        //  {
        //  char direction = 'N';
        //  char west = 'W';
        //  switch(direction)
        //  {
        //  case 'N':
        //  System.out.println("North");
        //  break;
        //  case 'E':
        //  System.out.println("East");
        //  break;
        //  case west://ase expressions must be constant expressions
        //  System.out.println("West");
        //  break;
        //  case 'S':
        //  System.out.println("South");
        //  }
        //  }
        // }
// 15 
        // public class demo {
        // public static void main(String[] args) {
        // int a = 7;
        // if ( a*2==a<<33 ) {
        //  System.out.print( "Yup" );//Yup
        //  }
        //  else {
        //  System.out.print( "Nope!" );
        //  }
        // }
        // }
// 16 
        // public class Test {
        // public static void main(String[] args){
        // boolean b = true; 
        //  if (b = false) { 
        //  System.out.println("HELLO"); 
        //  } else { 
        //  System.out.println("BYE"); //BYE
        //  } 
        // }
        // }
// 17 
        // public class Test {
        // public static void main(String [] args){
        // boolean x = true;
        //  boolean y = false;
        //  if (x && y) {
        //  System.out.println(true);
        //  } else {
        //  System.out.println(false);//false
        //  }
        // }
        // }
// 18 
        // public class Test { 
        // public static void main(String[] args) {
        // int a = 10;
        // int b = 9;
        // if (a > b)
        //  System.out.println("a is greater");
        // System.out.println("I am not in if block");Could not find or load main class test
// 19 
        // public class Test{
        //  public static void main(String s[])
        //  {
        //  float fl = 5.3f;
        //  if (fl == 5.3)
        //  System.out.println("Both are equal");
        //  else
        //  System.out.println("Both are not equal");//Both are not equal
        //  }
        // }
// 20 
        // public class Test { 
        //  public static void main (String[] args) { 
        //  int f = 10, s=0;
        //  if (f < 10)
        //  s = 1;
        //  if (f >= 10)
        //  s=2;
        //  System.out.println("y is " + s); }//y is 2
        // }
// 21 
        // if(true && false && true || false)
        //  System.out.println("True.");
        // else
        //  System.out.println("False");//False
// 22 
        // public class temp
        // {
        //  public static void main(String args[])
        //  {
        //  int x=1; 
        //  if((boolean)x==true)//Cannot cast from int to boolean
        //  System.out.println("True.");
        //  else
        //  System.out.println("False.");
        //  }
        // }
// 23 
        // public class temp
        // {
        //  public static void main(String args[])
        //  {
        //  int ok=10;
        //  switch(ok)
        //  {
        //  default:
        //  System.out.println("default");//default
        //  case 0:
        //  System.out.println("true");//true
        //  case 1:
        //  System.out.println("false");//false
        //  }
        //  }
        // }
// 24 
        // class selection_statements 
        //  {
        //  public static void main(String args[])
        //  {
        //  int var1 = 5; 
        //  int var2 = 6;
        //  if ((var2 = 1) == var1)
        //  System.out.print(var2);
        //  else 
        //  System.out.print(++var2);//2
        //  } 
        //  }
// 25
        //  public class Test { 
        // public static void main(String[] args) 
        //  { 
        //  int a = 10, b = 20; 
        //  if (a < b) { 
        //  if (a > b) { 
        //  System.out.println("HELLO ITER"); 
        //  } else { 
        //  System.out.println("WELCOME"); //WELCOME
        //  } 
        //  } 
        //  } 
        // }
// 26 
        // public class Test {
        //  public static void main(String[] args) {
        //  boolean x = true;
        //  boolean y = false;
        //  if (x || y) {
        //  System.out.println(true);//true
        //  } else {
        //  System.out.println(false);
        //  }
        //  }
        // }
// 27   
        //public class Student
        // {
        //  public static void main(String s[])
        //  {
        //  int marks = 80;
        //  if( marks > 70 )
        //  System.out.println("Distinction");//Distinction
        //  if( marks > 35 )
        //  System.out.println("Pass");//Pass
        //  else
        //  System.out.println("Fail");
        //  System.out.println("Better luck next time");//Better luck next time
        //  }
        // }
// 28 
        // public class Test2 {
        //  public static void main(String s[]) {
        // int a=15;
        // int b=25;
        // if ((a<b) || (a=5)>15)
        //  system.out.println(a);//system cannot be resolved
        // else
        //  system.out.println(b);}}//system cannot be resolved
// 29 
        // public class Test2 {
        //  public static void main(String s[]) {
        //  int x = 20;
        //  int y = 25;
        //  if (++x < (y = y -= 4) || (x = x += 4) > y) {
        //  System.out.println(x + "," + y);//25,21
        //  }
        //  }
        // }
// 30 
        // public class demo3
        // {
        // public static void main(String args[])
        // {
        // int i = 0;
        // if( i++ + i>=1)
        // System.out.println(true);//true
        // else System.out.println(false);
        // }
        // }
// 31 
        // public class demo4{
        // public static void main(String args[])
        // {
        // int i = 5;
        // if( !i)//The operator ! is undefined for the argument type(s) int
        // System.out.println(well);//well cannot be resolved to a variable
        // else System.out.println(done);// done cannot be resolved to a variable
        // }
        // }
// 32 
        // class demo5 
        //  {
        //  public static void main(String args[])
        //  {
        //  int var1 = 5; 
        //  int var2 = 6;
        //  if ((var2 = 1) == var1)//here var2 becomes 1
        //  System.out.print(var2);
        //  else 
        //  System.out.print(++var2);//2
        //  } 
        //  }
// 33 
        // public class Demo1
        //  {
        //  public static void main(String args[]) 
        //  { 
        //  int a = 5;
        //  int b = 10;
        //  boolean c=false;
        //  if (a == b >> 1 || c==true)
        //  {
        //  System.out.println("ITER");//ITER
        //  }
        //  else
        //  {
        //  System.out.println("SOA");
        //  }
        
        //  }
        // }
// 34 
        // public class Demo2
        // {
        //  public static void main(String args[])
        //  {
        //  int x=15;
        //  int y=10;
        //  int z=5;
        //  if(x>y & y>z)
        //  if (x>z | y>x)
        //  if(x>y ^ z<y)
        //  System.out.println("Apple");
        //  else
        //  System.out.println("Orange");//Orange
        //  else
        //  System.out.println("Banana");
        //  else
        //  System.out.println("Grapes");
        //  }
        // }
// 35     
        // public class Demo3
        // {
        //  public static void main(String[] args)
        //  {
        //  int var = 12;
        //  switch ("var")//here var is a String
        //  {
        //  case "014" :
        //  System.out.print("Hello");
        //  break;
        //  case "12" :
        //  System.out.print("Hi");
        //  default :
        //  System.out.print("How r u?");//How r u?
        //  }
        //  }
        // }
        
// 36 
        // public class Demo11
        // {
        //  public static void main(String args[])
        // {
        // int number = 4;
        // double alpha = -1.0;
        // if (number > 0)
        // if (alpha > 0)
        // System.out.println("Here I am!");
        // else if(number< alpha)
        // System.out.println("No, I’m here!");
        // else
        // System.out.println("No, actually, I’m here!");//No, actually, I?m here!
        // System.out.println("Most probably I am there");//Most probably I am there
        // }
        // }
// 37
        //  public class Demo5
        // {
        //  public static void main(String[] args)
        //  {
        //  int x = 1, y = 2; 
        //  switch (x) { 
        //  case 1: 
        //  switch (y) { 
        
        //  case 2: 
        //  System.out.println( "Choice is 2");//Choice is 2
        //  break; 
        
        //  case 3: 
        //  System.out.println( "Choice is 3"); 
        //  break; 
        //  } 
        //  break; 
        //  case 4: 
        //  System.out.println( "Choice is 4"); 
        //  break; 
        
        //  case 5: 
        //  System.out.println( "Choice is 5"); 
        //  break; 
        //  default: 
        //  System.out.println( "Choice is other than 1, 2 3, 4, or 5"); 
        //  break; 
        //  } 
        //  }
        // }
// 38 
        // class Demo1 { 
        // public
        //  static void main(String[] args) 
        //  { 
        //  boolean a = true; int i=0;
        //  if (a = true) 
        //  i=1; 
        
        //  System.out.println(i); //1
        //  } 
        // } 
// 39 
        // class Demo2 { 
        // public
        //  static void main(String[] args) 
        //  { 
        //  int i=0;
        //  if (i==1); 
        //  i=2; 
        
        //  System.out.println(i); //2
        //  } 
        // }
// 40 
        // class Demo3 { 
        // public
        //  static void main(String[] args)
        //  { 
        //  int i=2;
        //  switch(i)
        // {
        // case 1:
        
        //  System.out.println(i); 
        // case 2:
        //  System.out.println(i+1);
        // case 3:
        //  System.out.println(i+2);break;
        // default:
        //  System.out.println(i+3);
        //  } //   Syntax error, insert "}" to complete ClassBody
        // }
// 41 
        // class Demo4
        // {
        //  public static void main(String s[])
        //  {
        //  if( 1 < 2 )
        //  {
        //  System.out.println("1 is less than 2");//1 is less than 2
        //  }
        //  else
        //  System.out.println("2 is less than 1");
        //  System.out.println("Hello");//Hello
        
        //  }
        // }
// 42 
        // class OperatorsOutput
        // {
        //  public static void main(String s[])
        //  {
        //  int a = 12 + 21 * 3 - 9 / 2;
        //  int b = 14 - 32 * 4 + 175 / 8 - 3;
        //  if(++a > 71 && --b < 20)
        //  {
        //  System.out.println("a = " + a + " b = " + b);//a = 72 b = -97
        //  }
        //  if(b-- == -97 || a-- < 100)
        //  {
        //  System.out.println("a = " + a + " b = " + b);//a = 72 b = -98
        //  }
        //  }
        // }
// 43 
        // class Alpha { 
        // public
        //  static void main(String[] args) 
        //  { 
        //  int a=10;
        //  if(10L == a)
        //  System.out.println("10L");//10L
        //  if(10==a)
        //  System.out.println("10");//10
        //  else
        //  System.out.println("0");
        //  } 
        // }
// 44 
        // public class Alpha
        // {
        // public static void main(String[] args) 
        // { 
        
        //  int x='a';
        
        //  switch(x)
        //  {
        //  case 5: x+= 5;
        //  case 97: x+=10;//x = 107
        //  case 98: x+=15;break;//x becomes 122 and break
        //  case 99: x+=20;
        //  }
        //  System.out.println(x);//122
        // }
        // }
// 45 
        // Public class Alpha//error
        // {
        // public static void main(String[] args) 
        // {
        //  float a=0.7f;
        //  if(a<0.7) 
        //  System.out.println("Hello World"); 
        //  else
        //  System.out.println("Hello ITER "); 
        // }
        // }
// 46 
        // public class Alpha
        // {
        // public static void main(String[] args) 
        // {
        //  int a=35;
        // int b=25;
        // if ((a>b) && (a=5)<15)
        //  System.out.println(a);//5
        // else
        //  System.out.println(b);
        // }
        // }
// 47 
        // public class Alpha
        // {
        // public static void main(String[] args) 
        // {
        //  double x = 6.2;
        // if(x-- >= 6.0)
        // System.out.print("first ");//first
        // if(--x >= 5.0)
        // System.out.print("second ");
        // if(x-- >= 4.0)
        // System.out.print("third ");//third
        // else
        // System.out.print("fourth ");
        // }
        // }
// 48 
        // public class Main
        // {
        // public static void main(String[] args) {
        // switch(*(3 + "I LOVE" "ABCD" + 3))//Syntax error on token "*", delete this token// Syntax error on token ""ABCD"", delete this token
        // {
        // case 'A':// Type mismatch: cannot convert from char to String
        // System.out.println("Apple Mac");
        // break;
        // case 'B':// Type mismatch: cannot convert from char to String
        // System.out.println("Windows");
        // break;
        // case 'C':// Type mismatch: cannot convert from char to String
        // System.out.println("Great Linux");
        // break;
        // default:
        // System.out.println("All the above");
        // }
        // }
        // }
//49 
        // public class temp
        // {
        // public static void main(String args[])
        // {
        // if (!(System.out.println("x")))// The operator ! is undefined for the argument type(s) void
        // System.out.println("if part");
        // else
        // System.out.println(" else part");
        // }
        // }
// 50 
        // public class Main
        // {
        // public static void main(String[] args) {
        // if (int q = 0) // Syntax error on token "int", delete this token
        //                // q cannot be resolved to a variable
        // System.out.println("if part");
        // else
        // System.out.println("else part");
        // return 0;//Void methods cannot return a value
        // }
        // }
// 51 
        // public class demo {
        // public static void main(String[] args) {
        // int i = 1;
        // switch(i)
        // {
        // case i:
        // printf("case 1 executed");//The method printf(String) is undefined for the type QuestionAndAnswerBasedOncondition
        // break;
        // case i + 1;// Syntax error, insert ":" to complete SwitchLabel
        // printf("case 2 executed");//The method printf(String) is undefined for the type QuestionAndAnswerBasedOncondition
        // break;
        // default:
        // printf("default block executed");//The method printf(String) is undefined for the type QuestionAndAnswerBasedOncondition
        // break;
        // }
        // }
        // }
// 52 
        // public class A {
        // public final String xyz="if";//Illegal modifier for parameter xyz; only final is permitted
        // public static void main(String[] args) {
        // int a=10,b=5;
        // xyz(a>>1==b)//Syntax error, insert ";" to complete Statement
        // // The method xyz(boolean) is undefined for the type QuestionAndAnswerBasedOnconditio
        // {
        // System.out.println("ABC");
        // }
        // }
        // }
// 53 
        // public class A {
        // public static void main(String[] args) {//Error: Could not find or load main class abcd
        // int a=10,b=5;
        // switch(a<b)
        // {
        // case true: System.out.println("Wow"); 
        // break;
        // case false: System.out.println("Its working");
        // break;
        // }
        // }
        // }
// 54 
        // public class A {
        // public static final int x=4; 
        // public static void main(String[] args) {
        // int a=10,b=5;
        // switch(a<b?a:b-1)
        // {
        // case 5:System.out.println("Wow"); 
        // break;
        // case 3:System.out.println("Its working");
        // break;
        // case x:System.out.println("Ooh...");//  Illegal modifier for parameter x; only final is permitted
        // break;
        // default:System.out.println("Fine...");
        // }
        // }
        // }
// 55 
        // public class A {
        // public static void main(String[] args) {
        // int a=10,b=5;
        // if(a<b);
        // {
        // if(b++<=5)
        // System.out.println("Abc");//Abc
        // System.out.println("Def");//DEf
        // }
        // }
        // }
// 56 
        // public class A { 
        // public static void main(String[] args) 
        //  { 
        //  int a=1024,b=1024;
        //  boolean c;
        //  if (c = a>>9==(b/Math.pow(2,9))) { 
        //  System.out.println("HELLO"); //HELLO
        //  } else { 
        //  System.out.println("BYE"); 
        //  } 
        //  } 
        // } 
// 57 
        // class Test {
        // public static void main(String[] args) 
        //  { 
        //  int a=10, b=20, c=30; 
        //  if (c>b>a) { // The operator > is undefined for the argument type(s) boolean, int
        //  System.out.println("TRUE"); 
        //  } else { 
        //  System.out.println("FALSE"); 
        //  } 
        //  } 
        // } 
// 58 
        // public class SwitchTest1 {
        // public static void main(String[] args) {
        //  int N = 3;
        // switch(N){ 
        //  case 1:
        //  System.out.println("The number is 1.");
        //  break;
        //  case 2:
        //  case 4:
        //  case 8:
        //  System.out.println("The number is 2, 4, or 8.");
        //  System.out.println("(That’s a power of 2!)");
        //  break;
        //  case 3:
        //  case 6:
        //  case 9:
        //  System.out.println("The number is 3, 6, or 9.");//The number is 3, 6, or 9.
        //  System.out.println("(That’s a multiple of 3!)");//(That’s a multiple of 3!)
        //  break;
        //  case 5:
        //  System.out.println("The number is 5.");
        //  break;
        //  default:
        //  System.out.println("The number is 7 or is outside the range1 to 9.");
         
        // }
        // }
        // }
// 59 
        // public class SwitchTest2 {
        // public static void main(String[] args) {
        // String branch = "ECE";
        //  int semester = 1;
        //  switch(semester)
        //  { case 1: 
        //  System.out.println("ICP-CSE 1001");
        //  switch(branch)
        //  {
        //         case "ECE":
        //                 System.out.prinltln("ECE is learning ICP");
        //         case "CSE":
        //         case "EE":
        //                 System.out.println("EE is learning ICP");
        //  }
        //  case 2:
        //  case 3:
        //  case 1://Duplicate case
        //  default:
        //         System.out.println("Default"); 
        // }
        // }
// 60 
        // public class SwitchTest3 {
        //  public static void main(String args[]) {
        //  int number1 = 111, number2 = 101;
        //  switch (number1 & number2) {
        //  case 1 :
        //  System.out.println("-1-");
        //  case 101 :
        //  System.out.println("-101-");
        //  case 111 :
        //  System.out.println("-111-");
        //  case 010 :
        //  System.out.println("-010-");
        //  default :
        //  System.out.println("-" + x & y + "-");//x & y cannot be resolved to a variable
        // }
        // }
        // }
        }
}
