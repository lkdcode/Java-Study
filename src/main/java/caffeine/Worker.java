package caffeine;

public class Worker {
    private String name;
    private String rank;
    private int caffeine;

    public Worker(String name, String rank, int caffeine) {
        this.name = name;
        this.rank = rank;
        this.caffeine = caffeine;
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

    public int getCaffeine() {
        return caffeine;
    }

    public void setCaffeine(int caffeine) {
        this.caffeine = caffeine;
    }

    @Override
    public String toString() {
        StringBuilder list = new StringBuilder();
        return list.append("임직원 이름 : ").append(name)
          .append("     임직원 직급 : ").append(rank)
          .append("     카페임 함유량은 : ").append(caffeine).append(" mg 입니다.").append("\n")
          .toString();
    }

}
