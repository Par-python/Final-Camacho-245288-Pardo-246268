public class Player {
    
    private int x;
    private int y;
    private int speed;
    private String engineType;
    private int dTime;
    private boolean TireType;
    private int gear;

    public Player(int x, int y, String engineType, int dTime, boolean TireType){
        this.x = x;
        this.y = y;
        this.speed = 0;
        this.engineType = engineType;
        this.dTime = dTime;
        this.TireType = TireType;
        this.gear = 1; // it is always on gear one lil bro no neutral here
    }

    public void addSpeed(){
        //initializes the engines
        if (this.engineType == "V6 Engine" && this.speed <= 250){

            int counter = 1;
            if (counter == 10){
                counter = 1;
            } else {  
                this.speed+=1 * counter;
            }
        }

        if (this.engineType == "V8 Engine" && this.speed <= 270){

            int counter = 2;
            if (counter == 20){
                counter = 2;
            } else {
                this.speed+=1 * counter;
            }
        }
        
        if (this.engineType == "V10 Engine" && this.speed <=290){
            int counter = 3;
            if (counter == 30){
                counter = 3;
            } else {
                this.speed+=1 * counter;
            }
        }
    }

    public void addBreakPressure(){

        if(this.speed != 0){
            int counter = 1;
            if (counter == 10){
                counter = 1;
            } else {
                this.speed-=1 * counter;
            }
        }

    }

    // gearbox is sequential 
    public void shiftUp(){
        if (this.speed >= 30 && this.gear == 1){
            this.gear = 2;
        } else if (this.speed >= 80 && this.gear == 2){
            this.gear = 3;
        } else if (this.speed >= 120 && this.gear == 3){
            this.gear = 4; 
        } else if (this.speed >= 180 && this.gear == 4){
            this.gear = 5;
        }  else if (this.speed >= 210 && this.gear == 5){
           this.gear = 6;
        }
    }

    public void shiftDown(){
        if (this.speed <= 210 && this.gear == 6){
            this.gear = 5;
        } else if (this.speed <= 180 && this.gear == 5){
            this.gear = 4;
        } else if (this.speed <= 120 && this.gear == 4){
            this.gear = 3; 
        } else if (this.speed <= 80 && this.gear == 3){
            this.gear = 2;
        }  else if (this.speed <= 30 && this.gear == 2){
           this.gear = 1;
        }
    }

    public int getGear(){
        return this.gear;
    }
    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getSpeed(){
        return this.speed;
    }

    public int getDeltaTime(){
        return this.dTime;
    }

    public boolean getTireType(){
        return this.TireType;
    }
}
