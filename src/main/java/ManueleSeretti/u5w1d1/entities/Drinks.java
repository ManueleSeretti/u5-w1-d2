package ManueleSeretti.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Drinks {
    private String nome;
    private int calorie;
    private double prezzo;
    private double quantità;

    @Override
    public String toString() {
        return nome + "  " + quantità + "l         " + calorie + " Kcal            " + prezzo + "}\n";
    }
}
