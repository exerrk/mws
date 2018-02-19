package io.github.exerrk.mws.service.core.entity;

import javax.persistence.*;

/**
 * @author Evan Sid (a.k.a exerrk)
 * created in 08.2017
 */
@Entity
@Table(name = "HASHRATE_UNIT")
public class HashRateUnitEntity {
    @Id
    @SequenceGenerator(name = "hashrate_unit_id_seq", sequenceName = "hashrate_unit_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hashrate_unit_id_seq")
    private Long id;
    @Column(name = "hash_unit")
    private String hashUnit;
    @Column(name = "time_unit")
    private String timeUnit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHashUnit() {
        return hashUnit;
    }

    public void setHashUnit(String hashUnit) {
        this.hashUnit = hashUnit;
    }

    public String getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    @Override
    public String toString() {
        return "HashRateUnitEntity{" +
                "id=" + id +
                ", hashUnit='" + hashUnit + '\'' +
                ", timeUnit='" + timeUnit + '\'' +
                '}';
    }
}
