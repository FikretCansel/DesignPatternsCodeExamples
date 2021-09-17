public class Main {
    public static void main(String[] args) {
        MacMailClientVisitor macVisitor=new MacMailClientVisitor();
        LinuxMailClientVisitor linuxVisitor=new LinuxMailClientVisitor();
        WindowsMailClientVisitor windowsVisitor=new WindowsMailClientVisitor();
        OperaMailClient operaMailClient=new OperaMailClient();
        SquirrelMailClient squirrelMailClient = new SquirrelMailClient();
        ZimbraMailClient zimbraMailClient=new ZimbraMailClient();
        AndroidMailClientVisitor androidMailClientVisitor=new AndroidMailClientVisitor();

        System.out.println("-----Testing Opera Mail Client for different environments-----");
        operaMailClient.accept(macVisitor);
        operaMailClient.accept(linuxVisitor);
        operaMailClient.accept(windowsVisitor);


        System.out.println("\n-----Testing Squirrel Mail Client for different environments-----");
        squirrelMailClient.accept(macVisitor);
        squirrelMailClient.accept(linuxVisitor);
        squirrelMailClient.accept(windowsVisitor);
        squirrelMailClient.sendMail(new String[]{"Messaj1"});
        squirrelMailClient.accept(androidMailClientVisitor);

        System.out.println("\n-----Testing Zimbra Mail Client for different environments-----");
        zimbraMailClient.accept(macVisitor);
        zimbraMailClient.accept(linuxVisitor);
        zimbraMailClient.accept(windowsVisitor);


    }
}
