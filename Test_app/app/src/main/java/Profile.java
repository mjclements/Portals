    import java.util.List;

public class Profile {
    public int ID;
    public String name;
    //way to hold an image
    public List_of_Scene Liked;
    public List_of_Scene Seen;
    public List<String> tags;
    public List<Media_Type> preference;
    public boolean is_shown;
    public boolean learn;
    public boolean tell;

    Request_for_Content generate_request_for_content(){
        //Stub
    }
    void delete(){

    }
    void branch(){
        //give you a whole-ass menu to create a branch
    }
}
