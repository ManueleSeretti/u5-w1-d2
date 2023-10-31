package ManueleSeretti.u5w1d1.entities;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Toppings extends ElementiMenu {

    public Toppings(String nome, int calorie, double prezzo) {
        super(nome, calorie, prezzo);
    }
}
