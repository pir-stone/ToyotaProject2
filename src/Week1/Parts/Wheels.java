package Week1.Parts;

import Week1.Parts.Enums.Diametr;

public class Wheels {
    public int countwheels;
    Diametr diametr;
    public Wheels() {
        this.diametr = diametr;
    }

    private boolean makeHole;

    public Wheels(boolean makeHole) {
        this.makeHole = makeHole;
    }
    public void run() throws WheelsHoles {
        if (makeHole){
            throw new WheelsHoles();
        }
        System.out.println("колеса дырявые");
    }

}
