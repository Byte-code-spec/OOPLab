import java.util.Scanner;
class Student{
int usn;
String name;
void accept(){
Scanner sc= new Scanner(System.in);
System.out.print("Enter usn");
usn=sc.nextInt();
sc.nextLine();
System.out.println("Enter name");
name=sc.nextLine();
}
void display(){
System.out.println("usn: "+ usn);
System.out.println("name: "+ name);
}
public static void main(String[] args){
Student[] s=new Student[3];
for(int i=0; i<3; i++){
s[i]=new Student();
s[i].accept();
}
for(int i=0; i<3; i++){
s[i].display();
}
}
}