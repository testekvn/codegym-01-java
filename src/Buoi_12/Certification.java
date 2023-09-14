package Buoi_12;

public class Certification {
    public int Id;
    public String Name;
    public int Rank;

    public Certification(int id, String name, int rank) {
        Id = id;
        Name = name;
        Rank = rank;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRank() {
        return Rank;
    }

    public void setRank(int rank) {
        Rank = rank;
    }
}
