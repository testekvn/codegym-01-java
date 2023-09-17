package Test.QuanLyNhanVien;

public class Certification {
    String id;
    String name;
    float rank;

    public Certification(String id, String name, float rank) {
        this.id = id;
        this.name = name;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Certification{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }

    public Certification(){}
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

    public float getRank() {
        return rank;
    }

    public void setRank(float rank) {
        this.rank = rank;
    }
}
