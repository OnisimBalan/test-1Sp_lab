package test_sp;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.fasterxml.jackson.databind.ObjectMapper;

//singletone
//OOP
public class specie extends creatura{
    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public ObjectMapper objectMapper() {
        return new objectMapper();
    }

    private String rasa;

    public specie(String batalion, String nume, String rasa, Integer viata, Integer atac) {
        super(batalion, nume,  viata, atac);
        this.rasa = rasa;
    }

    //override
    @Override
    public String getBatalion() {
        return super.getBatalion();
    }

    public String getRasa() {
        return rasa;
    }
}