class Box {
double height, depth, width;
Box() {
height = depth = width = -1;
}
Box(double h, double d, double w) {
height = h;
depth = d;
width = w;
}
void volume() {
System.out.println("Volume is: " + height * depth * width);
}}
class ConOverLoad {
public static void main(String args[]) {
Box obj = new Box();
obj.volume();
Box obj1 = new Box(10, 10, 10);
obj1.volume();
}}
