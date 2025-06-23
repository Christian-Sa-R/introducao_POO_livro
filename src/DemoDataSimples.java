public class DemoDataSimples {
    public static void main(String[] args) {
        DataSimples hoje = new DataSimples();
        DataSimples independencia = new DataSimples();

        int umDia, umMes, umAno;

        umDia = 40; umMes = 1; umAno = 2001;
        hoje.inicializaDataSimples(umDia, umMes, umAno);
        hoje.mostrarDataSimples();

        umDia = 7; umMes = 9; umAno = 1822;
        independencia.inicializaDataSimples(umDia, umMes, umAno);
        independencia.mostrarDataSimples();

        if (hoje.comparaDataSimples(independencia)) {
            System.out.println("Datas iguais");
        }else{
            System.out.println("Datas diferentes");
        }

        hoje.dia = 0; hoje.mes = 1; hoje.ano = 2001;
        hoje.mostrarDataSimples();

        independencia.mes = 13;
        independencia.mostrarDataSimples();
    }
}
