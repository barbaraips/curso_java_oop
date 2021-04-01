public class Paciente {

    double peso;
    double altura;
    static double imc;
    String result;

    public static double calcularIMC(double altura, double peso) {
        imc = peso / (altura * altura);
        return imc;
    }

    public static String diagnostico(Paciente p) {
        String diagnostico = "O diagnostico do paciente é ";
        double imc = calcularIMC(p.altura, p.peso);


        if (imc < 16) {
            diagnostico += "baixo peso muito grave.";
        } else if (16 <= imc && imc <= 16.99) {
            diagnostico += "baixo peso grave.";
        } else if (17 <= imc && imc <= 18.49) {
            diagnostico += "baixo peso.";
        } else if (18.50 <= imc && imc <= 24.99) {
            diagnostico += "peso normal.";
        } else if (25 <= imc && imc <= 29.99) {
            diagnostico += "sobrepeso.";
        } else if (30 <= imc && imc <= 34.99) {
            diagnostico += "obesidade grau I.";
        } else if (35 <= imc && imc <= 39.99) {
            diagnostico += "obesidade grau II.";
        } else if (imc > 40) {
            diagnostico += "obesidade grau III (obesidade mórbida).";
        }

        return diagnostico;
    }

}

