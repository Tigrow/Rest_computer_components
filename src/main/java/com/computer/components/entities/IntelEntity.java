package com.computer.components.entities;


import javax.persistence.*;

@Entity
@Table(name="Intel")
public class IntelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="code_name")
    private String codename;
    @Column(name="processor_number")
    private String ProcessorNumber;
    @Column(name="status")
    private String Status;
    @Column(name="launch_date")
    private String LaunchDate;
    @Column(name="lithography")
    private String Lithography;
    @Column(name="recommended_customer_price")
    private String Price;
    @Column(name="cores")
    private int Cores;
    @Column(name="threads")
    private int Threads;
    @Column(name="processor_base_frequency")
    private String ProcessorBaseFrequency;
    @Column(name="max_turbo_frequency")
    private String MaxTurboFrequency;


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

    public String getProcessorNumber() {
        return ProcessorNumber;
    }
    public void setProcessorNumber(String name) {
        this.ProcessorNumber = name;
    }

    public String getStatus() {
        return Status;
    }
    public void setStatus(String name) {
        this.Status = name;
    }

    public String getLaunchDate() {
        return LaunchDate;
    }
    public void setLaunchDate(String name) {
        this.LaunchDate = name;
    }

    public String getLithography() {
        return Lithography;
    }
    public void setLithography(String name) {
        this.Lithography = name;
    }

    public String getPrice() {
        return Price;
    }
    public void setPrice(String name) {
        this.Price = name;
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

    public String getProcessorBaseFrequency() {
        return ProcessorBaseFrequency;
    }
    public void setProcessorBaseFrequency(String name) {
        this.ProcessorBaseFrequency = name;
    }

    public String getMaxTurboFrequency() {return MaxTurboFrequency;}
    public void setMaxTurboFrequency(String name){this.MaxTurboFrequency = name;}

    protected IntelEntity(){}
    public IntelEntity(String name/*,String codename*/) {
        this.name = name;
        //this.codename = codename;
    }

}
