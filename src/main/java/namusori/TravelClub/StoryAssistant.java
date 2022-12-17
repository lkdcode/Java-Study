package namusori.TravelClub;

import namusori.TravelClub.entity.TravelClub;
import namusori.TravelClub.ui.menu.ClubMenu;

public class StoryAssistant {

    private void startStory() {
        ClubMenu clubMenu = new ClubMenu();
        clubMenu.show();
    }

    public static void main(String[] args) {
        StoryAssistant assistant = new StoryAssistant();
        assistant.startStory();

    }
}

