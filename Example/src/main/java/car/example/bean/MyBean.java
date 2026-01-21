package car.example.bean;

import javax.swing.*;

public class MyBean {
    private String message;

    public void setMessage(String message) {
        this.message = message.toString();
    }

    public void showMessage()
    {
        System.out.println("Message"+message);
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
