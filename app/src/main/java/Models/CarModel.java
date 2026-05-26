package Models;

public class CarModel {
    private int images1;
    private String text;

    public CarModel(int images1, String text) {
        this.images1 = images1;
        this.text = text;
    }

    public int getImages1() {
        return images1;
    }

    public void setImages1(int images1) {
        this.images1 = images1;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
