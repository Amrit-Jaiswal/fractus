package com.db.fractus.entity;


import org.springframework.data.annotation.Id;

@Entity
@Table(name="country")
public class Country {

    @Id
    @Column(name="cid")
    private int cId;

    @Column(name="cname")
    private String cName;

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }
}
