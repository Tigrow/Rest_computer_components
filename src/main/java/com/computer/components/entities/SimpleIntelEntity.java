package com.computer.components.entities;


import javax.persistence.*;

@Entity
@Table(name="Intel")
public class SimpleIntelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="code_name")
    private String codename;
    @Column(name="cores")
    private int Cores;
    @Column(name="threads")
    private int Threads;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCodename() {
        return codename;
    }
    public void setCodename(String name) {
        this.codename = name;
    }

    public int getCores() {
        return Cores;
    }
    public void setCores(int Cores) {
        this.Cores = Cores;
    }

    public int getThreads() {
        return Threads;
    }
    public void setThreads(int Threads) {
        this.Threads = Threads;
    }
}
