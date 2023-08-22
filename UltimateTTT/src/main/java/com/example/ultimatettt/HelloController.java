package com.example.ultimatettt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    //  part 0
    @FXML
    private Button button00;
    @FXML
    private Button button01;
    @FXML
    private Button button02;
    @FXML
    private Button button03;
    @FXML
    private Button button04;
    @FXML
    private Button button05;
    @FXML
    private Button button06;
    @FXML
    private Button button07;
    @FXML
    private Button button08;

    //  part 1
    @FXML
    private Button button10;
    @FXML
    private Button button11;
    @FXML
    private Button button12;
    @FXML
    private Button button13;
    @FXML
    private Button button14;
    @FXML
    private Button button15;
    @FXML
    private Button button16;
    @FXML
    private Button button17;
    @FXML
    private Button button18;
    //  part 2
    @FXML
    private Button button20;
    @FXML
    private Button button21;
    @FXML
    private Button button22;
    @FXML
    private Button button23;
    @FXML
    private Button button24;
    @FXML
    private Button button25;
    @FXML
    private Button button26;
    @FXML
    private Button button27;
    @FXML
    private Button button28;
    //  part 3
    @FXML
    private Button button30;
    @FXML
    private Button button31;
    @FXML
    private Button button32;
    @FXML
    private Button button33;
    @FXML
    private Button button34;
    @FXML
    private Button button35;
    @FXML
    private Button button36;
    @FXML
    private Button button37;
    @FXML
    private Button button38;
    //  part 4
    @FXML
    private Button button40;
    @FXML
    private Button button41;
    @FXML
    private Button button42;
    @FXML
    private Button button43;
    @FXML
    private Button button44;
    @FXML
    private Button button45;
    @FXML
    private Button button46;
    @FXML
    private Button button47;
    @FXML
    private Button button48;
    //  part 5
    @FXML
    private Button button50;
    @FXML
    private Button button51;
    @FXML
    private Button button52;
    @FXML
    private Button button53;
    @FXML
    private Button button54;
    @FXML
    private Button button55;
    @FXML
    private Button button56;
    @FXML
    private Button button57;
    @FXML
    private Button button58;
    //  part 6
    @FXML
    private Button button60;
    @FXML
    private Button button61;
    @FXML
    private Button button62;
    @FXML
    private Button button63;
    @FXML
    private Button button64;
    @FXML
    private Button button65;
    @FXML
    private Button button66;
    @FXML
    private Button button67;
    @FXML
    private Button button68;
    //  part 7
    @FXML
    private Button button70;
    @FXML
    private Button button71;
    @FXML
    private Button button72;
    @FXML
    private Button button73;
    @FXML
    private Button button74;
    @FXML
    private Button button75;
    @FXML
    private Button button76;
    @FXML
    private Button button77;
    @FXML
    private Button button78;
    //  part 8
    @FXML
    private Button button80;
    @FXML
    private Button button81;
    @FXML
    private Button button82;
    @FXML
    private Button button83;
    @FXML
    private Button button84;
    @FXML
    private Button button85;
    @FXML
    private Button button86;
    @FXML
    private Button button87;
    @FXML
    private Button button88;
    // REST
    boolean currentPlayer=true;

    @FXML
    private Text gameStatus;
    @FXML
    private Button restartButton;
    ArrayList<Button> buttons0;
    ArrayList<Button> buttons1;
    ArrayList<Button> buttons2;
    ArrayList<Button> buttons3;
    ArrayList<Button> buttons4;
    ArrayList<Button> buttons5;
    ArrayList<Button> buttons6;
    ArrayList<Button> buttons7;
    ArrayList<Button> buttons8;
    ArrayList<ArrayList<Button>> wholeBoard;
    int previousMove;
    int[] wonSmallBoards;
    boolean gameIsDone=false;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        buttons0 = new ArrayList<>(Arrays.asList(button00,button01,button02,button03,button04,button05,button06,button07,button08));
        buttons1 = new ArrayList<>(Arrays.asList(button10,button11,button12,button13,button14,button15,button16,button17,button18));
        buttons2 = new ArrayList<>(Arrays.asList(button20,button21,button22,button23,button24,button25,button26,button27,button28));
        buttons3 = new ArrayList<>(Arrays.asList(button30,button31,button32,button33,button34,button35,button36,button37,button38));
        buttons4 = new ArrayList<>(Arrays.asList(button40,button41,button42,button43,button44,button45,button46,button47,button48));
        buttons5 = new ArrayList<>(Arrays.asList(button50,button51,button52,button53,button54,button55,button56,button57,button58));
        buttons6 = new ArrayList<>(Arrays.asList(button60,button61,button62,button63,button64,button65,button66,button67,button68));
        buttons7 = new ArrayList<>(Arrays.asList(button70,button71,button72,button73,button74,button75,button76,button77,button78));
        buttons8 = new ArrayList<>(Arrays.asList(button80,button81,button82,button83,button84,button85,button86,button87,button88));
        wholeBoard = new ArrayList<>(Arrays.asList(buttons0,buttons1,buttons2,buttons3,buttons4,buttons5,buttons6,buttons7,buttons8));
        gameStatus.setText("Game status:\nX's turn");
        for(ArrayList<Button> smallBoard : wholeBoard){
            for(Button button : smallBoard){
                clickButton(button);
                button.setFocusTraversable(false);
            }
        }
        wonSmallBoards= new int[9];
        for(int i=0;i<9;i++){
            wonSmallBoards[i]=0;
        }

    }
    @FXML
    public void resetGame(ActionEvent event){
        for(ArrayList<Button> smallBoard : wholeBoard){
            for(Button button : smallBoard){
                button.setText("");
                button.setDisable(false);
            }
        }
        wonSmallBoards= new int[9];
        for(int i=0;i<9;i++){
            wonSmallBoards[i]=0;
        }
        gameStatus.setText("Game status:\nX's turn");
        previousMove=0;
        currentPlayer=true;
        gameIsDone=false;
    }
    void clickButton(Button button) {
        button.setOnMouseClicked(mouseEvent -> {
            if(button.getText()==""){
                if(wonSmallBoards[previousMove]!=0){
                    previousMove=button.getId().charAt(6)-48;
                }
                setPlayerSymbol(button);
                button.setDisable(true);

                checkIfBoardWon();
                checkIfBoardOver();
                checkIfGameOver();
                checkIfGameWon();
                previousMove=button.getId().charAt(7)-48;
                System.out.println(previousMove);
                nextBoard();
                if(currentPlayer==true&&gameIsDone==false){
                    currentPlayer=false;
                    gameStatus.setText("Game status:\nO's turn");
                }
                else if(currentPlayer==false&&gameIsDone==false){
                    gameStatus.setText("Game status:\nX's turn");
                    currentPlayer=true;
                }
                if(gameIsDone==true){
                    gameEnded();
                }
                for(int i=0;i<9;i++){
                    System.out.print(wonSmallBoards[i]);
                    if((i+1)%3==0){
                        System.out.println();
                    }
                }
                System.out.println();
            }
        });
    }

    public void setPlayerSymbol(Button button){
        if(currentPlayer==true){
            button.setText("X");
        }
        else{
            button.setText("O");
        }
    }
    public void nextBoard(){
        if(wonSmallBoards[previousMove]==0){
            for(ArrayList<Button> smallBoard : wholeBoard){
                for(Button button : smallBoard){
                    button.setDisable(true);
                }
            }
            for(Button button : wholeBoard.get(previousMove)){
                if(button.getText()==""){
                    button.setDisable(false);
                }
                else{
                    button.setDisable(true);
                }
            }
        }
        else{
            for(int i =0;i<9;i++){

                    for(Button button : wholeBoard.get(i)){
                        if(button.getText()==""){
                            button.setDisable(false);
                        }
                        else{
                            button.setDisable(true);
                        }
                    }
                    if(wonSmallBoards[i]!=0){
                        for(Button button : wholeBoard.get(i)){
                            button.setDisable(true);
                        }
                    }

            }
        }
    }
    public void checkIfBoardOver(){
        boolean stillGoing=false;

        for(Button button : wholeBoard.get(previousMove)){
            if(button.getText().equals("") ){
                stillGoing=true;
            }
        }
        if(stillGoing==false){
            wonSmallBoards[previousMove]=3;
        }
    }
    public void checkIfGameOver(){
        boolean stillGoing=false;
        int crossesWon=0;
        int circlesWon=0;

        for(int i=0;i<9;i++){
            if(wonSmallBoards[i]==0){
                stillGoing=true;
            }
        }
        if(stillGoing==false){
            for(int i=0;i<9;i++){
                if(wonSmallBoards[i]==1){
                    crossesWon++;
                }
                else if(wonSmallBoards[i]==2){
                    circlesWon++;
                }
            }
            if(crossesWon>circlesWon){
                gameStatus.setText("Game Status: \nX won!");
            }
            else if(crossesWon<circlesWon){
                gameStatus.setText("Game Status: \nO won!");
            }
            else{
                gameStatus.setText("Game Status: \nTie!");
            }
            gameIsDone=true;

        }
    }
    public void checkIfBoardWon() {
        String symbol;
        int symbolInt;
        if(currentPlayer==true){
            symbol="X";
            symbolInt=1;
        }
        else{
            symbol="O";
            symbolInt=2;
        }
        ArrayList<Button> toCheck= wholeBoard.get(previousMove);
        // x x x
        //
        //
        if(toCheck.get(0).getText().equals(symbol) &&toCheck.get(1).getText().equals(symbol)&&toCheck.get(2).getText().equals(symbol)){
            wonSmallBoards[previousMove]=symbolInt;
        }
        //
        // x x x
        //
        if(toCheck.get(3).getText().equals(symbol)&&toCheck.get(4).getText().equals(symbol)&&toCheck.get(5).getText().equals(symbol)){
            wonSmallBoards[previousMove]=symbolInt;
        }
        //
        //
        // x x x
        if(toCheck.get(6).getText().equals(symbol)&&toCheck.get(7).getText().equals(symbol)&&toCheck.get(8).getText().equals(symbol)){
            wonSmallBoards[previousMove]=symbolInt;
        }
        // x
        // x
        // x
        if(toCheck.get(0).getText().equals(symbol)&&toCheck.get(3).getText().equals(symbol)&&toCheck.get(6).getText().equals(symbol)){
            wonSmallBoards[previousMove]=symbolInt;
        }
        //   x
        //   x
        //   x
        if(toCheck.get(1).getText().equals(symbol)&&toCheck.get(4).getText().equals(symbol)&&toCheck.get(7).getText().equals(symbol)){
            wonSmallBoards[previousMove]=symbolInt;
        }
        //     x
        //     x
        //     x
        if(toCheck.get(2).getText().equals(symbol)&&toCheck.get(5).getText().equals(symbol)&&toCheck.get(8).getText().equals(symbol)){
            wonSmallBoards[previousMove]=symbolInt;
        }
        //     x
        //   x
        // x
        if(toCheck.get(2).getText().equals(symbol)&&toCheck.get(4).getText().equals(symbol)&&toCheck.get(6).getText().equals(symbol)){
            wonSmallBoards[previousMove]=symbolInt;
        }
        // x
        //   x
        //     x
        if(toCheck.get(0).getText().equals(symbol)&&toCheck.get(4).getText().equals(symbol)&&toCheck.get(8).getText().equals(symbol)){
            wonSmallBoards[previousMove]=symbolInt;
        }


    }
    public void gameEnded(){
        for(ArrayList<Button> smallBoard : wholeBoard){
            for(Button button : smallBoard){
                button.setDisable(true);
            }
        }
    }
    public void checkIfGameWon(){
        if(wonSmallBoards[0]==1&&wonSmallBoards[1]==1&&wonSmallBoards[2]==1){
            gameStatus.setText("Game Status: \nX won!");
            gameIsDone=true;
        }
        else if(wonSmallBoards[3]==1&&wonSmallBoards[4]==1&&wonSmallBoards[5]==1){
            gameStatus.setText("Game Status: \nX won!");
            gameIsDone=true;
        }
        else if(wonSmallBoards[6]==1&&wonSmallBoards[7]==1&&wonSmallBoards[8]==1){
            gameStatus.setText("Game Status: \nX won!");
            gameIsDone=true;
        }
        else if(wonSmallBoards[0]==1&&wonSmallBoards[3]==1&&wonSmallBoards[6]==1){
            gameStatus.setText("Game Status: \nX won!");
            gameIsDone=true;
        }
        else if(wonSmallBoards[1]==1&&wonSmallBoards[4]==1&&wonSmallBoards[7]==1){
            gameStatus.setText("Game Status: \nX won!");
            gameIsDone=true;
        }
        else if(wonSmallBoards[2]==1&&wonSmallBoards[5]==1&&wonSmallBoards[8]==1){
            gameStatus.setText("Game Status: \nX won!");
            gameIsDone=true;
        }
        else if(wonSmallBoards[0]==1&&wonSmallBoards[4]==1&&wonSmallBoards[8]==1){
            gameStatus.setText("Game Status: \nX won!");
            gameIsDone=true;
        }
        else if(wonSmallBoards[2]==1&&wonSmallBoards[4]==1&&wonSmallBoards[6]==1){
            gameStatus.setText("Game Status: \nX won!");
            gameIsDone=true;
        }

        if(wonSmallBoards[0]==2&&wonSmallBoards[1]==2&&wonSmallBoards[2]==2){
            gameStatus.setText("Game Status: \nO won!");
            gameIsDone=true;
        }
        else if(wonSmallBoards[3]==2&&wonSmallBoards[4]==2&&wonSmallBoards[5]==2){
            gameStatus.setText("Game Status: \nO won!");
            gameIsDone=true;
        }
        else if(wonSmallBoards[6]==2&&wonSmallBoards[7]==2&&wonSmallBoards[8]==2){
            gameStatus.setText("Game Status: \nO won!");
            gameIsDone=true;
        }
        else if(wonSmallBoards[0]==2&&wonSmallBoards[3]==2&&wonSmallBoards[6]==2){
            gameStatus.setText("Game Status: \nO won!");
            gameIsDone=true;
        }
        else if(wonSmallBoards[1]==2&&wonSmallBoards[4]==2&&wonSmallBoards[7]==2){
            gameStatus.setText("Game Status: \nO won!");
            gameIsDone=true;
        }
        else if(wonSmallBoards[2]==2&&wonSmallBoards[5]==2&&wonSmallBoards[8]==2){
            gameStatus.setText("Game Status: \nO won!");
            gameIsDone=true;
        }
        else if(wonSmallBoards[0]==2&&wonSmallBoards[4]==2&&wonSmallBoards[8]==2){
            gameStatus.setText("Game Status: \nO won!");
            gameIsDone=true;
        }
        else if(wonSmallBoards[2]==2&&wonSmallBoards[4]==2&&wonSmallBoards[6]==2){
            gameStatus.setText("Game Status: \nO won!");
            gameIsDone=true;
        }

    }
}