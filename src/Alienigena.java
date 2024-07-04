import java.time.LocalDate;

public class Alienigena implements shouldBMonitored {
    private String id;
    private String nome;
    private String especie;
    private int periculosidade;
    private LocalDate dataHoraEntrada;
    private String plenetaOrigem;

    public Alienigena(String id, String nome, String especie, int periculosidade, String dataHoraEntrada, String plenetaOrigem) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.periculosidade = periculosidade;
        this.dataHoraEntrada = LocalDate.parse(dataHoraEntrada); // Parse da String para LocalDate
        this.plenetaOrigem = plenetaOrigem;
    }

    public boolean deveSerMonitorado() {
        return periculosidade >= 6;
    }

    public String getEspecie() {
        return especie;
    }

    public int getPericulosidade() {
        return periculosidade;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public String getPlenetaOrigem() {
        return plenetaOrigem;
    }

    @Override
    public void monitored() {
        System.out.println("-" + nome + " deve ser monitorado.");
    }

}

