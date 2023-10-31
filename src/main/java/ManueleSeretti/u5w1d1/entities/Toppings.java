package ManueleSeretti.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Toppings {
    private String nome;
    private int calorie;
    private double prezzo;

    @Override
    public String toString() {
        return nome + '\'' + "       " + calorie + "Kcal" + "       " + prezzo + "}\n";
    }
}
