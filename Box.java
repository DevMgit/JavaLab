class Box {
    double height;
    double depth;
    double width;

    void volume() {
        System.out.println("volume:" + height * depth * width);
    }

    public static void main(String args[]) {
        Box box = new Box();
        box.height = 10;
        box.depth = 10;
        box.width = 10;
        box.volume();
    }
}
