public class DataSimples {
    int dia, mes, ano;

    void inicializaDataSimples(int d, int m, int a) {
        if (dataValida(d, m, a)) {
            dia = d;
            mes = m;
            ano = a;
        }else{
            dia = 0;
            mes = 0;
            ano = 0;
        }
    }

    boolean dataValida(int d, int m, int a) {
        return d > 1 && d <= 31 && m > 1 && m <= 12; //retorna o valor lógico da operação
    }

    boolean comparaDataSimples(DataSimples outraDataSimples) {
        return dia == outraDataSimples.dia && mes == outraDataSimples.mes && ano == outraDataSimples.ano; //retorna o valor lógico da operação
    }

    void mostrarDataSimples() {
        System.out.println("Dia: " + dia);
        System.out.println("-");
        System.out.println("Mes: " + mes);
        System.out.println("-");
        System.out.println("Ano: " + ano);
    }
}
