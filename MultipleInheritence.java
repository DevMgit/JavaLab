class Student {
    int rollNo;

    void getnumber(int r) {
        rollNo = r;
    }

    void putnumber() {
        System.out.println("Roll No: " + rollNo);
    }
}

class Test extends Student {
    float part1, part2;

    void getmarks(float p1, float p2) {
        part1 = p1;
        part2 = p2;
    }

    void putmarks() {
        System.out.println("Marks: " + part1 + ", " + part2);
    }
}

interface Sports {
    float sportwt = 6.0f;

    void putwt();
}

class Result extends Test implements Sports {
    float total;

    public void putwt() {
        System.out.println("Sports Weightage: " + sportwt);
    }

    void display() {
        total = part1 + part2 + sportwt;
        putnumber();
        putmarks();
        putwt();
        System.out.println("Total Marks: " + total);
    }
}

class MultipleInheritence {
    public static void main(String args[]) {
        Result student = new Result();
        student.getnumber(101);
        student.getmarks(90.0f, 95.0f);
        student.display();
    }

}
