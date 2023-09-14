package Buoi_12.KiemTra;

public class Certification {
    private String id;
    private String name;
    private String rank;
    public Certification(){

    }

    public Certification(String id, String name, String rank) {
        this.id = id;
        this.name = name;
        this.rank = rank;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}

