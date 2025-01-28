import java.util.Scanner;

public class DateTest {

    public static void main(String[] args) {
        Date data = new Date(0, 0, 0);
        Scanner input = new Scanner(System.in);

        DisplayDate(data);

        System.out.printf("Digite o dia: ");
        int adicionar_dia = input.nextInt();
        data.AdicionarDia(adicionar_dia);

        DisplayDate(data);

        System.out.printf("Digite o mês: ");
        int adicionar_mes = input.nextInt();
        data.AdicionarMes(adicionar_mes);

        System.out.printf("Digite o ano: ");
        int adicionar_ano = input.nextInt();
        data.AdicionarAno(adicionar_ano);

        DisplayDate(data);

    }

    public static void DisplayDate(Date date)
    {
        System.out.printf("A data é %d/%d/%d %n", date.getDia(), date.getMes(), date.getAno());
    }

}
