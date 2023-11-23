package test_sp.test_sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import test_sp.battle;

@SpringBootApplication
public class TestSpApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpApplication.class, args);

		battle batalia = new battle();

		batalia.creatArmy();

		batalia.startBattle();
	}
}
