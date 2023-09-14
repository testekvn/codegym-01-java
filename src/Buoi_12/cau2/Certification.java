package Buoi_12.cau2;

public class Certification {
    //region Fields of Certification
    String id;
    String name;
    int rank;
    //endregion


    public Certification(String id, String name, int rank) {
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

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
