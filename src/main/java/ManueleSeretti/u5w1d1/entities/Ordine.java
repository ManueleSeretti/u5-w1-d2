package ManueleSeretti.u5w1d1.entities;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalTime;
import java.util.List;
import java.util.Random;

@Getter
@ToString
public class Ordine {

    private int id;
    private Tavolo tavolo;
    private LocalTime ora;
    private StatoOrdine stato;
    private int coperti;
    private List<ElementiMenu> lista;
    private double conto;

    public Ordine(Tavolo tavolo, LocalTime ora, int coperti, List<ElementiMenu> lista) {
        Random rndm = new Random();
        this.id = rndm.nextInt(1000, 9999);
        this.tavolo = tavolo;
        this.ora = ora;
        this.coperti = coperti;
        this.lista = lista;
        this.stato = StatoOrdine.IN_CORSO;
        lista.forEach(e -> this.conto = this.conto + e.getPrezzo());
        this.conto = this.conto + (coperti * 1);
    }
}
