package org.example.task3;

public class Point implements Movable, Displayable {
    private int x;
    private int y;

    public void setX (int x) {
        this.x = x;
    }
    public void setY (int y) {
        this.y = y;
    }

    public int getX () {
        return this.x;
    }

    public int getY () {
        return this.y;
    }

    @Override
    public void moveUp () {
        int yUp = y+1;
        System.out.println("Координаты при перемещении вверх: "+ x + "; "+ yUp);
    }
    @Override
    public void moveDown () {
        int yDown = y-1;
        System.out.println("Координаты при перемещении вниз: "+ x + "; " + yDown);
    }
    @Override
    public void moveLeft () {
        int xLeft = x-1;
        System.out.println("Координаты при перемещении влево: "+ xLeft + "; "+y);
    }
    @Override
    public void moveRight () {
        int xRight = x+1;
        System.out.println("Координаты при перемещении вправо: "+ xRight+ "; " +y);
    }

    @Override
    public void display() {
        System.out.println("Изначальные координаты: " + this.x + "; " + this.y);
    }
}


