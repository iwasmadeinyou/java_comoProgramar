// Account.java
// Classe Account que contém uma variável de instância name
// e métodos para configurar e obter seu valor.

public class Account {
    private String name; // Variável de instância
    private double balance; // Variável de instância

    public Account(String name, double balance) 
    {
        this.name = name;  // Atribui name à variável de instância name

        if (balance > 0.0) // Se o saldo for válido
            this.balance = balance; // O atribui à variável de instância balace
    } 

    // Método que deposita apenas uma quantida válida no saldo
    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
    }

    // Método que retorna o saldo da conta
    public double getBalance()
    {
        return balance;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

}  // Fim da classe

// Essa classe Account que contém uma variável de instância e métodos para conifgurar e obter seu valor
