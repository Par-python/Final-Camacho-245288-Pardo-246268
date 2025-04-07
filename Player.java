public class Player {
    

    private int x;
    private int y;
    private int Speed;
    private int dTime;
    private int bSpeed;
    private boolean TireType;

    public Player(int x, int y, int Speed, int dTime, int bSpeed,boolean TireType){
        this.x = x;
        this.y = y;
        this.Speed = Speed;
        this.dTime = dTime;
        this.bSpeed = bSpeed;
        this.TireType = TireType;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getSpeed(){
        return this.Speed;
    }

    public int getDeltaTime(){
        return this.dTime;
    }

    public int getBSpeed(){
        return this.bSpeed;
    }

    public boolean getTireType(){
        return this.TireType;
    }
}
