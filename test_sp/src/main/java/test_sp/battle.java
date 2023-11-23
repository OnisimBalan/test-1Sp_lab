package test_sp;

import java.util.List;
import java.util.Timer;

import org.springframework.stereotype.Component;

//component
//Strategy Pattern
@Component
public class battle {
    public List<creatura> aramata;

    Timer timer = new Timer();

    specie gnom = new specie("1", "Gnom1", "gnom", 100, 7);
    specie elf = new specie("1", "elf1", "elf", 100, 8);
    specie om = new specie("2", "Ion", "om", 100, 10);
    specie enti = new specie("3", "enti1", "enti", 100, 14);
    public specie Sauron = new specie("3", "Sauron", "boss", 100, 14);

    public void creatArmy() {
        this.aramata.add(gnom);
        this.aramata.add(elf);
        this.aramata.add(om);
        this.aramata.add(enti);
    }

    public void startBattle() {
        for (creatura creatura : aramata) {
            if (this.Sauron.getViata() <= 0) {
                System.err.println("Sauron a murit, vicotrie");

                break;
            }

            if (creatura.getViata() <= 0) {
                creatura.message();
                creatura.attack(Sauron);
            }

                timer.wait(1000);

        }
    }
}
