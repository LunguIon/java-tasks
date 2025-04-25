package ex_3;

import com.learn.task2.ex_3.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class GameTests {
    private Game football;
    private Game chess;
    @Before
    public void setUp() {
        football = new Football();
        chess = new Chess();
    }

    @Test
    public void testFootballGame() {
        String result = football.playGame();
        assertEquals("the football game is running " +
                        "Welcome to the main screen " +
                        "the football game started " +
                        "the player enjoys the game " +
                        "the football game ended",result);
    }

    @Test
    public void testChessGame() {
        String result = chess.playGame();
        assertEquals("the chess game is running " +
                        "Welcome to the main screen "+
                        "the chess game started " +
                        "the player enjoys the game " +
                        "the chess game ended",result);
    }

    @Test
    public void testFootballGameInitiation() {
        String result = football.initialize();
        assertEquals("the football game is running ", result);
    }

    @Test
    public void testFootballGameStartPlay() {
        String result = football.startPlay();
        assertEquals("the football game started ", result);
    }

    @Test
    public void testFootballGameEndPlay() {
        String result = football.endPlay();
        assertEquals("the football game ended", result);
    }

    @Test
    public void testChessGameInitiation() {
        String result = chess.initialize();
        assertEquals("the chess game is running ", result);
    }

    @Test
    public void testChessGameStartPlay() {
        String result = chess.startPlay();
        assertEquals("the chess game started ", result);
    }

    @Test
    public void testChessGameEndPlay() {
        String result = chess.endPlay();
        assertEquals("the chess game ended", result);
    }

}
