package com.boschtest.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "Enterprise")
public class Enterprise {
    @Id
    @Column(name="EID")
    @GeneratedValue
    private long eid;

    @Column(name="NAME")
    private String name;

    @Column(name="URL")
    private String url;

    @Column(name="AUTHENTICATION")
    private String authentication;

    @Column(name="HEALTHY")
    private boolean healthy;

    public long getEid() {
        return eid;
    }

    public void setEid(long eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAuthentication() {
        return authentication;
    }

    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    public boolean getHealth() {
        return healthy;
    }

    public void setHealth(boolean healthy) {
        this.healthy = healthy;
    }

}
