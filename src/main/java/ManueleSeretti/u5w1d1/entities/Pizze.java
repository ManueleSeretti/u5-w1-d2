package ManueleSeretti.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Pizze {
    private String nome;
    private List<String> ingredienti;
    private int calorie;
    private double prezzo;

    @Override
    public String toString() {
        return nome + "            " + ingredienti + "        " + calorie + "Kcal     " + prezzo + "}\n";
    }
}
