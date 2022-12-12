package via.sep3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import via.sep3.controller.EventsController;
import via.sep3.model.Event;
import via.sep3.model.User;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
public class RunLogicLayer
{
    public static void main(String[] args)
    {

        SpringApplication.run(RunLogicLayer.class, args);
    }
}

