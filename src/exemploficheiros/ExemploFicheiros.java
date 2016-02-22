package exemploficheiros;

import java.io.File;

/**
 *
 * @author ylagorebollar
 */
public class ExemploFicheiros {
    public static void main(String[] args) {
      LerFicheiro obxLer=new LerFicheiro();
      EscribirFich f=new EscribirFich();

      f.escribir("num");
      obxLer.lerEscribirFich("notasPares");
    }
    
}
