package ManueleSeretti.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public abstract class ElementiMenu {
    private String nome;
    private int calorie;
    private double prezzo;

    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                        ", calorie=" + calorie +
                        ", prezzo=" + prezzo;
    }
}
