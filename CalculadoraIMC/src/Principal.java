public class Principal {


    public static void main(String[] args) {
        Paciente p1 = new Paciente();
        p1.peso = 70;
        p1.altura = 1.73;
        System.out.println(Paciente.diagnostico(p1));

        Paciente p2 = new Paciente();
        p2.peso = 90;
        p2.altura = 1.65;
        System.out.println(Paciente.diagnostico(p2));

        Paciente p3 = new Paciente();
        p3.peso = 85;
        p3.altura = 1.80;
        System.out.println(Paciente.diagnostico(p3));
    }
}
