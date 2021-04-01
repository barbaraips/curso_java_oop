import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Pizza {

    static Map<String,Integer> hm = new HashMap<>();
    ArrayList<String> listaIngredientes = new ArrayList<>();

    private static void contabilizaIngrediente(ArrayList<String> list) {
        for (String ingrediente : list) {
            if (hm.containsKey(ingrediente)) {
                hm.replace(ingrediente, (hm.get(ingrediente) + 1));
            } else {
                hm.put(ingrediente, 1);
            }
        }
    }

    void adicionaIngrediente(String ingrediente){
        listaIngredientes.add(ingrediente);
        contabilizaIngrediente(listaIngredientes);
    }

    void zeraListaIngredientes(ArrayList<String> listaIngredientes) {
        listaIngredientes.clear();
    }

    int getPreco() {

        int precoPizza = 0;

        if (0 < listaIngredientes.size() && listaIngredientes.size() <= 2) {
            precoPizza = 15;
        }
        else if(3 <=listaIngredientes.size()  && listaIngredientes.size()  <= 5){precoPizza = 20;}
        else if(listaIngredientes.size()  > 5){precoPizza = 23;}

        return precoPizza;

    }
}
