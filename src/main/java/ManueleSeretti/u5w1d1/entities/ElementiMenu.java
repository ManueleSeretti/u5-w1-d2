package ManueleSeretti.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class ElementiMenu {
    private String nome;
    private int calorie;
    private double prezzo;

}
