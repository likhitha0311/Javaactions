public class Generics{
    public static void main(String[] args) {
        SoccerPlayer sc= new SoccerPlayer("Soccer");
    }
}

public class SoccerPlayer extends Player{
    public SoccerPlayer(String name) {
        super(name);
    }
}
