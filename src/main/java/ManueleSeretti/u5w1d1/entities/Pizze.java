package ManueleSeretti.u5w1d1.entities;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class Pizze extends ElementiMenu {
    private List<String> ingredienti;

    public Pizze(String nome, List<String> ingredienti, int calorie, double prezzo) {
        super(nome, calorie, prezzo);
        this.ingredienti = ingredienti;
    }

}
