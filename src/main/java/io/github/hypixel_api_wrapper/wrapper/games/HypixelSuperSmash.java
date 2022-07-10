package io.github.hypixel_api_wrapper.wrapper.games;

public class HypixelSuperSmash implements HypixelGame {
    @Override
    public String getGameID() {
        return "SUPER_SMASH";
    }

    @Override
    public String getGameName() {
        return "Smash Heros";
    }

    @Override
    public boolean isNetworkPresent() {
        return true;
    }
}
