package com.daltonsumrall.game.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import java.util.Stack;

/**
 * Created by dalton on 10/2/16.
 */

public class GameStateManager {
    private Stack<State> states;

    public GameStateManager(){
        states = new Stack<State>();
    }


    public void push(State state){
        states.push(state);
    }


    public void pop(State state){
        states.pop().dispose();
    }


    public void set(State state){
        states.pop().dispose();
        states.push(state);
    }


    public void update(float deltaTime){
        states.peek().update(deltaTime);
    }


    public void render(SpriteBatch spriteBatch){
        states.peek().render(spriteBatch);
    }

}
