package pl.piotrdawidziuk.gsontutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

//        Address address = new Address("Berlin","Germany");
//
//        List<FamilyMember> family = new ArrayList<>();
//        family.add(new FamilyMember("wife",30));
//        family.add(new FamilyMember("brother",34));
//        family.add(new FamilyMember("son",5));
//
//        Employee employee = new Employee("John",30,"john@gmail.com",address,family);
//        String json = gson.toJson(employee);
//        Log.e("JSON TEXT", json);


        String json = "{\"address\":{\"city\":\"Berlin\",\"country\":\"Germany\"},\"age\":30,\"family\":[{\"age\":30,\"role\":\"wife\"},{\"age\":34,\"role\":\"brother\"},{\"age\":5,\"role\":\"son\"}],\"first_name\":\"John\",\"mail\":\"john@gmail.com\"}\n";
        Employee employee = gson.fromJson(json,Employee.class);
        Address address = employee.getmAddress();
        Log.e("ADDRESS",address.getmCountry()+", "+address.getmCity());
        for (FamilyMember familyMember: employee.getmFamily()){
            Log.e("Family member: ", familyMember.getmRole()+" "+familyMember.getmAge());
        }

        String jsonFamily = "[{\"age\":30,\"role\":\"wife\"},{\"age\":34,\"role\":\"brother\"},{\"age\":5,\"role\":\"son\"}]";

        Type familyType = new TypeToken<ArrayList<FamilyMember>>(){}.getType();
        FamilyMember[] familyMembers = gson.fromJson(jsonFamily,FamilyMember[].class);
        ArrayList<FamilyMember> familyMemberArrayList = gson.fromJson(jsonFamily,familyType);
        for (FamilyMember familyMember : familyMemberArrayList){
            Log.e("MEMBER: ", familyMember.toString());
        }




    }
}
