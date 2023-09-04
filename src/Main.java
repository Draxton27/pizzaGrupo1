import model.Sucursal;
import model.Cliente;

public class Main {
    public static void main(String[] args) {
        Sucursal suc = new Sucursal(1, "Matagalpa", "Matagalpa");
        for(int i =0 ; i < 2; i ++)
        System.out.println(suc.toString());

        for(int i = 0; i <= 10; i++) {
            System.out.println(5 + "*" + i + "=" + 5 * i);
        }
    }

}