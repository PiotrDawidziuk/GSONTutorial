package pl.piotrdawidziuk.gsontutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

        Employee employee = new Employee("John",30,"john@gmail.com");
        String json = gson.toJson(employee);
        
    }
}
