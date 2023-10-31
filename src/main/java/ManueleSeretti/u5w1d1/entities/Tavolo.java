package ManueleSeretti.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Tavolo {
    private int nTavolo;
    private int maxCoperti;
    private StatoTavolo stato;

}
