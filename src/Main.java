import net.jadfreex.pv.commons.view.util.ViewExecutor;
import net.jadfreex.pv.view.InitView;

/**
 *
 * @author 170828 Grupo Salinas
 */
public class Main {

    private void run() {
        System.out.println("[INIT]\n\n");
        long time = System.currentTimeMillis();
        //
        ViewExecutor.show(InitView.class);
        //
        System.out.println(String.format("\n\n[EXEC TIME: %s ms]", System.currentTimeMillis() - time));
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
