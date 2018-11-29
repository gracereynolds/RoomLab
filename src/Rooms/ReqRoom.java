package Rooms;

import People.Person;

public class ReqRoom extends Room {
    public ReqRoom(int x, int y)
    {
        super(x,y);
    }
    @Override
    public void enterRoom(Person x)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You found the Room of Requirement! Ten bonus points for " + occupant.House + "!");
    }
}
