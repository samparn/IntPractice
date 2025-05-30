package practice.designpatterns.facade;

public class HomeTheaterFacade {
    private TV tv;
    private SoundSystem soundSystem;
    private Lights lights;

    public HomeTheaterFacade(TV tv, SoundSystem soundSystem, Lights lights) {
        this.tv = tv;
        this.soundSystem = soundSystem;
        this.lights = lights;
    }
    public void watchMovie(){
        System.out.println("Setting up movie");
        lights.dim();
        tv.on();
        tv.setInput("Apple TV");
        soundSystem.on();
        soundSystem.setVolume(30);
        System.out.println("Enjoy your movie");
    }
}
