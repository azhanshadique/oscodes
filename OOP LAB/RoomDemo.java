class Room {
    double length, breadth, height;
    Room(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }
    void Calc_area(String str) {
        double area = 2*(length*breadth + breadth*height + length*height);
        System.out.println("AREA OF "+str+" = "+area);
    }
}
class Bedroom extends Room {
    String features[] = new String[3];
    Bedroom(double l, double b, double h) {
        super(l,b,h);
        features[0] = "Attached Bathroom";
        features[1] = "Study Table";
        features[2] = "Night Lamp";
    }
    void display() {
        System.out.println("FEATURES OF BEDROOM: ");
        for(int i=0; i<features.length; i++)
            System.out.print(features[i]+", ");
        System.out.println();
        Calc_area("BEDROOM");
    }
}
class Drawingroom extends Room {
    String features[] = new String[2];
    Drawingroom(double l, double b, double h) {
        super(l,b,h);
        features[0] = "Sofa";
        features[1] = "Cabinet";
    }
    void display() {
        System.out.println("FEATURES OF DRAWING ROOM: ");
        for(int i=0; i<features.length; i++)
            System.out.print(features[i]+", ");
        System.out.println();
        Calc_area("DRAWING ROOM");
    }
}
class RoomDemo {
    public static void main (String args[]) {
        Bedroom obj1 = new Bedroom(10.3,20.7,15.5);
        System.out.println();
        obj1.display();
        System.out.println();
        Drawingroom obj2 = new Drawingroom(2.5, 7.3, 8.4);
        obj2.display();
    }
}