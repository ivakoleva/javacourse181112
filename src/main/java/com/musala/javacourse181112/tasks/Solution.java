class Robot {
    int currentX = 0;
    int currentY = 5;
    int lastX = 0;
    int lastY = 5;
    String a;
    int b;

    public Robot() {
        this.currentX = 0;
        this.currentY = 5;
    }

    public Robot(int currentX, int currentY) {
        this.currentX = currentX;
        this.currentY = currentY;
    }

    void moveX(int dx) {
        this.lastX = this.currentX + dx;
        this.currentX = this.currentX + dx;
        this.a = "x";
        this.b = dx;
    }

    void moveY(int dy) {
        this.lastY = this.currentY;
        this.currentY = this.currentY + dy;
        this.a = "y";
        this.b = dy;
    }

    void printCurrentCoordinates() {
        System.out.println(currentX + " " + currentY);
    }

    void printLastCoordinates() {
        System.out.println(lastX + " " + lastY);
    }

    void printLastMove() {
        System.out.println(a + " " + b);
    }
}