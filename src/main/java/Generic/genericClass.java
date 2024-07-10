package Generic;

public class genericClass<x> {
    private x content;
    public genericClass(x content ) {
        this.content = content;
    }
    public x getContent() {
        return content;
    }
    public void setContent(x content) {
        this.content = content;
    }
    public void Yazdir (){
        System.out.println("Girişler : " + this.content);
    }
}
