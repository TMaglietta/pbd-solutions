class Main {
    public static void main(String[] args) {
        System.out.println("  x\t  y\n-------------");
        for(float x = -10; x <= 10; x += 0.5){
            System.out.println(x + "\t" + (x*x));
        }
    }
}
