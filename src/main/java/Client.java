public class Client {
    private String id;
    private String fullName;
    public Client(String id,String fullName){
        this.fullName=fullName;
        this.id=id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }


}
