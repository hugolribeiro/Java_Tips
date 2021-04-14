public class Anime {
    private String name;
    private String score;

    public Anime(){

    }

    public Anime(String name, String score){
        this.setName(name);
        this.setScore(score);
    }

    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                ", score='" + score + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
