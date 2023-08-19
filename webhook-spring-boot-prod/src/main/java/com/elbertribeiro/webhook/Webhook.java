package com.elbertribeiro.webhook;

import javax.persistence.*;

@Entity
@Table(name = "TAB_WEBHOOK", schema = "WEBHOOK")
public class Webhook {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "TW_ID")
    private Integer id;
    @Column(name = "TW_URL")
    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
