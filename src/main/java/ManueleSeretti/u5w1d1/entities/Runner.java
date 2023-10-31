package ManueleSeretti.u5w1d1.entities;

import ManueleSeretti.u5w1d1.U5W1D1Application;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D1Application.class);
        List<ElementiMenu> lista = new ArrayList<>();
        lista.add((ElementiMenu) ctx.getBean("getPizzaMargherita"));
        lista.add((ElementiMenu) ctx.getBean("getPizzaMargherita"));
        lista.add((ElementiMenu) ctx.getBean("getPizzaMargherita"));
        lista.add((ElementiMenu) ctx.getBean("getPizzaMargherita"));
        lista.add((ElementiMenu) ctx.getBean("getWater"));
        lista.add((ElementiMenu) ctx.getBean("getWater"));
        lista.add((ElementiMenu) ctx.getBean("getWater"));
        lista.add((ElementiMenu) ctx.getBean("getWater"));

        Ordine o = (Ordine) ctx.getBean("Order_Component");
        o.setLista(lista);
        o.conto();
        log.info(String.valueOf(o));
        ctx.close();
    }
}
