package az.barama.endowed.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class CustomerEntity {

    @Id
    private Integer id;

    private String name;

    private String bank;

    public CustomerEntity() {
    }

    public CustomerEntity(Integer id, String name, String bank) {
        this.id = id;
        this.name = name;
        this.bank = bank;
    }

    public String getBank() { return bank; }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBank(String bank) {this.bank = bank;}
}