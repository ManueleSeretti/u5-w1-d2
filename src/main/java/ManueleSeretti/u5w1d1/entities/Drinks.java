package ManueleSeretti.u5w1d1.entities;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Drinks extends ElementiMenu {

    private double quantità;

    public Drinks(String nome, int calorie, double prezzo, double quantità) {
        super(nome, calorie, prezzo);
        this.quantità = quantità;
    }


}
