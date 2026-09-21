package model;

public class Event {

    private int idEvent;
    private String namaEvent;
    private String lokasi;

    public Event(int idEvent, String namaEvent, String lokasi) {
        this.idEvent = idEvent;
        this.namaEvent = namaEvent;
        this.lokasi = lokasi;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public String getNamaEvent() {
        return namaEvent;
    }

    public void setNamaEvent(String namaEvent) {
        this.namaEvent = namaEvent;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
} 