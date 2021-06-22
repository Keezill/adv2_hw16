package ua.mamedov;

public class Packer {
    public static void main(String[] args) {
        Packer packer = new Packer();
        Box<Food> foodBox = new Box<>();
        Box<Cake> cakeBox = new Box<>();
        cakeBox.put(new Cake());
        packer.repackage(foodBox, cakeBox);
    }

    public <T extends Goods> void repackage(Box<? super T> to, Box<? extends T> from) {
        to.put(from.get());
    }
}

