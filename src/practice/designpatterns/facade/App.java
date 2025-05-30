package practice.designpatterns.facade;

public class App {
    public static void main(String[] args){
        TV tv = new TV();
        SoundSystem soundSystem = new SoundSystem();
        Lights lights =  new Lights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, soundSystem, lights);
        homeTheater.watchMovie();
    }
}
/*
✔ WHEN to use:
   - When you have a complex subsystem and want to provide a simpler interface
   - When you want to decouple clients from subsystem implementations
   - When you want to reduce dependencies and simplify usage

✔ WHERE to use:
   - APIs: Providing a wrapper over complex libraries (e.g., HibernateUtil, EmailUtil)
   - UI controllers calling multiple services
   - File or network operations that involve many steps
   - Application startup code (bootstrapping subsystems)
*/
