package com.learn.task2.ex_3;

public abstract class Game {
    String gameStory;
    public String playGame() {
        this.gameStory = initialize();
        this.gameStory += "Welcome to the main screen ";
        this.gameStory += startPlay();
        this.gameStory += "the player enjoys the game ";
        this.gameStory += endPlay();
        return gameStory;

    }

    public abstract String initialize();

    public abstract String startPlay();

    public abstract String endPlay();

}
