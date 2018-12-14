import java.util.List;


public class List_of_Scene {
    private List<Scene> list_of_seen;
    int time;


    void add_scene(Scene to_add){
        //adds a scene to the list
    }

    public void display(){
        // Stub
    }
    void delete_scene(Scene to_delete){
        //deletes the scene that matches
    }
    List<Scene> sort_by_time_spent(){
        //Return a list of scenes sorted by time spent
    }
    List<Scene> top_scenes(){
        //Creates a list<scene> for sending a request_4_content
    }
    List<int> report_seen(){
        //return a list of the UUID of content you've seen
    }
    List<Scene> report_by_date(){
        //returns a list sorted by date
    }
}