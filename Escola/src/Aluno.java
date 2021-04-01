public class Aluno {

    int bim_1;
    int bim_2;
    int bim_3;
    int bim_4;

    public int media() {
        int total = 0;
        total += bim_1;
        total += bim_2;
        total += bim_3;
        total += bim_4;

        return total / 4;
    }

    public boolean passouDeAno() {
        return media() >= 60;
    }
}
