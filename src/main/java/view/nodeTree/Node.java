package view.nodeTree;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import taskModel.Task;

public class Node {

    private Circle _circle;
    private Text _text;
    private StackPane _stack;

    public Node(Task task, NodeColor color){
        _circle = new Circle(0, 0, 30);
        _text = new Text(task.getName() + "\n\n" + task.getWeight());

        _stack = new StackPane();
        _stack.getChildren().addAll(_circle, _text);
        setColor(color);
    }

    // TODO: Change switch statement to enum, and add more colours
    private void setColor(NodeColor color){
        switch(color){
            case BLACK:
                _circle.setFill(Color.BLACK);
                _text.setFill(Color.WHITE);
                break;
            case RED:
                _circle.setFill(Color.RED);
                _text.setFill(Color.WHITE);
                break;
            case ORANGE:
                _circle.setFill(Color.ORANGE);
                _text.setFill(Color.BLACK);
                break;
            case YELLOW:
                _circle.setFill(Color.YELLOW);
                _text.setFill(Color.BLACK);
                break;
            case GREEN:
                _circle.setFill(Color.GREEN);
                _text.setFill(Color.WHITE);
                break;
            case BLUE:
                _circle.setFill(Color.BLUE);
                _text.setFill(Color.WHITE);
                break;
            case INDIGO:
                _circle.setFill(Color.INDIGO);
                _text.setFill(Color.BLACK);
                break;
            case VIOLET:
                _circle.setFill(Color.VIOLET);
                _text.setFill(Color.BLACK);
                break;
            case CYAN:
                _circle.setFill(Color.CYAN);
                _text.setFill(Color.WHITE);
                break;
            case MAGENTA:
                _circle.setFill(Color.MAGENTA);
                _text.setFill(Color.BLACK);
                break;
            default:
            case WHITE:
                _circle.setFill(Color.WHITE);
                _text.setFill(Color.BLACK);
                break;
        }
    }

    public StackPane getStackPane(){
        return _stack;
    }
}
