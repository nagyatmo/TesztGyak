package test.java.tdd.homework;

import main.java.tdd.homework.App;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppTest 
{
    App app = new App();
    List<String> params = new ArrayList<>();

    @Test
    public void stringOnReturnEmptyTest() {
        assertEquals("Hello, my friend",app.stringOnReturn(params));
    }

    @Test
    public void stringOnReturnOneParamTest() {
        params.add("Bob");
        assertEquals("Hello, Bob",app.stringOnReturn(params));
    }

    @Test
    public void stringOnReturnMultipleParamTest() {
        params.add("Bob");
        params.add("Alice");
        params.add("Jerry");
        assertEquals("Hello, Bob, Alice, and Jerry.",app.stringOnReturn(params));
    }

    @Test
    public void stringOnReturnSingleUppercaseTest() {
        params.add("BARRY");
        assertEquals("HELLO, BARRY",app.stringOnReturn(params));
    }

    @Test
    public void stringOnReturnMixedUppercaseTest() {
        params.add("JAY");
        params.add("Maya");
        params.add("Alice");
        params.add("BOB");
        params.add("Charlotte");
        assertEquals("Hello, Maya, Alice, and Charlotte. AND HELLO JAY, AND BOB!",app.stringOnReturn(params));
    }

    @Test
    public void stringOnReturnCommaSplitTest() {
        params.add("Jerry");
        params.add("Alice, Bob");
        assertEquals("Hello, Jerry, Alice, and Bob.",app.stringOnReturn(params));
    }
}
