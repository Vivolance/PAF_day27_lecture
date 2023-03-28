package IBF.day27.lecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import IBF.day27.lecture.repository.TaskRepository;
import jakarta.json.Json;
import jakarta.json.JsonObject;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private TaskRepository taskRepo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) {

		JsonObject task = Json.createObjectBuilder()
			.add("task", "Watch JW4")
			.add("priority", 5)
			.add("dueDate", "2023-04-01")
			.build();

		// Document result = taskRepo.insertTask(task);
		// System.out.printf(">>>>", result);
	}

}
