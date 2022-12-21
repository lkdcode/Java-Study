package study;

public class TravelClub {
    private static final int MINIMUM_NAME_LENGTH = 3;
    private static final int MINIMUM_INTRO_LENGTH = 5;
    private String id;
    private String clubName;
    private String intro;
    private String foundationDay;

    private TravelClub() {

    }

    public TravelClub(String id, String clubName) {

    }

    public static TravelClub getSample() {
        return null;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubName() {
        return clubName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getFoundationDay() {
        return foundationDay;
    }

    public void setFoundationDay(String foundationDay) {
        this.foundationDay = foundationDay;
    }

}
