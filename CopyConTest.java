class Copy {
int a, b;
public Copy(int a1, int b1) {
a = a1;
b = b1;
}
public Copy(Copy C) {
a = C.a;
b = C.b;
}

void view() {
System.out.println("a=" + a + " b=" + b);
}}
class CopyConTest {
public static void main(String args[]) {
Copy test = new Copy(10, 15);
System.out.println("1st Const");
test.view();
Copy test1 = new Copy(test);
System.out.println("2nd Const");
test1.view();
}}
