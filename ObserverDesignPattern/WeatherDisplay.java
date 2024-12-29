package ObserverDesignPattern;

public class WeatherDisplay implements Observer{

    private String data;

    @Override
    public void update(String data){
        this.data = data;
        display();
    }

    public void display(){
        System.out.println("Weather Display: " + data);
    }
    
}
