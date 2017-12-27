package proxy.dynamicProxy.cglib;

public class Image {
    private String filename;

    public Image(){}

    public Image(String filename) {
        this.filename = filename;
    }

    public void display(){
        System.out.println("display:"+filename);
    }

    void delete(){
        System.out.println("delete:"+filename);
    }
}
