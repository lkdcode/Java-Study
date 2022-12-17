package namusori.TravelClub.entity;

import namusori.TravelClub.entity.util.DateUtil;

import java.util.UUID;

public class TravelClub {
    private static final int MINIMUM_NAME_LENGTH = 3;
    private static final int MINIMUM_INTRO_LENGTH = 3;
    private String id;
    private String clubName;
    private String intro;
    private String foundationDay;

    // Constructors
    private TravelClub() {
        this.id = UUID.randomUUID().toString();
    }

    public TravelClub(String clubName, String intro) {
        this();
        setClubName(clubName);
        setIntro(intro);
        this.foundationDay = DateUtil.today();
    }

    public void setClubName(String clubName) {
        if (clubName.length() < MINIMUM_NAME_LENGTH) {
            System.out.println("Club name be longer then " + MINIMUM_NAME_LENGTH);
            return;
        }
        this.clubName = clubName;
    }

    public void setIntro(String intro) {
        if (intro.length() < MINIMUM_INTRO_LENGTH) {
            System.out.println("Club intro should be longer then " + MINIMUM_INTRO_LENGTH);
            return;
        }
        this.intro = intro;
    }

    public String getClubName() {
        return this.clubName;
    }

    public String getIntro() {
        return this.intro;
    }

    public String getId() {
        return this.id;
    }

    public String getFoundationDay() {
        return foundationDay;
    }

    public static TravelClub getSample() {
        return new TravelClub("Sample Club", "Sample Club Intro~");
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("TravelClub club ID : ").append(id);
        builder.append(", clubName : ").append(clubName);
        builder.append(", Intro : ").append(intro);
        builder.append(", FoundationDay : ").append(foundationDay);

        return builder.toString();
    }
}