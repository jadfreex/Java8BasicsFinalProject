import net.jadfreex.pv.model.Empleado;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class Main {

    private void run() {
        System.out.println("[INIT]");
        long time = System.currentTimeMillis();
        Empleado.Type e = Empleado.Type.ADMIN;
        System.out.println(e);
        System.out.println(String.format("[EXEC TIME: %s ms]", System.currentTimeMillis() - time));
        System.out.println("[END]");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

}
