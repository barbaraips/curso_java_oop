public class Principal {

    public static void main(String[] args) {
        Aluno barbara = new Aluno();
        barbara.bim_1 = 70;
        barbara.bim_2 = 60;
        barbara.bim_3 = 80;
        barbara.bim_4 = 70;

        System.out.println(barbara.media());
        System.out.println(barbara.passouDeAno());
    }
}
