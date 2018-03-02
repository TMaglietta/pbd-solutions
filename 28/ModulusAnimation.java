public class ModulusAnimation {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i <= 80; i++) {
            if (i % 5 == 0 && !(i % 10 == 0)){
				System.out.print("Whosa best Sith Lord? ");
			}
			
			if (i % 10 == 0 && i != 0){
                System.out.print("JarJarsa best Sith Lord! \n");
			}
            Thread.sleep(200);
        }
    }
}