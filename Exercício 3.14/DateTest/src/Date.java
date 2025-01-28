// Cria uma classe chamada Date que inclui três variáveis de instância
// Dia, Mês e Ano

public class Date {
    private int mes;
    private int dia;
    private int ano;

    public Date(int mes, int dia, int ano){
        this.mes = mes;

        if (mes <= 12)
            this.mes = mes; // Atribui a variável do mês a instância do mês.

        if (dia <= 31)
            this.dia = dia; // Atribui a variável do dia a instância do dia.
    }

    public void  AdicionarDia(int adicionar_dia)
    {
        if (adicionar_dia > 0)
            dia = dia + adicionar_dia;
    }

    public void  AdicionarMes(int adicionar_mes)
    {
        if (adicionar_mes > 0)
            mes = mes + adicionar_mes;
    }

    public void  AdicionarAno(int adicionar_ano)
    {
        if (adicionar_ano > 0)
            ano = ano + adicionar_ano;
    }


    public int setMes() 
    {
        return mes;
    }

    public int getMes()
    {
        return mes;
    }

    public int setDia()
    {
        return dia;
    }

    public int getDia()
    {
        return dia;
    }

    public int setAno()
    {
        return ano;
    }

    public int getAno()
    {
        return ano;
    }
}
