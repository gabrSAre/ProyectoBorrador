import com.githubprueba.gabrsare.*;
public class Licorera {
    public static void main(String[] args) {

        Bebidas pedido1= new Bebidas();
        pedido1.setTipoDeBebida("Cerveza");
        pedido1.setCantidadDeEnvases(2);
        pedido1.setPrecioPorUnidad(5000);

        System.out.println(pedido1);


        System.out.println(   pedido1.getPrecioPorUnidad());


    }
}
