package Java.TABD_6.model;

import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Column;

import java.util.List;
import java.util.UUID;
@Table("divas")
public class DivaModel {

    @PrimaryKey
    private UUID id;

    @Column("Nome")
    private String nome;

    @Column("AnoNascimento")
    private int anoNascimento;

    @Column("Genero")
    private String genero;

    @Column("Hits")
    private List<String> hits;

    public DivaModel(UUID id, String nome, int anoNascimento, String genero, List<String> hits) {
        this.id = id;
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.genero = genero;
        this.hits = hits;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<String> getHits() {
        return hits;
    }

    public void setHits(List<String> hits) {
        this.hits = hits;
    }
}
